package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults
import net.deali.designsystem.internal.textfield.DealiTextFieldPaddingValues
import net.deali.designsystem.internal.textfield.DealiTextFieldState

/**
 * 디자인시스템 텍스트 입력 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. [isFlexible]이 `false`인 경우 무시됩니다.
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
        paddings = rememberTextAreaPaddings(),
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
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. [isFlexible]이 `false`인 경우 무시됩니다.
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
        paddings = rememberTextAreaPaddings(),
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

@Composable
private fun rememberTextAreaPaddings() =
    remember {
        TextAreaTextFieldPaddings(
            horizontal = 16.dp,
            vertical = 13.dp,
        )
    }

@Immutable
private class TextAreaTextFieldPaddings(
    private val horizontal: Dp,
    private val vertical: Dp,
) : DealiTextFieldPaddingValues {
    @Composable
    override fun padding(
        hasLeadingContent: Boolean,
        hasTrailingContent: Boolean
    ): State<PaddingValues> {
        return rememberUpdatedState(
            PaddingValues(horizontal = horizontal, vertical = vertical)
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (this::class != other::class) return false

        other as TextAreaTextFieldPaddings

        if (this.horizontal != other.horizontal) return false
        return this.vertical == other.vertical
    }

    override fun hashCode(): Int {
        var hash = horizontal.hashCode()
        hash = 31 * hash + vertical.hashCode()
        return hash
    }
}

private const val DEFAULT_MIN_LINES = 1
private const val DEFAULT_MAX_LINES = 4
