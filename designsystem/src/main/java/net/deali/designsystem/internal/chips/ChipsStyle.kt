package net.deali.designsystem.internal.chips

internal sealed interface ChipsStyle {
    object Outline : ChipsStyle

    object Filled : ChipsStyle

    data class Square(val useBoldFontWeight: Boolean = true) : ChipsStyle

    object FilledSquare : ChipsStyle

    object FilledDepth : ChipsStyle

    object FilledImage : ChipsStyle

    object FilledImageDepth : ChipsStyle

    companion object {
        val Square: Square = Square()

        val SquareBold: Square = Square(useBoldFontWeight = true)

        val SquareRegular : Square = Square(useBoldFontWeight = false)
    }
}
