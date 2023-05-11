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
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.MediumFulledButton
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.white100

@Composable
fun MenuScreen(
    navigateToTypography: () -> Unit
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
            onClick = navigateToTypography
        ) {
            DealiText(
                text = "1. Typography",
                style = AppTheme.typography.H1_32_B,
                color = white100
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "2. Grid",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "3. Colors",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "4. Indentations",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "5. Iconography",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "6. Shadows",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "7. Corner radius",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "8. Navigation",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "9. Buttons",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "10. UI Elements",
                style = AppTheme.typography.H1_32_B
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "11. Forms",
                style = AppTheme.typography.H1_32_B
            )
        }
    }
}

@Composable
@Preview(showBackground = true, widthDp = 360, backgroundColor = 0XFFFFFF)
private fun MenuScreenPreview() {
    MenuScreen(
        navigateToTypography = {}
    )
}