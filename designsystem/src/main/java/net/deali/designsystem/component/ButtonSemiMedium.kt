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
fun btnFilledSemiMedium01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledSemiMedium02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledSemiMedium03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledSemiMedium04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledSemiMedium05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledSemiMedium06(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledTonalSemiMedium01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledTonalSemiMedium02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledTonalSemiMedium03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledTonalSemiMedium04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledTonalSemiMedium05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnFilledTonalSemiMedium06(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineSemiMedium01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineSemiMedium02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineSemiMedium03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineSemiMedium04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineSemiMedium05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineSemiMedium06(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineBgSemiMedium01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineBgSemiMedium03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineBgSemiMedium04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineBgSemiMedium05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnOutlineBgSemiMedium06(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium06(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
fun btnTextSemiMedium07(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    clickable: Boolean = true,
    enabled: Boolean = true,
    loading: Boolean = false,
    iconColor: Color? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
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
        buttonSize = ButtonSize.SemiMedium,
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
        btnFilledSemiMedium01(
            text = "btnFilledSemiMedium01", onClick = {}, modifier = modifier,
        )
        btnFilledSemiMedium02(
            text = "btnFilledSemiMedium02", onClick = {}, modifier = modifier,
        )
        btnFilledSemiMedium03(
            text = "btnFilledSemiMedium03", onClick = {}, modifier = modifier,
        )
        btnFilledSemiMedium04(
            text = "btnFilledSemiMedium04", onClick = {}, modifier = modifier,
        )
        btnFilledSemiMedium05(
            text = "btnFilledSemiMedium05", onClick = {}, modifier = modifier,
        )
        btnFilledSemiMedium06(
            text = "btnFilledSemiMedium06", onClick = {}, modifier = modifier,
        )
        btnFilledTonalSemiMedium01(
            text = "btnFilledTonalSemiMedium01", onClick = {}, modifier = modifier,
        )
        btnFilledTonalSemiMedium02(
            text = "btnFilledTonalSemiMedium02", onClick = {}, modifier = modifier,
        )
        btnFilledTonalSemiMedium03(
            text = "btnFilledTonalSemiMedium03", onClick = {}, modifier = modifier,
        )
        btnFilledTonalSemiMedium04(
            text = "btnFilledTonalSemiMedium04", onClick = {}, modifier = modifier,
        )
        btnFilledTonalSemiMedium05(
            text = "btnFilledTonalSemiMedium05", onClick = {}, modifier = modifier,
        )
        btnFilledTonalSemiMedium06(
            text = "btnFilledTonalSemiMedium06", onClick = {}, modifier = modifier,
        )
        btnOutlineSemiMedium01(
            text = "btnOutlineSemiMedium01", onClick = {}, modifier = modifier,
        )
        btnOutlineSemiMedium02(
            text = "btnOutlineSemiMedium02", onClick = {}, modifier = modifier,
        )
        btnOutlineSemiMedium03(
            text = "btnOutlineSemiMedium03", onClick = {}, modifier = modifier,
        )
        btnOutlineSemiMedium04(
            text = "btnOutlineSemiMedium04", onClick = {}, modifier = modifier,
        )
        btnOutlineSemiMedium05(
            text = "btnOutlineSemiMedium05", onClick = {}, modifier = modifier,
        )
        btnOutlineSemiMedium06(
            text = "btnOutlineSemiMedium06", onClick = {}, modifier = modifier,
        )
        btnOutlineBgSemiMedium01(
            text = "btnOutlineBgSemiMedium01", onClick = {}, modifier = modifier,
        )
        btnOutlineBgSemiMedium03(
            text = "btnOutlineBgSemiMedium03", onClick = {}, modifier = modifier,
        )
        btnOutlineBgSemiMedium04(
            text = "btnOutlineBgSemiMedium04", onClick = {}, modifier = modifier,
        )
        btnOutlineBgSemiMedium05(
            text = "btnOutlineBgSemiMedium05", onClick = {}, modifier = modifier,
        )
        btnOutlineBgSemiMedium06(
            text = "btnOutlineBgSemiMedium06", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium01(
            text = "btnTextSemiMedium01", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium02(
            text = "btnTextSemiMedium02", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium03(
            text = "btnTextSemiMedium03", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium04(
            text = "btnTextSemiMedium04", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium05(
            text = "btnTextSemiMedium05", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium06(
            text = "btnTextSemiMedium06", onClick = {}, modifier = modifier,
        )
        btnTextSemiMedium07(
            text = "btnTextSemiMedium07", onClick = {}, modifier = modifier,
        )
    }
}
