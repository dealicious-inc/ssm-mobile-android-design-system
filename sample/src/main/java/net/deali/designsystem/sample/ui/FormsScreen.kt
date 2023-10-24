package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.btnOutlineMediumPrimary01

@Composable
fun FormsScreen(
    navigateToInput: () -> Unit,
    navigateToInputWithButton: () -> Unit,
    navigateToTextField: () -> Unit,
    onBackPress: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Forms",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            btnOutlineMediumPrimary01(
                text = "Text Input",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToInput,
            )
            btnOutlineMediumPrimary01(
                text = "Text Input + Button",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToInputWithButton,
            )
            btnOutlineMediumPrimary01(
                text = "Text Field",
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                onClick = navigateToTextField,
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
        navigateToTextField = {},
        onBackPress = {},
    )
}
