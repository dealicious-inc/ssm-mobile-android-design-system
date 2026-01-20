package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.button.ButtonDefaults
import net.deali.designsystem.internal.button.ButtonSize
import net.deali.designsystem.internal.button.ButtonStyle
import net.deali.designsystem.internal.button.CoreButton
import net.deali.designsystem.theme.DealiColor

@Composable
fun btnFilledRoundMedium01(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary01,
            disabledBackgroundColor = DealiColor.g40,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}


@Composable
fun btnFilledRoundMedium02(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.gradient,
            disabledBackgroundColor = SolidColor(DealiColor.g40),
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledRoundMedium03(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.b40,
            disabledBackgroundColor = DealiColor.b20,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledRoundMedium04(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.mbs01,
            disabledBackgroundColor = DealiColor.g40,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledRoundMedium05(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.gradient01,
            disabledBackgroundColor = SolidColor(DealiColor.g40),
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledRoundMedium06(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Filled,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary05,
            disabledBackgroundColor = DealiColor.g40,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.primary04,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalRoundMedium01(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary03,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalRoundMedium02(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.w20,
            disabledBackgroundColor = DealiColor.w20,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalRoundMedium03(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalRoundMedium04(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalRoundMedium05(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g10,
            contentColor = DealiColor.g70,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalRoundMedium06(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.FilledTonal,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineRoundMedium01(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.g30,
            iconColor = iconColor,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineRoundMedium02(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.primary04,
            disabledOutlineColor = DealiColor.w50,
            iconColor = iconColor,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineRoundMedium03(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.secondary01,
            disabledOutlineColor = DealiColor.g30,
            iconColor = iconColor,
            contentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineRoundMedium04(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g30,
            iconColor = iconColor,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineRoundMedium05(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            iconColor = iconColor,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineRoundMedium06(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            iconColor = iconColor,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgRoundMedium01(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            outlineColor = DealiColor.primary01,
            disabledOutlineColor = DealiColor.g30,
            iconColor = iconColor,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgRoundMedium03(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            outlineColor = DealiColor.secondary01,
            disabledOutlineColor = DealiColor.g30,
            iconColor = iconColor,
            contentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgRoundMedium04(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            outlineColor = DealiColor.g100,
            disabledOutlineColor = DealiColor.g30,
            iconColor = iconColor,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgRoundMedium05(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            iconColor = iconColor,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgRoundMedium06(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Outline,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.primary04,
            outlineColor = DealiColor.g30,
            disabledOutlineColor = DealiColor.g20,
            iconColor = iconColor,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium01(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.primary01,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium02(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.primary04,
            disabledContentColor = DealiColor.w50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium03(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.secondary01,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium04(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g100,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium05(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g80,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium06(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g70,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}

@Composable
fun btnTextRoundMedium07(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    clickable: Boolean = true,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CoreButton(
        modifier = modifier,
        text = text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        clickable = clickable,
        enabled = enabled,
        loading = loading,
        buttonStyle = ButtonStyle.Text,
        buttonSize = ButtonSize.Medium,
        buttonColors = ButtonDefaults.colors(
            backgroundColor = DealiColor.transparent,
            disabledBackgroundColor = DealiColor.transparent,
            contentColor = DealiColor.g60,
            disabledContentColor = DealiColor.g50,
            iconColor = iconColor,
        ),
        overflow = overflow,
        maxLines = maxLines,
        interactionSource = interactionSource,
        isRoundShape = true,
        onClick = onClick,
    )
}


@Preview(showBackground = true, backgroundColor = 0x666666)
@Composable
private fun Preview() {
    val modifier = Modifier.padding(bottom = 8.dp)

    Column {
        btnFilledRoundMedium01(
            text = "btnFilledRoundMedium01", onClick = {}, modifier = modifier,
        )
        btnFilledRoundMedium02(
            text = "btnFilledRoundMedium02", onClick = {}, modifier = modifier,
        )
        btnFilledRoundMedium03(
            text = "btnFilledRoundMedium03", onClick = {}, modifier = modifier,
        )
        btnFilledRoundMedium04(
            text = "btnFilledRoundMedium04", onClick = {}, modifier = modifier,
        )
        btnFilledRoundMedium05(
            text = "btnFilledRoundMedium05", onClick = {}, modifier = modifier,
        )
        btnFilledRoundMedium06(
            text = "btnFilledRoundMedium06", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundMedium01(
            text = "btnFilledTonalRoundMedium01", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundMedium02(
            text = "btnFilledTonalRoundMedium02", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundMedium03(
            text = "btnFilledTonalRoundMedium03", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundMedium04(
            text = "btnFilledTonalRoundMedium04", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundMedium05(
            text = "btnFilledTonalRoundMedium05", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundMedium06(
            text = "btnFilledTonalRoundMedium06", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundMedium01(
            text = "btnOutlineRoundMedium01", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundMedium02(
            text = "btnOutlineRoundMedium02", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundMedium03(
            text = "btnOutlineRoundMedium03", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundMedium04(
            text = "btnOutlineRoundMedium04", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundMedium05(
            text = "btnOutlineRoundMedium05", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundMedium06(
            text = "btnOutlineRoundMedium06", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundMedium01(
            text = "btnOutlineBgRoundMedium01", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundMedium03(
            text = "btnOutlineBgRoundMedium03", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundMedium04(
            text = "btnOutlineBgRoundMedium04", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundMedium05(
            text = "btnOutlineBgRoundMedium05", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundMedium06(
            text = "btnOutlineBgRoundMedium06", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium01(
            text = "btnTextRoundMedium01", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium02(
            text = "btnTextRoundMedium02", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium03(
            text = "btnTextRoundMedium03", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium04(
            text = "btnTextRoundMedium04", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium05(
            text = "btnTextRoundMedium05", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium06(
            text = "btnTextRoundMedium06", onClick = {}, modifier = modifier,
        )
        btnTextRoundMedium07(
            text = "btnTextRoundMedium07", onClick = {}, modifier = modifier,
        )
    }
}
