package net.deali.designsystem.internal.textarea

import androidx.compose.runtime.Composable
import net.deali.designsystem.internal.textfield.TextFieldColors
import net.deali.designsystem.internal.textfield.TextFieldColorsImpl
import net.deali.designsystem.internal.textfield.TextFieldPaddings
import net.deali.designsystem.theme.DealiColor

internal object TextArea02Styles {
    @Composable
    fun colors(): TextFieldColors {
        return TextFieldColorsImpl(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.g20,
            readOnlyBackgroundColor = DealiColor.g05,
            outlineColor = DealiColor.g10,
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