package net.deali.designsystem.sample.ui

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.theme.white100
import net.deali.designsystem.util.getRandomText

@Composable
fun RadioButtonScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "RadioButton",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
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
                .background(color = white100)
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
