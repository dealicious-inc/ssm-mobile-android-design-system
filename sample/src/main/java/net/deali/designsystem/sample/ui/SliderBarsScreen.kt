package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.internal.slider.DealiRangeSlider
import net.deali.designsystem.theme.DealiColor


@Composable
fun SliderScreen(
    onBackPress: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Slider Bars",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            val leftInitValue by remember { mutableStateOf(0f) }
            val rightInitValue by remember { mutableStateOf(1f) }

            var leftValue by remember { mutableStateOf(0f) }
            var rightValue by remember { mutableStateOf(0f) }

            DealiRangeSlider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                trackColor = DealiColor.primary01,
                trackBackgroundColor = DealiColor.g30,
                trackHeight = 6.dp,
                thumbRadius = 11.dp,
                trackCornerRadius = CornerRadius(32f, 32f),
                leftInitValue = leftInitValue,
                rightInitValue = rightInitValue,
                onValueChanged = { left, right ->
                    leftValue = left
                    rightValue = right
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(text = "MIN $leftValue\nMAX $rightValue")
        }
    }
}


//@OptIn(ExperimentalMaterialApi::class)
//@Composable
//fun Slider(
//    minValue: Float,
//    maxValue: Float,
//    onMinValueChange: (Float) -> Unit,
//    onMaxValueChange: (Float) -> Unit,
//    modifier: Modifier = Modifier,
//    steps: Int = 0,
//    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
//) { }