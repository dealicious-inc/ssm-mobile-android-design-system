package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.MediumFulledButton

@Composable
fun MenuScreen(
    navigateToTypography: () -> Unit,
    navigateToButton: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "1. Typography",
            onClick = navigateToTypography
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "2. Grid",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "3. Colors",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "4. Indentations",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "5. Iconography",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "6. Shadows",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "7. Corner radius",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "8. Navigation",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "9. Buttons",
            onClick = navigateToButton
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "10. UI Elements",
            onClick = {}
        )

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            process = false,
            text = "11. Forms",
            onClick = {}
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 360, backgroundColor = 0XFFFFFF)
private fun MenuScreenPreview() {
    MenuScreen(
        navigateToTypography = {},
        navigateToButton = {}
    )
}