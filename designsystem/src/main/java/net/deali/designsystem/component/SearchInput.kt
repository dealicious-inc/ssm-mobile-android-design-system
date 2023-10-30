package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import net.deali.designsystem.R
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldColors
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun SearchInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
) {
    var isFocused by remember { mutableStateOf(false) }

    CoreDealiTextField(
        modifier = modifier
            .onFocusChanged { isFocused = it.isFocused },
        value = value,
        onValueChange = onValueChange,
        textStyle = DealiFont.b2r14,
        colors = rememberSearchInputColors(),
        enabled = true,
        isError = false,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
        placeholder = placeholder,
        isHelperTextVisible = false,
        trailingContent = if (isFocused) {
            {
                Icon16(
                    iconRes = R.drawable.ic_x,
                    color = DealiColor.primary05,
                    enabled = true,
                    onClick = remember { { onValueChange("") } },
                )
            }
        } else {
            {
                Icon24(
                    iconRes = R.drawable.ic_search,
                    color = DealiColor.primary05,
                    enabled = false,
                    onClick = {},
                )
            }
        }
    )
}

@Composable
fun SearchInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
) {
    var isFocused by remember { mutableStateOf(false) }

    CoreDealiTextFieldForTextFieldValue(
        modifier = modifier
            .onFocusChanged { isFocused = it.isFocused },
        value = value,
        onValueChange = onValueChange,
        textStyle = DealiFont.b2r14,
        colors = rememberSearchInputColors(),
        enabled = true,
        isError = false,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
        placeholder = placeholder,
        isHelperTextVisible = false,
        trailingContent = if (isFocused) {
            {
                Icon16(
                    iconRes = R.drawable.ic_x,
                    color = DealiColor.primary05,
                    enabled = true,
                    onClick = remember { { onValueChange(TextFieldValue()) } },
                )
            }
        } else {
            {
                Icon24(
                    iconRes = R.drawable.ic_search,
                    color = DealiColor.primary05,
                    enabled = false,
                    onClick = {},
                )
            }
        }
    )
}

@Composable
private fun rememberSearchInputColors() =
    remember { SearchInputTextFieldColors() }

@Immutable
private class SearchInputTextFieldColors : DealiTextFieldColors {
    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(DealiColor.g10)
    }

    @Composable
    override fun outlineColor(enabled: Boolean, focused: Boolean, isError: Boolean): State<Color> {
        return rememberUpdatedState(DealiColor.transparent)
    }

    @Composable
    override fun textColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(DealiColor.primary05)
    }

    @Composable
    override fun placeholderTextColor(): State<Color> {
        return rememberUpdatedState(DealiColor.g60)
    }

    @Composable
    override fun labelTextColor(): State<Color> {
        throw UndefinedException()
    }

    @Composable
    override fun helperTextColor(isError: Boolean): State<Color> {
        throw UndefinedException()
    }

    private class UndefinedException : IllegalStateException("정의되지 않았습니다.")

}