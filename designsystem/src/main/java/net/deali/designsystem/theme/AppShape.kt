package net.deali.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Stable
data class AppShape(
    val radius0: Shape = RoundedCornerShape(0.dp),
    val radius6: Shape = RoundedCornerShape(6.dp),
    val radius4: Shape = RoundedCornerShape(4.dp),
    val radius3: Shape = RoundedCornerShape(3.dp),
    val radius100percent: Shape = RoundedCornerShape(percent = 100),
    val radius20: Shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
    val radius10: Shape = RoundedCornerShape(10.dp),
    val radius8: Shape = RoundedCornerShape(8.dp),
)

internal val LocalShapes = staticCompositionLocalOf { AppShape() }
