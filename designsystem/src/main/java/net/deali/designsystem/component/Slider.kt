@file:OptIn(ExperimentalMaterialApi::class)

package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.slider.CoreSlider
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont


@Composable
fun Slider(modifier: Modifier = Modifier) {
    var minValue by remember { mutableStateOf(0.0f) }
    var maxValue by remember { mutableStateOf(1.0f) }
    val density = LocalDensity.current

    CoreSlider(
        modifier = modifier
            .fillMaxWidth()
            .background(DealiColor.primary03),
        minValue = minValue,
        maxValue = maxValue,
        onMinValueChange = { value -> minValue = value },
        onMaxValueChange = { value -> maxValue = value },
        thumb = {
            Thumb()
        },
        track = {
            Track(
                minValue = minValue,
                maxValue = maxValue,
            )
        }
    )
}

@Composable
fun Thumb(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(22.dp)
            .clip(CircleShape)
            .background(DealiColor.secondary01),
    )
}

@Composable
private fun Track(
    minValue: Float,
    maxValue: Float,
    modifier: Modifier = Modifier,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
) {
    Row(
        modifier = modifier
            .height(8.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(100.dp))
            .background(DealiColor.g30),  // Todo 색상 문의
    ) {
        val denominator = valueRange.endInclusive - valueRange.start

        TrackSpan(weight = minValue / denominator)
        TrackSpan(
            weight = (maxValue - minValue) / denominator,
            color = DealiColor.primary01,
        )
        TrackSpan(weight = 1 - (maxValue / denominator))

    }
}

@Composable
private fun RowScope.TrackSpan(
    modifier: Modifier = Modifier,
    weight: Float,
    color: Color = DealiColor.transparent,
) {
    if (weight > 0f) {
        Box(
            modifier = modifier
                .fillMaxHeight()
                .weight(weight)
                .background(color = color)
        )
    }
}

@Composable
private fun Indicator(
    text: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Divider(
            modifier = Modifier.height(6.dp),
            color = DealiColor.g30,
            thickness = 1.dp,
        )
        Spacer(modifier = Modifier.height(4.dp))
        DealiText(
            text = text,
            style = DealiFont.b4r12,
            color = DealiColor.g80,
        )
    }
}