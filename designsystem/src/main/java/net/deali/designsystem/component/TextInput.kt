package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import net.deali.designsystem.theme.AppTheme

@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    @DrawableRes trailingIconRes: Int?,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = AppTheme.colors.text01,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    isHelperTextVisible: Boolean = false,
    label: String? = null,
    helperText: String? = null,
) {
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
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
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
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
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
        enabled = enabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        trailingContent = trailingContent,
    )
}

@Composable
fun TextInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    @DrawableRes trailingIconRes: Int?,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = AppTheme.colors.text01,
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
        enabled = enabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
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
fun TextInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
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
        enabled = enabled,
        isError = isError,
        singleLine = true,
        minLines = 1,
        maxLines = 1,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource,
        placeholder = placeholder,
        label = label,
        helperText = helperText,
        isHelperTextVisible = isHelperTextVisible,
        trailingContent = trailingContent,
    )
}
