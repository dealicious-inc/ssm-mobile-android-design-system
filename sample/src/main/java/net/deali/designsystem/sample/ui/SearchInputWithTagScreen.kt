package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.SearchInput
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.theme.DealiColor

@Composable
fun SearchInputWithTagScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Input",
                onBack = onBackPress,
            )
        }
    ) {
        var text by remember { mutableStateOf("") }
        var placeholder by remember { mutableStateOf("") }
        var tagText by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SearchInput(
                value = text,
                onValueChange = remember { { text = it } },
                placeholder = placeholder,
                tagText = tagText,
            )
            SampleDivider()
            InputOption(
                title = "Placeholder",
                value = placeholder,
                onValueChange = { placeholder = it },
                placeholder = "Placeholder를 수정해 보세요.",
            )
            SampleDivider()
            InputOption(
                title = "Tag Text",
                value = tagText,
                onValueChange = { tagText = it },
                placeholder = "Tag의 텍스트를 수정해보세요",
            )
        }
    }
}

@Composable
private fun SampleDivider() = Box(
    modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(color = DealiColor.g20)
)


@Composable
private fun InputOption(
    title: String,
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
) {
    TextInput(
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        label = title,
        modifier = modifier,
    )
}

@Composable
@Preview(showBackground = true)
private fun SearchInputScreenPreview() {
    SearchInputScreen(onBackPress = {})
}

