package net.deali.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class AppShape(
    val small: Shape = RoundedCornerShape(4.dp),
    val medium: Shape = RoundedCornerShape(4.dp),
    val large: Shape = RoundedCornerShape(0.dp),
    val bottomSheet: Shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
    val smallButton: Shape = RoundedCornerShape(4.dp),
    val mediumButton: Shape = RoundedCornerShape(6.dp),
    val largeButton: Shape = RoundedCornerShape(6.dp),
)

internal val LocalShapes = staticCompositionLocalOf { AppShape() }
