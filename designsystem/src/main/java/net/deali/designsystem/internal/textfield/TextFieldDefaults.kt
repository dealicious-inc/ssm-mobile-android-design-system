package net.deali.designsystem.internal.textfield

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.HorizontalSpacer
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.btnFilledTonalMedium03
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

internal object DealiTextFieldDefaults {
    val BorderWidth: Dp = 1.dp
    val BorderShape: Shape = RoundedCornerShape(6.dp)

    val TextStyle: TextStyle
        @Composable
        get() = DealiFont.b2r14

    @Composable
    fun cursor(): Brush {
        return SolidColor(DealiColor.g100)
    }

    @Composable
    fun paddings(): DealiTextFieldPaddingValues {
        return DefaultDealiTextFieldPaddingValues(
            horizontal = 12.dp,
            decoratedStart = 6.dp,
            vertical = 12.dp
        )
    }

    @Composable
    fun colors(): DealiTextFieldColors {
        return DefaultDealiTextFieldColors(
            backgroundColor = DealiColor.primary04,
            disabledBackgroundColor = DealiColor.g10,
            readOnlyBackgroundColor = DealiColor.g05,
            outlineColor = DealiColor.g20,
            focusedOutlineColor = DealiColor.g100,
            errorOutlineColor = DealiColor.error,
            readOnlyOutlineColor = DealiColor.g05,
            textColor = DealiColor.g100,
            disabledTextColor = DealiColor.g50,
            readOnlyTextColor = DealiColor.g80,
            placeholderTextColor = DealiColor.g70,
            labelTextColor = DealiColor.g100,
            helperTextColor = DealiColor.g70,
            errorHelperTextColor = DealiColor.error,
        )
    }

    @Composable
    fun TrailingRemoveIcon(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
    ) {
        Icon16(
            modifier = modifier,
            onClick = onClick,
            iconRes = R.drawable.ic_x_circle_filled,
            color = DealiColor.g50,
        )
    }

    @Composable
    fun TrailingButton(
        text: String,
        onClick: () -> Unit,
        enabled: Boolean,
        modifier: Modifier = Modifier,
    ) {
        Row(modifier = modifier) {
            HorizontalSpacer(width = 8.dp)

            btnFilledTonalMedium03(
                text = text,
                enabled = enabled,
                onClick = onClick,
            )
        }
    }
}

@Stable
internal interface DealiTextFieldPaddingValues {

    @Composable
    fun padding(
        singleLine: Boolean,
        hasLeadingContent: Boolean,
        hasTrailingContent: Boolean,
    ): State<PaddingValues>
}

@Immutable
private class DefaultDealiTextFieldPaddingValues(
    private val decoratedStart: Dp,
    private val horizontal: Dp,
    private val vertical: Dp,
) : DealiTextFieldPaddingValues {

    @Composable
    override fun padding(
        singleLine: Boolean,
        hasLeadingContent: Boolean,
        hasTrailingContent: Boolean,
    ): State<PaddingValues> {

        return rememberUpdatedState(
            if (singleLine) {
                if (hasLeadingContent) {
                    PaddingValues(start = decoratedStart, end = horizontal)
                } else {
                    PaddingValues(horizontal = horizontal)
                }
            } else {
                PaddingValues(horizontal = horizontal, vertical = vertical)
            }
        )
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as DefaultDealiTextFieldPaddingValues

        if (this.horizontal != other.horizontal) return false
        if (this.decoratedStart != other.decoratedStart) return false
        return this.vertical == other.vertical
    }

    override fun hashCode(): Int {
        var hash = horizontal.hashCode()
        hash = 31 * hash + decoratedStart.hashCode()
        hash = 31 * hash + vertical.hashCode()
        return hash
    }
}

@Stable
internal interface DealiTextFieldColors {
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
) : DealiTextFieldColors {
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
                DealiTextFieldState.ENABLED,
                DealiTextFieldState.ERROR -> textColor

                DealiTextFieldState.READ_ONLY -> readOnlyTextColor
                else -> disabledTextColor
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
