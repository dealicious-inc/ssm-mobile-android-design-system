package net.deali.designsystem.internal.chips

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.theme.DealiColor

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
    val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
    val contentColor by chipsColors.contentColor(enabled)

    CoreChipsLayout(
        onClick = onClick,
        leftIcon = leftIcon,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
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

@Composable
internal fun CoreCustomChips(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    selected: Boolean,
    enabled: Boolean,
    chipsStyle: ChipsStyle,
    chipsSize: ChipsSize,
    chipsColors: ChipsColors,
    spacingBetweenContentAndRemove: Dp,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val contentColor by chipsColors.contentColor(enabled)

    CoreChipsLayout(
        onClick = onClick,
        leftIcon = null,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        DepthContent(
            onRemoveClick = onRemoveClick,
            removeIcon = removeIcon,
            useRemoveIcon = useRemoveIcon,
            contentColor = contentColor,
            spacingBetweenContentAndRemove = spacingBetweenContentAndRemove,
            content = content,
        )
    }
}

@Composable
internal fun ChipsImage(
    imageUrl: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(shape = CircleShape)
            .border(width = 1.dp, color = DealiColor.b5, shape = CircleShape)
            .size(12.dp)
    ) {
        if (enabled) {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = DealiColor.g40)
            )
        }
    }
}

@Composable
private fun CoreChipsLayout(
    onClick: () -> Unit,
    @DrawableRes leftIcon: Int?,
    useRemoveIcon: Boolean,
    selected: Boolean,
    enabled: Boolean,
    chipsStyle: ChipsStyle,
    chipsSize: ChipsSize,
    chipsColors: ChipsColors,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val chipsShape = ChipsDefaults.chipsShape(style = chipsStyle)
    val chipsMinSize = ChipsDefaults.chipsMinSize(size = chipsSize)
    val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
    val backgroundColor by chipsColors.backgroundColor(enabled, selected)
    val outlineColor by chipsColors.outlineColor(enabled, selected)

    Box(
        modifier = modifier
            .clip(shape = chipsShape)
            .outlineBorderOrNothing(
                enableBorder = true,
                color = outlineColor,
                shape = chipsShape
            )
            .defaultMinSize(
                minWidth = chipsMinSize,
                minHeight = chipsMinSize,
            )
            .then(
                if (chipsStyle == ChipsStyle.FilledImageDepth || chipsStyle == ChipsStyle.FilledDepth) {
                    Modifier
                } else {
                    Modifier.width(IntrinsicSize.Min)
                }
            )
            .height(chipsMinSize)
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
            verticalAlignment = Alignment.CenterVertically,
            content = content,
        )
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
        Spacer(modifier = Modifier.width(4.dp))
    }
    DealiText(
        modifier = Modifier.weight(weight = 1f),
        text = text,
        style = textStyle.copy(textAlign = textAlign),
        color = contentColor,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
    if (useRemoveIcon) {
        Spacer(modifier = Modifier.width(4.dp))
        Icon16(
            onClick = onRemoveClick,
            iconRes = removeIcon,
            color = contentColor,
        )
    }
}

@Composable
private fun RowScope.DepthContent(
    onRemoveClick: () -> Unit,
    @DrawableRes removeIcon: Int,
    useRemoveIcon: Boolean,
    contentColor: Color,
    spacingBetweenContentAndRemove: Dp,
    content: @Composable RowScope.() -> Unit,
) {
    content()
    if (useRemoveIcon) {
        Spacer(modifier = Modifier.width(spacingBetweenContentAndRemove))
        Icon16(
            onClick = onRemoveClick,
            iconRes = removeIcon,
            color = contentColor,
        )
    }
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
