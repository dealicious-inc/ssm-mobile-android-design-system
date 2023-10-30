package net.deali.designsystem.internal.textfield

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation

@Composable
internal fun CoreDealiTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    colors: DealiTextFieldColors =  DealiTextFieldDefaults.colors(),
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = true,  // Todo helper Text가 null이면 false로 되어야될듯..?
    trailingContent: @Composable (() -> Unit)? = null,
) {
    // TextFieldValue를 사용하는 BasicDealiTextField를 String을 사용 하는 BasicDealiTextField로 만들기 위한 코드.
    // 구현은 androidx.compose.foundation.text.BasicTextField()를 참고 했습니다.

    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)

    // Recomposition이 발생할 때 마다 textFieldValueState와 textFieldValue가 다른지 확인 후 동기화.
    SideEffect {
        if (
            textFieldValue.selection != textFieldValueState.selection ||
            textFieldValue.composition != textFieldValueState.composition
        ) {
            textFieldValueState = textFieldValue
        }
    }

    // 가장 최근의 String 값을 저장.
    // TextFieldValue는 text 말고 다른 속성도 함께 가지고 있습니다. 하지만 TextFieldValue의 String 값이 변할
    // 때만 onValueChange()를 호출하기 위해서 마지막 composition 에서의 text 값을 저장합니다.
    var latestString by remember(value) { mutableStateOf(value) }

    CoreDealiTextFieldForTextFieldValue(
        value = textFieldValue,
        onValueChange = { changedTextFieldValueState ->
            textFieldValueState = changedTextFieldValueState
            val isStringChanged = latestString != changedTextFieldValueState.text
            latestString = changedTextFieldValueState.text
            if (isStringChanged) {
                onValueChange(changedTextFieldValueState.text)
            }
        },
        modifier = modifier,
        textStyle = textStyle,
        colors = colors,
        enabled = enabled,
        isError = isError,
        singleLine = singleLine,
        minLines = minLines,
        maxLines = maxLines,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        trailingContent = trailingContent
    )
}

@Composable
internal fun CoreDealiTextFieldForTextFieldValue(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    colors: DealiTextFieldColors =  DealiTextFieldDefaults.colors(),
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = true,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    var isValueEmpty by remember(value) { mutableStateOf(value.text.isEmpty()) }

    val mergedTextStyle = if (enabled) {
        textStyle
    } else {
        val textColor by colors.textColor(enabled)
        textStyle.merge(TextStyle(color = textColor))
    }

    BasicTextField(
        value = value,
        onValueChange = { textFieldValue ->
            onValueChange(textFieldValue)
            isValueEmpty = textFieldValue.text.isEmpty()
        },
        modifier = modifier,
        textStyle = mergedTextStyle,
        enabled = enabled,
        readOnly = !enabled,
        singleLine = singleLine,
        minLines = if (singleLine) 1 else minLines,
        maxLines = if (singleLine) 1 else maxLines,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        cursorBrush = DealiTextFieldDefaults.cursor(),
        decorationBox = { innerTextField ->
            DealiTextFieldDecorationBox(
                enabled = enabled,
                isError = isError,
                singleLine = singleLine,
                colors = colors,
                interactionSource = interactionSource,
                isValueEmpty = isValueEmpty,
                placeholder = placeholder,
                label = label,
                helperText = helperText,
                isHelperTextVisible = isHelperTextVisible,
                modifier = Modifier.fillMaxWidth(),
                innerTextField = innerTextField,
                trailingContent = trailingContent,
            )
        }
    )
}
