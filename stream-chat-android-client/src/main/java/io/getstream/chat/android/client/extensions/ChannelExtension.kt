package io.getstream.chat.android.client.extensions

import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.models.Channel
import io.getstream.chat.android.client.models.User
import io.getstream.chat.android.core.internal.InternalStreamChatApi

public fun Channel.isAnonymousChannel(): Boolean = id.isAnonymousChannelId()

/**
 * Checks if [Channel] is muted for [user].
 *
 * @return True if the channel is muted for [user].
 */
public fun Channel.isMutedFor(user: User): Boolean = user.channelMutes.any { mute -> mute.channel.cid == cid }

@InternalStreamChatApi
public fun Channel.getUsersExcludingCurrent(): List<User> {
    val users = members.map { it.user }
    val currentUserId = ChatClient.instance().getCurrentUser()?.id
    return if (currentUserId != null) {
        users.filterNot { it.id == currentUserId }
    } else {
        users
    }
}
