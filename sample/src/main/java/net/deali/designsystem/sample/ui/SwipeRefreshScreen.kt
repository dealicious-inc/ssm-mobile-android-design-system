package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.SwipeRefresh
import net.deali.designsystem.component.SwitchSmall
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun SwipeRefreshScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Swipe Refresh",
                onBack = onBackPress,
            )
        }
    ) {
        val coroutineScope = rememberCoroutineScope()

        var isRefreshing by remember { mutableStateOf(false) }
        var isEnabled by remember { mutableStateOf(true) }

        SwipeRefresh(
            modifier = Modifier
                .fillMaxSize(),
            isRefreshing = isRefreshing,
            isEnabled = isEnabled,
            onRefresh = {
                coroutineScope.launch {
                    isRefreshing = true
                    delay(300)
                    isRefreshing = false
                }
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
            ) {
                ToggleOption(
                    title = "Enabled",
                    selected = isEnabled,
                    onSelectedChange = { isEnabled = it }
                )
            }
        }
    }
}

@Composable
private fun ToggleOption(
    title: String,
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DealiText(
            text = title,
            style = DealiFont.b4r12,
            color = DealiColor.g100,
        )
        SwitchSmall(
            isOn = selected,
            onChange = onSelectedChange,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun SwipeRefreshScreenPreview() {
    SwipeRefreshScreen(onBackPress = {})
}
