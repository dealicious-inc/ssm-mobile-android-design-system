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
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * 디자인시스템 Text Field 핵심 컴포넌트. TextField류 컴포넌트 구현의 기반이 되는 컴포넌트입니다.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param colors 텍스트 필드의 색상 상태.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param enabled 텍스트 필드 활성화 상태.
 * @param isError 텍스트 필드 에러 상태.
 * @param singleLine 텍스트 필드에 1줄로만 문자를 쓸 수 있도록 설정.
 * @param minLines 텍스트 필드에서 한번에 보이는 최소 줄 수. 이 값은 실제 입력 된 문자를 제한하지 않습니다.
 * 이 값은 반드시 1보다 커야 하고 [maxLines]보다 작아야 합니다. 만약 [singleLine]이 `true`이면 무시됩니다.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. 이 값은 실제 입력 된 문자를 제한하지 않습니다.
 * 이 값은 반드시 1과 [minLines]보다 커야 합니다. 만약 [singleLine]이 `true`이면 무시됩니다.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param onTextLayout 내부에서 그려 진 텍스트 레이아웃이 변할 때 호출되는 콜백.
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param placeholderOverflow [placeholder]가 레이아웃을 벗어 날 경우 처리 할 [TextOverflow] 옵션.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [isError]가 활성화된 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 * @param innerTextFieldMinHeight 내부 텍스트 필드의 최소 높이 제한.
 * @param innerTextFieldMaxHeight 내부 텍스트 필드의 최대 높이 제한.
 * @param labelContent 라벨 영역에 추가적으로 표시 할 컨텐츠.
 * @param leadingContent 내부 텍스트 필드 바깥 앞에 표시 할 컨텐츠.
 * @param trailingContent 내부 텍스트 필드 바깥 뒤에 표시 할 컨텐츠.
 * @param innerLeadingContent 내부 텍스트 필드 안쪽에서 텍스트 앞에 표시 할 컨텐츠.
 * @param innerTrailingContent 내부 텍스트 필드 안쪽에서 텍스트 뒤에 표시 할 컨텐츠.
 * @param innerFixedContent 내부 텍스트 안쪽에서 텍스트 뒤에 표시 할 컨텐츠 중 [innerTrailingContent]보다 뒤에 표시 할 컨텐츠.
 * [innerTrailingContent]는 포커스 상태 등 텍스트 필드 상태에 따라 변경되는 형태로 많이 사용되는 반면, [innerFixedContent]는
 * 상태와 무관하게 계속 보여 줄 컨텐츠에 주로 사용합니다.
 */
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
    onTextLayout: (TextLayoutResult) -> Unit = {},
    placeholder: String? = null,
    placeholderOverflow: TextOverflow = TextOverflow.Ellipsis,
    label: String? = null,
    isNecessary: Boolean = false,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    isCounterTextVisible: Boolean = false,
    innerTextFieldMinHeight: Dp = 46.dp,
    innerTextFieldMaxHeight: Dp = 106.dp,
    labelContent: @Composable (() -> Unit)? = null,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    innerLeadingContent: @Composable (() -> Unit)? = null,
    innerTrailingContent: @Composable (() -> Unit)? = null,
    innerFixedContent: @Composable (() -> Unit)? = null,
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
        onTextLayout = onTextLayout,
        placeholder = placeholder,
        placeholderOverflow = placeholderOverflow,
        label = label,
        isNecessary = isNecessary,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        isCounterTextVisible = isCounterTextVisible,
        innerTextFieldMinHeight = innerTextFieldMinHeight,
        innerTextFieldMaxHeight = innerTextFieldMaxHeight,
        labelContent = labelContent,
        leadingContent = leadingContent,
        trailingContent = trailingContent,
        innerLeadingContent = innerLeadingContent,
        innerTrailingContent = innerTrailingContent,
        innerFixedContent = innerFixedContent,
    )
}

/**
 * 디자인시스템 Text Field 핵심 컴포넌트. TextField류 컴포넌트 구현의 기반이 되는 컴포넌트입니다.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param colors 텍스트 필드의 색상 상태.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param enabled 텍스트 필드 활성화 상태.
 * @param isError 텍스트 필드 에러 상태.
 * @param singleLine 텍스트 필드에 1줄로만 문자를 쓸 수 있도록 설정.
 * @param minLines 텍스트 필드에서 한번에 보이는 최소 줄 수. 이 값은 실제 입력 된 문자를 제한하지 않습니다.
 * 이 값은 반드시 1보다 커야 하고 [maxLines]보다 작아야 합니다. 만약 [singleLine]이 `true`이면 무시됩니다.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. 이 값은 실제 입력 된 문자를 제한하지 않습니다.
 * 이 값은 반드시 1과 [minLines]보다 커야 합니다. 만약 [singleLine]이 `true`이면 무시됩니다.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param onTextLayout 내부에서 그려 진 텍스트 레이아웃이 변할 때 호출되는 콜백.
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param placeholderOverflow [placeholder]가 레이아웃을 벗어 날 경우 처리 할 [TextOverflow] 옵션.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [isError]가 활성화된 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 * @param innerTextFieldMinHeight 내부 텍스트 필드의 최소 높이 제한.
 * @param innerTextFieldMaxHeight 내부 텍스트 필드의 최대 높이 제한.
 * @param labelContent 라벨 영역에 추가적으로 표시 할 컨텐츠.
 * @param leadingContent 내부 텍스트 필드 바깥 앞에 표시 할 컨텐츠.
 * @param trailingContent 내부 텍스트 필드 바깥 뒤에 표시 할 컨텐츠.
 * @param innerLeadingContent 내부 텍스트 필드 안쪽에서 텍스트 앞에 표시 할 컨텐츠.
 * @param innerTrailingContent 내부 텍스트 필드 안쪽에서 텍스트 뒤에 표시 할 컨텐츠.
 * @param innerFixedContent 내부 텍스트 안쪽에서 텍스트 뒤에 표시 할 컨텐츠 중 [innerTrailingContent]보다 뒤에 표시 할 컨텐츠.
 * [innerTrailingContent]는 포커스 상태 등 텍스트 필드 상태에 따라 변경되는 형태로 많이 사용되는 반면, [innerFixedContent]는
 * 상태와 무관하게 계속 보여 줄 컨텐츠에 주로 사용합니다.
 */
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
    onTextLayout: (TextLayoutResult) -> Unit = {},
    placeholder: String? = null,
    placeholderOverflow: TextOverflow = TextOverflow.Ellipsis,
    label: String? = null,
    isNecessary: Boolean = false,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    isCounterTextVisible: Boolean = false,
    innerTextFieldMinHeight: Dp = 46.dp,
    innerTextFieldMaxHeight: Dp = 46.dp,
    labelContent: @Composable (() -> Unit)? = null,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    innerLeadingContent: @Composable (() -> Unit)? = null,
    innerTrailingContent: @Composable (() -> Unit)? = null,
    innerFixedContent: @Composable (() -> Unit)? = null,
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
        onTextLayout = onTextLayout,
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
                placeholderMaxLines = if (singleLine) 1 else maxLines,
                placeholderOverflow = placeholderOverflow,
                label = label,
                isNecessary = isNecessary,
                helperText = helperText,
                textLength = value.text.length,
                maxLength = maxLength,
                isHelperTextVisible = isHelperTextVisible,
                isCounterTextVisible = isCounterTextVisible,
                innerTextFieldMinHeight = innerTextFieldMinHeight,
                innerTextFieldMaxHeight = innerTextFieldMaxHeight,
                innerTextField = innerTextField,
                labelContent = labelContent,
                leadingContent = leadingContent,
                trailingContent = trailingContent,
                innerLeadingContent = innerLeadingContent,
                innerTrailingContent = innerTrailingContent,
                innerFixedContent = innerFixedContent,
            )
        }
    )
}
