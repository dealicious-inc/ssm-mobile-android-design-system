package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.btnFilledMediumPrimary01

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
    navigateToChips: () -> Unit,
    navigateToUIElements: () -> Unit,
    navigateToForms: () -> Unit,
    navigateToBottomSheets: () -> Unit,
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
                .weight(1f)
                .padding(top = 12.dp)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState())
                .padding(bottom = 24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Typography",
                onClick = navigateToTypography
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Grid",
                onClick = navigateToGrid
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Colors",
                onClick = navigateToColors
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Indentations",
                onClick = navigateToIndentations
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Iconography",
                onClick = navigateToIconography
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Shadows",
                onClick = navigateToShadows
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Corner radius",
                onClick = navigateToCornerRadius
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Navigation",
                onClick = navigateToNavigation
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Buttons",
                onClick = navigateToButtons
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Chips",
                onClick = navigateToChips
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "UI Elements",
                onClick = navigateToUIElements
            )

            btnFilledMediumPrimary01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Forms",
                onClick = navigateToForms
            )

            btnFilledMediumPrimary01(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "BottomSheets",
                onClick = navigateToBottomSheets
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
        navigateToChips = {},
        navigateToUIElements = {},
        navigateToForms = {},
        navigateToBottomSheets = {},
    )
}
