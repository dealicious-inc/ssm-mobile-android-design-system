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
fun btnFilledMedium01(
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
        onClick = onClick,
    )
}


@Composable
fun btnFilledMedium02(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledMedium03(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledMedium04(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledMedium05(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledMedium06(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalMedium01(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalMedium02(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalMedium03(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalMedium04(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalMedium05(
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
        onClick = onClick,
    )
}

@Composable
fun btnFilledTonalMedium06(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineMedium01(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineMedium02(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineMedium03(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineMedium04(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineMedium05(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineMedium06(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgMedium01(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgMedium03(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgMedium04(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgMedium05(
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
        onClick = onClick,
    )
}

@Composable
fun btnOutlineBgMedium06(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium01(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium02(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium03(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium04(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium05(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium06(
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
        onClick = onClick,
    )
}

@Composable
fun btnTextMedium07(
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
        onClick = onClick,
    )
}

@Preview(showBackground = true, backgroundColor = 0x666666, heightDp = 1500)
@Composable
private fun Preview() {
    val modifier = Modifier.padding(bottom = 8.dp)

    Column {
        btnFilledMedium01(
            text = "btnFilledMedium01", onClick = {}, modifier = modifier,
        )
        btnFilledMedium02(
            text = "btnFilledMedium02", onClick = {}, modifier = modifier,
        )
        btnFilledMedium03(
            text = "btnFilledMedium03", onClick = {}, modifier = modifier,
        )
        btnFilledTonalMedium01(
            text = "btnFilledTonalMedium01", onClick = {}, modifier = modifier,
        )
        btnFilledTonalMedium02(
            text = "btnFilledTonalMedium02", onClick = {}, modifier = modifier,
        )
        btnFilledTonalMedium03(
            text = "btnFilledTonalMedium03", onClick = {}, modifier = modifier,
        )
        btnFilledTonalMedium04(
            text = "btnFilledTonalMedium04", onClick = {}, modifier = modifier,
        )
        btnFilledTonalMedium05(
            text = "btnFilledTonalMedium05", onClick = {}, modifier = modifier,
        )
        btnFilledTonalMedium06(
            text = "btnFilledTonalMedium06", onClick = {}, modifier = modifier,
        )
        btnOutlineMedium01(
            text = "btnOutlineMedium01", onClick = {}, modifier = modifier,
        )
        btnOutlineMedium02(
            text = "btnOutlineMedium02", onClick = {}, modifier = modifier,
        )
        btnOutlineMedium03(
            text = "btnOutlineMedium03", onClick = {}, modifier = modifier,
        )
        btnOutlineMedium04(
            text = "btnOutlineMedium04", onClick = {}, modifier = modifier,
        )
        btnOutlineMedium05(
            text = "btnOutlineMedium05", onClick = {}, modifier = modifier,
        )
        btnOutlineMedium06(
            text = "btnOutlineMedium06", onClick = {}, modifier = modifier,
        )
        btnOutlineBgMedium01(
            text = "btnOutlineBgMedium01", onClick = {}, modifier = modifier,
        )
        btnOutlineBgMedium03(
            text = "btnOutlineBgMedium03", onClick = {}, modifier = modifier,
        )
        btnOutlineBgMedium04(
            text = "btnOutlineBgMedium04", onClick = {}, modifier = modifier,
        )
        btnOutlineBgMedium05(
            text = "btnOutlineBgMedium05", onClick = {}, modifier = modifier,
        )
        btnOutlineBgMedium06(
            text = "btnOutlineBgMedium06", onClick = {}, modifier = modifier,
        )
        btnTextMedium01(
            text = "btnTextMedium01", onClick = {}, modifier = modifier,
        )
        btnTextMedium02(
            text = "btnTextMedium02", onClick = {}, modifier = modifier,
        )
        btnTextMedium03(
            text = "btnTextMedium03", onClick = {}, modifier = modifier,
        )
        btnTextMedium04(
            text = "btnTextMedium04", onClick = {}, modifier = modifier,
        )
        btnTextMedium05(
            text = "btnTextMedium05", onClick = {}, modifier = modifier,
        )
        btnTextMedium06(
            text = "btnTextMedium06", onClick = {}, modifier = modifier,
        )
        btnTextMedium07(
            text = "btnTextMedium07", onClick = {}, modifier = modifier,
        )
    }
}
