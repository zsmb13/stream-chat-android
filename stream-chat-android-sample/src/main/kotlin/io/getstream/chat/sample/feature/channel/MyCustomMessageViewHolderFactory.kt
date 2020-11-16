package io.getstream.chat.sample.feature.channel

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import com.getstream.sdk.chat.adapter.MessageListItem
import com.getstream.sdk.chat.adapter.MessageViewHolderFactory
import com.getstream.sdk.chat.adapter.viewholder.message.BaseMessageListItemViewHolder
import com.getstream.sdk.chat.view.MessageListViewStyle
import io.getstream.chat.android.client.models.Channel
import io.getstream.chat.android.client.models.initials
import io.getstream.chat.sample.databinding.ItemMessageBinding

class MyCustomMessageViewHolderFactory : MessageViewHolderFactory() {

    override fun createMessageViewHolder(
        parent: ViewGroup,
        viewType: Int,
        style: MessageListViewStyle,
        channel: Channel
    ): BaseMessageListItemViewHolder<*> {
        return when (viewType) {
            MESSAGEITEM_MESSAGE -> MyCustomMessageViewHolder(parent)
            else -> super.createMessageViewHolder(parent, viewType, style, channel)
        }
    }
}

class MyCustomMessageViewHolder(
    val parent: ViewGroup,
    val binding: ItemMessageBinding = ItemMessageBinding.inflate(parent.inflater, parent, false)
) : BaseMessageListItemViewHolder<MessageListItem.MessageItem>(binding.root) {

    private val colors = listOf(Color.BLUE, Color.CYAN, Color.MAGENTA)

    override fun bind(item: MessageListItem.MessageItem) {
        binding.message.text = item.message.text
        val userId = item.message.user.id
        val color = userIdWithColor.get(userId) ?: colors.random()
        if (!userIdWithColor.containsKey(userId)) {
            userIdWithColor.put(userId, color)
        }
        binding.avatarBg.setBackgroundColor(color)
        binding.avatarInitials.text = item.message.user.initials
    }

    companion object {
        private val userIdWithColor: MutableMap<String, Int> = mutableMapOf()
    }
}

internal inline val ViewGroup.inflater: LayoutInflater
    get() = LayoutInflater.from(context)

