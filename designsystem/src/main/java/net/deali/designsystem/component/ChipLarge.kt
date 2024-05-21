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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.chip.ChipDefaults
import net.deali.designsystem.internal.chip.ChipImage
import net.deali.designsystem.internal.chip.ChipSize
import net.deali.designsystem.internal.chip.ChipStyle
import net.deali.designsystem.internal.chip.CoreCustomChip
import net.deali.designsystem.internal.chip.CoreIconOnlyChip
import net.deali.designsystem.internal.chip.CoreRegularChip
import net.deali.designsystem.theme.DealiColor

@Composable
fun chipOutlineLarge01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    rightIconColor: Color? = Color.Unspecified,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
    singleLine: Boolean = true,
) {
    CoreRegularChip(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        textSingleLine = singleLine,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.Outline,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        interactionSource = interactionSource,
        modifier = modifier
    )
}

@Composable
fun chipOutlineLarge01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChip(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.Outline,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipOutlineSquareLarge01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    rightIconColor: Color? = Color.Unspecified,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
    singleLine: Boolean = true,
) {
    CoreRegularChip(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        textSingleLine = singleLine,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.Square,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        interactionSource = interactionSource,
        modifier = modifier
    )
}

@Composable
fun chipOutlineSquareLarge01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChip(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.Square,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary04,
            selectedBackgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.g20,
            selectedOutlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g20,
        ),
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipFilledLarge01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    rightIconColor: Color? = Color.Unspecified,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
    singleLine: Boolean = true,
) {
    CoreRegularChip(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        textSingleLine = singleLine,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.Filled,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary03,
            selectedBackgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            selectedContentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.transparent,
            selectedOutlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.transparent,
        ),
        interactionSource = interactionSource,
        modifier = modifier
    )
}

@Composable
fun chipFilledLarge01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChip(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.Filled,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary03,
            selectedBackgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            selectedContentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.transparent,
            selectedOutlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.transparent,
        ),
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipFilledSquareLarge01(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    rightIconColor: Color? = Color.Unspecified,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
    singleLine: Boolean = true,
) {
    CoreRegularChip(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        textSingleLine = singleLine,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.FilledSquare,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary03,
            selectedBackgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            selectedContentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.transparent,
            selectedOutlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.transparent,
        ),
        interactionSource = interactionSource,
        modifier = modifier
    )
}

@Composable
fun chipFilledSquareLarge01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChip(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.FilledSquare,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.primary03,
            selectedBackgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            selectedContentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            outlineColor = DealiColor.transparent,
            selectedOutlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.transparent,
        ),
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipFilledSquareLarge02(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    rightIconColor: Color? = Color.Unspecified,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
    singleLine: Boolean = true,
) {
    CoreRegularChip(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        textSingleLine = singleLine,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.FilledSquare,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.g10,
            selectedBackgroundColor = DealiColor.secondary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        interactionSource = interactionSource,
        modifier = modifier
    )
}

@Composable
fun chipFilledSquareLarge02(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChip(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.FilledSquare,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.g10,
            selectedBackgroundColor = DealiColor.secondary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipFilledSquareLarge03(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    rightIconColor: Color? = Color.Unspecified,
    onLeftIconClick: (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
    singleLine: Boolean = true,
) {
    CoreRegularChip(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        textSingleLine = singleLine,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.FilledSquare,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.g10,
            selectedBackgroundColor = DealiColor.g20,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        interactionSource = interactionSource,
        modifier = modifier
    )
}

@Composable
fun chipFilledSquareLarge03(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChip(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = ChipStyle.FilledSquare,
        chipSize = ChipSize.Large,
        chipColors = ChipDefaults.colors(
            backgroundColor = DealiColor.g10,
            selectedBackgroundColor = DealiColor.g20,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            selectedContentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
@JvmName("chipsFilledDepthLarge01OnlyTexts")
fun chipFilledDepthLarge01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    texts: List<String>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipStyle = ChipStyle.FilledImageDepth
    val chipSize = ChipSize.Large
    val chipColors = ChipDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChip(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = chipStyle,
        chipSize = chipSize,
        chipColors = chipColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipDefaults.chipTextStyle(chipSize, chipStyle, selected, enabled)
        val contentColor by chipColors.contentColor(enabled, selected)

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
@JvmName("chipsFilledDepthLarge01OnlyIcons")
fun chipFilledDepthLarge01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    icons: List<Int>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipStyle = ChipStyle.FilledImageDepth
    val chipSize = ChipSize.Large
    val chipColors = ChipDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChip(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = chipStyle,
        chipSize = chipSize,
        chipColors = chipColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val contentColor by chipColors.contentColor(enabled, selected)

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
@JvmName("chipsFilledDepthLarge01TextsAndIcons")
fun chipFilledDepthLarge01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    contents: List<Triple<Int?, String, Int?>>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipStyle = ChipStyle.FilledImageDepth
    val chipSize = ChipSize.Large
    val chipColors = ChipDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChip(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = chipStyle,
        chipSize = chipSize,
        chipColors = chipColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipDefaults.chipTextStyle(chipSize, chipStyle, selected, enabled)
        val contentColor by chipColors.contentColor(enabled, selected)

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
fun chipFilledImageLarge01(
    onClick: () -> Unit,
    imageUrl: String,
    text: String,
    modifier: Modifier = Modifier,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    val chipStyle = ChipStyle.FilledImage
    val chipSize = ChipSize.Large
    val chipColors = ChipDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChip(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = chipStyle,
        chipSize = chipSize,
        chipColors = chipColors,
        spacingBetweenContentAndRemove = 8.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipDefaults.chipTextStyle(chipSize, chipStyle, selected, enabled)
        val contentColor by chipColors.contentColor(enabled, selected)

        ChipImage(
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
fun chipFilledImageDepthLarge01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    imageUrl: String,
    texts: List<String>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipStyle = ChipStyle.FilledImageDepth
    val chipSize = ChipSize.Large
    val chipColors = ChipDefaults.colors(
        backgroundColor = DealiColor.primary04,
        selectedBackgroundColor = DealiColor.g10,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
        outlineColor = DealiColor.g20,
        selectedOutlineColor = DealiColor.transparent,
        disabledOutlineColor = DealiColor.transparent,
    )

    CoreCustomChip(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = chipStyle,
        chipSize = chipSize,
        chipColors = chipColors,
        spacingBetweenContentAndRemove = 8.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipDefaults.chipTextStyle(chipSize, chipStyle, selected, enabled)
        val contentColor by chipColors.contentColor(enabled, selected)

        for ((index, text) in texts.withIndex()) {
            if (index == 0) {
                Row(
                    modifier = Modifier.weight(0.3f),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    ChipImage(
                        imageUrl = imageUrl,
                        enabled = enabled,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
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
                        .padding(horizontal = 12.dp, vertical = 13.dp)
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
fun chipOutlineImageLarge01(
    onClick: () -> Unit,
    imageUrl: String,
    text: String,
    modifier: Modifier = Modifier,
    useRemoveIcon: Boolean = false,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    val chipStyle = ChipStyle.Outline
    val chipSize = ChipSize.Large
    val chipColors = ChipDefaults.colors(
        backgroundColor = DealiColor.primary04,
        selectedBackgroundColor = DealiColor.primary04,
        disabledBackgroundColor = DealiColor.primary04,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
        outlineColor = DealiColor.g20,
        selectedOutlineColor = DealiColor.g100,
        disabledOutlineColor = DealiColor.g20,
    )

    CoreCustomChip(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipStyle = chipStyle,
        chipSize = chipSize,
        chipColors = chipColors,
        spacingBetweenContentAndRemove = 8.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val textStyle = ChipDefaults.chipTextStyle(chipSize, chipStyle, selected, enabled)
        val contentColor by chipColors.contentColor(enabled, selected)

        ChipImage(
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
