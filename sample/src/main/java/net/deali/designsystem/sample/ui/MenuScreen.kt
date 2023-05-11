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
                text = "1. Typography"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "2. Grid"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "3. Colors"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "4. Indentations"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "5. Iconography"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "6. Shadows"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "7. Corner radius"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "8. Navigation"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "9. Buttons"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "10. UI Elements"
            )
        }

        MediumFulledButton(
            modifier = Modifier
                .fillMaxWidth(),
            enabled = true,
            onClick = {}
        ) {
            DealiText(
                text = "11. Forms"
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