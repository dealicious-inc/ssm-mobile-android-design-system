package net.deali.designsystem.internal.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

@Stable
internal interface TextFieldColors {
    @Composable
    fun backgroundColor(state: DealiTextFieldState): State<Color>

    @Composable
    fun backgroundColor(enabled: Boolean): State<Color>

    @Composable
    fun outlineColor(state: DealiTextFieldState, focused: Boolean): State<Color?>

    @Composable
    fun textColor(state: DealiTextFieldState): State<Color>

    @Composable
    fun outlineColor(enabled: Boolean, focused: Boolean, isError: Boolean): State<Color?>

    @Composable
    fun textColor(enabled: Boolean): State<Color>

    @Composable
    fun placeholderTextColor(state: DealiTextFieldState): State<Color>

    @Composable
    fun labelTextColor(): State<Color>

    @Composable
    fun helperTextColor(isError: Boolean): State<Color>
}

@Immutable
internal class TextFieldColorsImpl(
    private val backgroundColor: Color,
    private val disabledBackgroundColor: Color,
    private val readOnlyBackgroundColor: Color,
    private val outlineColor: Color,
    private val focusedOutlineColor: Color,
    private val errorOutlineColor: Color,
    private val readOnlyOutlineColor: Color,
    private val textColor: Color,
    private val disabledTextColor: Color,
    private val readOnlyTextColor: Color,
    private val placeholderTextColor: Color,
    private val labelTextColor: Color,
    private val helperTextColor: Color,
    private val errorHelperTextColor: Color,
) : TextFieldColors {
    @Composable
    override fun backgroundColor(state: DealiTextFieldState): State<Color> {
        return rememberUpdatedState(
            when (state) {
                DealiTextFieldState.ENABLED,
                DealiTextFieldState.ERROR -> backgroundColor

                DealiTextFieldState.READ_ONLY -> readOnlyBackgroundColor
                else -> disabledBackgroundColor
            }
        )
    }

    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(if (enabled) backgroundColor else disabledBackgroundColor)
    }

    @Composable
    override fun outlineColor(state: DealiTextFieldState, focused: Boolean): State<Color> {
        return rememberUpdatedState(
            when (state) {
                DealiTextFieldState.ENABLED -> {
                    if (focused) {
                        focusedOutlineColor
                    } else {
                        outlineColor
                    }
                }

                DealiTextFieldState.ERROR -> errorOutlineColor
                else -> readOnlyOutlineColor
            }
        )
    }

    @Composable
    override fun textColor(state: DealiTextFieldState): State<Color> {
        return rememberUpdatedState(
            when (state) {
                DealiTextFieldState.DISABLED -> disabledTextColor
                DealiTextFieldState.READ_ONLY -> readOnlyTextColor
                else -> textColor
            }
        )
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
    override fun placeholderTextColor(state: DealiTextFieldState): State<Color> {
        return rememberUpdatedState(
            when (state) {
                DealiTextFieldState.DISABLED -> disabledTextColor
                DealiTextFieldState.READ_ONLY -> readOnlyTextColor
                else -> placeholderTextColor
            }
        )
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

        other as TextFieldColorsImpl

        if (this.backgroundColor != other.backgroundColor) return false
        if (this.disabledBackgroundColor != other.disabledBackgroundColor) return false
        if (this.outlineColor != other.outlineColor) return false
        if (this.focusedOutlineColor != other.focusedOutlineColor) return false
        if (this.errorOutlineColor != other.errorOutlineColor) return false
        if (this.textColor != other.textColor) return false
        if (this.disabledTextColor != other.disabledTextColor) return false
        if (this.readOnlyTextColor != other.readOnlyTextColor) return false
        if (this.placeholderTextColor != other.placeholderTextColor) return false
        if (this.labelTextColor != other.labelTextColor) return false
        if (this.helperTextColor != other.helperTextColor) return false
        return this.errorHelperTextColor == other.errorHelperTextColor
    }

    override fun hashCode(): Int {
        var hash = backgroundColor.hashCode()
        hash = 31 * hash + disabledBackgroundColor.hashCode()
        hash = 31 * hash + outlineColor.hashCode()
        hash = 31 * hash + focusedOutlineColor.hashCode()
        hash = 31 * hash + errorOutlineColor.hashCode()
        hash = 31 * hash + textColor.hashCode()
        hash = 31 * hash + readOnlyTextColor.hashCode()
        hash = 31 * hash + disabledTextColor.hashCode()
        hash = 31 * hash + placeholderTextColor.hashCode()
        hash = 31 * hash + labelTextColor.hashCode()
        hash = 31 * hash + helperTextColor.hashCode()
        hash = 31 * hash + errorHelperTextColor.hashCode()
        return hash
    }
}
