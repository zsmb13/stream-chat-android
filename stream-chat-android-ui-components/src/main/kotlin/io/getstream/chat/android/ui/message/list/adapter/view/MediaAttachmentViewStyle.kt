package io.getstream.chat.android.ui.message.list.adapter.view

import android.content.Context
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.DimenRes
import io.getstream.chat.android.ui.R
import io.getstream.chat.android.ui.TransformStyle
import io.getstream.chat.android.ui.common.extensions.internal.dpToPx
import io.getstream.chat.android.ui.common.extensions.internal.getColorCompat
import io.getstream.chat.android.ui.common.extensions.internal.getDimension
import io.getstream.chat.android.ui.common.extensions.internal.getDrawableCompat
import io.getstream.chat.android.ui.common.extensions.internal.use
import io.getstream.chat.android.ui.common.style.TextStyle

private const val DEFAULT_GIPHY_HEIGHT = 200

/**
 * Style for [MediaAttachmentView].
 * Use this class together with [TransformStyle.mediaAttachmentStyleTransformer] to change styles programmatically.
 *
 * @param progressIcon Animated progress drawable. Default value is [R.drawable.stream_ui_rotating_indeterminate_progress_gradient].
 * @param giphyIcon Giphy icon. Default value is [R.drawable.stream_ui_giphy_label].
 * @param imageBackgroundColor Image background. Default value is [R.color.stream_ui_grey].
 * @param moreCountOverlayColor More count semi-transparent overlay color. Default value is [R.color.stream_ui_overlay].
 * @param moreCountTextStyle Appearance for "more count" text.
 */
public data class MediaAttachmentViewStyle(
    public val progressIcon: Drawable,
    public val giphyIcon: Drawable,
    public val placeholderIcon: Drawable,
    @ColorInt val imageBackgroundColor: Int,
    @ColorInt val moreCountOverlayColor: Int,
    public val moreCountTextStyle: TextStyle,
    @DimenRes public val giphyHeight: Int,
) {
    internal companion object {
        operator fun invoke(context: Context, attrs: AttributeSet?): MediaAttachmentViewStyle {
            context.obtainStyledAttributes(
                attrs,
                R.styleable.MediaAttachmentView,
                R.attr.streamUiMessageListMediaAttachmentStyle,
                R.style.StreamUi_MessageList_MediaAttachment
            ).use { a ->
                val progressIcon = a.getDrawable(R.styleable.MediaAttachmentView_streamUiMediaAttachmentProgressIcon)
                    ?: context.getDrawableCompat(R.drawable.stream_ui_rotating_indeterminate_progress_gradient)!!

                val giphyIcon = a.getDrawable(R.styleable.MediaAttachmentView_streamUiMediaAttachmentGiphyIcon)
                    ?: context.getDrawableCompat(R.drawable.stream_ui_giphy_label)!!

                val imageBackgroundColor = a.getColor(
                    R.styleable.MediaAttachmentView_streamUiMediaAttachmentImageBackgroundColor,
                    context.getColorCompat(R.color.stream_ui_grey)
                )

                val moreCountOverlayColor = a.getColor(
                    R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountOverlayColor,
                    context.getColorCompat(R.color.stream_ui_overlay)
                )

                val moreCountTextStyle = TextStyle.Builder(a)
                    .size(
                        R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextSize,
                        context.getDimension(R.dimen.stream_ui_message_media_attachment_more_count_text_size)
                    )
                    .color(
                        R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextColor,
                        context.getColorCompat(R.color.stream_ui_literal_white)
                    )
                    .font(
                        R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountFontAssets,
                        R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextFont
                    )
                    .style(
                        R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextStyle,
                        Typeface.NORMAL
                    )
                    .build()

                val placeholderIcon =
                    a.getDrawable(R.styleable.MediaAttachmentView_streamUiMediaAttachmentPlaceHolderIcon)
                        ?: context.getDrawableCompat(R.drawable.stream_ui_picture_placeholder)!!

                val giphyHeight =
                    a.getDimensionPixelSize(R.styleable.MediaAttachmentView_streamUiMediaAttachmentGiphyHeight,
                        DEFAULT_GIPHY_HEIGHT.dpToPx())

                return MediaAttachmentViewStyle(
                    progressIcon = progressIcon,
                    giphyIcon = giphyIcon,
                    imageBackgroundColor = imageBackgroundColor,
                    moreCountOverlayColor = moreCountOverlayColor,
                    moreCountTextStyle = moreCountTextStyle,
                    placeholderIcon = placeholderIcon,
                    giphyHeight = giphyHeight,
                ).let(TransformStyle.mediaAttachmentStyleTransformer::transform)
            }
        }
    }
}
