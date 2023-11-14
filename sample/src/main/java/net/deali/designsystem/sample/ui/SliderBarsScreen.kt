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
import androidx.compose.ui.platform.LocalDensity
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
            var minValue by remember { mutableStateOf(0f) }
            var maxValue by remember { mutableStateOf(1f) }
            var offset by remember { mutableStateOf(0f) }
            val density = LocalDensity.current

            var resultMin by remember { mutableStateOf(0f) }
            var resultMax by remember { mutableStateOf(0f) }

//            Slider(
//                modifier = Modifier.fillMaxWidth()
//            )

            DealiRangeSlider(
                modifier = Modifier
                    .fillMaxWidth(),
                trackColor = DealiColor.primary01,
                backColor = DealiColor.g30,
                barHeight = 6.dp,
                thumbRadius = 11.dp,
                cornerRadius = CornerRadius(32f, 32f),
                progress1InitialValue = minValue,
                progress2InitialValue = maxValue,
                onProgressChanged = { min, max ->
                    resultMin = min
                    resultMax = max
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(text = "MIN $resultMin\nMAX $resultMax")
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