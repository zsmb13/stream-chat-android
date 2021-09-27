package io.getstream.chat.android.ui.message.list.adapter.viewholder.attachment

import android.view.ViewGroup
import io.getstream.chat.android.ui.common.extensions.internal.streamThemeInflater
import io.getstream.chat.android.ui.databinding.StreamUiItemFileAttachmentBinding
import io.getstream.chat.android.ui.message.list.MessageListItemStyle
import io.getstream.chat.android.ui.message.list.adapter.BaseAttachmentItemViewHolder
import io.getstream.chat.android.ui.message.list.adapter.view.internal.AttachmentClickListener
import io.getstream.chat.android.ui.message.list.adapter.view.internal.AttachmentDownloadClickListener
import io.getstream.chat.android.ui.message.list.adapter.view.internal.AttachmentLongClickListener

internal class AttachmentViewHolderFactory(
    private val attachmentClickListener: AttachmentClickListener,
    private val attachmentLongClickListener: AttachmentLongClickListener,
    private val attachmentDownloadClickListener: AttachmentDownloadClickListener,
    private val style: MessageListItemStyle,
) {

    fun attachmentViewHolder(parent: ViewGroup, viewType: Int): BaseAttachmentItemViewHolder {
        return fileAttachmentViewHolder(parent)
    }

    private fun fileAttachmentViewHolder(parent: ViewGroup): FileAttachmentViewHolder {
        return StreamUiItemFileAttachmentBinding
            .inflate(parent.streamThemeInflater, parent, false)
            .let { binding ->
                FileAttachmentViewHolder(
                    binding,
                    attachmentClickListener,
                    attachmentLongClickListener,
                    attachmentDownloadClickListener,
                    style.fileAttachmentStyle
                )
            }
    }
}
