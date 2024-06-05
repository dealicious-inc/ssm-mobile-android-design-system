package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun RadioButtonScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "RadioButton",
                onBack = onBackPress,
            )
        }
    ) {
        val radioOptions = listOf(
            getRandomText(1),
            getRandomText(2),
            getRandomText(3),
            getRandomText(4)
        )

        var selectedItem by remember {
            mutableStateOf(radioOptions[0])
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.primary04)
                .padding(10.dp)
                .selectableGroup(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            radioOptions.forEachIndexed { index, label ->
                RadioButton(
                    text = "$label / selected : ${selectedItem == label} / enabled : ${index != radioOptions.lastIndex}",
                    selected = (selectedItem == label),
                    onClick = { selectedItem = label },
                    enabled = index != radioOptions.lastIndex
                )
            }
        }
    }
}

@Composable
@Preview
private fun RadioButtonScreenPreview() {
    RadioButtonScreen(
        onBackPress = {}
    )
}
