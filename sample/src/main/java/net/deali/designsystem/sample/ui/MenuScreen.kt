package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.btnFilledMedium01
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

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
    navigateToChip: () -> Unit,
    navigateToUIElements: () -> Unit,
    navigateToForms: () -> Unit,
    navigateToBottomSheets: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(start = 20.dp)
            ) {
                DealiText(
                    modifier = Modifier.align(Alignment.CenterStart),
                    text = "Deali Design System Sample",
                    style = DealiFont.sh3sb16,
                    color = DealiColor.primary05,
                )
            }
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
            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Typography",
                onClick = navigateToTypography
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Grid",
                onClick = navigateToGrid
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Colors",
                onClick = navigateToColors
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Indentations",
                onClick = navigateToIndentations
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Iconography",
                onClick = navigateToIconography
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Shadows",
                onClick = navigateToShadows
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Corner radius",
                onClick = navigateToCornerRadius
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Navigation",
                onClick = navigateToNavigation
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Buttons",
                onClick = navigateToButtons
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Chip",
                onClick = navigateToChip
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "UI Elements",
                onClick = navigateToUIElements
            )

            btnFilledMedium01(
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
                loading = false,
                text = "Forms",
                onClick = navigateToForms
            )

            btnFilledMedium01(
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
        navigateToChip = {},
        navigateToUIElements = {},
        navigateToForms = {},
        navigateToBottomSheets = {},
    )
}
