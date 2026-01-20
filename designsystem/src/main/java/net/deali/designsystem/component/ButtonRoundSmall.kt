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
fun btnFilledRoundSmall01(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledRoundSmall02(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledRoundSmall03(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledRoundSmall04(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledRoundSmall05(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledRoundSmall06(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledTonalRoundSmall01(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledTonalRoundSmall02(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledTonalRoundSmall03(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledTonalRoundSmall04(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledTonalRoundSmall05(
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
        buttonSize = ButtonSize.Small,
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
fun btnFilledTonalRoundSmall06(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineRoundSmall01(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineRoundSmall02(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineRoundSmall03(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineRoundSmall04(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineRoundSmall05(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineRoundSmall06(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineBgRoundSmall01(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineBgRoundSmall03(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineBgRoundSmall04(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineBgRoundSmall05(
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
        buttonSize = ButtonSize.Small,
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
fun btnOutlineBgRoundSmall06(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall01(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall02(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall03(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall04(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall05(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall06(
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
        buttonSize = ButtonSize.Small,
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
fun btnTextRoundSmall07(
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
        buttonSize = ButtonSize.Small,
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
        btnFilledRoundSmall01(
            text = "btnFilledRoundSmall01", onClick = {}, modifier = modifier,
        )
        btnFilledRoundSmall02(
            text = "btnFilledRoundSmall02", onClick = {}, modifier = modifier,
        )
        btnFilledRoundSmall03(
            text = "btnFilledRoundSmall03", onClick = {}, modifier = modifier,
        )
        btnFilledRoundSmall04(
            text = "btnFilledRoundSmall04", onClick = {}, modifier = modifier,
        )
        btnFilledRoundSmall05(
            text = "btnFilledRoundSmall05", onClick = {}, modifier = modifier,
        )
        btnFilledRoundSmall06(
            text = "btnFilledRoundSmall06", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundSmall01(
            text = "btnFilledTonalRoundSmall01", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundSmall02(
            text = "btnFilledTonalRoundSmall02", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundSmall03(
            text = "btnFilledTonalRoundSmall03", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundSmall04(
            text = "btnFilledTonalRoundSmall04", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundSmall05(
            text = "btnFilledTonalRoundSmall05", onClick = {}, modifier = modifier,
        )
        btnFilledTonalRoundSmall06(
            text = "btnFilledTonalRoundSmall06", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundSmall01(
            text = "btnOutlineRoundSmall01", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundSmall02(
            text = "btnOutlineRoundSmall02", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundSmall03(
            text = "btnOutlineRoundSmall03", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundSmall04(
            text = "btnOutlineRoundSmall04", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundSmall05(
            text = "btnOutlineRoundSmall05", onClick = {}, modifier = modifier,
        )
        btnOutlineRoundSmall06(
            text = "btnOutlineRoundSmall06", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundSmall01(
            text = "btnOutlineBgRoundSmall01", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundSmall03(
            text = "btnOutlineBgRoundSmall03", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundSmall04(
            text = "btnOutlineBgRoundSmall04", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundSmall05(
            text = "btnOutlineBgRoundSmall05", onClick = {}, modifier = modifier,
        )
        btnOutlineBgRoundSmall06(
            text = "btnOutlineBgRoundSmall06", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall01(
            text = "btnTextRoundSmall01", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall02(
            text = "btnTextRoundSmall02", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall03(
            text = "btnTextRoundSmall03", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall04(
            text = "btnTextRoundSmall04", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall05(
            text = "btnTextRoundSmall05", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall06(
            text = "btnTextRoundSmall06", onClick = {}, modifier = modifier,
        )
        btnTextRoundSmall07(
            text = "btnTextRoundSmall07", onClick = {}, modifier = modifier,
        )
    }
}
