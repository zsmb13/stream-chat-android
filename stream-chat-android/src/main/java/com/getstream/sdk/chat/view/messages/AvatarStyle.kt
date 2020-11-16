package com.getstream.sdk.chat.view.messages

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Typeface
import androidx.annotation.ColorInt
import androidx.annotation.DimenRes
import androidx.annotation.StyleableRes
import com.getstream.sdk.chat.R
import com.getstream.sdk.chat.style.TextStyle

public data class AvatarStyle internal constructor(
    public val avatarWidth: Int,
    public val avatarHeight: Int,
    public val avatarBorderWidth: Int,
    public val avatarBorderColor: Int,
    public val avatarBackgroundColor: Int,
    public val avatarInitialText: TextStyle,
) {
    public class Builder(private val a: TypedArray, c: Context) {
        private val res = c.resources

        private var avatarWidth: Int = 0
        private var avatarHeight: Int = 0
        private var avatarBorderWidth: Int = 0
        private var avatarBorderColor: Int = 0
        private var avatarBackgroundColor: Int = 0
        private var avatarInitialText: TextStyle = TextStyle()

        public fun avatarWidth(
            @StyleableRes avatarWidthStyleableId: Int,
            @DimenRes defaultValue: Int
        ): Builder = apply {
            avatarWidth = a.getDimensionPixelSize(
                avatarWidthStyleableId,
                res.getDimensionPixelSize(defaultValue)
            )
        }

        public fun avatarHeight(
            @StyleableRes avatarHeightStyleableId: Int,
            @DimenRes defaultValue: Int
        ): Builder = apply {
            avatarHeight = a.getDimensionPixelSize(
                avatarHeightStyleableId,
                res.getDimensionPixelSize(defaultValue)
            )
        }

        public fun avatarBorderWidth(
            @StyleableRes avatarBorderWidthStyleableId: Int,
            @DimenRes defaultValue: Int
        ): Builder = apply {
            avatarBorderWidth = a.getDimensionPixelSize(
                avatarBorderWidthStyleableId,
                res.getDimensionPixelSize(defaultValue)
            )
        }

        public fun avatarBorderColor(
            @StyleableRes avatarBorderColorStyleableId: Int,
            @ColorInt defaultColor: Int
        ): Builder = apply {
            avatarBorderColor = a.getColor(avatarBorderColorStyleableId, defaultColor)
        }

        public fun avatarBackgroundColor(
            @StyleableRes avatarBackgroundColorStyleableId: Int,
            @ColorInt defaultColor: Int
        ): Builder = apply {
            avatarBackgroundColor = a.getColor(avatarBackgroundColorStyleableId, defaultColor)
        }

        public fun avatarInitialText(
            @StyleableRes avatarTextSizeStyleableId: Int,
            @DimenRes avatarTextSizeDefaultValue: Int,
            @StyleableRes avatarTextColorStyleableId: Int,
            @ColorInt avatarTextColorDefaultValue: Int,
            @StyleableRes avatarTextFontAssetsStyleableId: Int = R.styleable.MessageListView_streamAvatarTextFontAssets,
            @StyleableRes avatarTextFontStyleableId: Int = R.styleable.MessageListView_streamAvatarTextFont,
            @StyleableRes avatarTextStyleStyleableId: Int,
            defaultTextStyle: Int = Typeface.BOLD,
        ): Builder = apply {
            avatarInitialText = TextStyle.Builder(a)
                .size(
                    avatarTextSizeStyleableId,
                    res.getDimensionPixelSize(avatarTextSizeDefaultValue)
                )
                .color(avatarTextColorStyleableId, avatarTextColorDefaultValue)
                .font(avatarTextFontAssetsStyleableId, avatarTextFontStyleableId)
                .style(avatarTextStyleStyleableId, defaultTextStyle)
                .build()
        }

        public fun build(): AvatarStyle =
            AvatarStyle(
                avatarWidth,
                avatarHeight,
                avatarBorderWidth,
                avatarBorderColor,
                avatarBackgroundColor,
                avatarInitialText
            )
    }
}
