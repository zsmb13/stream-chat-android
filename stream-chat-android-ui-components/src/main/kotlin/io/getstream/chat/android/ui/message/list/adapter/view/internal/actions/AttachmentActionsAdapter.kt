package io.getstream.chat.android.ui.message.list.adapter.view.internal.actions

import android.view.ViewGroup
import io.getstream.chat.android.client.models.AttachmentAction
import io.getstream.chat.android.ui.common.extensions.internal.streamThemeInflater
import io.getstream.chat.android.ui.common.internal.SimpleListAdapter
import io.getstream.chat.android.ui.databinding.StreamUiItemAttachmentActionBinding

internal class AttachmentActionsAdapter(
    private val actionClickListener: (AttachmentAction) -> Unit
) : SimpleListAdapter<AttachmentAction, AttachmentActionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttachmentActionViewHolder {
        return StreamUiItemAttachmentActionBinding
            .inflate(parent.streamThemeInflater, parent, false)
            .let {
                AttachmentActionViewHolder(it, actionClickListener)
            }
    }
}
