package net.deali.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Immutable
object DealiColor {
    val primary01: Color = Color(0xFFFB4760)
    val primary02: Color = Color(0xFFEC2843)
    val primary03: Color = Color(0xFFFEECEF)
    val primary04: Color = Color(0xFFFFFFFF)
    val primary05: Color = Color(0xFF000000)
    val secondary01: Color = Color(0xFF4759FB)
    val secondary02: Color = Color(0xFF2B3EE7)
    val secondary03: Color = Color(0xFFEAEFFF)
    val secondary04: Color = Color(0xFFFF7C44)
    val secondary05: Color = Color(0xFFFF6827)
    val secondary06: Color = Color(0xFFFFECDB)
    val g100: Color = Color(0xFF222222)
    val g80: Color = Color(0xFF686E7B)
    val g70: Color = Color(0xFF8F97A7)
    val g60: Color = Color(0xFFA6ADBD)
    val g50: Color = Color(0xFFBEC5D2)
    val g40: Color = Color(0xFFD0D6E1)
    val g30: Color = Color(0xFFDFE3ED)
    val g20: Color = Color(0xFFEBEEF6)
    val g10: Color = Color(0xFFF5F6FB)
    val g05: Color = Color(0xFFF6F6F7)
    val error: Color = Color(0xFFFA1818)
    val linkAndInfo: Color = Color(0xFF2B66FD)
    val warning: Color = Color(0xFFFFD600)
    val success: Color = Color(0xFF1BDA17)
    val etc01: Color = Color(0x1A000000)
    val etc02: Color = Color(0x33000000)
    val etc03: Color = Color(0x66000000)
    val etc04: Color = Color(0x33FFFFFF)
    val etc05: Color = Color(0x80FFFFFF)
    val etc06: Color = Color(0xB2000000)
    val etc07: Color = Color(0xE5FFFFFF)
    val etc08: Color = Color(0x0DFFFFFF)
    val etc09: Color = Color(0x1AFFFFFF)
    val b70: Color = Color(0xB2000000)
    val b50: Color = Color(0x80000000)
    val b40: Color = Color(0x66000000)
    val b30: Color = Color(0x4D000000)
    val b20: Color = Color(0x33000000)
    val b10: Color = Color(0x1A000000)
    val b5: Color = Color(0x33000000)
    val w90: Color = Color(0xE5FFFFFF)
    val w70: Color = Color(0xB2FFFFFF)
    val w50: Color = Color(0x80FFFFFF)
    val w30: Color = Color(0x4DFFFFFF)
    val w20: Color = Color(0x33FFFFFF)
    val w15: Color = Color(0x26FFFFFF)
    val w10: Color = Color(0x1AFFFFFF)
    val w5: Color = Color(0x0DFFFFFF)
    val transparent: Color = Color(0x00FFFFFF)
    val ripple: Color = Color(0x22000000)

    val gradient: Brush = kotlin.run {
        val start = Color(0xFFFB4760)
        val end = Color(0xFFFE1EA4)
        Brush.horizontalGradient(colors = listOf(start, end))
    }
}

internal val LocalColors = staticCompositionLocalOf { DealiColor }