package net.deali.designsystem.internal.chip

import androidx.compose.runtime.Stable

@Stable
internal sealed interface ChipStyle {
    data object Outline : ChipStyle

    data object OutlineImage : ChipStyle

    data class Square(val useBoldFontWeight: Boolean = true) : ChipStyle

    data object Filled : ChipStyle

    data object FilledSquare : ChipStyle

    data object FilledDepth : ChipStyle

    data object FilledImageDepth : ChipStyle

    companion object {
        val Square: Square = Square()

        val SquareBold: Square = Square(useBoldFontWeight = true)

        val SquareRegular: Square = Square(useBoldFontWeight = false)
    }
}
