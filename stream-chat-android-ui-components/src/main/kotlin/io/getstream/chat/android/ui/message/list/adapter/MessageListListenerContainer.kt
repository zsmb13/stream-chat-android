package io.getstream.chat.android.ui.message.list.adapter

import io.getstream.chat.android.ui.message.list.MessageListView.ThreadClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.AttachmentActionListener
import io.getstream.chat.android.ui.message.list.MessageListView.AttachmentClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.AttachmentDownloadClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.GiphySendListener
import io.getstream.chat.android.ui.message.list.MessageListView.LinkClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.MessageClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.MessageLongClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.MessageRetryListener
import io.getstream.chat.android.ui.message.list.MessageListView.ReactionViewClickListener
import io.getstream.chat.android.ui.message.list.MessageListView.UserClickListener

public sealed interface MessageListListenerContainer {
    public val messageClickListener: MessageClickListener
    public val messageLongClickListener: MessageLongClickListener
    public val messageRetryListener: MessageRetryListener
    public val threadClickListener: ThreadClickListener
    public val attachmentClickListener: AttachmentClickListener
    public val attachmentDownloadClickListener: AttachmentDownloadClickListener
    public val reactionViewClickListener: ReactionViewClickListener
    public val userClickListener: UserClickListener
    public val giphySendListener: GiphySendListener
    public val linkClickListener: LinkClickListener
    public val attachmentActionListener: AttachmentActionListener
}
