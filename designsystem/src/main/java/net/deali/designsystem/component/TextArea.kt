package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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

@Composable
fun textAreaFlexible(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    minLines: Int = 1,
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
fun textAreaFlexible(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    minLines: Int = 1,
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
fun textAreaFixed(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    minLines: Int = 4,
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
        innerTextFieldMinHeight = 106.dp,
    )
}

@Composable
fun textAreaFixed(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = DealiTextFieldDefaults.TextStyle,
    enabled: Boolean = true,
    isError: Boolean = false,
    minLines: Int = 4,
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
        innerTextFieldMinHeight = 106.dp,
    )
}
