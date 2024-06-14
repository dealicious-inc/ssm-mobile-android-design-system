package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
import net.deali.designsystem.component.HorizontalDivider
import net.deali.designsystem.component.SearchInput
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.internal.textfield.DealiTextFieldState
import net.deali.designsystem.sample.ui.NavigationContainer
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
                tagText = tagText,
                placeholder = placeholder,
                onClickSearch = {},
                state = DealiTextFieldState.ENABLED,
            )
            HorizontalDivider(color = DealiColor.g20)
            TextInput(
                value = placeholder,
                onValueChange = { placeholder = it },
                placeholder = "Placeholder를 수정해 보세요.",
                label = "Placeholder",
                modifier = Modifier,
            )
            HorizontalDivider(color = DealiColor.g20)
            TextInput(
                value = tagText,
                onValueChange = { tagText = it },
                placeholder = "Tag의 텍스트를 수정해보세요",
                label = "Tag Text",
                modifier = Modifier,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun SearchInputWithTagScreenPreview() {
    SearchInputWithTagScreen(onBackPress = {})
}

