package net.deali.designsystem.sample.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.PriceRangeSlider
import net.deali.designsystem.component.RangeSlider
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont


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
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var rangeLeftValue by remember { mutableStateOf(0f) }
            var rangeRightValue by remember { mutableStateOf(1f) }

            DealiText(text = "RangeSlider", style = DealiFont.b1sb15, color = DealiColor.g100)

            RangeSlider(
                modifier = Modifier,
                leftInitValue = rangeLeftValue,
                rightInitValue = rangeRightValue,
                trackColor = DealiColor.primary01,
                trackBackgroundColor = DealiColor.g30,
                trackHeight = 6.dp,
                thumbRadius = 11.dp,
                onValueChanged = { left, right ->
                    rangeLeftValue = left
                    rangeRightValue = right
                }
            )

            Text(text = "MIN $rangeLeftValue\nMAX $rangeRightValue")

            Divider(
                modifier = Modifier.padding(20.dp),
                color = DealiColor.g30
            )

            var priceLeftValue by remember { mutableStateOf(0.3f) }
            var priceRightValue by remember { mutableStateOf(0.7f) }

            DealiText(
                text = "PriceRangeSlider init - 0.3~0.7 ",
                style = DealiFont.b1sb15,
                color = DealiColor.g100
            )

            PriceRangeSlider(
                modifier = Modifier,
                leftInitValue = priceLeftValue,
                rightInitValue = priceRightValue,
                indicators = listOf("1만원", "3만원", "5만원", "15만원", "25만원"),
                onValueChanged = { left, right ->
                    priceLeftValue = left
                    priceRightValue = right
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(text = "MIN $priceLeftValue\nMAX $priceRightValue")
        }
    }
}