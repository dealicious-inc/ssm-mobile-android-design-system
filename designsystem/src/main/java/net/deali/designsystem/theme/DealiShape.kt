package net.deali.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
object DealiShape {
    val radius0: Shape = RoundedCornerShape(0.dp)
    val radius3: Shape = RoundedCornerShape(3.dp)
    val radius4: Shape = RoundedCornerShape(4.dp)
    val radius6: Shape = RoundedCornerShape(6.dp)
    val radius10: Shape = RoundedCornerShape(10.dp)
    val radius12: Shape = RoundedCornerShape(12.dp)
    val radius16: Shape = RoundedCornerShape(16.dp)
    val radius100: Shape = RoundedCornerShape(percent = 100)
    val radius20: Shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
}

internal val LocalShapes = staticCompositionLocalOf { DealiShape }
