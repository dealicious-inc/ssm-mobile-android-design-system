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
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
internal fun CoreDealiTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    colors: DealiTextFieldColors = DealiTextFieldDefaults.colors(),
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    innerTextFieldMinHeight: Dp = 46.dp,
    buttonContent: @Composable (() -> Unit)? = null,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    // String을 사용 하는 BasicDealiTextField를 TextFieldValue를 사용하는 BasicDealiTextField로 만들기 위한 코드
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)

    // Recomposition이 발생할 때 마다 textFieldValueState와 textFieldValue가 다른지 확인 후 동기화
    SideEffect {
        if (
            textFieldValue.selection != textFieldValueState.selection ||
            textFieldValue.composition != textFieldValueState.composition
        ) {
            textFieldValueState = textFieldValue
        }
    }

    // 가장 최근의 String 값을 저장
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
        maxLength = maxLength,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        innerTextFieldMinHeight = innerTextFieldMinHeight,
        buttonContent = buttonContent,
        leadingContent = leadingContent,
        trailingContent = trailingContent,
    )
}

@Composable
internal fun CoreDealiTextFieldForTextFieldValue(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    colors: DealiTextFieldColors = DealiTextFieldDefaults.colors(),
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    innerTextFieldMinHeight: Dp = 46.dp,
    buttonContent: @Composable (() -> Unit)? = null,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    val isValueEmpty by rememberUpdatedState(newValue = value.text.isEmpty())

    val mergedTextStyle = if (enabled) {
        textStyle
    } else {
        val textColor by colors.textColor(enabled)
        textStyle.merge(TextStyle(color = textColor))
    }

    BasicTextField(
        value = value,
        onValueChange = {
            val changedText = it.text
            if (changedText.length > maxLength) {
                onValueChange(it.copy(text = changedText.substring(0, maxLength)))
            } else {
                onValueChange(it)
            }
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
                modifier = Modifier.fillMaxWidth(),
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
                innerTextFieldMinHeight = innerTextFieldMinHeight,
                innerTextField = innerTextField,
                buttonContent = buttonContent,
                leadingContent = leadingContent,
                trailingContent = trailingContent,
            )
        }
    )
}
