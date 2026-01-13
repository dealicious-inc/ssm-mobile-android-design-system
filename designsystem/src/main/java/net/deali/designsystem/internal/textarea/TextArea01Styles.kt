package net.deali.designsystem.internal.textarea

import androidx.compose.runtime.Composable
import net.deali.designsystem.internal.textfield.TextFieldColors
import net.deali.designsystem.internal.textfield.TextFieldColorsImpl
import net.deali.designsystem.internal.textfield.TextFieldPaddings
import net.deali.designsystem.theme.DealiColor

internal object TextArea01Styles {
    @Composable
    fun colors(): TextFieldColors {
        return TextFieldColorsImpl(
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
    fun paddings(): TextFieldPaddings {
        return defaultTextAreaPaddings
    }
}