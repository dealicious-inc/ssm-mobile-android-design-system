package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.CheckBox
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.theme.DealiColor

@Composable
fun CheckBoxScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "CheckBox",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        var checked by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.primary04)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            CheckBox(
                checked = checked,
                text = "CheckBox / checked: $checked / enabled: true",
                onCheck = {
                    checked = !checked
                }
            )

            CheckBox(
                checked = false,
                enabled = false,
                text = "CheckBox / checked: false / enabled: false",
                onCheck = { }
            )
        }
    }
}

@Composable
@Preview
private fun CheckBoxScreenPreview() {
    CheckBoxScreen(
        onBackPress = {}
    )
}
