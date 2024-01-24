package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults
import net.deali.designsystem.theme.DealiColor

@Composable
fun TextInputWithButton(
    value: String,
    onValueChange: (String) -> Unit,
    @DrawableRes trailingIconRes: Int?,
    buttonText: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    inputEnabled: Boolean = true,
    buttonEnabled: Boolean = true,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = DealiColor.g100,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
) {
    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = inputEnabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        buttonContent = {
            DealiTextFieldDefaults.TrailingButton(
                text = buttonText,
                onClick = onButtonClick,
                enabled = buttonEnabled
            )
        },
        trailingContent = if (trailingIconRes != null) {
            @Composable {
                Icon16(
                    iconRes = trailingIconRes,
                    color = iconColor,
                    enabled = onIconClick != null,
                    onClick = onIconClick ?: {},
                )
            }
        } else {
            null
        },
    )
}

@Composable
fun TextInputWithButton(
    value: String,
    onValueChange: (String) -> Unit,
    buttonText: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    inputEnabled: Boolean = true,
    buttonEnabled: Boolean = true,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = inputEnabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        buttonContent = {
            DealiTextFieldDefaults.TrailingButton(
                text = buttonText,
                onClick = onButtonClick,
                enabled = buttonEnabled
            )
        },
        trailingContent = trailingContent,
    )
}

@Composable
fun TextInputWithButton(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    @DrawableRes trailingIconRes: Int?,
    buttonText: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    inputEnabled: Boolean = true,
    buttonEnabled: Boolean = true,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = DealiColor.g100,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
) {
    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = inputEnabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        buttonContent = {
            DealiTextFieldDefaults.TrailingButton(
                text = buttonText,
                onClick = onButtonClick,
                enabled = buttonEnabled
            )
        },
        trailingContent = if (trailingIconRes != null) {
            @Composable {
                Icon16(
                    iconRes = trailingIconRes,
                    color = iconColor,
                    enabled = onIconClick != null,
                    onClick = onIconClick ?: {},
                )
            }
        } else {
            null
        },
    )
}

@Composable
fun TextInputWithButton(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    buttonText: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    inputEnabled: Boolean = true,
    buttonEnabled: Boolean = true,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        textStyle = textStyle,
        enabled = inputEnabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        buttonContent = {
            DealiTextFieldDefaults.TrailingButton(
                text = buttonText,
                onClick = onButtonClick,
                enabled = buttonEnabled
            )
        },
        trailingContent = trailingContent,
    )
}
