package net.deali.designsystem.internal.tag

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon

@Composable
internal fun CoreTag(
    text: String,
    color: Color,
    backgroundColor: Color,
    tagSize: TagSize,
    tagStyle: TagStyle,
    modifier: Modifier = Modifier,
    borderColor: Color = Color.Unspecified,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    val style = TagDefaults.textStyle(tagSize)
    val containerPaddingValues = TagDefaults.containerPadding(tagSize)
    val textPaddingValues = TagDefaults.textPadding()
    val cornerRadius = TagDefaults.cornerRadius(tagSize)
    val iconSize = TagDefaults.iconSize(tagSize)
    val height = TagDefaults.height(tagSize)

    val shape = RoundedCornerShape(cornerRadius)
    val showBorder = tagStyle == TagStyle.Outline && borderColor.isSpecified
    val resolvedIconColor = if (iconColor.isSpecified) iconColor else color

    Row(
        modifier = modifier
            .height(height)
            .then(
                if (tagStyle != TagStyle.Text) {
                    Modifier.background(
                        color = backgroundColor,
                        shape = shape
                    )
                } else {
                    Modifier
                }
            )
            .then(
                if (showBorder) {
                    Modifier.border(
                        width = 1.dp,
                        color = borderColor,
                        shape = shape
                    )
                } else {
                    Modifier
                }
            )
            .padding(containerPaddingValues),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        leftIcon?.let { iconRes ->
            Box(
                modifier = Modifier.size(iconSize),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    iconRes = iconRes,
                    size = iconSize,
                    color = resolvedIconColor,
                )
            }
        }

        DealiText(
            modifier = Modifier.padding(textPaddingValues),
            text = text,
            color = color,
            style = style,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        rightIcon?.let { iconRes ->
            Box(
                modifier = Modifier.size(iconSize),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    iconRes = iconRes,
                    size = iconSize,
                    color = resolvedIconColor,
                )
            }
        }
    }
}
