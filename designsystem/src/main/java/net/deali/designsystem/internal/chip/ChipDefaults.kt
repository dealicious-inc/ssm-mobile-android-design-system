package net.deali.designsystem.internal.chip

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
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape

internal object ChipDefaults {
    @Composable
    fun colors(
        backgroundColor: Color,
        selectedBackgroundColor: Color,
        disabledBackgroundColor: Color,
        contentColor: Color,
        selectedContentColor: Color,
        disabledContentColor: Color,
        outlineColor: Color = DealiColor.transparent,
        selectedOutlineColor: Color = DealiColor.transparent,
        disabledOutlineColor: Color = DealiColor.transparent,
    ): ChipColors {
        return DefaultChipColors(
            backgroundColor = backgroundColor,
            selectedBackgroundColor = selectedBackgroundColor,
            disabledBackgroundColor = disabledBackgroundColor,
            contentColor = contentColor,
            selectedContentColor = selectedContentColor,
            disabledContentColor = disabledContentColor,
            outlineColor = outlineColor,
            selectedOutlineColor = selectedOutlineColor,
            disabledOutlineColor = disabledOutlineColor,
        )
    }

    @Composable
    fun chipShape(style: ChipStyle): Shape {
        return when (style) {
            is ChipStyle.Square,
            ChipStyle.FilledSquare,
            ChipStyle.FilledDepth,
            ChipStyle.FilledImage,
            ChipStyle.FilledImageDepth -> {
                DealiShape.radius4
            }

            else -> {
                DealiShape.radius100
            }
        }
    }

    @Composable
    fun chipMinSize(size: ChipSize): Dp {
        return when (size) {
            ChipSize.Large -> 46.dp
            ChipSize.Medium -> 40.dp
            ChipSize.Small -> 32.dp
        }
    }

    @Composable
    fun chipPaddings(
        size: ChipSize,
        style: ChipStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        useOnlyCenterIcon: Boolean,
        fontWeight: FontWeight?,
        textSingleLine: Boolean,
    ): PaddingValues {
        if (useOnlyCenterIcon) return PaddingValues(all = 0.dp)

        return when (size) {
            ChipSize.Large -> largeChipPaddings(style, textSingleLine)

            ChipSize.Medium -> mediumChipPaddings(
                style = style,
                useLeftIcon = useLeftIcon,
                useRightIcon = useRightIcon,
                fontWeight = fontWeight,
                textSingleLine = textSingleLine,
            )

            ChipSize.Small -> smallChipPaddings(
                style = style,
                useLeftIcon = useLeftIcon,
                useRightIcon = useRightIcon,
                textSingleLine = textSingleLine,
            )
        }
    }

    @Composable
    private fun largeChipPaddings(style: ChipStyle, textSingleLine: Boolean): PaddingValues {
        return if (style == ChipStyle.Outline || style == ChipStyle.Filled) {
            PaddingValues(
                horizontal = 16.dp,
                vertical = if (textSingleLine) 0.dp else 10.dp
            )
        } else {
            PaddingValues(
                horizontal = 12.dp,
                vertical = if (textSingleLine) 0.dp else 10.dp
            )
        }
    }

    @Composable
    private fun mediumChipPaddings(
        style: ChipStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        fontWeight: FontWeight?,
        textSingleLine: Boolean,
    ): PaddingValues {
        val verticalPadding = if (textSingleLine) 0.dp else 7.dp

        return when (style) {
            ChipStyle.Outline,
            ChipStyle.Filled -> {
                PaddingValues(horizontal = 16.dp, vertical = verticalPadding)
            }

            is ChipStyle.Square -> {
                if (fontWeight == FontWeight.Bold) {
                    PaddingValues(horizontal = 12.dp, vertical = verticalPadding)
                } else {
                    PaddingValues(
                        start = if (useLeftIcon) 12.dp else 16.dp,
                        end = if (useRightIcon) 12.dp else 16.dp,
                        top = verticalPadding,
                        bottom = verticalPadding
                    )
                }
            }

            ChipStyle.FilledSquare -> {
                PaddingValues(
                    start = if (useLeftIcon) 12.dp else 16.dp,
                    end = if (useRightIcon) 12.dp else 16.dp,
                    top = verticalPadding,
                    bottom = verticalPadding
                )
            }

            ChipStyle.FilledDepth -> {
                PaddingValues(
                    end = 12.dp,
                )
            }

            ChipStyle.FilledImage -> {
                PaddingValues(
                    start = 12.dp,
                    end = if (useRightIcon) 12.dp else 16.dp,
                )
            }

            ChipStyle.FilledImageDepth -> {
                PaddingValues(horizontal = 12.dp)
            }
        }
    }

    @Composable
    private fun smallChipPaddings(
        style: ChipStyle,
        useLeftIcon: Boolean,
        useRightIcon: Boolean,
        textSingleLine: Boolean,
    ): PaddingValues {
        return when (style) {
            ChipStyle.Outline,
            ChipStyle.Filled,
            ChipStyle.FilledDepth,
            ChipStyle.FilledImageDepth -> {
                PaddingValues(
                    horizontal = 12.dp,
                    vertical = if (textSingleLine) 0.dp else 3.dp
                )
            }

            is ChipStyle.Square,
            ChipStyle.FilledSquare,
            ChipStyle.FilledImage -> {
                PaddingValues(
                    start = if (useLeftIcon) 8.dp else 12.dp,
                    end = if (useRightIcon) 8.dp else 12.dp,
                    top = if (textSingleLine) 0.dp else 3.dp,
                    bottom = if (textSingleLine) 0.dp else 3.dp
                )
            }
        }
    }

    @Composable
    fun chipTextStyle(
        chipSize: ChipSize,
        chipStyle: ChipStyle,
        selected: Boolean,
        enabled: Boolean,
    ): TextStyle {
        return when (chipSize) {
            ChipSize.Large -> DealiFont.b2sb14

            ChipSize.Medium -> {
                if (chipStyle is ChipStyle.Square) {
                    return if (enabled && selected) {
                        DealiFont.b2sb14
                    } else {
                        if (chipStyle.useBoldFontWeight) DealiFont.b2sb14 else DealiFont.b2r14
                    }
                }
                DealiFont.b2sb14
            }

            ChipSize.Small -> {
                when (chipStyle) {
                    ChipStyle.FilledDepth,
                    ChipStyle.FilledImage,
                    ChipStyle.FilledImageDepth -> DealiFont.b2r14

                    else -> if (enabled && selected) DealiFont.b2sb14 else DealiFont.b2r14
                }

            }
        }
    }
}

@Stable
internal interface ChipColors {
    @Composable
    fun backgroundColor(enabled: Boolean, selected: Boolean): State<Color>

    @Composable
    fun contentColor(enabled: Boolean, selected: Boolean): State<Color>

    @Composable
    fun outlineColor(enabled: Boolean, selected: Boolean): State<Color>
}

@Immutable
private class DefaultChipColors(
    val backgroundColor: Color,
    val selectedBackgroundColor: Color,
    val disabledBackgroundColor: Color,
    val contentColor: Color,
    val selectedContentColor: Color,
    val disabledContentColor: Color,
    val outlineColor: Color,
    val selectedOutlineColor: Color,
    val disabledOutlineColor: Color,
) : ChipColors {
    @Composable
    override fun backgroundColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            when {
                enabled && selected -> selectedBackgroundColor
                enabled && !selected -> backgroundColor
                else -> disabledBackgroundColor
            }
        )
    }

    @Composable
    override fun contentColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            when {
                enabled && selected -> selectedContentColor
                enabled && !selected -> contentColor
                else -> disabledContentColor
            }
        )
    }

    @Composable
    override fun outlineColor(enabled: Boolean, selected: Boolean): State<Color> {
        return rememberUpdatedState(
            when {
                enabled && selected -> selectedOutlineColor
                enabled && !selected -> outlineColor
                else -> disabledOutlineColor
            }
        )
    }
}
