package net.deali.designsystem.internal.slider

import android.util.Log
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlin.math.roundToInt


private enum class SliderComponents {
    THUMB_MIN,
    THUMB_MAX,
    TRACK,
    INDICATOR,
}

@Composable
internal fun CoreSlider(
    minValue: Float,
    maxValue: Float,
    onMinValueChange: (Float) -> Unit,
    onMaxValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    gap: Int = 1,
    thumb: @Composable (thumbValue: Int) -> Unit,
    track: @Composable () -> Unit,
    indicator: @Composable (indicatorValue: Int) -> Unit = {},
) {
    require(minValue in 0f..1f)
    require(maxValue in 0f..1f)
    require(minValue <= maxValue)
    val density = LocalDensity.current

    var trackSize by remember { mutableStateOf(IntSize.Zero) }

    var minThumbTouchInteractionState by remember { mutableStateOf<TouchInteraction>(TouchInteraction.None) }
    var maxThumbTouchInteractionState by remember { mutableStateOf<TouchInteraction>(TouchInteraction.None) }

    val initialThumbSize = density.run { 22.dp.toPx().roundToInt() }
    var thumbSize = IntSize(width = initialThumbSize, height = 0)
    var minThumbPosition by remember { mutableStateOf(Offset.Zero) }
    var maxThumbPosition by remember { mutableStateOf(Offset.Zero) }
    var minThumbPositionWhenStartMoving by remember { mutableStateOf<Offset?>(null) }
    var maxThumbPositionWhenStartMoving by remember { mutableStateOf<Offset?>(null) }

    Layout(
        modifier = modifier,
        measurePolicy = sliderMeasurePolicy(
            gap = gap,
            minValue = minValue,
            maxValue = maxValue,
        ),
        content = {
            Box(
                modifier = Modifier
                    .layoutId(SliderComponents.THUMB_MIN)
                    .onGloballyPositioned { minThumbPosition = it.positionInParent() }
                    .touchInteraction(
                        key = remember { MutableInteractionSource() }
                    ) { touchInteraction ->
                        minThumbTouchInteractionState = touchInteraction
                    }
            ) { thumb(minValue.roundToInt()) }

            Box(
                modifier = Modifier
                    .layoutId(SliderComponents.THUMB_MAX)
                    .onGloballyPositioned { maxThumbPosition = it.positionInParent() }
                    .touchInteraction(
                        key = remember { MutableInteractionSource() }
                    ) { touchInteraction ->
                        maxThumbTouchInteractionState = touchInteraction
                    }
            ) { thumb(maxValue.roundToInt()) }

            Box(
                modifier = Modifier
                    .layoutId(SliderComponents.TRACK)
                    .onSizeChanged { trackSize = it }
            ) { track() }

        }
    )

    LaunchedEffect(key1 = minThumbTouchInteractionState) {
        when (val touchInteraction = minThumbTouchInteractionState) {
            is TouchInteraction.Up -> {
                minThumbTouchInteractionState = TouchInteraction.None
            }

            is TouchInteraction.Down -> {
                minThumbPositionWhenStartMoving = minThumbPosition
                maxThumbPositionWhenStartMoving = maxThumbPosition
                // Todo 진동
            }

            is TouchInteraction.Move -> {
                val calculatedByPosition = calculateValueByPosition(
                    trackSize = trackSize,
                    thumbSize = thumbSize,
                    position = Offset(
                        x = minThumbPositionWhenStartMoving!!.x + touchInteraction.position.x,
                        y = touchInteraction.position.y
                    ),
                )
                val resultValue = when {
                    calculatedByPosition < 0f -> 0f
                    calculatedByPosition in 0f..maxValue -> calculatedByPosition
                    else -> maxValue
                }
//                onMinValueChange(resultValue)
//                Log.d("haena", """
//                    thumbPosition when value == 0f = ${minThumbPositionWhenStartMoving}
//                    centerXWhenStartMoving = ${minThumbPositionWhenStartMoving!!.x + thumbSize.width / 2}
//                """.trimIndent())
            }

            //
            //                    containerWidth = ${size.width - thumbSize.width}
            //                    minThumbPositionWhenStartMoving = ${minThumbPositionWhenStartMoving?.x}
            //                    touchInteraction.position.x = ${touchInteraction.position.x},
            //                    positionX = ${minThumbPositionWhenStartMoving!!.x + touchInteraction.position.x}
            //                    centerXWhenStartMoving = ${minThumbPositionWhenStartMoving!!.x + thumbSize.width}
            else -> Unit
        }
    }

    LaunchedEffect(key1 = Unit, ) {
        repeat(6) { i ->
            delay(1000)
            onMinValueChange(0.1f * (i + 1))
        }
    }
}

private fun calculateValueByPosition(
    trackSize: IntSize,
    thumbSize: IntSize,
    position: Offset,
): Float {
    val thumbRadius = thumbSize.width / 2
    val centerXOfThumb = position.x - thumbRadius

//    Log.d(
//        "haena",
//        """
//            centerXOfThumb = ${centerXOfThumb},
//            result = ${centerXOfThumb / trackSize.width }
//        """.trimIndent()
//    )

    return trackSize.width / centerXOfThumb
}

private fun sliderMeasurePolicy(
    gap: Int,
    minValue: Float,
    maxValue: Float,
) = MeasurePolicy { measurables, constraints ->
    val minThumbPlaceable = measurables
        .first { it.layoutId == SliderComponents.THUMB_MIN }
        .measure(constraints)
    val maxThumbPlaceable = measurables
        .first { it.layoutId == SliderComponents.THUMB_MAX }
        .measure(constraints)
    val thumbRadius = minThumbPlaceable.height / 2


    //    val indicatorPlaceables = measurables
    //        .filter { it.layoutId == SliderComponents.INDICATOR }
    //        .map { it.measure(constraints) }
    //    val indicatorHeight = indicatorPlaceables
    //        .maxByOrNull { it.height }
    //        ?.height ?: 0

    val trackPlaceable = measurables
        .first { it.layoutId == SliderComponents.TRACK }
        .measure(constraints)
    val trackWidth = trackPlaceable.width
    val trackHeight = trackPlaceable.height

    val width = trackWidth + (thumbRadius * 2)
    val height = maxOf(trackHeight, thumbRadius * 2)
    //    Log.d("haena", "trackHeight = $trackHeight, thumbRadius=  $thumbRadius, y = ${height - (trackHeight / 2)}")

    //    val sectionWidth = trackWidth / itemCount
    //    val indicatorSpacing = sectionWidth * gap

    layout(width = width, height = height) {
        trackPlaceable.placeRelative(
            x = thumbRadius,
            y = (height / 2) - (trackHeight / 2),
        )

//        val centerXOfMinThumb =
        minThumbPlaceable.placeRelative(
            x = maxOf(thumbRadius + trackWidth * minValue, 0f).roundToInt(),
            y = (height / 2) - thumbRadius,
        )

        Log.d("haena", "minValue = $minValue, trackWidth = $trackWidth, thumbRadius = $thumbRadius, result = ${thumbRadius + (width - thumbRadius * 2) * minValue - 33} ")
        maxThumbPlaceable.placeRelative(
            x = ((maxValue * width) - thumbRadius).roundToInt(),
            y = (height / 2) - thumbRadius,
        )

        //        var indicatorOffsetX = thumbRadius
        //        indicatorPlaceables.forEach { placeable ->
        //            placeable.placeRelative(
        //                x = (indicatorOffsetX - (placeable.width / 2)).roundToInt(),
        //                y = sliderHeight
        //            )
        //            indicatorOffsetX += indicatorSpacing
        //        }
    }
}

sealed class TouchInteraction {
    object None : TouchInteraction()
    object Down : TouchInteraction()
    object Up : TouchInteraction()
    data class Move(val position: Offset) : TouchInteraction()
}

internal fun Modifier.touchInteraction(
    key: Any,
    block: (TouchInteraction) -> Unit,
) = pointerInput(key) {
    awaitEachGesture {
        block(TouchInteraction.Down)
        do {
            val event = awaitPointerEvent()
            event.changes.forEach { pointerInputChange: PointerInputChange ->
                if (pointerInputChange.positionChange() != Offset.Zero) {
                    pointerInputChange.consume()
                }
            }
            block(TouchInteraction.Move(event.changes.first().position))
        } while (event.changes.any { it.pressed })

        block(TouchInteraction.Up)
    }
}
