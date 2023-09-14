package net.deali.designsystem.internal.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

internal object ButtonDefaults {

    @Composable
    fun colors(
        backgroundColor: Color,
        disabledBackgroundColor: Color,
        contentColor: Color,
        disabledContentColor: Color,
        outlineColor: Color = DealiColor.transparent,
        disabledOutlineColor: Color = DealiColor.transparent,
    ): ButtonColors {
        return DefaultButtonColors(
            backgroundColor = SolidColor(backgroundColor),
            disabledBackgroundColor = SolidColor(disabledBackgroundColor),
            outlineColor = outlineColor,
            disabledOutlineColor = disabledOutlineColor,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
        )
    }

    @Composable
    fun colors(
        backgroundColor: Brush,
        disabledBackgroundColor: Brush,
        contentColor: Color,
        disabledContentColor: Color,
        outlineColor: Color = DealiColor.transparent,
        disabledOutlineColor: Color = DealiColor.transparent,
    ): ButtonColors {
        return DefaultButtonColors(
            backgroundColor = backgroundColor,
            disabledBackgroundColor = disabledBackgroundColor,
            outlineColor = outlineColor,
            disabledOutlineColor = disabledOutlineColor,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
        )
    }

    @Composable
    fun buttonShape(buttonSize: ButtonSize, rounded: Boolean): Shape {
        if (rounded) {
            return AppTheme.shapes.radius100percent
        }
        return when (buttonSize) {
            ButtonSize.Large -> AppTheme.shapes.radius6
            ButtonSize.Medium -> AppTheme.shapes.radius6
            ButtonSize.Small -> AppTheme.shapes.radius4
        }
    }

    @Composable
    fun buttonMinHeight(buttonSize: ButtonSize): Dp {
        return when (buttonSize) {
            ButtonSize.Large -> 50.dp
            ButtonSize.Medium -> 46.dp
            ButtonSize.Small -> 32.dp
        }
    }

    @Composable
    fun buttonPaddings(
        buttonSize: ButtonSize,
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
    ): PaddingValues {
        return when (buttonSize) {
            ButtonSize.Large -> largeButtonPaddings(buttonStyle, useLeftIcon, useRightIcon)
            ButtonSize.Medium -> mediumButtonPaddings(buttonStyle, useLeftIcon, useRightIcon)
            ButtonSize.Small -> smallButtonPaddings(buttonStyle, useLeftIcon, useRightIcon)
        }
    }

    @Composable
    private fun largeButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean
    ): PaddingValues {
        if (buttonStyle == ButtonStyle.Text) {
            return PaddingValues(horizontal = 16.dp)
        }
        if (!useLeftIcon && !useRightIcon) {
            return PaddingValues(horizontal = 40.dp)
        }
        val leftPadding = if (useLeftIcon) 16.dp else 20.dp
        val rightPadding = if (useRightIcon) 16.dp else 20.dp
        return PaddingValues(start = leftPadding, end = rightPadding)
    }

    @Composable
    private fun mediumButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean
    ): PaddingValues {
        if (buttonStyle == ButtonStyle.Text) {
            return PaddingValues(horizontal = 16.dp)
        }
        val leftPadding = if (useLeftIcon) 16.dp else 20.dp
        val rightPadding = if (useRightIcon) 16.dp else 20.dp
        return PaddingValues(start = leftPadding, end = rightPadding)
    }

    @Composable
    private fun smallButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean
    ): PaddingValues {
        if (buttonStyle == ButtonStyle.Text) {
            return PaddingValues(horizontal = 16.dp)
        }
        val leftPadding = if (useLeftIcon) 12.dp else 16.dp
        val rightPadding = if (useRightIcon) 12.dp else 16.dp
        return PaddingValues(start = leftPadding, end = rightPadding)
    }

    @Composable
    fun buttonTextStyle(buttonSize: ButtonSize, buttonStyle: ButtonStyle): TextStyle {
        return when (buttonSize) {
            ButtonSize.Large -> DealiFont.b1sb15

            ButtonSize.Medium -> if (buttonStyle == ButtonStyle.Text) {
                DealiFont.b2r14
            } else {
                DealiFont.b2sb14
            }

            ButtonSize.Small -> if (buttonStyle == ButtonStyle.Text) {
                DealiFont.b4r12
            } else {
                DealiFont.b4sb12
            }
        }
    }
}

@Stable
internal interface ButtonColors {
    @Composable
    fun backgroundColor(enabled: Boolean): State<Brush>

    @Composable
    fun outlineColor(enabled: Boolean): State<Color>

    @Composable
    fun contentColor(enabled: Boolean): State<Color>
}

@Immutable
private class DefaultButtonColors(
    val backgroundColor: Brush,
    val disabledBackgroundColor: Brush,
    val outlineColor: Color,
    val disabledOutlineColor: Color,
    val contentColor: Color,
    val disabledContentColor: Color,
) : ButtonColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Brush> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun outlineColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) outlineColor else disabledOutlineColor)
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }
}
