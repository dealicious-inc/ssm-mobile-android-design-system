package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.MediumFulledButton
import net.deali.designsystem.component.NavigationBar

@Composable
fun MenuScreen(
    navigateToTypography: () -> Unit,
    navigateToGrid: () -> Unit,
    navigateToColors: () -> Unit,
    navigateToIndentations: () -> Unit,
    navigateToIconography: () -> Unit,
    navigateToShadows: () -> Unit,
    navigateToCornerRadius: () -> Unit,
    navigateToNavigation: () -> Unit,
    navigateToButtons: () -> Unit,
    navigateToUIElements: () -> Unit,
    navigateToForms: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Deali Design System Sample"
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .weight(1f),
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
                onClick = navigateToGrid
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "3. Colors",
                onClick = navigateToColors
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "4. Indentations",
                onClick = navigateToIndentations
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "5. Iconography",
                onClick = navigateToIconography
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "6. Shadows",
                onClick = navigateToShadows
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "7. Corner radius",
                onClick = navigateToCornerRadius
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "8. Navigation",
                onClick = navigateToNavigation
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "9. Buttons",
                onClick = navigateToButtons
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "10. UI Elements",
                onClick = navigateToUIElements
            )

            MediumFulledButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "11. Forms",
                onClick = navigateToForms
            )
        }
    }
}

@Composable
@Preview(showBackground = true, widthDp = 360, backgroundColor = 0XFFFFFF)
private fun MenuScreenPreview() {
    MenuScreen(
        navigateToTypography = {},
        navigateToGrid = {},
        navigateToColors = {},
        navigateToIndentations = {},
        navigateToIconography = {},
        navigateToShadows = {},
        navigateToCornerRadius = {},
        navigateToNavigation = {},
        navigateToButtons = {},
        navigateToUIElements = {},
        navigateToForms = {},
    )
}
