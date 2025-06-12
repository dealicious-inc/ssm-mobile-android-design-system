package net.deali.designsystem.internal.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

internal object ButtonDefaults {
    @Composable
    fun colors(
        backgroundColor: Color,
        disabledBackgroundColor: Color,
        contentColor: Color,
        disabledContentColor: Color,
        iconColor: Color?,
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
            iconColor = iconColor,
        )
    }

    @Composable
    fun colors(
        backgroundColor: Brush,
        disabledBackgroundColor: Brush,
        contentColor: Color,
        disabledContentColor: Color,
        iconColor: Color?,
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
            iconColor = iconColor ?: contentColor,
        )
    }

    @Composable
    fun buttonShape(buttonSize: ButtonSize, rounded: Boolean): Shape {
        if (rounded) {
            return RoundedCornerShape(percent = 100)
        }
        return when (buttonSize) {
            ButtonSize.Large -> RoundedCornerShape(6.dp)
            ButtonSize.Medium -> RoundedCornerShape(6.dp)
            ButtonSize.SemiMedium -> RoundedCornerShape(6.dp)
            ButtonSize.Small -> RoundedCornerShape(4.dp)
        }
    }

    @Composable
    fun buttonPaddings(
        buttonSize: ButtonSize,
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        isLoading: Boolean,
        rounded: Boolean,
    ): PaddingValues {
        return when (buttonSize) {
            ButtonSize.Large -> largeButtonPaddings(
                buttonStyle,
                useLeftIcon,
                useRightIcon,
                isLoading
            )

            ButtonSize.Medium -> mediumButtonPaddings(
                buttonStyle,
                useLeftIcon,
                useRightIcon,
                isLoading
            )

            ButtonSize.SemiMedium -> semiMediumButtonPaddings(
                buttonStyle,
                useLeftIcon,
                useRightIcon,
                isLoading
            )

            ButtonSize.Small -> smallButtonPaddings(
                buttonStyle,
                useLeftIcon,
                useRightIcon,
                isLoading,
                rounded
            )
        }
    }

    @Composable
    private fun largeButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        isLoading: Boolean,
    ): PaddingValues {
        return when {
            isLoading -> {
                PaddingValues(
                    vertical = 13.dp,
                )
            }

            buttonStyle == ButtonStyle.Text -> {
                PaddingValues(
                    horizontal = 16.dp,
                    vertical = 15.dp,
                )
            }

            else -> {
                val leftPadding = if (useLeftIcon) 16.dp else 20.dp
                val rightPadding = if (useRightIcon) 16.dp else 20.dp
                val verticalPadding = 15.dp

                PaddingValues(
                    start = leftPadding,
                    end = rightPadding,
                    top = verticalPadding,
                    bottom = verticalPadding,
                )
            }
        }
    }

    @Composable
    private fun mediumButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        isLoading: Boolean,
    ): PaddingValues {
        return when {
            isLoading -> {
                PaddingValues(
                    vertical = 11.dp,
                )
            }

            buttonStyle == ButtonStyle.Text -> {
                PaddingValues(
                    horizontal = 16.dp,
                    vertical = 13.dp,
                )
            }

            else -> {
                val leftPadding = if (useLeftIcon) 16.dp else 20.dp
                val rightPadding = if (useRightIcon) 16.dp else 20.dp
                val verticalPadding = 13.dp

                PaddingValues(
                    start = leftPadding,
                    end = rightPadding,
                    top = verticalPadding,
                    bottom = verticalPadding,
                )
            }
        }
    }

    @Composable
    private fun semiMediumButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        isLoading: Boolean,
    ): PaddingValues {
        return when {
            isLoading -> {
                PaddingValues(
                    vertical = 8.dp,
                )
            }

            buttonStyle == ButtonStyle.Text -> {
                PaddingValues(
                    horizontal = 16.dp,
                    vertical = 10.dp,
                )
            }

            else -> {
                val leftPadding = if (useLeftIcon) 12.dp else 16.dp
                val rightPadding = if (useRightIcon) 12.dp else 16.dp
                val verticalPadding = 10.dp

                PaddingValues(
                    start = leftPadding,
                    end = rightPadding,
                    top = verticalPadding,
                    bottom = verticalPadding,
                )
            }
        }
    }

    @Composable
    private fun smallButtonPaddings(
        buttonStyle: ButtonStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        isLoading: Boolean,
        rounded: Boolean
    ): PaddingValues {
        return when {
            isLoading -> {
                PaddingValues(
                    vertical = 8.dp,
                )
            }

            rounded -> { // TODO DRG 체크!
                PaddingValues(
                    start = if (useLeftIcon) 12.dp else 16.dp,
                    end = if (useRightIcon) 12.dp else 16.dp
                )
            }

            buttonStyle == ButtonStyle.Text -> {
                PaddingValues(
                    horizontal = 16.dp,
                    vertical = 7.dp,
                )
            }

            else -> {
                val leftPadding = if (useLeftIcon) 8.dp else 12.dp
                val rightPadding = if (useRightIcon) 8.dp else 12.dp
                val verticalPadding = 7.dp

                PaddingValues(
                    start = leftPadding,
                    end = rightPadding,
                    top = verticalPadding,
                    bottom = verticalPadding,
                )
            }
        }
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

            ButtonSize.SemiMedium -> if (buttonStyle == ButtonStyle.Text) {
                DealiFont.b2r14
            } else {
                DealiFont.b2sb14
            }

            ButtonSize.Small -> if (buttonStyle == ButtonStyle.Text) {
                DealiFont.b3r13
            } else {
                DealiFont.b3sb13
            }
        }
    }

    @Composable
    fun loadingIconSize(buttonSize: ButtonSize): DpSize {
        return when (buttonSize) {
            ButtonSize.Large, ButtonSize.Medium -> DpSize(24.dp, 24.dp)
            ButtonSize.SemiMedium, ButtonSize.Small -> DpSize(16.dp, 16.dp)
        }
    }

    @Composable
    fun subIconSize(buttonSize: ButtonSize): Dp {
        return when (buttonSize) {
            ButtonSize.Small -> 16.dp
            else -> 20.dp
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

    @Composable
    fun iconColor(enabled: Boolean): State<Color>
}

@Immutable
private class DefaultButtonColors(
    val backgroundColor: Brush,
    val disabledBackgroundColor: Brush,
    val outlineColor: Color,
    val disabledOutlineColor: Color,
    val contentColor: Color,
    val disabledContentColor: Color,
    val iconColor: Color?,
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

    /**
     * 아이콘 설정을 따로 하지 않은 경우 : 텍스트 컬러를 따름. (enabled: contentColor, disabled: disabledContentColor)
     * 아이콘 컬러를 임의 설정한 경우 : enabled 여부와 상관없이 임의 설정한 컬러 사용.
     */
    @Composable
    override fun iconColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(
            if (iconColor == null) {
                if (enabled) contentColor else disabledContentColor
            } else {
                iconColor
            }
        )
    }
}
