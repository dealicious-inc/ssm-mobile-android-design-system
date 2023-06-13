package net.deali.designsystem.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R

@Composable
fun Rating(
    totalCount: Int,
    rating: Float,
    size: Dp,
    modifier: Modifier = Modifier,
    spaceBetween: Dp = 0.dp,
) {
    val painter = painterResource(id = R.drawable.ic_zzim_16)
    val filledPainter = painterResource(id = R.drawable.ic_zzim_filled_16)

    val space = LocalDensity.current.run { spaceBetween.toPx() }
    val imageSize = LocalDensity.current.run { if (size < 1.dp) painter.intrinsicSize.width else size.toPx() }

    val totalWidth = size * totalCount + spaceBetween * (totalCount - 1)

    val reminder = rating - rating.toInt()
    val ratingInt = (rating - reminder).toInt()

    Canvas(
        modifier = modifier
            .width(totalWidth)
            .height(size)
    ) {
        for (i in 0 until totalCount) {
            val start = imageSize * i + space * i

            translate(
                left = start
            ) {
                with(painter) {
                    draw(
                        size = Size(imageSize, imageSize)
                    )
                }
            }
        }

        with(drawContext.canvas.nativeCanvas) {
            val checkPoint = saveLayer(null, null)

            for (i in 0 until totalCount) {
                val start = imageSize * i + space * i

                translate(
                    left = start
                ) {
                    with(filledPainter) {
                        draw(
                            size = Size(imageSize, imageSize)
                        )
                    }
                }
            }

            val end = imageSize * totalCount + space * (totalCount - 1)
            val start = rating * imageSize + ratingInt * space
            val blankStart = end - start

            drawRect(
                color = Color.Transparent,
                topLeft = Offset(start, 0f),
                size = Size(blankStart, imageSize),
                blendMode = BlendMode.SrcIn
            )

            restoreToCount(checkPoint)
        }
    }
}
