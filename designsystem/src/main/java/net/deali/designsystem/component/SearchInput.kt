@file:OptIn(ExperimentalComposeUiApi::class, ExperimentalComposeUiApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldColors
import net.deali.designsystem.internal.textfield.DealiTextFieldState
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape

/**
 * 검색어를 입력할 수 있는 SearchInput.
 * */
@Composable
fun SearchInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    maxLength: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    onClickSearch: () -> Unit,
    onClickRemoveIcon: () -> Unit = {},
) {
    var isFocused by remember { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current
    val onSearch: () -> Unit = remember {
        {
            onClickSearch.invoke()
            keyboardController?.hide()
        }
    }

    val searchBarModifier = if (state == DealiTextFieldState.READ_ONLY) {
        modifier.then(
            Modifier
                .clip(DealiShape.radius6)
                .clickable { onClickSearch.invoke() }
        )
    } else {
        modifier
    }

    CoreDealiTextField(
        modifier = searchBarModifier
            .onFocusChanged { isFocused = it.isFocused }
            .focusRequester(focusRequester),
        value = value,
        onValueChange = onValueChange,
        textStyle = DealiFont.b2r14,
        colors = rememberSearchInputColors(),
        state = state,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        maxLength = maxLength,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearch.invoke() }),
        interactionSource = interactionSource,
        placeholder = placeholder,
        isHelperTextVisible = false,
        innerTextFieldMinHeight = 40.dp,
        innerTrailingContent = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                if (value.isNotEmpty() || isFocused) {
                    Icon16(
                        iconRes = R.drawable.ic_x_circle_filled,
                        color = DealiColor.g50,
                        enabled = true,
                        onClick = {
                            if (state.isEnabled) {
                                focusRequester.requestFocus()
                            }
                            onValueChange("")
                            onClickRemoveIcon()
                        }
                    )
                }

                if (value.isEmpty() || isFocused) {
                    Icon24(
                        iconRes = R.drawable.ic_search,
                        color = DealiColor.g100,
                        onClick = onSearch,
                    )
                }
            }
        }
    )
}


/**
 * TextFieldValue를 이용해 검색어를 입력할 수 있는 SearchInput.
 * */
@Composable
fun SearchInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    maxLength: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    onClickSearch: () -> Unit,
    onClickRemoveIcon: () -> Unit = {},
) {
    var isFocused by remember { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current
    val onSearch: () -> Unit = remember {
        {
            onClickSearch.invoke()
            keyboardController?.hide()
        }
    }

    val searchBarModifier = if (state == DealiTextFieldState.READ_ONLY) {
        modifier.then(
            Modifier
                .clip(DealiShape.radius6)
                .clickable { onClickSearch.invoke() }
        )
    } else {
        modifier
    }

    CoreDealiTextFieldForTextFieldValue(
        modifier = searchBarModifier
            .onFocusChanged { isFocused = it.isFocused }
            .focusRequester(focusRequester),
        value = value,
        onValueChange = onValueChange,
        textStyle = DealiFont.b2r14,
        colors = rememberSearchInputColors(),
        state = state,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        maxLength = maxLength,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearch.invoke() }),
        interactionSource = interactionSource,
        placeholder = placeholder,
        isHelperTextVisible = false,
        innerTextFieldMinHeight = 40.dp,
        innerTrailingContent = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                if (value.text.isNotEmpty() || isFocused) {
                    Icon16(
                        iconRes = R.drawable.ic_x_circle_filled,
                        color = DealiColor.g50,
                        enabled = true,
                        onClick = {
                            if (state.isEnabled) {
                                focusRequester.requestFocus()
                            }
                            onValueChange(TextFieldValue())
                            onClickRemoveIcon()
                        }
                    )
                }

                if (value.text.isEmpty() || isFocused) {
                    Icon24(
                        iconRes = R.drawable.ic_search,
                        color = DealiColor.g100,
                        onClick = onSearch,
                    )
                }
            }
        }
    )
}

/**
 * 검색어를 입력할 수 있고 tag를 가지고 있는 SearchInput.
 * */
@Composable
fun SearchInput(
    value: String,
    tagText: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    maxLength: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    onClickSearch: () -> Unit,
    onClickRemoveIcon: () -> Unit = {},
) {
    var isFocused by remember { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current
    val onSearch: () -> Unit = remember {
        {
            onClickSearch.invoke()
            keyboardController?.hide()
        }
    }

    val searchBarModifier = if (state == DealiTextFieldState.READ_ONLY) {
        modifier.then(
            Modifier
                .clip(DealiShape.radius6)
                .clickable { onClickSearch.invoke() }
        )
    } else {
        modifier
    }

    CoreDealiTextField(
        modifier = searchBarModifier
            .onFocusChanged { isFocused = it.isFocused }
            .focusRequester(focusRequester),
        value = value,
        onValueChange = onValueChange,
        textStyle = DealiFont.b2r14,
        colors = rememberSearchInputColors(),
        state = state,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        maxLength = maxLength,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearch.invoke() }),
        interactionSource = interactionSource,
        placeholder = placeholder,
        isHelperTextVisible = false,
        innerTextFieldMinHeight = 40.dp,
        innerLeadingContent = {
            TagOutlineLarge04(
                modifier = Modifier
                    .requiredWidthIn(max = 92.dp),
                text = tagText,
            )
        },
        innerTrailingContent = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                if (value.isNotEmpty() || isFocused) {
                    Icon16(
                        iconRes = R.drawable.ic_x_circle_filled,
                        color = DealiColor.g50,
                        enabled = true,
                        onClick = {
                            if (state.isEnabled) {
                                onValueChange("")
                                focusRequester.requestFocus()
                            }
                            onClickRemoveIcon()
                        }
                    )
                }

                if (value.isEmpty() || isFocused) {
                    Icon24(
                        iconRes = R.drawable.ic_search,
                        color = DealiColor.g100,
                        onClick = onSearch,
                    )
                }
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
    override fun backgroundColor(state: DealiTextFieldState): State<Color> {
        return rememberUpdatedState(DealiColor.g10)
    }

    @Composable
    override fun backgroundColor(enabled: Boolean): State<Color> {
        return rememberUpdatedState(DealiColor.g10)
    }

    @Composable
    override fun outlineColor(state: DealiTextFieldState, focused: Boolean): State<Color?> {
        return rememberUpdatedState(null)
    }

    @Composable
    override fun outlineColor(enabled: Boolean, focused: Boolean, isError: Boolean): State<Color?> {
        return rememberUpdatedState(null)
    }

    @Composable
    override fun textColor(state: DealiTextFieldState): State<Color> {
        return rememberUpdatedState(DealiColor.primary05)
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

@Preview
@Composable
private fun SearchInputShowOnlyPreview() {
    Box(
        modifier = Modifier
            .background(DealiColor.primary04)
            .padding(8.dp)
    ) {
        SearchInput(
            placeholder = "플레이스홀더",
            value = "",
            onValueChange = {},
            onClickSearch = {},
        )
    }
}

@Preview
@Composable
private fun SearchInputPreview() = AppTheme {
    Box(
        modifier = Modifier
            .background(DealiColor.primary04)
            .padding(8.dp)
    ) {
        SearchInput(
            value = "search input",
            onClickSearch = {},
            onValueChange = {},
        )
    }
}

@Preview
@Composable
private fun SearchInputWithTagPreview() = AppTheme {
    Box(
        modifier = Modifier
            .background(DealiColor.primary04)
            .padding(8.dp)
    ) {
        SearchInput(
            value = "search input",
            tagText = "원피스",
            onValueChange = {},
            onClickSearch = {},
            state = DealiTextFieldState.ENABLED
        )
    }
}