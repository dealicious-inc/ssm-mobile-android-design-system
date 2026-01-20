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
fun btnFilledRoundLarge01(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledRoundLarge02(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledRoundLarge03(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledRoundLarge04(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledRoundLarge05(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledRoundLarge06(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledTonalRoundLarge01(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledTonalRoundLarge02(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledTonalRoundLarge03(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledTonalRoundLarge04(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledTonalRoundLarge05(
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
        buttonSize = ButtonSize.Large,
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
fun btnFilledTonalRoundLarge06(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineRoundLarge01(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineRoundLarge02(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineRoundLarge03(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineRoundLarge04(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineRoundLarge05(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineRoundLarge06(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineBgRoundLarge01(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineBgRoundLarge03(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineBgRoundLarge04(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineBgRoundLarge05(
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
        buttonSize = ButtonSize.Large,
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
fun btnOutlineBgRoundLarge06(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge01(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge02(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge03(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge04(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge05(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge06(
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
        buttonSize = ButtonSize.Large,
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
fun btnTextRoundLarge07(
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
        buttonSize = ButtonSize.Large,
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

@Preview(showBackground = true, backgroundColor = 0x666666, heightDp = 1500)
@Composable
private fun Preview() {
    val modifier = Modifier.padding(bottom = 8.dp)

    Column {
        btnFilledRoundLarge01(
            text = "btnFilledRoundLarge01", onClick = {}, modifier = modifier,
        )
        btnFilledRoundLarge02(
            text = "btnFilledRoundLarge02", onClick = {}, modifier = modifier,
        )
        btnFilledRoundLarge03(
            text = "btnFilledRoundLarge03", onClick = {}, modifier = modifier,
        )
        btnFilledRoundLarge04(
            text = "btnFilledRoundLarge04", onClick = {}, modifier = modifier,
        )
        btnFilledRoundLarge05(
            text = "btnFilledRoundLarge05", onClick = {}, modifier = modifier,
        )
        btnFilledRoundLarge06(
            text = "btnFilledRoundLarge06", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundLarge01(
            text = "btnFilledTonalRoundLarge01", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundLarge02(
            text = "btnFilledTonalRoundLarge02", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundLarge03(
            text = "btnFilledTonalRoundLarge03", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundLarge04(
            text = "btnFilledTonalRoundLarge04", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundLarge05(
            text = "btnFilledTonalRoundLarge05", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundLarge06(
            text = "btnFilledTonalRoundLarge06", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundLarge01(
            text = "btnOutlineRoundLarge01", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundLarge02(
            text = "btnOutlineRoundLarge02", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundLarge03(
            text = "btnOutlineRoundLarge03", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundLarge04(
            text = "btnOutlineRoundLarge04", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundLarge05(
            text = "btnOutlineRoundLarge05", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundLarge06(
            text = "btnOutlineRoundLarge06", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundLarge01(
            text = "btnOutlineBgRoundLarge01", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundLarge03(
            text = "btnOutlineBgRoundLarge03", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundLarge04(
            text = "btnOutlineBgRoundLarge04", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundLarge05(
            text = "btnOutlineBgRoundLarge05", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundLarge06(
            text = "btnOutlineBgRoundLarge06", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge01(
            text = "btnTextRoundLarge01", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge02(
            text = "btnTextRoundLarge02", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge03(
            text = "btnTextRoundLarge03", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge04(
            text = "btnTextRoundLarge04", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge05(
            text = "btnTextRoundLarge05", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge06(
            text = "btnTextRoundLarge06", onClick = {}, modifier = modifier,
        )
        btnTextRoundLarge07(
            text = "btnTextRoundLarge07", onClick = {}, modifier = modifier,
        )
    }
}
