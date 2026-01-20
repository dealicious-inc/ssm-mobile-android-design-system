package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.btnOutlineMedium01
import net.deali.designsystem.sample.ui.NavigationContainer

@Composable
fun FormsScreen(
    navigateToInput: () -> Unit,
    navigateToInputWithButton: () -> Unit,
    navigateToTextArea: () -> Unit,
    navigateToTextAreaButton: () -> Unit,
    navigateToSearchInput: () -> Unit,
    navigateToSearchInputWithTag: () -> Unit,
    navigateToDropdown: () -> Unit,
    onBackPress: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Forms",
                onBack = onBackPress,
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Text Input",
                enabled = true,
                onClick = navigateToInput,
            )
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Text Input + Button",
                enabled = true,
                onClick = navigateToInputWithButton,
            )
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Text Area",
                enabled = true,
                onClick = navigateToTextArea,
            )
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Text Area + Buttons",
                enabled = true,
                onClick = navigateToTextAreaButton,
            )
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Search Input",
                enabled = true,
                onClick = navigateToSearchInput,
            )
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Search Input + Tag",
                enabled = true,
                onClick = navigateToSearchInputWithTag,
            )
            btnOutlineMedium01(
                modifier = Modifier.fillMaxWidth(),
                text = "Dropdown",
                enabled = true,
                onClick = navigateToDropdown,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun FormsScreenPreview() {
    FormsScreen(
        navigateToInput = {},
        navigateToInputWithButton = {},
        navigateToTextArea = {},
        navigateToTextAreaButton = {},
        navigateToSearchInput = {},
        navigateToSearchInputWithTag = {},
        navigateToDropdown = {},
        onBackPress = {},
    )
}
