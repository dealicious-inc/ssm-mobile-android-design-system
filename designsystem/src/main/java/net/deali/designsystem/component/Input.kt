package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import net.deali.designsystem.internal.textfield.CoreDealiTextField
import net.deali.designsystem.internal.textfield.CoreDealiTextFieldForTextFieldValue
import net.deali.designsystem.theme.gray100

@Composable
fun Input(
    value: String,
    onValueChange: (String) -> Unit,
    @DrawableRes trailingIconRes: Int?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = gray100,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
) {
    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
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
        trailingContent = if (trailingIconRes != null) {
            @Composable {
                Icon16(
                    painter = painterResource(id = trailingIconRes),
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
fun Input(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    CoreDealiTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
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
        trailingContent = trailingContent,
    )
}

@Composable
fun Input(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    @DrawableRes trailingIconRes: Int?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    iconColor: Color = gray100,
    onIconClick: (() -> Unit)? = null,
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
) {
    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
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
        trailingContent = if (trailingIconRes != null) {
            @Composable {
                Icon16(
                    painter = painterResource(id = trailingIconRes),
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
fun Input(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholder: String? = null,
    label: String? = null,
    helperText: String? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    CoreDealiTextFieldForTextFieldValue(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
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
        trailingContent = trailingContent,
    )
}

@Composable
fun InputWithButton(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
}

@Composable
fun DealiTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
}
