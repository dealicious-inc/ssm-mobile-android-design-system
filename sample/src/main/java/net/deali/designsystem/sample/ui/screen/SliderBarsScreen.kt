package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.PriceRangeSlider
import net.deali.designsystem.component.RangeSlider
import net.deali.designsystem.component.TextInput
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont


@Composable
fun SliderScreen(
    onBackPress: () -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Slider Bars",
                onBack = onBackPress,
            )
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var minValue by remember { mutableStateOf(0f) }
            var maxValue by remember { mutableStateOf(1f) }

            DealiText(text = "RangeSlider", style = DealiFont.b1sb15, color = DealiColor.g100)

            RangeSlider(
                modifier = Modifier,
                minValue = minValue,
                maxValue = maxValue,
                trackColor = DealiColor.primary01,
                trackBackgroundColor = DealiColor.g30,
                trackHeight = 6.dp,
                thumbRadius = 11.dp,
                onValueChanged = { min, max ->
                    minValue = min
                    maxValue = max
                }
            )

            Text(text = "MIN $minValue\nMAX $maxValue")

            Divider(
                modifier = Modifier.padding(20.dp),
                color = DealiColor.g30
            )

            var priceMinValue by remember { mutableStateOf(0.3f) }
            var priceMaxValue by remember { mutableStateOf(0.7f) }

            Row {
                TextInput(
                    modifier = Modifier
                        .weight(1f),
                    value = priceMinValue.toString(),
                    onValueChange = {
                        priceMinValue = try {
                            it.toFloat()
                        } catch (e: Exception) {
                            e.printStackTrace()
                            0f
                        }
                    },
                )

                TextInput(
                    modifier = Modifier
                        .weight(1f),
                    value = priceMaxValue.toString(),
                    onValueChange = {
                        priceMaxValue = try {
                            it.toFloat()
                        } catch (e: Exception) {
                            e.printStackTrace()
                            0f
                        }
                    },
                )
            }

            DealiText(
                text = "PriceRangeSlider init - 0.3~0.7 ",
                style = DealiFont.b1sb15,
                color = DealiColor.g100
            )

            PriceRangeSlider(
                modifier = Modifier,
                minValue = priceMinValue,
                maxValue = priceMaxValue,
                indicators = listOf("1만원", "3만원", "5만원", "15만원", "25만원"),
                onValueChanged = { min, max ->
                    priceMinValue = min
                    priceMaxValue = max
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(text = "MIN $priceMinValue\nMAX $priceMaxValue")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSliderScreen() {
    SliderScreen {}
}
