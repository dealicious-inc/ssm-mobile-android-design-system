package net.deali.designsystem.internal.textfield

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
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.AppTheme

internal object DealiTextFieldDefaults {
    val BorderWidth: Dp = 1.dp
    val BorderShape: Shape = RoundedCornerShape(6.dp)

    /** Unicode character '▪' */
    private const val SquareBullet: Char = '\u25aa'
    private const val Space: Char = ' '
    const val HelperTextBullet: String = "${SquareBullet}${Space}"

//    TODO DRG AppTheme.colors.text01 로 바꿔야 함.
    val Cursor: Brush = SolidColor(Color(0xFF222222))

    val TextStyle: TextStyle
        @Composable
        get() = AppTheme.typography.b2r14

    @Composable
    fun paddings(): DealiTextFieldPaddingValues {
        return DefaultDealiTextFieldPaddingValues(
            start = 12.dp,
            end = 12.dp,
            decoratedEnd = 16.dp,
        )
    }

    @Composable
    fun colors(): DealiTextFieldColors {
        return DefaultDealiTextFieldColors(
            backgroundColor = AppTheme.colors.primary04,
            disabledBackgroundColor = AppTheme.colors.divider03,
            outlineColor = AppTheme.colors.line04,
            focusedOutlineColor = AppTheme.colors.line01,
            errorOutlineColor = AppTheme.colors.error,
            textColor = AppTheme.colors.text01,
            disabledTextColor = AppTheme.colors.text05,
            placeholderTextColor = AppTheme.colors.text03,
            labelTextColor = AppTheme.colors.text01,
            helperTextColor = AppTheme.colors.text03,
            errorHelperTextColor = AppTheme.colors.error,
        )
    }
}

@Stable
internal interface DealiTextFieldPaddingValues {
    @Composable
    fun padding(decorated: Boolean): State<PaddingValues>
}

@Immutable
private class DefaultDealiTextFieldPaddingValues(
    private val start: Dp,
    private val end: Dp,
    private val decoratedEnd: Dp
) : DealiTextFieldPaddingValues {
    @Composable
    override fun padding(decorated: Boolean): State<PaddingValues> {
        return rememberUpdatedState(
            if (decorated) {
                PaddingValues(start = start, end = decoratedEnd)
            } else {
                PaddingValues(start = start, end = end)
            }
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as DefaultDealiTextFieldPaddingValues

        if (this.start != other.start) return false
        if (this.end != other.end) return false
        if (this.decoratedEnd != other.decoratedEnd) return false

        return true
    }

    override fun hashCode(): Int {
        var hash = start.hashCode()
        hash = 31 * hash + end.hashCode()
        hash = 31 * hash + decoratedEnd.hashCode()
        return hash
    }
}

@Stable
internal interface DealiTextFieldColors {
    @Composable
    fun backgroundColor(enabled: Boolean): State<Color>

    @Composable
    fun outlineColor(enabled: Boolean, focused: Boolean, isError: Boolean): State<Color>

    @Composable
    fun textColor(enabled: Boolean): State<Color>

    @Composable
    fun placeholderTextColor(): State<Color>

    @Composable
    fun labelTextColor(): State<Color>

    @Composable
    fun helperTextColor(isError: Boolean): State<Color>
}

@Immutable
private class DefaultDealiTextFieldColors(
    private val backgroundColor: Color,
    private val disabledBackgroundColor: Color,
    private val outlineColor: Color,
    private val focusedOutlineColor: Color,
    private val errorOutlineColor: Color,
    private val textColor: Color,
    private val disabledTextColor: Color,
    private val placeholderTextColor: Color,
    private val labelTextColor: Color,
    private val helperTextColor: Color,
    private val errorHelperTextColor: Color,
) : DealiTextFieldColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun outlineColor(enabled: Boolean, focused: Boolean, isError: Boolean): State<Color> {
        return rememberUpdatedState(
            if (enabled) {
                if (isError) {
                    errorOutlineColor
                } else if (focused) {
                    focusedOutlineColor
                } else {
                    outlineColor
                }
            } else {
                outlineColor
            }
        )
    }

    @Composable
    override fun textColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) textColor else disabledTextColor)
    }

    @Composable
    override fun placeholderTextColor(): State<Color> {
        return rememberUpdatedState(placeholderTextColor)
    }

    @Composable
    override fun labelTextColor(): State<Color> {
        return rememberUpdatedState(labelTextColor)
    }

    @Composable
    override fun helperTextColor(isError: Boolean): State<Color> {
        return rememberUpdatedState(if (isError) errorHelperTextColor else helperTextColor)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as DefaultDealiTextFieldColors

        if (this.backgroundColor != other.backgroundColor) return false
        if (this.disabledBackgroundColor != other.disabledBackgroundColor) return false
        if (this.outlineColor != other.outlineColor) return false
        if (this.focusedOutlineColor != other.focusedOutlineColor) return false
        if (this.errorOutlineColor != other.errorOutlineColor) return false
        if (this.textColor != other.textColor) return false
        if (this.disabledTextColor != other.disabledTextColor) return false
        if (this.placeholderTextColor != other.placeholderTextColor) return false
        if (this.labelTextColor != other.labelTextColor) return false
        if (this.helperTextColor != other.helperTextColor) return false
        if (this.errorHelperTextColor != other.errorHelperTextColor) return false

        return true
    }

    override fun hashCode(): Int {
        var hash = backgroundColor.hashCode()
        hash = 31 * hash + disabledBackgroundColor.hashCode()
        hash = 31 * hash + outlineColor.hashCode()
        hash = 31 * hash + focusedOutlineColor.hashCode()
        hash = 31 * hash + errorOutlineColor.hashCode()
        hash = 31 * hash + textColor.hashCode()
        hash = 31 * hash + disabledTextColor.hashCode()
        hash = 31 * hash + placeholderTextColor.hashCode()
        hash = 31 * hash + labelTextColor.hashCode()
        hash = 31 * hash + helperTextColor.hashCode()
        hash = 31 * hash + errorHelperTextColor.hashCode()
        return hash
    }
}
