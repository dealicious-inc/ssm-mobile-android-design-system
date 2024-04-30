package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param enabled 텍스트 필드 활성화 상태.
 * @param isError 텍스트 필드 에러 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. [isFlexible]이 `false`인 경우 무시됩니다.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [isError]가 활성화된 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    isFlexible: Boolean = true,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    isNecessary: Boolean = false,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    isCounterTextVisible: Boolean = false,
) {
    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = enabled,
        isError = isError,
        singleLine = false,
        minLines = if (isFlexible) 1 else 4,
        maxLines = if (isFlexible) maxLines else Int.MAX_VALUE,
        maxLength = maxLength,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        isNecessary = isNecessary,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        isCounterTextVisible = isCounterTextVisible,
        innerTextFieldMinHeight = if (isFlexible) 46.dp else 106.dp,
        innerTextFieldMaxHeight = 106.dp,
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param enabled 텍스트 필드 활성화 상태.
 * @param isError 텍스트 필드 에러 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. [isFlexible]이 `false`인 경우 무시됩니다.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [isError]가 활성화된 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    isFlexible: Boolean = true,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    isNecessary: Boolean = false,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    isCounterTextVisible: Boolean = false,
) {
    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = enabled,
        isError = isError,
        singleLine = false,
        minLines = if (isFlexible) 1 else 4,
        maxLines = if (isFlexible) maxLines else Int.MAX_VALUE,
        maxLength = maxLength,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        isNecessary = isNecessary,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        isCounterTextVisible = isCounterTextVisible,
        innerTextFieldMinHeight = if (isFlexible) 46.dp else 106.dp,
        innerTextFieldMaxHeight = 106.dp,
    )
}
