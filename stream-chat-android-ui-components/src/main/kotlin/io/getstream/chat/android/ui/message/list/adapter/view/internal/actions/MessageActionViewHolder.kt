package io.getstream.chat.android.ui.message.list.adapter.view.internal.actions

import io.getstream.chat.android.client.models.MessageAction
import io.getstream.chat.android.ui.common.internal.SimpleListAdapter
import io.getstream.chat.android.ui.databinding.StreamUiItemMessageActionBinding

internal class MessageActionViewHolder(
    binding: StreamUiItemMessageActionBinding,
) : SimpleListAdapter.ViewHolder<MessageAction>(binding.root) {


    override fun bind(item: MessageAction) {
    }

    override fun unbind() {
        super.unbind()
    }
}
