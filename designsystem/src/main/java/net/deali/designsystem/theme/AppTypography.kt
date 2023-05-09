package net.deali.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class AppTypography(
    val body: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    )
)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }
