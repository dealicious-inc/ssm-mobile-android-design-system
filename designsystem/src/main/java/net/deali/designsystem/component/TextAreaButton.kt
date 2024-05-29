package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults
import net.deali.designsystem.internal.textfield.DealiTextFieldState
import net.deali.designsystem.theme.DealiColor

/**
 * [textAreaButton] 컴포넌트에서 사용하는 버튼의 타입.
 */
enum class TextAreaActionButtonType {
    Send,
    Upload,
}

/**
 * 특수 액션 버튼이 포함 된 Text Area 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param actionButtonType 사용할 특수 액션 버튼의 타입.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param isAttachButtonVisible 컴포넌트 앞쪽 부착 버튼 활성화 상태.
 * @param onAttachButtonClick 컴포넌트 앞쪽 부착 버튼 클릭 이벤트.
 * @param onActionButtonClick 특수 액션 버튼 클릭 이벤트.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. [isFlexible]이 `false`인 경우 무시됩니다.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 */
@Composable
fun textAreaButton(
    value: String,
    onValueChange: (String) -> Unit,
    actionButtonType: TextAreaActionButtonType,
    modifier: Modifier = Modifier,
    isFlexible: Boolean = true,
    isAttachButtonVisible: Boolean = false,
    onAttachButtonClick: () -> Unit = {},
    onActionButtonClick: () -> Unit = {},
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    maxLines: Int = Int.MAX_VALUE,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
) {
    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        state = state,
        singleLine = false,
        minLines = if (isFlexible) 1 else 4,
        maxLines = if (isFlexible) maxLines else Int.MAX_VALUE,
        maxLength = maxLength,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = null,
        isNecessary = false,
        helperText = null,
        isHelperTextVisible = false,
        isCounterTextVisible = false,
        innerTextFieldMinHeight = if (isFlexible) 46.dp else 106.dp,
        innerTextFieldMaxHeight = 106.dp,
        decorationAlignment = Alignment.Bottom,
        leadingContent = {
            if (isAttachButtonVisible) {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.Bottom,
                ) {
                    AttachButton(onClick = onAttachButtonClick)
                    HorizontalSpacer(width = 12.dp)
                }
            }
        },
        trailingContent = {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.Bottom,
            ) {
                HorizontalSpacer(width = 12.dp)
                when (actionButtonType) {
                    TextAreaActionButtonType.Send -> SendButton(
                        value = value,
                        onClick = onActionButtonClick
                    )

                    TextAreaActionButtonType.Upload -> UploadButton(
                        value = value,
                        onClick = onActionButtonClick
                    )
                }
            }
        },
    )
}

/**
 * 특수 버튼이 포함 된 Text Area 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param actionButtonType 사용할 특수 액션 버튼의 타입.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param isAttachButtonVisible 컴포넌트 앞쪽 부착 버튼 활성화 상태.
 * @param onAttachButtonClick 컴포넌트 앞쪽 부착 버튼 클릭 이벤트.
 * @param onActionButtonClick 특수 액션 버튼 클릭 이벤트.
 * @param textStyle 텍스트 필드에 입력 된 문자의 스타일.
 * @param state 텍스트 필드 상태.
 * @param maxLines 텍스트 필드에서 한번에 보이는 최대 줄 수. [isFlexible]이 `false`인 경우 무시됩니다.
 * @param maxLength 텍스트 필드에 입력 가능한 최대 문자 수.
 * @param keyboardOptions 키보드 옵션.
 * @param keyboardActions 키보드 액션.
 * @param visualTransformation 이 텍스트 필드에 적용 할 [VisualTransformation].
 * @param interactionSource 이 텍스트 필드에 적용 할 [MutableInteractionSource].
 * @param placeholder 현재 입력 된 문자가 없을 때 보여 줄 placeholder 문구.
 */
@Composable
fun textAreaButton(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    actionButtonType: TextAreaActionButtonType,
    modifier: Modifier = Modifier,
    isFlexible: Boolean = true,
    isAttachButtonVisible: Boolean = false,
    onAttachButtonClick: () -> Unit = {},
    onActionButtonClick: () -> Unit = {},
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    state: DealiTextFieldState = DealiTextFieldState.ENABLED,
    maxLines: Int = Int.MAX_VALUE,
    maxLength: Int = Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
) {
    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        state = state,
        singleLine = false,
        minLines = if (isFlexible) 1 else 4,
        maxLines = if (isFlexible) maxLines else Int.MAX_VALUE,
        maxLength = maxLength,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = null,
        isNecessary = false,
        helperText = null,
        isHelperTextVisible = false,
        isCounterTextVisible = false,
        innerTextFieldMinHeight = if (isFlexible) 46.dp else 106.dp,
        innerTextFieldMaxHeight = 106.dp,
        decorationAlignment = Alignment.Bottom,
        leadingContent = {
            if (isAttachButtonVisible) {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.Bottom,
                ) {
                    AttachButton(onClick = onAttachButtonClick)
                    HorizontalSpacer(width = 12.dp)
                }
            }
        },
        trailingContent = {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.Bottom,
            ) {
                HorizontalSpacer(width = 12.dp)
                when (actionButtonType) {
                    TextAreaActionButtonType.Send -> SendButton(
                        value = value.text,
                        onClick = onActionButtonClick
                    )

                    TextAreaActionButtonType.Upload -> UploadButton(
                        value = value.text,
                        onClick = onActionButtonClick
                    )
                }
            }
        },
    )
}

/**
 * 특수 액션 버튼이 포함 된 Text Area 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param actionButtonType 사용할 특수 액션 버튼의 타입.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param isAttachButtonVisible 컴포넌트 앞쪽 부착 버튼 활성화 상태.
 * @param onAttachButtonClick 컴포넌트 앞쪽 부착 버튼 클릭 이벤트.
 * @param onActionButtonClick 특수 액션 버튼 클릭 이벤트.
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
 */
@Deprecated("DealiTextFieldState를 추가한 버전을 사용해주세요.")
@Composable
fun textAreaButton(
    value: String,
    onValueChange: (String) -> Unit,
    actionButtonType: TextAreaActionButtonType,
    modifier: Modifier = Modifier,
    isFlexible: Boolean = true,
    isAttachButtonVisible: Boolean = false,
    onAttachButtonClick: () -> Unit = {},
    onActionButtonClick: () -> Unit = {},
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
        label = null,
        isNecessary = false,
        helperText = null,
        isHelperTextVisible = false,
        isCounterTextVisible = false,
        innerTextFieldMinHeight = if (isFlexible) 46.dp else 106.dp,
        innerTextFieldMaxHeight = 106.dp,
        decorationAlignment = Alignment.Bottom,
        leadingContent = {
            if (isAttachButtonVisible) {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.Bottom,
                ) {
                    AttachButton(onClick = onAttachButtonClick)
                    HorizontalSpacer(width = 12.dp)
                }
            }
        },
        trailingContent = {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.Bottom,
            ) {
                HorizontalSpacer(width = 12.dp)
                when (actionButtonType) {
                    TextAreaActionButtonType.Send -> SendButton(
                        value = value,
                        onClick = onActionButtonClick
                    )

                    TextAreaActionButtonType.Upload -> UploadButton(
                        value = value,
                        onClick = onActionButtonClick
                    )
                }
            }
        },
    )
}

/**
 * 특수 버튼이 포함 된 Text Area 컴포넌트.
 *
 * @param value 현재 입력 된 문자.
 * @param onValueChange 입력 된 문자가 변경되었을 때 실행되는 콜백.
 * @param actionButtonType 사용할 특수 액션 버튼의 타입.
 * @param modifier [Modifier].
 * @param isFlexible 텍스트 필드가 가변 높이인지 여부. 높이가 가변적인 경우 최소, 최대 높이 내에서 조정되며,
 * 고정적인 경우는 최대 높이로 고정됩니다.
 * @param isAttachButtonVisible 컴포넌트 앞쪽 부착 버튼 활성화 상태.
 * @param onAttachButtonClick 컴포넌트 앞쪽 부착 버튼 클릭 이벤트.
 * @param onActionButtonClick 특수 액션 버튼 클릭 이벤트.
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
 */
@Deprecated("DealiTextFieldState를 추가한 버전을 사용해주세요.")
@Composable
fun textAreaButton(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    actionButtonType: TextAreaActionButtonType,
    modifier: Modifier = Modifier,
    isFlexible: Boolean = true,
    isAttachButtonVisible: Boolean = false,
    onAttachButtonClick: () -> Unit = {},
    onActionButtonClick: () -> Unit = {},
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
        label = null,
        isNecessary = false,
        helperText = null,
        isHelperTextVisible = false,
        isCounterTextVisible = false,
        innerTextFieldMinHeight = if (isFlexible) 46.dp else 106.dp,
        innerTextFieldMaxHeight = 106.dp,
        decorationAlignment = Alignment.Bottom,
        leadingContent = {
            if (isAttachButtonVisible) {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.Bottom,
                ) {
                    AttachButton(onClick = onAttachButtonClick)
                    HorizontalSpacer(width = 12.dp)
                }
            }
        },
        trailingContent = {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.Bottom,
            ) {
                HorizontalSpacer(width = 12.dp)
                when (actionButtonType) {
                    TextAreaActionButtonType.Send -> SendButton(
                        value = value.text,
                        onClick = onActionButtonClick
                    )

                    TextAreaActionButtonType.Upload -> UploadButton(
                        value = value.text,
                        onClick = onActionButtonClick
                    )
                }
            }
        },
    )
}

@Composable
private fun AttachButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier.height(46.dp),
        contentAlignment = Alignment.Center,
    ) {
        Icon24(
            iconRes = R.drawable.ic_pluscircle_filled,
            modifier = modifier,
            onClick = onClick,
        )
    }
}

@Composable
private fun SendButton(
    value: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier.height(46.dp),
        contentAlignment = Alignment.Center,
    ) {
        Icon24(
            modifier = modifier,
            iconRes = R.drawable.ic_send,
            enabled = value.isNotEmpty(),
            color = if (value.isNotEmpty()) DealiColor.primary01 else DealiColor.g60,
            onClick = onClick,
        )
    }
}

@Composable
private fun UploadButton(
    value: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier.height(46.dp),
        contentAlignment = Alignment.Center,
    ) {
        Icon24(
            modifier = modifier,
            iconRes = R.drawable.ic_up_1_filled,
            enabled = value.isNotEmpty(),
            color = if (value.isNotEmpty()) DealiColor.primary01 else DealiColor.g60,
            onClick = onClick,
        )
    }
}
