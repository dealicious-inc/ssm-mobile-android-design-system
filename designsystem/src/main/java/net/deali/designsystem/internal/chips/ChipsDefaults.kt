package net.deali.designsystem.internal.chips

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

internal object ChipsDefaults {
    @Composable
    fun colors(
        backgroundColor: Color,
        selectedBackgroundColor: Color,
        disabledBackgroundColor: Color,
        contentColor: Color,
        disabledContentColor: Color,
        outlineColor: Color = DealiColor.transparent,
        selectedOutlineColor: Color = DealiColor.transparent,
        disabledOutlineColor: Color = DealiColor.transparent,
    ): ChipsColors {
        return DefaultChipsColors(
            backgroundColor = backgroundColor,
            selectedBackgroundColor = selectedBackgroundColor,
            disabledBackgroundColor = disabledBackgroundColor,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
            outlineColor = outlineColor,
            selectedOutlineColor = selectedOutlineColor,
            disabledOutlineColor = disabledOutlineColor,
        )
    }

    @Composable
    fun chipsShape(style: ChipsStyle): Shape {
        return when (style) {
            is ChipsStyle.Square,
            ChipsStyle.FilledSquare,
            ChipsStyle.FilledDepth,
            ChipsStyle.FilledImage,
            ChipsStyle.FilledImageDepth -> {
                AppTheme.shapes.radius4
            }

            else -> {
                AppTheme.shapes.radius100percent
            }
        }
    }

    @Composable
    fun chipsMinSize(size: ChipsSize): Dp {
        return when (size) {
            ChipsSize.Large -> 46.dp
            ChipsSize.Medium -> 40.dp
            ChipsSize.Small -> 32.dp
        }
    }

    @Composable
    fun chipsPaddings(
        size: ChipsSize,
        style: ChipsStyle,
        useLeftIcon: Boolean,
        useRemoveIcon: Boolean,
        fontWeight: FontWeight?,
    ): PaddingValues {
        return when (size) {
            ChipsSize.Large -> largeChipsPaddings(style)
            ChipsSize.Medium -> mediumChipsPaddings(style, useLeftIcon, useRemoveIcon, fontWeight)
            ChipsSize.Small -> smallChipsPaddings(style, useLeftIcon, useRemoveIcon)
        }
    }

    @Composable
    private fun largeChipsPaddings(style: ChipsStyle): PaddingValues {
        return if (style == ChipsStyle.Outline || style == ChipsStyle.Filled) {
            PaddingValues(horizontal = 16.dp)
        } else {
            PaddingValues(horizontal = 12.dp)
        }
    }

    @Composable
    private fun mediumChipsPaddings(
        style: ChipsStyle,
        useLeftIcon: Boolean,
        useRemoveIcon: Boolean,
        fontWeight: FontWeight?,
    ): PaddingValues {
        return when (style) {
            ChipsStyle.Outline,
            ChipsStyle.Filled -> {
                PaddingValues(horizontal = 16.dp)
            }

            is ChipsStyle.Square -> {
                if (fontWeight == FontWeight.Bold) {
                    PaddingValues(horizontal = 12.dp)
                } else {
                    PaddingValues(
                        start = if (useLeftIcon) 12.dp else 16.dp,
                        end = if (useRemoveIcon) 12.dp else 16.dp,
                    )
                }
            }

            ChipsStyle.FilledSquare -> {
                PaddingValues(
                    start = if (useLeftIcon) 12.dp else 16.dp,
                    end = if (useRemoveIcon) 12.dp else 16.dp,
                )
            }

            ChipsStyle.FilledDepth -> {
                PaddingValues(
                    end = 12.dp,
                )
            }

            ChipsStyle.FilledImage -> {
                PaddingValues(
                    start = 12.dp,
                    end = if (useRemoveIcon) 12.dp else 16.dp,
                )
            }

            ChipsStyle.FilledImageDepth -> {
                PaddingValues(horizontal = 12.dp)
            }
        }
    }

    @Composable
    private fun smallChipsPaddings(
        style: ChipsStyle,
        useLeftIcon: Boolean,
        useRemoveIcon: Boolean,
    ): PaddingValues {
        return when (style) {
            ChipsStyle.Outline,
            ChipsStyle.Filled,
            ChipsStyle.FilledDepth,
            ChipsStyle.FilledImageDepth -> {
                PaddingValues(horizontal = 12.dp)
            }

            is ChipsStyle.Square,
            ChipsStyle.FilledSquare,
            ChipsStyle.FilledImage -> {
                PaddingValues(
                    start = if (useLeftIcon) 8.dp else 12.dp,
                    end = if (useRemoveIcon) 8.dp else 12.dp,
                )
            }
        }
    }

    @Composable
    fun chipsTextStyle(
        chipsSize: ChipsSize,
        chipsStyle: ChipsStyle,
        selected: Boolean,
        enabled: Boolean,
    ): TextStyle {
        return when (chipsSize) {
            ChipsSize.Large -> DealiFont.b2sb14

            ChipsSize.Medium -> {
                if (chipsStyle is ChipsStyle.Square) {
                    return if (enabled && selected) {
                        DealiFont.b2sb14
                    } else {
                        if (chipsStyle.useBoldFontWeight) DealiFont.b2sb14 else DealiFont.b2r14
                    }
                }
                DealiFont.b2sb14
            }

            ChipsSize.Small -> {
                when (chipsStyle) {
                    ChipsStyle.FilledDepth,
                    ChipsStyle.FilledImage,
                    ChipsStyle.FilledImageDepth -> DealiFont.b2r14

                    else -> if (enabled && selected) DealiFont.b2sb14 else DealiFont.b2r14
                }

            }
        }
    }
}

@Stable
internal interface ChipsColors {
    @Composable
    fun backgroundColor(enabled: Boolean, selected: Boolean): State<Color>

    @Composable
    fun contentColor(enabled: Boolean): State<Color>

    @Composable
    fun outlineColor(enabled: Boolean, selected: Boolean): State<Color>
}

@Immutable
private class DefaultChipsColors(
    val backgroundColor: Color,
    val selectedBackgroundColor: Color,
    val disabledBackgroundColor: Color,
    val contentColor: Color,
    val disabledContentColor: Color,
    val outlineColor: Color,
    val selectedOutlineColor: Color,
    val disabledOutlineColor: Color,
) : ChipsColors {
    @Composable
    override fun backgroundColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (selected) {
                    selectedBackgroundColor
                } else {
                    backgroundColor
                }
            } else {
                disabledBackgroundColor
            }
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) contentColor else disabledContentColor)
    }

    @Composable
    override fun outlineColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (selected) {
                    selectedOutlineColor
                } else {
                    outlineColor
                }
            } else {
                disabledOutlineColor
            }
        )
    }
}
