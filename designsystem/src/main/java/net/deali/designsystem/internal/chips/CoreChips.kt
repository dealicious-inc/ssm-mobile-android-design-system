package net.deali.designsystem.internal.chips

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16

@Composable
internal fun CoreChips(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    text: String,
    textAlign: TextAlign?,
    @DrawableRes leftIcon: Int?,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    selected: Boolean,
    enabled: Boolean,
    chipsStyle: ChipsStyle,
    chipsSize: ChipsSize,
    chipsColors: ChipsColors,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsShape = ChipsDefaults.chipsShape(style = chipsStyle)
    val chipsMinSize = ChipsDefaults.chipsMinSize(size = chipsSize)
    val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
    val backgroundColor by chipsColors.backgroundColor(enabled, selected)
    val outlineColor by chipsColors.outlineColor(enabled, selected)
    val contentColor by chipsColors.contentColor(enabled)

    Box(
        modifier = modifier
            .clip(shape = chipsShape)
            .outlineBorderOrNothing(
                enableBorder = true,
                color = outlineColor,
                shape = chipsShape
            )
            .width(IntrinsicSize.Min)
            .defaultMinSize(
                minWidth = chipsMinSize,
                minHeight = chipsMinSize,
            )
            .background(color = backgroundColor)
            .clickable(
                interactionSource = interactionSource,
                indication = rememberRipple(),
                enabled = enabled,
                role = Role.Button,
                onClick = onClick,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier
                .padding(
                    ChipsDefaults.chipsPaddings(
                        size = chipsSize,
                        style = chipsStyle,
                        useLeftIcon = leftIcon != null,
                        useRemoveIcon = useRemoveIcon,
                        fontWeight = textStyle.fontWeight,
                    )
                ),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            when (chipsStyle) {
                ChipsStyle.FilledDepth,
                ChipsStyle.FilledImageDepth -> {
                    DepthContent()
                }

                else -> {
                    NormalContent(
                        onRemoveClick = onRemoveClick,
                        text = text,
                        textStyle = textStyle,
                        textAlign = textAlign,
                        leftIcon = leftIcon,
                        removeIcon = removeIcon,
                        useRemoveIcon = useRemoveIcon,
                        contentColor = contentColor,
                    )
                }
            }
        }
    }
}

@Composable
private fun RowScope.NormalContent(
    onRemoveClick: () -> Unit,
    text: String,
    textStyle: TextStyle,
    textAlign: TextAlign?,
    @DrawableRes leftIcon: Int?,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    contentColor: Color,
) {
    if (leftIcon != null) {
        Icon16(
            iconRes = leftIcon,
            color = contentColor,
        )
    }
    DealiText(
        modifier = Modifier.weight(weight = 1f),
        text = text,
        style = textStyle.copy(textAlign = textAlign),
        color = contentColor,
    )
    if (useRemoveIcon) {
        Icon16(
            onClick = onRemoveClick,
            iconRes = removeIcon,
            color = contentColor,
        )
    }
}

@Composable
private fun DepthContent() {

}

@Stable
private fun Modifier.outlineBorderOrNothing(
    enableBorder: Boolean,
    color: Color,
    shape: Shape,
): Modifier {
    return if (enableBorder) {
        this.then(Modifier.border(width = 1.dp, color = color, shape = shape))
    } else {
        this
    }
}
