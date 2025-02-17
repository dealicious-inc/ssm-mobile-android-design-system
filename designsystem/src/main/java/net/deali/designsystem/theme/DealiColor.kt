package net.deali.designsystem.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.linearGradient

@Immutable
object DealiColor {

    //Primary
    val primary01: Color = Color(0xFFFB4760)
    val primary02: Color = Color(0xFFEC2843)
    val primary03: Color = Color(0xFFFEECEF)
    val primary04: Color = Color(0xFFFFFFFF)
    val primary05: Color = Color(0xFF000000)

    //Secondary
    val secondary01: Color = Color(0xFF4759FB)
    val secondary02: Color = Color(0xFF2B3EE6)
    val secondary03: Color = Color(0xFFEAEFFF)
    val secondary04: Color = Color(0xFFFF7C44)
    val secondary05: Color = Color(0xFFFF6827)
    val secondary06: Color = Color(0xFFFFECDB)

    //Gray, Text, Line, BG
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

    //Service
    val error: Color = Color(0xFFFA1818)
    val warning: Color = Color(0xFFFFD600)
    val linkAndInfo: Color = Color(0xFF2B66FD)
    val success: Color = Color(0xFF1BDA17)

    //Etc
    val b70: Color = Color(0xB3000000)
    val b50: Color = Color(0x80000000)
    val b40: Color = Color(0x66000000)
    val b30: Color = Color(0x4D000000)
    val b20: Color = Color(0x33000000)
    val b10: Color = Color(0x1A000000)
    val b5: Color = Color(0x0D000000)
    val b2: Color = Color(0x05000000)

    val w90: Color = Color(0xE6FFFFFF)
    val w70: Color = Color(0xB3FFFFFF)
    val w50: Color = Color(0x80FFFFFF)
    val w40: Color = Color(0x66FFFFFF)
    val w30: Color = Color(0x4DFFFFFF)
    val w20: Color = Color(0x33FFFFFF)
    val w15: Color = Color(0x26FFFFFF)
    val w10: Color = Color(0x1AFFFFFF)
    val w5: Color = Color(0x0DFFFFFF)

    val transparent: Color = Color(0x00FFFFFF)
    val ripple: Color = b2

    val mbs01: Color = Color(0xFF1F5EFF)
    val mbs02: Color = Color(0xFFE5FE1E)

    val gradient: Brush = kotlin.run {
        val start = Color(0xFFFB4760)
        val end = Color(0xFFFE1EA4)
        Brush.horizontalGradient(colors = listOf(start, end))
    }

    val gradient01: Brush = kotlin.run {
        Brush.linearGradient(
            0.4f to mbs01,
            1.0f to mbs02,
            angleInDegrees = 98f,
            useAsCssAngle = true,
        )
    }

    val gradient02: Brush = kotlin.run {
        Brush.linearGradient(
            0.5f to mbs01,
            1.0f to Color(0XFFA6CB65),
            angleInDegrees = 148f,
            useAsCssAngle = true,
        )
    }
}

internal val LocalColors = staticCompositionLocalOf { DealiColor }

@Preview(showBackground = true)
@Composable
fun Preview1() {
    Column {

        Box(
            modifier = Modifier
                .width(176.dp)
                .height(54.dp)
                .background(DealiColor.gradient01)
        )
    }
}

@Preview
@Composable
fun Preview2() {
    Box(
        modifier = Modifier
            .width(176.dp)
            .height(54.dp)
            .alpha(0.8f)
            .background(DealiColor.gradient02)

    )
}

@Preview
@Composable
fun Preview3() {
    Box(
        modifier = Modifier
            .width(80.dp)
            .height(80.dp)
            .alpha(0.8f)
            .background(DealiColor.gradient02)

    )
}

@Preview
@Composable
fun Preview4() {
    Box(
        modifier = Modifier
            .width(360.dp)
            .height(711.dp)
            .alpha(0.8f)
            .background(DealiColor.gradient02)

    )
}
