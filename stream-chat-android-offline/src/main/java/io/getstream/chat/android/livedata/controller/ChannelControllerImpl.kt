package io.getstream.chat.android.livedata.controller

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import io.getstream.chat.android.client.events.ChatEvent
import io.getstream.chat.android.client.models.Attachment
import io.getstream.chat.android.client.models.Channel
import io.getstream.chat.android.client.models.ChannelUserRead
import io.getstream.chat.android.client.models.Member
import io.getstream.chat.android.client.models.Message
import io.getstream.chat.android.client.models.Reaction
import io.getstream.chat.android.client.models.TypingEvent
import io.getstream.chat.android.client.models.User
import io.getstream.chat.android.client.utils.Result
import io.getstream.chat.android.offline.channel.ChannelData
import kotlinx.coroutines.flow.map
import java.io.File
import io.getstream.chat.android.offline.channel.ChannelController as ChannelControllerStateFlow
import io.getstream.chat.android.offline.channel.ChannelController.MessagesState as OfflineMessageState

internal class ChannelControllerImpl(private val channelControllerStateFlow: ChannelControllerStateFlow) :
    ChannelController {

    override val channelType: String = channelControllerStateFlow.channelType
    override val channelId: String = channelControllerStateFlow.channelId

    override val repliedMessage: LiveData<Message?> = channelControllerStateFlow.repliedMessage.asLiveData()
    override val messages: LiveData<List<Message>> = channelControllerStateFlow.messages.asLiveData()
    override val messagesState = channelControllerStateFlow.messagesState.map {
        when (it) {
            OfflineMessageState.Loading -> ChannelController.MessagesState.Loading
            OfflineMessageState.NoQueryActive -> ChannelController.MessagesState.NoQueryActive
            OfflineMessageState.OfflineNoResults -> ChannelController.MessagesState.OfflineNoResults
            is OfflineMessageState.Result -> ChannelController.MessagesState.Result(it.messages)
        }
    }.asLiveData()
    override val oldMessages: LiveData<List<Message>> = channelControllerStateFlow.oldMessages.asLiveData()
    override val watcherCount: LiveData<Int> = channelControllerStateFlow.watcherCount.asLiveData()
    override val watchers: LiveData<List<User>> = channelControllerStateFlow.watchers.asLiveData()
    override val typing: LiveData<TypingEvent> = channelControllerStateFlow.typing.asLiveData()
    override val reads: LiveData<List<ChannelUserRead>> = channelControllerStateFlow.reads.asLiveData()
    override val read: LiveData<ChannelUserRead?> = channelControllerStateFlow.read.asLiveData()
    override val unreadCount: LiveData<Int?> = channelControllerStateFlow.unreadCount.asLiveData()
    override val members: LiveData<List<Member>> = channelControllerStateFlow.members.asLiveData()
    override val offlineChannelData: LiveData<ChannelData> = channelControllerStateFlow.channelData.asLiveData()
    override val hidden: LiveData<Boolean> = channelControllerStateFlow.hidden.asLiveData()
    override val muted: LiveData<Boolean> = channelControllerStateFlow.muted.asLiveData()
    override val loading: LiveData<Boolean> = channelControllerStateFlow.loading.asLiveData()
    override val loadingOlderMessages: LiveData<Boolean> = channelControllerStateFlow.loadingOlderMessages.asLiveData()
    override val loadingNewerMessages: LiveData<Boolean> = channelControllerStateFlow.loadingNewerMessages.asLiveData()
    override val endOfOlderMessages: LiveData<Boolean> = channelControllerStateFlow.endOfOlderMessages.asLiveData()
    override val endOfNewerMessages: LiveData<Boolean> = channelControllerStateFlow.endOfNewerMessages.asLiveData()

    override var recoveryNeeded = channelControllerStateFlow.recoveryNeeded
    override val cid = channelControllerStateFlow.cid

    fun getThread(threadId: String): ThreadControllerImpl =
        ThreadControllerImpl(channelControllerStateFlow.getThread(threadId))

    suspend fun keystroke(parentId: String?): Result<Boolean> = channelControllerStateFlow.keystroke(parentId)
    suspend fun stopTyping(parentId: String?): Result<Boolean> = channelControllerStateFlow.stopTyping(parentId)
    internal fun markRead(): Boolean = channelControllerStateFlow.markRead()

    suspend fun hide(clearHistory: Boolean): Result<Unit> = channelControllerStateFlow.hide(clearHistory)
    suspend fun show(): Result<Unit> = channelControllerStateFlow.show()
    suspend fun leave(): Result<Unit> = channelControllerStateFlow.leave()
    suspend fun delete(): Result<Unit> = channelControllerStateFlow.delete()
    suspend fun watch(limit: Int = 30) = channelControllerStateFlow.watch(limit)
    suspend fun loadOlderMessages(limit: Int = 30): Result<Channel> =
        channelControllerStateFlow.loadOlderMessages(limit)

    suspend fun loadOlderMessages(messageId: String, limit: Int): Result<Channel> =
        channelControllerStateFlow.loadOlderMessages(messageId, limit)

    suspend fun sendMessage(
        message: Message,
        attachmentTransformer: ((at: Attachment, file: File) -> Attachment)? = null,
    ): Result<Message> = channelControllerStateFlow.sendMessage(message, attachmentTransformer)

    suspend fun sendImage(file: File): Result<String> = channelControllerStateFlow.sendImage(file)
    suspend fun sendFile(file: File): Result<String> = channelControllerStateFlow.sendFile(file)

    suspend fun sendReaction(reaction: Reaction, enforceUnique: Boolean): Result<Reaction> =
        channelControllerStateFlow.sendReaction(reaction, enforceUnique)

    suspend fun deleteReaction(reaction: Reaction): Result<Message> =
        channelControllerStateFlow.deleteReaction(reaction)

    override fun getMessage(messageId: String): Message? = channelControllerStateFlow.getMessage(messageId)
    override fun clean() = channelControllerStateFlow.clean()
    internal fun handleEvent(event: ChatEvent) = channelControllerStateFlow.handleEvent(event)

    suspend fun editMessage(message: Message): Result<Message> = channelControllerStateFlow.editMessage(message)
    suspend fun deleteMessage(message: Message, hard: Boolean = false): Result<Message> =
        channelControllerStateFlow.deleteMessage(message, hard)

    override fun toChannel(): Channel = channelControllerStateFlow.toChannel()

    internal fun replyMessage(repliedMessage: Message?) = channelControllerStateFlow.replyMessage(repliedMessage)
}
