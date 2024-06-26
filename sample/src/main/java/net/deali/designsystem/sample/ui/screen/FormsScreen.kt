package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
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
            ActionBar(
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
                text = "Text Input",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToInput,
            )
            btnOutlineMedium01(
                text = "Text Input + Button",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToInputWithButton,
            )
            btnOutlineMedium01(
                text = "Text Area",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToTextArea,
            )
            btnOutlineMedium01(
                text = "Text Area + Buttons",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToTextAreaButton,
            )
            btnOutlineMedium01(
                text = "Search Input",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToSearchInput,
            )
            btnOutlineMedium01(
                text = "Search Input + Tag",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToSearchInputWithTag,
            )
            btnOutlineMedium01(
                text = "Dropdown",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
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
