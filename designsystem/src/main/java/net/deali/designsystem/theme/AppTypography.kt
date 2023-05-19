package net.deali.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import net.deali.appresource.R
import net.deali.designsystem.unit.tu

data class AppTypography(
    val H1_32_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (32.sp).tu,
        lineHeight = (40.sp).tu
    ),

    val H1_24_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (24.sp).tu,
        lineHeight = (32.sp).tu
    ),

    val SH1_20_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (20.sp).tu,
        lineHeight = (28.sp).tu
    ),

    val SH1_20_M: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = (20.sp).tu,
        lineHeight = (28.sp).tu
    ),

    val SH2_18_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (18.sp).tu,
        lineHeight = (26.sp).tu
    ),

    val SH2_18_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = (18.sp).tu,
        lineHeight = (26.sp).tu
    ),

    val SH3_16_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (16.sp).tu,
        lineHeight = (22.sp).tu
    ),

    val SH3_16_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = (16.sp).tu,
        lineHeight = (22.sp).tu
    ),

    val B1_15_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (15.sp).tu,
        lineHeight = (20.sp).tu
    ),

    val B1_15_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = (15.sp).tu,
        lineHeight = (20.sp).tu
    ),

    val B1_14_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (14.sp).tu,
        lineHeight = (20.sp).tu
    ),

    val B2_14_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (14.sp).tu,
        lineHeight = (20.sp).tu
    ),

    val B2_14_M: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = (14.sp).tu,
        lineHeight = (20.sp).tu
    ),

    val B2_14_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = (14.sp).tu,
        lineHeight = (20.sp).tu
    ),

    val B3_13_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (13.sp).tu,
        lineHeight = (18.sp).tu
    ),

    val B3_13_M: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = (13.sp).tu,
        lineHeight = (18.sp).tu
    ),

    val B3_13_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = (13.sp).tu,
        lineHeight = (18.sp).tu
    ),

    val B4_12_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (12.sp).tu,
        lineHeight = (18.sp).tu
    ),

    val B4_12_M: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = (12.sp).tu,
        lineHeight = (18.sp).tu
    ),

    val B4_12_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Normal,
        fontSize = (12.sp).tu,
        lineHeight = (18.sp).tu
    ),

    val C1_10_B: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Bold,
        fontSize = (10.sp).tu,
        lineHeight = (14.sp).tu
    ),

    val C1_10_R: TextStyle = TextStyle(
        fontFamily = Pretendard,
        fontWeight = FontWeight.Medium,
        fontSize = (10.sp).tu,
        lineHeight = (14.sp).tu
    )
)

internal val LocalTypography = staticCompositionLocalOf { AppTypography() }

private val Pretendard = FontFamily(
    Font(R.font.pretendard_jp_regular, FontWeight.Normal),
    Font(R.font.pretendard_jp_medium, FontWeight.Medium),
    Font(R.font.pretendard_jp_bold, FontWeight.Bold)
)