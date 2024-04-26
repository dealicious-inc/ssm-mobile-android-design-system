package net.deali.designsystem.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import net.deali.designsystem.theme.DealiColor

/**
 * hex 코드를 color로 파싱하는 함수
 */
@Composable
fun getColorFromHex(hex: String): Color {
    if (hex.isEmpty()) return DealiColor.transparent

    val colorString = if (hex.startsWith("#")) hex else "#$hex"
    return Color(android.graphics.Color.parseColor(colorString))
}
