package net.deali.designsystem.internal.textfield

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp

@Composable
internal fun BasicDealiTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
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

    BasicDealiTextField(
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
        enabled = enabled,
        isError = isError,
        singleLine = singleLine,
        minLines = minLines,
        maxLines = maxLines,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
    )
}

@Composable
internal fun BasicDealiTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    minLines: Int = 1,
    maxLines: Int = Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
) {
    var isValueEmpty by remember { mutableStateOf(value.text.isEmpty()) }

    BasicTextField(
        value = value,
        onValueChange = { textFieldValue ->
            onValueChange(textFieldValue)
            isValueEmpty = textFieldValue.text.isEmpty()
        },
        modifier = modifier,
        enabled = enabled,
        readOnly = !enabled,
        singleLine = singleLine,
        minLines = if (singleLine) 1 else minLines,
        maxLines = if (singleLine) 1 else maxLines,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        cursorBrush = DealiTextFieldDefaults.Cursor,
        decorationBox = { innerTextField ->
            DealiTextFieldDecorationBox(
                innerTextField = innerTextField,
                enabled = enabled,
                isError = isError,
                colors = DealiTextFieldDefaults.colors(),
                interactionSource = interactionSource,
                isValueEmpty = isValueEmpty,
                placeholder = placeholder,
                label = label,
                helperText = helperText,
                modifier = Modifier.fillMaxWidth()
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun DealiInputPreview(
    @PreviewParameter(DealiInputPreviewParamProvider::class)
    previewParam: DealiInputPreviewParam
) {
    Box(modifier = Modifier.padding(all = 8.dp)) {
        var text by remember {
            mutableStateOf(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sodales" +
                        "laoreet commodo."
            )
        }
        BasicDealiTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            enabled = previewParam.enabled,
            isError = previewParam.isError,
            placeholder = "Placeholder",
            label = previewParam.label,
            helperText = previewParam.helperText
        )
    }
}

private class DealiInputPreviewParamProvider : PreviewParameterProvider<DealiInputPreviewParam> {
    override val values: Sequence<DealiInputPreviewParam> = sequenceOf(
        DealiInputPreviewParam(
            enabled = true,
            focused = false,
            isError = false,
            label = null,
            helperText = null,
        ),
        DealiInputPreviewParam(
            enabled = true,
            focused = false,
            isError = false,
            label = "Label",
            helperText = "Helper text",
        ),
        DealiInputPreviewParam(
            enabled = true,
            focused = true,
            isError = false,
            label = null,
            helperText = null,
        ),
        DealiInputPreviewParam(
            enabled = true,
            focused = true,
            isError = false,
            label = "Label",
            helperText = "Helper text",
        ),
        DealiInputPreviewParam(
            enabled = true,
            focused = false,
            isError = true,
            label = null,
            helperText = null,
        ),
        DealiInputPreviewParam(
            enabled = true,
            focused = false,
            isError = true,
            label = "Label",
            helperText = "Helper text",
        ),
        DealiInputPreviewParam(
            enabled = false,
            focused = true,
            isError = true,
            label = null,
            helperText = null,
        ),
        DealiInputPreviewParam(
            enabled = false,
            focused = true,
            isError = true,
            label = "Label",
            helperText = "Helper text",
        ),
    )
}

private data class DealiInputPreviewParam(
    val enabled: Boolean,
    val focused: Boolean,
    val isError: Boolean,
    val label: String?,
    val helperText: String?,
)
