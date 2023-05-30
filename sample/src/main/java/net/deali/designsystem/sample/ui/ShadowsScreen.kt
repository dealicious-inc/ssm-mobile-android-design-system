package net.deali.designsystem.sample.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100

@Composable
fun ShadowsScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Shadows",
                navigationIcon = {
                    Icon24(
                        painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        DealiText(
            text = "SHADOWS SCREEN EMPTY",
            style = AppTheme.typography.h1b32,
            color = gray100
        )
    }
}

@Composable
@Preview
private fun ShadowsScreenPreview() {
    ShadowsScreen(
        onBackPress = {}
    )
}
