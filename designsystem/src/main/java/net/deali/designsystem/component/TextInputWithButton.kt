package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.DealiTextFieldDefaults
import net.deali.designsystem.theme.AppTheme

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
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = AppTheme.colors.g100,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
) {
    TextInputWithButtonRow(modifier = modifier) {
        TextInput(
            value = value,
            onValueChange = onValueChange,
            trailingIconRes = trailingIconRes,
            modifier = Modifier.weight(1f),
            textStyle = textStyle,
            enabled = inputEnabled,
            isError = isError,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            iconColor = iconColor,
            onIconClick = onIconClick,
            placeholder = placeholder,
            label = label,
            helperText = helperText,
            isHelperTextVisible = isHelperTextVisible,
        )
        ButtonMediumOutlined(
            text = buttonText,
            enabled = buttonEnabled,
            modifier = Modifier,
            onClick = onButtonClick,
        )
    }
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
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    TextInputWithButtonRow(modifier = modifier) {
        TextInput(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.weight(1f),
            textStyle = textStyle,
            enabled = inputEnabled,
            isError = isError,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            placeholder = placeholder,
            label = label,
            helperText = helperText,
            isHelperTextVisible = isHelperTextVisible,
            trailingContent = trailingContent,
        )
        ButtonMediumOutlined(
            text = buttonText,
            enabled = buttonEnabled,
            modifier = Modifier,
            onClick = onButtonClick,
        )
    }
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
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = AppTheme.colors.g100,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
) {
    TextInputWithButtonRow(modifier = modifier) {
        TextInput(
            value = value,
            onValueChange = onValueChange,
            trailingIconRes = trailingIconRes,
            modifier = Modifier.weight(1f),
            textStyle = textStyle,
            enabled = inputEnabled,
            isError = isError,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            iconColor = iconColor,
            onIconClick = onIconClick,
            placeholder = placeholder,
            label = label,
            helperText = helperText,
            isHelperTextVisible = isHelperTextVisible,
        )
        ButtonMediumOutlined(
            text = buttonText,
            enabled = buttonEnabled,
            modifier = Modifier,
            onClick = onButtonClick,
        )
    }
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
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    isHelperTextVisible: Boolean = false,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    TextInputWithButtonRow(modifier = modifier) {
        TextInput(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.weight(1f),
            textStyle = textStyle,
            enabled = inputEnabled,
            isError = isError,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            placeholder = placeholder,
            label = label,
            helperText = helperText,
            isHelperTextVisible = isHelperTextVisible,
            trailingContent = trailingContent,
        )
        ButtonMediumOutlined(
            text = buttonText,
            enabled = buttonEnabled,
            modifier = Modifier,
            onClick = onButtonClick,
        )
    }
}

@Composable
private fun TextInputWithButtonRow(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) = Row(
    modifier = modifier,
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    verticalAlignment = Alignment.CenterVertically,
    content = content,
)
