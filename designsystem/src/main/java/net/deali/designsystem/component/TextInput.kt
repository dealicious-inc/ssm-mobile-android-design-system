package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults

/**
 * 신상마켓 디자인시스템 [TextInput] 컴포넌트.
 *
 * @param value 입력 된 텍스트.
 * @param onValueChange 입력 된 텍스트가 바뀔 때 호출되는 콜백.
 * @param modifier [Modifier].
 * @param textStyle [TextInput]에 입력 된 텍스트의 스타일.
 * @param placeholder [value]가 비어 있을 때 표시 할 힌트 문구.
 * @param label [TextInput] 상단에 표시 할 라벨.
 * @param isNecessary [TextInput] 상단에 표시 할 라벨 옆 원형점의 필수 표시.
 * @param helperText [TextInput] 하단에 표시 할 도움말 문구 또는 에러 메세지.
 * @param isHelperTextVisible [helperText]의 표시 상태.
 * @param enabled [TextInput]의 입력 가능 상태.
 * @param isError [TextInput]의 에러 여부.
 * @param maxLength 입력 가능 한 최대 글자수.
 * @param keyboardOptions IME Aciton 등을 재정의 할 수 있는 [KeyboardOptions].
 * @param keyboardActions 키보드 관련 동작을 재정의 할 수 있는 [KeyboardActions].
 * @param visualTransformation UI에 보이는 포맷을 변경해주는 [VisualTransformation].
 * @param interactionSource 인터렉션을 커스터마이즈 하거나 인터렉션 상태를 사용하기 위한 [MutableInteractionSource].
 * @param labelContent [TextInput] 상단에 표시 할 라벨 옆 컨텐츠 슬롯.
 * @param trailingContent [TextInput] 내부 우측에 표시 할 커스텀 컨텐츠 슬롯. [TextInput]은 기본적으로 [value]가
 * 1자 이상 있으면서 포커스 상태이며 에러가 아닌 경우 [trailingContent]에 전체 삭제 아이콘을 표시하는 동작을 내장하고 있습니다.
 * 그 외의 [trailingContent]를 재정의 하고 싶은 경우 사용할 수 있습니다.
 * @param fixedContent [TextInput] 내부 우측에 표시 할 커스텀 컨텐츠 슬롯.
 * 포커스와 관계없이 작동합니다.
 */
@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    placeholder: String? = null,
    label: String? = null,
    isNecessary: Boolean = false,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    enabled: Boolean = true,
    isError: Boolean = false,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    labelContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    fixedContent: @Composable (() -> Unit)? = null,
) {
    val focused by interactionSource.collectIsFocusedAsState()
    val shouldRemoveIconVisible by rememberUpdatedState(
        focused && value.isNotEmpty() && !isError
    )
    val onRemoveIconClick: () -> Unit = remember {
        { onValueChange("") }
    }

    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = enabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
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
        labelContent = labelContent,
        trailingContent = if (shouldRemoveIconVisible) {
            {
                DealiTextFieldDefaults.TrailingRemoveIcon(onClick = onRemoveIconClick)
            }
        } else {
            trailingContent
        },
        fixedContent = fixedContent,
    )
}

/**
 * 신상마켓 디자인시스템 [TextInput] 컴포넌트.
 *
 * @param value 입력 된 텍스트.
 * @param onValueChange 입력 된 텍스트가 바뀔 때 호출되는 콜백.
 * @param modifier [Modifier].
 * @param textStyle [TextInput]에 입력 된 텍스트의 스타일.
 * @param placeholder [value]가 비어 있을 때 표시 할 힌트 문구.
 * @param label [TextInput] 상단에 표시 할 라벨.
 * @param helperText [TextInput] 하단에 표시 할 도움말 문구 또는 에러 메세지.
 * @param isHelperTextVisible [helperText]의 표시 상태.
 * @param enabled [TextInput]의 입력 가능 상태.
 * @param isError [TextInput]의 에러 여부.
 * @param maxLength 입력 가능 한 최대 글자수.
 * @param keyboardOptions IME Aciton 등을 재정의 할 수 있는 [KeyboardOptions].
 * @param keyboardActions 키보드 관련 동작을 재정의 할 수 있는 [KeyboardActions].
 * @param visualTransformation UI에 보이는 포맷을 변경해주는 [VisualTransformation].
 * @param interactionSource 인터렉션을 커스터마이즈 하거나 인터렉션 상태를 사용하기 위한 [MutableInteractionSource].
 * @param trailingContent [TextInput] 내부 우측에 표시 할 커스텀 컨텐츠 슬롯. [TextInput]은 기본적으로 [value]가
 * 1자 이상 있으면서 포커스 상태이며 에러가 아닌 경우 [trailingContent]에 전체 삭제 아이콘을 표시하는 동작을 내장하고 있습니다.
 * 그 외의 [trailingContent]를 재정의 하고 싶은 경우 사용할 수 있습니다.
 */
@Composable
fun TextInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    trailingContent: @Composable (() -> Unit)? = null,
    fixedContent: @Composable (() -> Unit)? = null,
) {
    val focused by interactionSource.collectIsFocusedAsState()
    val shouldRemoveIconVisible by rememberUpdatedState(
        focused && value.text.isNotEmpty() && !isError
    )
    val onRemoveIconClick: () -> Unit = remember {
        { onValueChange(TextFieldValue()) }
    }

    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = enabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        maxLength = maxLength,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        trailingContent = if (shouldRemoveIconVisible) {
            {
                DealiTextFieldDefaults.TrailingRemoveIcon(onClick = onRemoveIconClick)
            }
        } else {
            trailingContent
        },
        fixedContent = fixedContent,
    )
}
