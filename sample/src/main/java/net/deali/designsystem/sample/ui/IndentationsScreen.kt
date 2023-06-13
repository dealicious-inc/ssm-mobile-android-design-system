package net.deali.designsystem.sample.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100

@Composable
fun IndentationsScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Indentations",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        DealiText(
            text = "INDENTATIONS SCREEN EMPTY",
            style = AppTheme.typography.h1b32,
            color = gray100
        )
    }
}

@Composable
@Preview
private fun IndentationsScreenPreview() {
    IndentationsScreen(
        onBackPress = {}
    )
}
