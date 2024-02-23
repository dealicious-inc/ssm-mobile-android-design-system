package net.deali.designsystem.internal.chip

internal sealed interface ChipStyle {
    object Outline : ChipStyle

    object Filled : ChipStyle

    data class Square(val useBoldFontWeight: Boolean = true) : ChipStyle

    object FilledSquare : ChipStyle

    object FilledDepth : ChipStyle

    object FilledImage : ChipStyle

    object FilledImageDepth : ChipStyle

    companion object {
        val Square: Square = Square()

        val SquareBold: Square = Square(useBoldFontWeight = true)

        val SquareRegular : Square = Square(useBoldFontWeight = false)
    }
}
