package io.getstream.chat.android.ui.message.list.adapter.attachments

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import io.getstream.chat.android.client.models.Attachment
import io.getstream.chat.android.ui.message.list.adapter.BaseAttachmentItemViewHolder
import io.getstream.chat.android.ui.message.list.adapter.viewholder.attachment.AttachmentViewHolderFactory

internal class AttachmentsAdapter(
    private val viewHolderFactory: AttachmentViewHolderFactory,
) : ListAdapter<Attachment, BaseAttachmentItemViewHolder>(AttachmentDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseAttachmentItemViewHolder {
        return viewHolderFactory.attachmentViewHolder(parent, viewType)
    }

    override fun getItemViewType(position: Int): Int = 1

    override fun onBindViewHolder(holder: BaseAttachmentItemViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }

    private object AttachmentDiffCallback : DiffUtil.ItemCallback<Attachment>() {
        override fun areItemsTheSame(oldItem: Attachment, newItem: Attachment): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Attachment, newItem: Attachment): Boolean {
            return oldItem == newItem
        }
    }
}
