package net.deali.designsystem.theme

import android.graphics.Typeface
import androidx.compose.material.Typography
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import net.deali.designsystem.R
import net.deali.designsystem.util.tu

@Stable
class AppTypography(
    h1b32: TextStyle,
    h2b24: TextStyle,
    sh1b20: TextStyle,
    sh1m20: TextStyle,
    sh2b18: TextStyle,
    sh2r18: TextStyle,
    sh3b16: TextStyle,
    sh3r16: TextStyle,
    b1sb15: TextStyle,
    b1r15: TextStyle,
    b2sb14: TextStyle,
    b2r14: TextStyle,
    b3sb13: TextStyle,
    b3r13: TextStyle,
    b4sb12: TextStyle,
    b4r12: TextStyle,
    c1b10: TextStyle,
    c1r10: TextStyle,
) {
    var h1b32 by mutableStateOf(h1b32)
        private set

    var h2b24 by mutableStateOf(h2b24)
        private set

    var sh1b20 by mutableStateOf(sh1b20)
        private set

    var sh1m20 by mutableStateOf(sh1m20)
        private set

    var sh2b18 by mutableStateOf(sh2b18)
        private set

    var sh2r18 by mutableStateOf(sh2r18)
        private set

    var sh3b16 by mutableStateOf(sh3b16)
        private set

    var sh3r16 by mutableStateOf(sh3r16)
        private set

    var b1sb15 by mutableStateOf(b1sb15)
        private set

    var b1r15 by mutableStateOf(b1r15)
        private set

    var b2sb14 by mutableStateOf(b2sb14)
        private set

    var b2r14 by mutableStateOf(b2r14)
        private set

    var b3sb13 by mutableStateOf(b3sb13)
        private set

    var b3r13 by mutableStateOf(b3r13)
        private set

    var b4sb12 by mutableStateOf(b4sb12)
        private set

    var b4r12 by mutableStateOf(b4r12)
        private set

    var c1b10 by mutableStateOf(c1b10)
        private set

    var c1r10 by mutableStateOf(c1r10)
        private set

    fun copy(
        h1b32: TextStyle = this.h1b32,
        h2b24: TextStyle = this.h2b24,
        sh1b20: TextStyle = this.sh1b20,
        sh1m20: TextStyle = this.sh1m20,
        sh2b18: TextStyle = this.sh2b18,
        sh2r18: TextStyle = this.sh2r18,
        sh3b16: TextStyle = this.sh3b16,
        sh3r16: TextStyle = this.sh3r16,
        b1sb15: TextStyle = this.b1sb15,
        b1r15: TextStyle = this.b1r15,
        b2sb14: TextStyle = this.b2sb14,
        b2r14: TextStyle = this.b2r14,
        b3sb13: TextStyle = this.b3sb13,
        b3r13: TextStyle = this.b3r13,
        b4sb12: TextStyle = this.b4sb12,
        b4r12: TextStyle = this.b4r12,
        c1b10: TextStyle = this.c1b10,
        c1r10: TextStyle = this.c1r10,
    ) = AppTypography(
        h1b32,
        h2b24,
        sh1b20,
        sh1m20,
        sh2b18,
        sh2r18,
        sh3b16,
        sh3r16,
        b1sb15,
        b1r15,
        b2sb14,
        b2r14,
        b3sb13,
        b3r13,
        b4sb12,
        b4r12,
        c1b10,
        c1r10,
    )

    fun updateTypographyFrom(other: AppTypography) {
        h1b32 = other.h1b32
        h2b24 = other.h2b24
        sh1b20 = other.sh1b20
        sh1m20 = other.sh1m20
        sh2b18 = other.sh2b18
        sh2r18 = other.sh2r18
        sh3b16 = other.sh3b16
        sh3r16 = other.sh3r16
        b1sb15 = other.b1sb15
        b1r15 = other.b1r15
        b2sb14 = other.b2sb14
        b2r14 = other.b2r14
        b3sb13 = other.b3sb13
        b3r13 = other.b3r13
        b4sb12 = other.b4sb12
        b4r12 = other.b4r12
        c1b10 = other.c1b10
        c1r10 = other.c1r10
    }
}

internal val LocalTypography = staticCompositionLocalOf { pretendardTypography() }

fun pretendardTypography(
    h1b32: TextStyle = baseH1b32.copy(fontFamily = Pretendard),
    h2b24: TextStyle = baseH2b24.copy(fontFamily = Pretendard),
    sh1b20: TextStyle = bashSh1b20.copy(fontFamily = Pretendard),
    sh1m20: TextStyle = baseSh1m20.copy(fontFamily = Pretendard),
    sh2b18: TextStyle = baseSh2b18.copy(fontFamily = Pretendard),
    sh2r18: TextStyle = baseSh2r18.copy(fontFamily = Pretendard),
    sh3b16: TextStyle = baseSh3b16.copy(fontFamily = Pretendard),
    sh3r16: TextStyle = baseSh3r16.copy(fontFamily = Pretendard),
    b1sb15: TextStyle = baseB1sb15.copy(fontFamily = Pretendard),
    b1r15: TextStyle = baseB1r15.copy(fontFamily = Pretendard),
    b2sb14: TextStyle = baseB2sb14.copy(fontFamily = Pretendard),
    b2r14: TextStyle = baseB2r14.copy(fontFamily = Pretendard),
    b3sb13: TextStyle = baseB3sb13.copy(fontFamily = Pretendard),
    b3r13: TextStyle = baseB3r13.copy(fontFamily = Pretendard),
    b4sb12: TextStyle = baseB4sb12.copy(fontFamily = Pretendard),
    b4r12: TextStyle = baseB4r12.copy(fontFamily = Pretendard),
    c1b10: TextStyle = baseC1b10.copy(fontFamily = Pretendard),
    c1r10: TextStyle = baseC1r10.copy(fontFamily = Pretendard),
): AppTypography = AppTypography(
    h1b32 = h1b32,
    h2b24 = h2b24,
    sh1b20 = sh1b20,
    sh1m20 = sh1m20,
    sh2b18 = sh2b18,
    sh2r18 = sh2r18,
    sh3b16 = sh3b16,
    sh3r16 = sh3r16,
    b1sb15 = b1sb15,
    b1r15 = b1r15,
    b2sb14 = b2sb14,
    b2r14 = b2r14,
    b3sb13 = b3sb13,
    b3r13 = b3r13,
    b4sb12 = b4sb12,
    b4r12 = b4r12,
    c1b10 = c1b10,
    c1r10 = c1r10,
)

fun defaultTypography(
    h1b32: TextStyle = baseH1b32,
    h2b24: TextStyle = baseH2b24,
    sh1b20: TextStyle = bashSh1b20,
    sh1m20: TextStyle = baseSh1m20,
    sh2b18: TextStyle = baseSh2b18,
    sh2r18: TextStyle = baseSh2r18,
    sh3b16: TextStyle = baseSh3b16,
    sh3r16: TextStyle = baseSh3r16,
    b1sb15: TextStyle = baseB1sb15,
    b1r15: TextStyle = baseB1r15,
    b2sb14: TextStyle = baseB2sb14,
    b2r14: TextStyle = baseB2r14,
    b3sb13: TextStyle = baseB3sb13,
    b3r13: TextStyle = baseB3r13,
    b4sb12: TextStyle = baseB4sb12,
    b4r12: TextStyle = baseB4r12,
    c1b10: TextStyle = baseC1b10,
    c1r10: TextStyle = baseC1r10,
): AppTypography = AppTypography(
    h1b32 = h1b32,
    h2b24 = h2b24,
    sh1b20 = sh1b20,
    sh1m20 = sh1m20,
    sh2b18 = sh2b18,
    sh2r18 = sh2r18,
    sh3b16 = sh3b16,
    sh3r16 = sh3r16,
    b1sb15 = b1sb15,
    b1r15 = b1r15,
    b2sb14 = b2sb14,
    b2r14 = b2r14,
    b3sb13 = b3sb13,
    b3r13 = b3r13,
    b4sb12 = b4sb12,
    b4r12 = b4r12,
    c1b10 = c1b10,
    c1r10 = c1r10,
)

private val Pretendard = FontFamily(
    Typeface.DEFAULT,
//    Font(R.font.pretendard_regular, FontWeight.Normal),
//    Font(R.font.pretendard_medium, FontWeight.Medium),
//    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
//    Font(R.font.pretendard_bold, FontWeight.Bold)
)

internal val MaterialTypography = Typography(Pretendard)

private val baseH1b32: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (32.sp).tu,
    lineHeight = (40.sp).tu,
)

private val baseH2b24: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (24.sp).tu,
    lineHeight = (32.sp).tu
)

private val bashSh1b20: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu
)

private val baseSh1m20: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu
)

private val baseSh2b18: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu
)

private val baseSh2r18: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu
)

private val baseSh3b16: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu
)

private val baseSh3r16: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu
)

private val baseB1sb15: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu
)

private val baseB1r15: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu
)

private val baseB2sb14: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu
)

private val baseB2r14: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu
)

private val baseB3sb13: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu
)

private val baseB3r13: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu
)

private val baseB4sb12: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu
)

private val baseB4r12: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu
)

private val baseC1b10: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu
)

private val baseC1r10: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu
)
