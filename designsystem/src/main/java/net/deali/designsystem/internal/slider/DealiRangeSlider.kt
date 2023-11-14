package net.deali.designsystem.internal.slider


import android.view.MotionEvent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import net.deali.designsystem.theme.DealiColor
import kotlin.math.pow
import kotlin.math.sqrt

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun DealiRangeSlider(
    modifier: Modifier,
    trackColor: Color,
    backColor: Color,
    barHeight: Dp,
    thumbRadius: Dp,
    cornerRadius: CornerRadius,
    progress1InitialValue: Float,
    progress2InitialValue: Float,
    onProgressChanged: (progress1: Float, progress2: Float) -> Unit
) {

    val thumbRadiusPx = with(LocalDensity.current) { thumbRadius.toPx() }

    var progress1 by remember { mutableStateOf(progress1InitialValue) }
    var progress2 by remember { mutableStateOf(progress2InitialValue) }

    var width by remember { mutableStateOf(0f) }
    var height by remember { mutableStateOf(0f) }

    var isLeftThumbDragging by remember { mutableStateOf(false) }
    var isRightThumbDragging by remember { mutableStateOf(false) }

    var leftThumbOffset by remember { mutableStateOf(Offset.Zero) }
    var rightThumbOffset by remember { mutableStateOf(Offset.Zero) }

    val thumbShadowBrush: Brush = run {
        Brush.radialGradient(
            colorStops = arrayOf(
                0.0f to DealiColor.transparent,
                0.8f to DealiColor.b10,
            ),
        )
    }

    Canvas(
        modifier = modifier
            .height(barHeight)
            .pointerInteropFilter(
                onTouchEvent = { motionEvent ->
                    when (motionEvent.action) {
                        MotionEvent.ACTION_DOWN -> {
                            val x = motionEvent.x
                            val y = motionEvent.y
                            val dis1 = sqrt(
                                (x - leftThumbOffset.x).pow(2) + (y - leftThumbOffset.y).pow(2)
                            )
                            val dis2 = sqrt(
                                (x - rightThumbOffset.x).pow(2) + (y - rightThumbOffset.y).pow(2)
                            )

                            //TODO 양쪽 겹쳤을때 판단 로직 추가
                            if (dis1 < thumbRadiusPx + 10) { // left thumb clicked
                                isLeftThumbDragging = true
                            } else if (dis2 < thumbRadiusPx + 10) { // right thumb clicked
                                isRightThumbDragging = true
                            }
                        }

                        MotionEvent.ACTION_MOVE -> {
                            val x = motionEvent.x

                            if (isLeftThumbDragging) {
                                progress1 = if (x <= 0) {
                                    0f
                                } else if (x >= width * progress2) {
                                    progress2
                                } else {
                                    x / width
                                }
                                leftThumbOffset = leftThumbOffset.copy(x = width * progress1)
                                onProgressChanged(progress1, progress2)

                            } else if (isRightThumbDragging) {
                                progress2 = if (x >= width) {
                                    1f
                                } else if (x <= width * progress1) {
                                    progress1
                                } else {
                                    x / width
                                }
                                rightThumbOffset = rightThumbOffset.copy(x = width * progress2)
                                onProgressChanged(progress1, progress2)
                            }
                        }

                        MotionEvent.ACTION_UP -> {
                            isLeftThumbDragging = false
                            isRightThumbDragging = false
//                            onProgressChanged(progress1, progress2)
                        }
                    }
                    true
                }
            )
            .onGloballyPositioned {
                leftThumbOffset = Offset(x = it.size.width * progress1, y = it.size.height / 2f)
                rightThumbOffset = Offset(x = it.size.width * progress2, y = it.size.height / 2f)
            }
    ) {
        width = this.size.width
        height = this.size.height

        //Track Background
        drawRoundRect(
            color = backColor,
            cornerRadius = cornerRadius,
            topLeft = Offset(x = 0f, y = barHeight.toPx() / 4f),
            size = Size(width = width, height = barHeight.toPx())
        )

        //Track
        drawRect(
            color = trackColor,
            topLeft = Offset(x = width * progress1, y = 0f),
            size = Size(width = width * (progress2 - progress1), height = height)
        )

        //Left Shadow
        drawCircle(
            brush = thumbShadowBrush,
            radius = (thumbRadius.toPx() + 1),
            center = Offset(leftThumbOffset.x + 0.7f, leftThumbOffset.y + 0.7f),
        )

        //Left Thumb
        drawCircle(
            color = DealiColor.primary04,
            radius = thumbRadius.toPx(),
            center = leftThumbOffset,
        )

        //Right Shadow
        drawCircle(
            brush = thumbShadowBrush,
            radius = (thumbRadius.toPx() + 1),
            center = Offset(rightThumbOffset.x + 0.7f, rightThumbOffset.y + 0.7f),
        )

        //Right Thumb
        drawCircle(
            color = DealiColor.primary04,
            radius = thumbRadius.toPx(),
            center = rightThumbOffset,
        )


    }
}


