package io.getstream.chat.android.ui.message.list.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.getstream.chat.android.client.models.Attachment

public abstract class BaseAttachmentItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    public abstract fun bindData(data: Attachment)

}
