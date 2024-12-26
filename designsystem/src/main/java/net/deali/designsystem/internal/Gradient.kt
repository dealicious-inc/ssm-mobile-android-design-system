package net.deali.designsystem.internal

import androidx.compose.runtime.Stable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

/**
 * Compose의 기본 linearGradient와 달리 각도를 지정할 수 있으며,
 * CSS와 동일한 각도를 사용할 수 있다.
 */
class LinearGradient constructor(
    private val colors: List<Color>,
    private val stops: List<Float>? = null,
    private val tileMode: TileMode = TileMode.Clamp,
    angleInDegrees: Float = 0f,
    useAsCssAngle: Boolean = false
) : ShaderBrush() {

    private val normalizedAngle: Float = if (useAsCssAngle) {
        ((90 - angleInDegrees) % 360 + 360) % 360
    } else {
        (angleInDegrees % 360 + 360) % 360
    }
    private val angleInRadians: Float = Math.toRadians(normalizedAngle.toDouble()).toFloat()

    override fun createShader(size: Size): Shader {
        val (from, to) = getGradientCoordinates(size = size)

        return LinearGradientShader(
            colors = colors,
            colorStops = stops,
            from = from,
            to = to,
            tileMode = tileMode
        )
    }

    private fun getGradientCoordinates(size: Size): Pair<Offset, Offset> {
        val diagonal = sqrt(size.width.pow(2) + size.height.pow(2))
        val angleBetweenDiagonalAndWidth = acos(size.width / diagonal)
        val angleBetweenDiagonalAndGradientLine =
            if ((normalizedAngle > 90 && normalizedAngle < 180)
                || (normalizedAngle > 270 && normalizedAngle < 360)
            ) {
                PI.toFloat() - angleInRadians - angleBetweenDiagonalAndWidth
            } else {
                angleInRadians - angleBetweenDiagonalAndWidth
            }
        val halfGradientLine = abs(cos(angleBetweenDiagonalAndGradientLine) * diagonal) / 2

        val horizontalOffset = halfGradientLine * cos(angleInRadians)
        val verticalOffset = halfGradientLine * sin(angleInRadians)

        val start = size.center + Offset(-horizontalOffset, verticalOffset)
        val end = size.center + Offset(horizontalOffset, -verticalOffset)

        return start to end
    }
}

@Stable
fun Brush.Companion.linearGradient(
    colors: List<Color>,
    stops: List<Float>? = null,
    tileMode: TileMode = TileMode.Clamp,
    angleInDegrees: Float = 0f,
    useAsCssAngle: Boolean = false
): Brush = LinearGradient(
    colors = colors,
    stops = stops,
    tileMode = tileMode,
    angleInDegrees = angleInDegrees,
    useAsCssAngle = useAsCssAngle,
)

@Stable
fun Brush.Companion.linearGradient(
    vararg colorStops: Pair<Float, Color>,
    tileMode: TileMode = TileMode.Clamp,
    angleInDegrees: Float = 0f,
    useAsCssAngle: Boolean = false
): Brush = LinearGradient(
    colors = List(colorStops.size) { i -> colorStops[i].second },
    stops = List(colorStops.size) { i -> colorStops[i].first },
    tileMode = tileMode,
    angleInDegrees = angleInDegrees,
    useAsCssAngle = useAsCssAngle,
)