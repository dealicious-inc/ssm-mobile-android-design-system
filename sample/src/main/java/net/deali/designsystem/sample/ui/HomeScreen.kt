package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import net.deali.designsystem.component.CommonButton

@Composable
fun MenuScreen(
    navigateToTypography: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        CommonButton(
            onClick = navigateToTypography
        ) {
            BasicText(
                modifier = Modifier,
                text = "1. Typography"
            )
        }
    }
}
