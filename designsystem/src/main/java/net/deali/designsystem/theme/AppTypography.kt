package net.deali.designsystem.theme

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
    h1sb32: TextStyle,
    h3sb28: TextStyle,
    h2sb24: TextStyle,
    sh1sb20: TextStyle,
    sh1r20: TextStyle,
    sh2sb18: TextStyle,
    sh2r18: TextStyle,
    sh3sb16: TextStyle,
    sh3r16: TextStyle,
    b1sb15: TextStyle,
    b1r15: TextStyle,
    b2sb14: TextStyle,
    b2r14: TextStyle,
    b3sb13: TextStyle,
    b3r13: TextStyle,
    b4sb12: TextStyle,
    b4r12: TextStyle,
    c1sb10: TextStyle,
    c1r10: TextStyle,
) {
    var h1sb32 by mutableStateOf(h1sb32)
        private set

    var h3sb28 by mutableStateOf(h3sb28)
        private set

    var h2sb24 by mutableStateOf(h2sb24)
        private set

    var sh1sb20 by mutableStateOf(sh1sb20)
        private set

    var sh1r20 by mutableStateOf(sh1r20)
        private set

    var sh2sb18 by mutableStateOf(sh2sb18)
        private set

    var sh2r18 by mutableStateOf(sh2r18)
        private set

    var sh3sb16 by mutableStateOf(sh3sb16)
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

    var c1sb10 by mutableStateOf(c1sb10)
        private set

    var c1r10 by mutableStateOf(c1r10)
        private set

    fun copy(
        h1sb32: TextStyle = this.h1sb32,
        h3sb28: TextStyle = this.h3sb28,
        h2sb24: TextStyle = this.h2sb24,
        sh1sb20: TextStyle = this.sh1sb20,
        sh1r20: TextStyle = this.sh1r20,
        sh2sb18: TextStyle = this.sh2sb18,
        sh2r18: TextStyle = this.sh2r18,
        sh3sb16: TextStyle = this.sh3sb16,
        sh3r16: TextStyle = this.sh3r16,
        b1sb15: TextStyle = this.b1sb15,
        b1r15: TextStyle = this.b1r15,
        b2sb14: TextStyle = this.b2sb14,
        b2r14: TextStyle = this.b2r14,
        b3sb13: TextStyle = this.b3sb13,
        b3r13: TextStyle = this.b3r13,
        b4sb12: TextStyle = this.b4sb12,
        b4r12: TextStyle = this.b4r12,
        c1sb10: TextStyle = this.c1sb10,
        c1r10: TextStyle = this.c1r10,
    ) = AppTypography(
        h1sb32 = h1sb32,
        h3sb28 = h3sb28,
        h2sb24 = h2sb24,
        sh1sb20 = sh1sb20,
        sh1r20 = sh1r20,
        sh2sb18 = sh2sb18,
        sh2r18 = sh2r18,
        sh3sb16 = sh3sb16,
        sh3r16 = sh3r16,
        b1sb15 = b1sb15,
        b1r15 = b1r15,
        b2sb14 = b2sb14,
        b2r14 = b2r14,
        b3sb13 = b3sb13,
        b3r13 = b3r13,
        b4sb12 = b4sb12,
        b4r12 = b4r12,
        c1sb10 = c1sb10,
        c1r10 = c1r10,
    )

    fun updateTypographyFrom(other: AppTypography) {
        h1sb32 = other.h1sb32
        h3sb28 = other.h3sb28
        h2sb24 = other.h2sb24
        sh1sb20 = other.sh1sb20
        sh1r20 = other.sh1r20
        sh2sb18 = other.sh2sb18
        sh2r18 = other.sh2r18
        sh3sb16 = other.sh3sb16
        sh3r16 = other.sh3r16
        b1sb15 = other.b1sb15
        b1r15 = other.b1r15
        b2sb14 = other.b2sb14
        b2r14 = other.b2r14
        b3sb13 = other.b3sb13
        b3r13 = other.b3r13
        b4sb12 = other.b4sb12
        b4r12 = other.b4r12
        c1sb10 = other.c1sb10
        c1r10 = other.c1r10
    }
}

//internal val LocalTypography = staticCompositionLocalOf { pretendardTypography() } // 폰트제거 테스트
internal val LocalTypography = staticCompositionLocalOf { defaultTypography() }

fun pretendardTypography(
    h1sb32: TextStyle = baseH1sb32.copy(fontFamily = Pretendard),
    h3sb28: TextStyle = baseH3sb28.copy(fontFamily = Pretendard),
    h2sb24: TextStyle = baseH2sb24.copy(fontFamily = Pretendard),
    sh1sb20: TextStyle = bashSh1sb20.copy(fontFamily = Pretendard),
    sh1r20: TextStyle = baseSh1r20.copy(fontFamily = Pretendard),
    sh2sb18: TextStyle = baseSh2sb18.copy(fontFamily = Pretendard),
    sh2r18: TextStyle = baseSh2r18.copy(fontFamily = Pretendard),
    sh3sb16: TextStyle = baseSh3sb16.copy(fontFamily = Pretendard),
    sh3r16: TextStyle = baseSh3r16.copy(fontFamily = Pretendard),
    b1sb15: TextStyle = baseB1sb15.copy(fontFamily = Pretendard),
    b1r15: TextStyle = baseB1r15.copy(fontFamily = Pretendard),
    b2sb14: TextStyle = baseB2sb14.copy(fontFamily = Pretendard),
    b2r14: TextStyle = baseB2r14.copy(fontFamily = Pretendard),
    b3sb13: TextStyle = baseB3sb13.copy(fontFamily = Pretendard),
    b3r13: TextStyle = baseB3r13.copy(fontFamily = Pretendard),
    b4sb12: TextStyle = baseB4sb12.copy(fontFamily = Pretendard),
    b4r12: TextStyle = baseB4r12.copy(fontFamily = Pretendard),
    c1sb10: TextStyle = baseC1sb10.copy(fontFamily = Pretendard),
    c1r10: TextStyle = baseC1r10.copy(fontFamily = Pretendard),
): AppTypography = AppTypography(
    h1sb32 = h1sb32,
    h3sb28 = h3sb28,
    h2sb24 = h2sb24,
    sh1sb20 = sh1sb20,
    sh1r20 = sh1r20,
    sh2sb18 = sh2sb18,
    sh2r18 = sh2r18,
    sh3sb16 = sh3sb16,
    sh3r16 = sh3r16,
    b1sb15 = b1sb15,
    b1r15 = b1r15,
    b2sb14 = b2sb14,
    b2r14 = b2r14,
    b3sb13 = b3sb13,
    b3r13 = b3r13,
    b4sb12 = b4sb12,
    b4r12 = b4r12,
    c1sb10 = c1sb10,
    c1r10 = c1r10,
)

fun defaultTypography(
    h1sb32: TextStyle = baseH1sb32,
    h3sb28: TextStyle = baseH3sb28,
    h2sb24: TextStyle = baseH2sb24,
    sh1sb20: TextStyle = bashSh1sb20,
    sh1r20: TextStyle = baseSh1r20,
    sh2sb18: TextStyle = baseSh2sb18,
    sh2r18: TextStyle = baseSh2r18,
    sh3sb16: TextStyle = baseSh3sb16,
    sh3r16: TextStyle = baseSh3r16,
    b1sb15: TextStyle = baseB1sb15,
    b1r15: TextStyle = baseB1r15,
    b2sb14: TextStyle = baseB2sb14,
    b2r14: TextStyle = baseB2r14,
    b3sb13: TextStyle = baseB3sb13,
    b3r13: TextStyle = baseB3r13,
    b4sb12: TextStyle = baseB4sb12,
    b4r12: TextStyle = baseB4r12,
    c1sb10: TextStyle = baseC1sb10,
    c1r10: TextStyle = baseC1r10,
): AppTypography = AppTypography(
    h1sb32 = h1sb32,
    h3sb28 = h3sb28,
    h2sb24 = h2sb24,
    sh1sb20 = sh1sb20,
    sh1r20 = sh1r20,
    sh2sb18 = sh2sb18,
    sh2r18 = sh2r18,
    sh3sb16 = sh3sb16,
    sh3r16 = sh3r16,
    b1sb15 = b1sb15,
    b1r15 = b1r15,
    b2sb14 = b2sb14,
    b2r14 = b2r14,
    b3sb13 = b3sb13,
    b3r13 = b3r13,
    b4sb12 = b4sb12,
    b4r12 = b4r12,
    c1sb10 = c1sb10,
    c1r10 = c1r10,
)

private val Pretendard = FontFamily(
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_bold, FontWeight.Bold)
)

internal val MaterialTypography = Typography(Pretendard)

private val baseH1sb32: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (32.sp).tu,
    lineHeight = (40.sp).tu,
)

private val baseH3sb28: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (28.sp).tu,
    lineHeight = (36.sp).tu,
)

private val baseH2sb24: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize =  (24.sp).tu,
    lineHeight = (32.sp).tu,
)

private val bashSh1sb20: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu,
)

private val baseSh1r20: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu,
)

private val baseSh2sb18: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu,
)

private val baseSh2r18: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu,
)

private val baseSh3sb16: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu,
)

private val baseSh3r16: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu,
)

private val baseB1sb15: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu,
)

private val baseB1r15: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu,
)

private val baseB2sb14: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu,
)

private val baseB2r14: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu,
)

private val baseB3sb13: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu,
)

private val baseB3r13: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu,
)

private val baseB4sb12: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu,
)

private val baseB4r12: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu,
)

private val baseC1sb10: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu,
)

private val baseC1r10: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu,
)
