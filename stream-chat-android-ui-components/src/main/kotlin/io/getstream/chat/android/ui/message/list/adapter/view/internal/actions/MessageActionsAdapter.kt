package io.getstream.chat.android.ui.message.list.adapter.view.internal.actions

import android.view.ViewGroup
import io.getstream.chat.android.client.models.MessageAction
import io.getstream.chat.android.ui.common.extensions.internal.streamThemeInflater
import io.getstream.chat.android.ui.common.internal.SimpleListAdapter
import io.getstream.chat.android.ui.databinding.StreamUiItemMessageActionBinding

internal class MessageActionsAdapter : SimpleListAdapter<MessageAction, MessageActionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageActionViewHolder {
        return StreamUiItemMessageActionBinding
            .inflate(parent.streamThemeInflater, parent, false)
            .let {
                MessageActionViewHolder(it)
            }
    }
}
