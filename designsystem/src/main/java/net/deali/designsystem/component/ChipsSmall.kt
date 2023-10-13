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
fun chipsOutlineSmallPrimary01(
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
        chipsSize = ChipsSize.Small,
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
fun chipsSquareSmallPrimary01(
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
        chipsSize = ChipsSize.Small,
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
fun chipsFilledSmallPrimary01(
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
        chipsSize = ChipsSize.Small,
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
fun chipsFilledSquareSmallPrimary01(
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
        chipsSize = ChipsSize.Small,
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
fun chipsFilledSquareSmallSecondary01(
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
        chipsSize = ChipsSize.Small,
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
@JvmName("chipsFilledDepthSmallSecondary01OnlyTexts")
fun chipsFilledDepthSmallSecondary01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    texts: List<String>,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Small
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
            if (index != 0) {
                Spacer(modifier = Modifier.width(4.dp))
                Icon16(
                    iconRes = R.drawable.ic_arrow_right,
                    color = contentColor,
                )
                Spacer(modifier = Modifier.width(4.dp))
            }
            DealiText(
                text = text,
                style = textStyle,
                color = contentColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
@JvmName("chipsFilledDepthSmallSecondary01OnlyIcons")
fun chipsFilledDepthSmallSecondary01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    icons: List<Int>,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Small
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
        val contentColor by chipsColors.contentColor(enabled)

        for ((index, icon) in icons.withIndex()) {
            if (index != 0) {
                Spacer(modifier = Modifier.width(8.dp))
                Icon16(
                    iconRes = R.drawable.ic_arrow_right,
                    color = contentColor,
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
            Icon16(
                iconRes = icon,
                color = contentColor,
            )
        }
    }
}

@Composable
@JvmName("chipsFilledDepthSmallSecondary01TextsAndIcons")
fun chipsFilledDepthSmallSecondary01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    contents: List<Triple<Int?, String, Int?>>,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Small
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

        for ((index, content) in contents.withIndex()) {
            if (index != 0) {
                Spacer(modifier = Modifier.width(8.dp))
                Icon16(
                    iconRes = R.drawable.ic_arrow_right,
                    color = contentColor,
                )
                Spacer(modifier = Modifier.width(8.dp))
            }

            val leftIcon = content.first
            val text = content.second
            val rightIcon = content.third

            if (leftIcon != null) {
                Icon16(
                    iconRes = leftIcon,
                    color = contentColor,
                )
                Spacer(modifier = Modifier.width(4.dp))
            }
            DealiText(
                text = text,
                style = textStyle,
                color = contentColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (rightIcon != null) {
                Spacer(modifier = Modifier.width(4.dp))
                Icon16(
                    iconRes = rightIcon,
                    color = contentColor,
                )
            }
        }
    }
}

@Composable
fun chipsFilledImageSmallSecondary01(
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
    val chipsSize = ChipsSize.Small
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
        spacingBetweenContentAndRemove = 8.dp,
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
fun chipsFilledImageDepthSmallSecondary01(
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
    val chipsSize = ChipsSize.Small
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
