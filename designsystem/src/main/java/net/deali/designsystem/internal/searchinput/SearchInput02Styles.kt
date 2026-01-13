package net.deali.designsystem.internal.searchinput

import androidx.compose.runtime.Composable
import net.deali.designsystem.internal.textfield.TextFieldColors
import net.deali.designsystem.internal.textfield.TextFieldColorsImpl
import net.deali.designsystem.internal.textfield.TextFieldPaddings
import net.deali.designsystem.theme.DealiColor

internal object SearchInput02Styles {
    @Composable
    fun colors(): TextFieldColors {
        return TextFieldColorsImpl(
            backgroundColor = DealiColor.g10,
            disabledBackgroundColor = DealiColor.primary04,
            readOnlyBackgroundColor = DealiColor.primary04,
            outlineColor = DealiColor.g10,
            focusedOutlineColor = DealiColor.g10,
            errorOutlineColor = DealiColor.primary04,
            readOnlyOutlineColor = DealiColor.primary04,
            textColor = DealiColor.g100,
            disabledTextColor = DealiColor.primary04,
            readOnlyTextColor = DealiColor.primary04,
            placeholderTextColor = DealiColor.g60,
            labelTextColor = DealiColor.primary04,
            helperTextColor = DealiColor.primary04,
            errorHelperTextColor = DealiColor.primary04,
        )
    }

    @Composable
    fun paddings(): TextFieldPaddings {
        return defaultSearchInputPaddings
    }
}