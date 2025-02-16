package io.getstream.chat.android.compose.state.channel.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * UI representation of a Channel option, when the user selects a channel in the list.
 *
 * @param title The title to represent the action.
 * @param titleColor The color of the title text.
 * @param icon The icon to represent the action.
 * @param iconColor The color of the icon.
 * @param action The [ChannelListAction] the option represents.
 */
public class ChannelOption(
    public val title: String,
    public val titleColor: Color,
    public val icon: ImageVector,
    public val iconColor: Color,
    public val action: ChannelListAction,
)
