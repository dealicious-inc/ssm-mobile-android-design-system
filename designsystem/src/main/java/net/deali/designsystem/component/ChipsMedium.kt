package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.chips.ChipsDefaults
import net.deali.designsystem.internal.chips.ChipsImage
import net.deali.designsystem.internal.chips.ChipsSize
import net.deali.designsystem.internal.chips.ChipsStyle
import net.deali.designsystem.internal.chips.CoreChips
import net.deali.designsystem.internal.chips.CoreCustomChips
import net.deali.designsystem.theme.DealiColor

@Composable
fun chipsOutlineMediumPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    CoreChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Outline,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        modifier = modifier,
        interactionSource = interactionSource,
    )
}

@Composable
fun chipsSquareBoldMediumPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    CoreChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.SquareBold,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        modifier = modifier,
        interactionSource = interactionSource,
    )
}

@Composable
fun chipsSquareRegularMediumPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    CoreChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.SquareRegular,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        modifier = modifier,
        interactionSource = interactionSource,
    )
}

@Composable
fun chipsFilledMediumPrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    CoreChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Filled,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
            backgroundColor = DealiColor.primary03,
            selectedBackgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.transparent,
            selectedOutlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.transparent,
        ),
        modifier = modifier,
        interactionSource = interactionSource,
    )
}

@Composable
fun chipsFilledMediumSquarePrimary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    CoreChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Square,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
            backgroundColor = DealiColor.primary03,
            selectedBackgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.transparent,
            selectedOutlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.transparent,
        ),
        modifier = modifier,
        interactionSource = interactionSource,
    )
}

@Composable
fun chipsFilledSquareMediumSecondary01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    CoreChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Square,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
            backgroundColor = DealiColor.g10,
            selectedBackgroundColor = DealiColor.g20,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        modifier = modifier,
        interactionSource = interactionSource,
    )
}

@Composable
fun chipsFilledImageMediumSecondary01(
    onClick: () -> Unit,
    imageUrl: String,
    text: String,
    modifier: Modifier = Modifier,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    val chipsStyle = ChipsStyle.FilledImage
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
        val contentColor by chipsColors.contentColor(enabled)

        ChipsImage(
            imageUrl = imageUrl,
            enabled = enabled,
        )
        Spacer(modifier = Modifier.width(4.dp))
        DealiText(
            modifier = Modifier.weight(weight = 1f),
            text = text,
            style = textStyle.copy(textAlign = textAlign),
            color = contentColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
fun chipsFilledImageDepthMediumSecondary01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    imageUrl: String,
    texts: List<String>,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.primary04,
        selectedBackgroundColor = DealiColor.g10,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
        outlineColor = DealiColor.g20,
        selectedOutlineColor = DealiColor.transparent,
        disabledOutlineColor = DealiColor.transparent,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
        val contentColor by chipsColors.contentColor(enabled)

        for ((index, text) in texts.withIndex()) {
            if (index == 0) {
                Row(
                    modifier = Modifier.weight(0.3f),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    ChipsImage(
                        imageUrl = imageUrl,
                        enabled = enabled,
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    DealiText(
                        modifier = Modifier.weight(weight = 1f),
                        text = text,
                        style = textStyle,
                        color = contentColor,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            } else {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 10.dp)
                        .width(1.dp)
                        .fillMaxHeight()
                        .background(color = DealiColor.g30)
                )
                DealiText(
                    modifier = Modifier.weight(weight = 0.3f),
                    text = text,
                    style = textStyle,
                    color = contentColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Composable
fun chipsOutlineImageMediumSecondary01(
    onClick: () -> Unit,
    imageUrl: String,
    text: String,
    modifier: Modifier = Modifier,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    val chipsStyle = ChipsStyle.Outline
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.primary04,
        selectedBackgroundColor = DealiColor.primary04,
        disabledBackgroundColor = DealiColor.primary04,
        contentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
        outlineColor = DealiColor.g20,
        selectedOutlineColor = DealiColor.g100,
        disabledOutlineColor = DealiColor.g20,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipsDefaults.chipsTextStyle(chipsSize, chipsStyle, selected, enabled)
        val contentColor by chipsColors.contentColor(enabled)

        ChipsImage(
            imageUrl = imageUrl,
            enabled = enabled,
        )
        Spacer(modifier = Modifier.width(4.dp))
        DealiText(
            modifier = Modifier.weight(weight = 1f),
            text = text,
            style = textStyle.copy(textAlign = textAlign),
            color = contentColor,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}
