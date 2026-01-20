package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.DealiTextFieldState
import net.deali.designsystem.theme.DealiColor

/**
 * 검색어를 입력할 수 있는 SearchBar
 */
@Composable
fun SearchBar(
    value: String,
    onValueChange: (String) -> Unit,
    onClickSearch: () -> Unit,
    modifier: Modifier = Modifier,
    maxLength: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    focusRequester: FocusRequester = remember { FocusRequester() },
    keyboardController: SoftwareKeyboardController? = LocalSoftwareKeyboardController.current,
    onClickRemoveIcon: () -> Unit = {},
) {
    Box(
        modifier = modifier
            .background(DealiColor.primary04)
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
    ) {
        SearchInput(
            value = value,
            onValueChange = onValueChange,
            maxLength = maxLength,
            interactionSource = interactionSource,
            placeholder = placeholder,
            state = state,
            focusRequester = focusRequester,
            keyboardController = keyboardController,
            onClickSearch = onClickSearch,
            onClickRemoveIcon = onClickRemoveIcon,
        )
    }
}

/**
 * TextFieldValue를 이용해 검색어를 입력할 수 있는 SearchBar
 */
@Composable
fun SearchBar(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    onClickSearch: () -> Unit,
    modifier: Modifier = Modifier,
    maxLength: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    focusRequester: FocusRequester = remember { FocusRequester() },
    keyboardController: SoftwareKeyboardController? = LocalSoftwareKeyboardController.current,
    onClickRemoveIcon: () -> Unit = {},
) {
    Box(
        modifier = modifier
            .background(DealiColor.primary04)
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
    ) {
        SearchInput(
            value = value,
            onValueChange = onValueChange,
            maxLength = maxLength,
            interactionSource = interactionSource,
            placeholder = placeholder,
            state = state,
            focusRequester = focusRequester,
            keyboardController = keyboardController,
            onClickSearch = onClickSearch,
            onClickRemoveIcon = onClickRemoveIcon,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    SearchBar(
        value = "",
        placeholder = "placeholder",
        onClickSearch = {},
        onValueChange = {},
    )
}