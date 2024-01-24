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
import net.deali.designsystem.internal.chips.ChipsDefaults
import net.deali.designsystem.internal.chips.ChipsImage
import net.deali.designsystem.internal.chips.ChipsSize
import net.deali.designsystem.internal.chips.ChipsStyle
import net.deali.designsystem.internal.chips.CoreCustomChips
import net.deali.designsystem.internal.chips.CoreIconOnlyChips
import net.deali.designsystem.internal.chips.CoreRegularChips
import net.deali.designsystem.theme.DealiColor

@Composable
fun chipsOutlineMedium01(
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
) {
    CoreRegularChips(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Outline,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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
fun chipsOutlineMedium01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChips(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Outline,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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

@Deprecated(message = "API가 변경되었습니다. 향후 제거 될 예정이니 새로운 parameter를 가진 컴포넌트를 사용하세요.")
@Composable
fun chipsOutlineMedium01(
    onClick: () -> Unit,
    text: String,
    useRemoveIcon: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    chipsOutlineMedium01(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = if (useRemoveIcon) R.drawable.ic_x_s else null,
        leftIconColor = leftIconColor,
        rightIconColor = Color.Unspecified,
        onLeftIconClick = null,
        onRightIconClick = onRemoveClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipsSquareBoldMedium01(
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
) {
    CoreRegularChips(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.SquareBold,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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
fun chipsSquareBoldMedium01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChips(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.SquareBold,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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

@Deprecated(message = "API가 변경되었습니다. 향후 제거 될 예정이니 새로운 parameter를 가진 컴포넌트를 사용하세요.")
@Composable
fun chipsSquareBoldMedium01(
    onClick: () -> Unit,
    text: String,
    useRemoveIcon: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    chipsSquareBoldMedium01(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = if (useRemoveIcon) R.drawable.ic_x_s else null,
        leftIconColor = leftIconColor,
        rightIconColor = Color.Unspecified,
        onLeftIconClick = null,
        onRightIconClick = onRemoveClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipsFilledMedium01(
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
) {
    CoreRegularChips(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Filled,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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
fun chipsFilledMedium01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChips(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Filled,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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

@Deprecated(message = "API가 변경되었습니다. 향후 제거 될 예정이니 새로운 parameter를 가진 컴포넌트를 사용하세요.")
@Composable
fun chipsFilledMedium01(
    onClick: () -> Unit,
    text: String,
    useRemoveIcon: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    chipsFilledMedium01(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = if (useRemoveIcon) R.drawable.ic_x_s else null,
        leftIconColor = leftIconColor,
        rightIconColor = Color.Unspecified,
        onLeftIconClick = null,
        onRightIconClick = onRemoveClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipsFilledSquareMedium01(
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
) {
    CoreRegularChips(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Square,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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
fun chipsFilledSquareMedium01(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChips(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Square,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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

@Deprecated(message = "API가 변경되었습니다. 향후 제거 될 예정이니 새로운 parameter를 가진 컴포넌트를 사용하세요.")
@Composable
fun chipsFilledSquareMedium01(
    onClick: () -> Unit,
    text: String,
    useRemoveIcon: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    chipsFilledSquareMedium01(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = if (useRemoveIcon) R.drawable.ic_x_s else null,
        leftIconColor = leftIconColor,
        rightIconColor = Color.Unspecified,
        onLeftIconClick = null,
        onRightIconClick = onRemoveClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
fun chipsFilledSquareMedium02(
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
) {
    CoreRegularChips(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        onLeftIconClick = onLeftIconClick,
        onRightIconClick = onRightIconClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Square,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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
fun chipsFilledSquareMedium02(
    onClick: () -> Unit,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    iconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreIconOnlyChips(
        onClick = onClick,
        icon = icon,
        iconColor = iconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = ChipsStyle.Square,
        chipsSize = ChipsSize.Medium,
        chipsColors = ChipsDefaults.colors(
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

@Deprecated(message = "API가 변경되었습니다. 향후 제거 될 예정이니 새로운 parameter를 가진 컴포넌트를 사용하세요.")
@Composable
fun chipsFilledSquareMedium02(
    onClick: () -> Unit,
    text: String,
    useRemoveIcon: Boolean,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    leftIconColor: Color? = Color.Unspecified,
    onRemoveClick: () -> Unit = {},
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    textAlign: TextAlign? = null,
) {
    chipsFilledSquareMedium02(
        onClick = onClick,
        text = text,
        textAlign = textAlign,
        leftIcon = leftIcon,
        rightIcon = if (useRemoveIcon) R.drawable.ic_x_s else null,
        leftIconColor = leftIconColor,
        rightIconColor = Color.Unspecified,
        onLeftIconClick = null,
        onRightIconClick = onRemoveClick,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        interactionSource = interactionSource,
        modifier = modifier,
    )
}

@Composable
@JvmName("chipsFilledDepthMediumSecondary01OnlyTexts")
fun chipsFilledDepthMedium01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    texts: List<String>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
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
        val contentColor by chipsColors.contentColor(enabled, selected)

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
@JvmName("chipsFilledDepthMediumSecondary01OnlyIcons")
fun chipsFilledDepthMedium01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    icons: List<Int>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        chipsStyle = chipsStyle,
        chipsSize = chipsSize,
        chipsColors = chipsColors,
        spacingBetweenContentAndRemove = 16.dp,
        modifier = modifier,
        interactionSource = interactionSource,
    ) {
        val contentColor by chipsColors.contentColor(enabled, selected)

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
@JvmName("chipsFilledDepthMediumSecondary01TextsAndIcons")
fun chipsFilledDepthMedium01(
    onClick: () -> Unit,
    onRemoveClick: () -> Unit,
    contents: List<Triple<Int?, String, Int?>>,
    modifier: Modifier = Modifier,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
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
        val contentColor by chipsColors.contentColor(enabled, selected)

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
fun chipsFilledImageMedium01(
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
    val chipsStyle = ChipsStyle.FilledImage
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
        backgroundColor = DealiColor.g10,
        selectedBackgroundColor = DealiColor.g20,
        disabledBackgroundColor = DealiColor.g10,
        contentColor = DealiColor.g100,
        selectedContentColor = DealiColor.g100,
        disabledContentColor = DealiColor.g50,
    )

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        clickable = clickable,
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
        val contentColor by chipsColors.contentColor(enabled, selected)

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
fun chipsFilledImageDepthMedium01(
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
    val chipsStyle = ChipsStyle.FilledImageDepth
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
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

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x,
        useRemoveIcon = true,
        clickable = clickable,
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
        val contentColor by chipsColors.contentColor(enabled, selected)

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
fun chipsOutlineImageMedium01(
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
    val chipsStyle = ChipsStyle.Outline
    val chipsSize = ChipsSize.Medium
    val chipsColors = ChipsDefaults.colors(
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

    CoreCustomChips(
        onClick = onClick,
        onRemoveClick = onRemoveClick,
        removeIcon = R.drawable.ic_x_s,
        useRemoveIcon = useRemoveIcon,
        clickable = clickable,
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
        val contentColor by chipsColors.contentColor(enabled, selected)

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
