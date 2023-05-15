package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.appresource.R
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.MediumOutlinedButton
import net.deali.designsystem.component.NavigationBar

@Composable
fun UIElementsScreen(
    navigateToTag: () -> Unit,
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "UI Elements",
                navigationIcon = {
                    Icon24(
                        painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .weight(1f),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            MediumOutlinedButton(
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = true,
                process = false,
                text = "Tag",
                onClick = navigateToTag
            )
        }
    }
}

@Composable
@Preview
private fun UIElementsScreenPreview() {
    UIElementsScreen(
        navigateToTag = {},
        onBackPress = {}
    )
}
