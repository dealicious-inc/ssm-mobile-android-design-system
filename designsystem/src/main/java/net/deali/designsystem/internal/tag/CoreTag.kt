package net.deali.designsystem.internal.tag

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

@Composable
internal fun CoreTag(
    text: String,
    color: Color,
    backgroundColor: Color,
    tagSize: TagSize,
    tagStyle: TagStyle,
    modifier: Modifier = Modifier,
    borderColor: Color = Color.Unspecified,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    val style = TagDefaults.textStyle(tagSize)
    val containerPaddingValues = TagDefaults.containerPadding(tagSize)
    val textPaddingValues = TagDefaults.textPadding()
    val cornerRadius = TagDefaults.cornerRadius(tagSize)
    val iconSize = TagDefaults.iconSize(tagSize)
    val height = TagDefaults.height(tagSize)

    val shape = RoundedCornerShape(cornerRadius)
    val showBorder = tagStyle == TagStyle.Outline && borderColor.isSpecified

    Row(
        modifier = modifier
            .height(height)
            .background(
                color = backgroundColor,
                shape = shape
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
        leadingIcon?.let { icon ->
            Box(
                modifier = Modifier.size(iconSize),
                contentAlignment = Alignment.Center,
            ) {
                icon()
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

        trailingIcon?.let { icon ->
            Box(
                modifier = Modifier.size(iconSize),
                contentAlignment = Alignment.Center,
            ) {
                icon()
            }
        }
    }
}
