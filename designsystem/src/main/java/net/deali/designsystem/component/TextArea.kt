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
import net.deali.designsystem.internal.textarea.TextArea01Styles
import net.deali.designsystem.internal.textarea.TextArea02Styles
import net.deali.designsystem.internal.textarea.TextArea03Styles
import net.deali.designsystem.internal.textarea.defaultTextAreaPaddings
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults
import net.deali.designsystem.internal.textfield.DealiTextFieldState

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Deprecated("텍스트 필드 컴포넌트는 디자인 시스템 컴포넌트로 이전되었습니다. 자세한 내용은 디자인 시스템 문서를 참고해주세요.")
@Composable
fun textArea(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        textStyle = textStyle,
        paddings = defaultTextAreaPaddings,
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Deprecated("텍스트 필드 컴포넌트는 디자인 시스템 컴포넌트로 이전되었습니다. 자세한 내용은 디자인 시스템 문서를 참고해주세요.")
@Composable
fun textArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        paddings = defaultTextAreaPaddings,
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea01(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        colors = TextArea01Styles.colors(),
        paddings = TextArea01Styles.paddings(),
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea01(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        colors = TextArea01Styles.colors(),
        paddings = TextArea01Styles.paddings(),
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}


/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea02(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        colors = TextArea02Styles.colors(),
        paddings = TextArea02Styles.paddings(),
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea02(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        colors = TextArea02Styles.colors(),
        paddings = TextArea02Styles.paddings(),
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea03(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        colors = TextArea03Styles.colors(),
        paddings = TextArea03Styles.paddings(),
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 * @param label 텍스트 필드 위에 보여 줄 라벨 문구.
 * @param isNecessary 필수적인 입력값을 유저에게 보여 주기 위한 인디케이터 표시 활성화.
 * @param helperText 텍스트 필드 아래에 보여 줄 도움말이나 에러 문구. [DealiTextFieldState.ERROR]일 경우 에러 색상으로 표현됩니다.
 * @param isHelperTextVisible [helperText] 활성화 상태.
 * @param isCounterTextVisible 입력 된 글자 수 카운터 활성화 상태. 최대 문자 수는 [maxLength]를 사용합니다.
 */
@Composable
fun textArea03(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    minLines: Int = DEFAULT_MIN_LINES,
    maxLines: Int = DEFAULT_MAX_LINES,
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
        colors = TextArea03Styles.colors(),
        paddings = TextArea03Styles.paddings(),
        state = state,
        singleLine = false,
        minLines = minLines,
        maxLines = maxLines,
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
    )
}

private const val DEFAULT_MIN_LINES = 1
private const val DEFAULT_MAX_LINES = 4
