package net.deali.designsystem.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import net.deali.designsystem.R
import net.deali.designsystem.util.tu

object DealiFont {
    val h1sb32: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.h1sb32
    val h3sb28: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.h3sb28
    val h2sb24: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.h2sb24
    val sh1sb20: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.sh1sb20
    val sh1r20: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.sh1r20
    val sh2sb18: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.sh2sb18
    val sh2r18: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.sh2r18
    val sh3sb16: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.sh3sb16
    val sh3r16: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.sh3r16
    val b1sb15: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b1sb15
    val b1r15: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b1r15
    val b2sb14: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b2sb14
    val b2r14: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b2r14
    val b3sb13: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b3sb13
    val b3r13: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b3r13
    val b4sb12: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b4sb12
    val b4r12: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.b4r12
    val c1sb10: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.c1sb10
    val c1r10: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current.c1r10
}

@Stable
internal class AppTypography(
    val h1sb32: TextStyle = _h1sb32,
    val h3sb28: TextStyle = _h3sb28,
    val h2sb24: TextStyle = _h2sb24,
    val sh1sb20: TextStyle = _sh1sb20,
    val sh1r20: TextStyle = _sh1r20,
    val sh2sb18: TextStyle = _sh2sb18,
    val sh2r18: TextStyle = _sh2r18,
    val sh3sb16: TextStyle = _sh3sb16,
    val sh3r16: TextStyle = _sh3r16,
    val b1sb15: TextStyle = _b1sb15,
    val b1r15: TextStyle = _b1r15,
    val b2sb14: TextStyle = _b2sb14,
    val b2r14: TextStyle = _b2r14,
    val b3sb13: TextStyle = _b3sb13,
    val b3r13: TextStyle = _b3r13,
    val b4sb12: TextStyle = _b4sb12,
    val b4r12: TextStyle = _b4r12,
    val c1sb10: TextStyle = _c1sb10,
    val c1r10: TextStyle = _c1r10,
)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }

internal fun chineseTypography(): AppTypography = AppTypography(
    h1sb32 = _h1sb32.copy(fontWeight = FontWeight.Bold),
    h3sb28 = _h3sb28.copy(fontWeight = FontWeight.Bold),
    h2sb24 = _h2sb24.copy(fontWeight = FontWeight.Bold),
    sh1sb20 = _sh1sb20.copy(fontWeight = FontWeight.Bold),
    sh1r20 = _sh1r20.copy(fontWeight = FontWeight.Normal),
    sh2sb18 = _sh2sb18.copy(fontWeight = FontWeight.Bold),
    sh2r18 = _sh2r18.copy(fontWeight = FontWeight.Normal),
    sh3sb16 = _sh3sb16.copy(fontWeight = FontWeight.Bold),
    sh3r16 = _sh3r16.copy(fontWeight = FontWeight.Normal),
    b1sb15 = _b1sb15.copy(fontWeight = FontWeight.Bold),
    b1r15 = _b1r15.copy(fontWeight = FontWeight.Normal),
    b2sb14 = _b2sb14.copy(fontWeight = FontWeight.Bold),
    b2r14 = _b2r14.copy(fontWeight = FontWeight.Normal),
    b3sb13 = _b3sb13.copy(fontWeight = FontWeight.Bold),
    b3r13 = _b3r13.copy(fontWeight = FontWeight.Normal),
    b4sb12 = _b4sb12.copy(fontWeight = FontWeight.Bold),
    b4r12 = _b4r12.copy(fontWeight = FontWeight.Normal),
    c1sb10 = _c1sb10.copy(fontWeight = FontWeight.Bold),
    c1r10 = _c1r10.copy(fontWeight = FontWeight.Normal),
)

internal fun pretendardTypography(): AppTypography = AppTypography(
    h1sb32 = _h1sb32.copy(fontFamily = Pretendard),
    h3sb28 = _h3sb28.copy(fontFamily = Pretendard),
    h2sb24 = _h2sb24.copy(fontFamily = Pretendard),
    sh1sb20 = _sh1sb20.copy(fontFamily = Pretendard),
    sh1r20 = _sh1r20.copy(fontFamily = Pretendard),
    sh2sb18 = _sh2sb18.copy(fontFamily = Pretendard),
    sh2r18 = _sh2r18.copy(fontFamily = Pretendard),
    sh3sb16 = _sh3sb16.copy(fontFamily = Pretendard),
    sh3r16 = _sh3r16.copy(fontFamily = Pretendard),
    b1sb15 = _b1sb15.copy(fontFamily = Pretendard),
    b1r15 = _b1r15.copy(fontFamily = Pretendard),
    b2sb14 = _b2sb14.copy(fontFamily = Pretendard),
    b2r14 = _b2r14.copy(fontFamily = Pretendard),
    b3sb13 = _b3sb13.copy(fontFamily = Pretendard),
    b3r13 = _b3r13.copy(fontFamily = Pretendard),
    b4sb12 = _b4sb12.copy(fontFamily = Pretendard),
    b4r12 = _b4r12.copy(fontFamily = Pretendard),
    c1sb10 = _c1sb10.copy(fontFamily = Pretendard),
    c1r10 = _c1r10.copy(fontFamily = Pretendard),
)

internal val Pretendard = FontFamily(
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_bold, FontWeight.Bold)
)

internal val MaterialTypography = Typography(Pretendard)

private val _h1sb32: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (32.sp).tu,
    lineHeight = (40.sp).tu,
)

private val _h3sb28: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (28.sp).tu,
    lineHeight = (36.sp).tu,
)

private val _h2sb24: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (24.sp).tu,
    lineHeight = (32.sp).tu,
)

private val _sh1sb20: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu,
)

private val _sh1r20: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu,
)

private val _sh2sb18: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu,
)

private val _sh2r18: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu,
)

private val _sh3sb16: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu,
)

private val _sh3r16: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu,
)

private val _b1sb15: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu,
)

private val _b1r15: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu,
)

private val _b2sb14: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu,
)

private val _b2r14: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu,
)

private val _b3sb13: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu,
)

private val _b3r13: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu,
)

private val _b4sb12: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu,
)

private val _b4r12: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu,
)

private val _c1sb10: TextStyle = TextStyle(
    fontWeight = FontWeight.SemiBold,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu,
)

private val _c1r10: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu,
)
