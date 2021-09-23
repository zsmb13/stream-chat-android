package io.getstream.chat.android.ui.message.list.adapter.view.internal.actions

import android.widget.Toast
import io.getstream.chat.android.client.models.AttachmentAction
import io.getstream.chat.android.ui.common.internal.SimpleListAdapter
import io.getstream.chat.android.ui.databinding.StreamUiItemAttachmentActionBinding

internal class AttachmentActionViewHolder(
    private val binding: StreamUiItemAttachmentActionBinding,
) : SimpleListAdapter.ViewHolder<AttachmentAction>(binding.root) {

    override fun bind(item: AttachmentAction) {
        binding.root.setOnClickListener {
            Toast.makeText(context, "Ha!", Toast.LENGTH_SHORT).show()
        }
    }
}
