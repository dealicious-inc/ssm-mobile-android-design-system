package net.deali.designsystem.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.textfield.BasicDealiTextField

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
) {
    BasicDealiTextField(
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
) {
    BasicDealiTextField(
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

@Preview(showBackground = true)
@Composable
private fun InputPreview() {
    Box(modifier = Modifier.padding(all = 8.dp)) {
        var text by remember {
            mutableStateOf(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sodales" +
                        "laoreet commodo."
            )
        }
        Input(
            value = text,
            onValueChange = { text = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InputWithButtonPreview() {
    Box(modifier = Modifier.padding(all = 8.dp)) {
        var text by remember {
            mutableStateOf(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sodales" +
                        "laoreet commodo."
            )
        }
        InputWithButton(
            value = text,
            onValueChange = { text = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TextFieldPreview() {
    Box(modifier = Modifier.padding(all = 8.dp)) {
        var text by remember {
            mutableStateOf(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sodales" +
                        "laoreet commodo."
            )
        }
        DealiTextField(
            value = text,
            onValueChange = { text = it }
        )
    }
}
