package io.getstream.chat.android.ui.message.list.adapter.view.internal.actions

import io.getstream.chat.android.client.models.AttachmentAction
import io.getstream.chat.android.ui.common.internal.SimpleListAdapter
import io.getstream.chat.android.ui.databinding.StreamUiItemAttachmentActionBinding

internal class AttachmentActionViewHolder(
    private val binding: StreamUiItemAttachmentActionBinding,
    private val clickListener: (AttachmentAction) -> Unit,
) : SimpleListAdapter.ViewHolder<AttachmentAction>(binding.root) {

    override fun bind(item: AttachmentAction) {
        binding.run {
            root.setOnClickListener {
                clickListener(item)
            }

            actionText.text = item.text
        }
    }
}
