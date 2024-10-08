package net.deali.designsystem.internal.chip

internal sealed interface ChipStyle {
    data object Outline : ChipStyle

    data object Filled : ChipStyle

    data class Square(val useBoldFontWeight: Boolean = true) : ChipStyle

    data object FilledSquare : ChipStyle

    data object FilledDepth : ChipStyle

    data object FilledImage : ChipStyle

    data object FilledImageDepth : ChipStyle

    companion object {
        val Square: Square = Square()

        val SquareBold: Square = Square(useBoldFontWeight = true)

        val SquareRegular: Square = Square(useBoldFontWeight = false)
    }
}
