package net.deali.designsystem.theme

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
import net.deali.appresource.R
import net.deali.designsystem.unit.tu

@Stable
class AppTypography(
    H1_32_B: TextStyle,
    H1_24_B: TextStyle,
    SH1_20_B: TextStyle,
    SH1_20_M: TextStyle,
    SH2_18_B: TextStyle,
    SH2_18_R: TextStyle,
    SH3_16_B: TextStyle,
    SH3_16_R: TextStyle,
    B1_15_B: TextStyle,
    B1_15_R: TextStyle,
    B2_14_B: TextStyle,
    B2_14_M: TextStyle,
    B2_14_R: TextStyle,
    B3_13_B: TextStyle,
    B3_13_M: TextStyle,
    B3_13_R: TextStyle,
    B4_12_B: TextStyle,
    B4_12_M: TextStyle,
    B4_12_R: TextStyle,
    C1_10_B: TextStyle,
    C1_10_R: TextStyle,
) {
    var H1_32_B by mutableStateOf(H1_32_B)
        private set

    var H1_24_B by mutableStateOf(H1_24_B)
        private set

    var SH1_20_B by mutableStateOf(SH1_20_B)
        private set

    var SH1_20_M by mutableStateOf(SH1_20_M)
        private set

    var SH2_18_B by mutableStateOf(SH2_18_B)
        private set

    var SH2_18_R by mutableStateOf(SH2_18_R)
        private set

    var SH3_16_B by mutableStateOf(SH3_16_B)
        private set

    var SH3_16_R by mutableStateOf(SH3_16_R)
        private set

    var B1_15_B by mutableStateOf(B1_15_B)
        private set

    var B1_15_R by mutableStateOf(B1_15_R)
        private set

    var B2_14_B by mutableStateOf(B2_14_B)
        private set

    var B2_14_M by mutableStateOf(B2_14_M)
        private set

    var B2_14_R by mutableStateOf(B2_14_R)
        private set

    var B3_13_B by mutableStateOf(B3_13_B)
        private set

    var B3_13_M by mutableStateOf(B3_13_M)
        private set

    var B3_13_R by mutableStateOf(B3_13_R)
        private set

    var B4_12_B by mutableStateOf(B4_12_B)
        private set

    var B4_12_M by mutableStateOf(B4_12_M)
        private set

    var B4_12_R by mutableStateOf(B4_12_R)
        private set

    var C1_10_B by mutableStateOf(C1_10_B)
        private set

    var C1_10_R by mutableStateOf(C1_10_R)
        private set

    fun copy(
        H1_32_B: TextStyle = this.H1_32_B,
        H1_24_B: TextStyle = this.H1_24_B,
        SH1_20_B: TextStyle = this.SH1_20_B,
        SH1_20_M: TextStyle = this.SH1_20_M,
        SH2_18_B: TextStyle = this.SH2_18_B,
        SH2_18_R: TextStyle = this.SH2_18_R,
        SH3_16_B: TextStyle = this.SH3_16_B,
        SH3_16_R: TextStyle = this.SH3_16_R,
        B1_15_B: TextStyle = this.B1_15_B,
        B1_15_R: TextStyle = this.B1_15_R,
        B2_14_B: TextStyle = this.B2_14_B,
        B2_14_M: TextStyle = this.B2_14_M,
        B2_14_R: TextStyle = this.B2_14_R,
        B3_13_B: TextStyle = this.B3_13_B,
        B3_13_M: TextStyle = this.B3_13_M,
        B3_13_R: TextStyle = this.B3_13_R,
        B4_12_B: TextStyle = this.B4_12_B,
        B4_12_M: TextStyle = this.B4_12_M,
        B4_12_R: TextStyle = this.B4_12_R,
        C1_10_B: TextStyle = this.C1_10_B,
        C1_10_R: TextStyle = this.C1_10_R,
    ) = AppTypography(
        H1_32_B,
        H1_24_B,
        SH1_20_B,
        SH1_20_M,
        SH2_18_B,
        SH2_18_R,
        SH3_16_B,
        SH3_16_R,
        B1_15_B,
        B1_15_R,
        B2_14_B,
        B2_14_M,
        B2_14_R,
        B3_13_B,
        B3_13_M,
        B3_13_R,
        B4_12_B,
        B4_12_M,
        B4_12_R,
        C1_10_B,
        C1_10_R,
    )

    fun updateTypographyFrom(other: AppTypography) {
        H1_32_B = other.H1_32_B
        H1_24_B = other.H1_24_B
        SH1_20_B = other.SH1_20_B
        SH1_20_M = other.SH1_20_M
        SH2_18_B = other.SH2_18_B
        SH2_18_R = other.SH2_18_R
        SH3_16_B = other.SH3_16_B
        SH3_16_R = other.SH3_16_R
        B1_15_B = other.B1_15_B
        B1_15_R = other.B1_15_R
        B2_14_B = other.B2_14_B
        B2_14_M = other.B2_14_M
        B2_14_R = other.B2_14_R
        B3_13_B = other.B3_13_B
        B3_13_M = other.B3_13_M
        B3_13_R = other.B3_13_R
        B4_12_B = other.B4_12_B
        B4_12_M = other.B4_12_M
        B4_12_R = other.B4_12_R
        C1_10_B = other.C1_10_B
        C1_10_R = other.C1_10_R
    }
}

internal val LocalTypography = staticCompositionLocalOf { pretendardTypography() }

fun pretendardTypography(
    H1_32_B: TextStyle = BASE_H1_32_B.copy(fontFamily = Pretendard),
    H1_24_B: TextStyle = BASE_H1_24_B.copy(fontFamily = Pretendard),
    SH1_20_B: TextStyle = BASE_SH1_20_B.copy(fontFamily = Pretendard),
    SH1_20_M: TextStyle = BASE_SH1_20_M.copy(fontFamily = Pretendard),
    SH2_18_B: TextStyle = BASE_SH2_18_B.copy(fontFamily = Pretendard),
    SH2_18_R: TextStyle = BASE_SH2_18_R.copy(fontFamily = Pretendard),
    SH3_16_B: TextStyle = BASE_SH3_16_B.copy(fontFamily = Pretendard),
    SH3_16_R: TextStyle = BASE_SH3_16_R.copy(fontFamily = Pretendard),
    B1_15_B: TextStyle = BASE_B1_15_B.copy(fontFamily = Pretendard),
    B1_15_R: TextStyle = BASE_B1_15_R.copy(fontFamily = Pretendard),
    B2_14_B: TextStyle = BASE_B2_14_B.copy(fontFamily = Pretendard),
    B2_14_M: TextStyle = BASE_B2_14_M.copy(fontFamily = Pretendard),
    B2_14_R: TextStyle = BASE_B2_14_R.copy(fontFamily = Pretendard),
    B3_13_B: TextStyle = BASE_B3_13_B.copy(fontFamily = Pretendard),
    B3_13_M: TextStyle = BASE_B3_13_M.copy(fontFamily = Pretendard),
    B3_13_R: TextStyle = BASE_B3_13_R.copy(fontFamily = Pretendard),
    B4_12_B: TextStyle = BASE_B4_12_B.copy(fontFamily = Pretendard),
    B4_12_M: TextStyle = BASE_B4_12_M.copy(fontFamily = Pretendard),
    B4_12_R: TextStyle = BASE_B4_12_R.copy(fontFamily = Pretendard),
    C1_10_B: TextStyle = BASE_C1_10_B.copy(fontFamily = Pretendard),
    C1_10_R: TextStyle = BASE_C1_10_R.copy(fontFamily = Pretendard),
): AppTypography = AppTypography(
    H1_32_B = H1_32_B,
    H1_24_B = H1_24_B,
    SH1_20_B = SH1_20_B,
    SH1_20_M = SH1_20_M,
    SH2_18_B = SH2_18_B,
    SH2_18_R = SH2_18_R,
    SH3_16_B = SH3_16_B,
    SH3_16_R = SH3_16_R,
    B1_15_B = B1_15_B,
    B1_15_R = B1_15_R,
    B2_14_B = B2_14_B,
    B2_14_M = B2_14_M,
    B2_14_R = B2_14_R,
    B3_13_B = B3_13_B,
    B3_13_M = B3_13_M,
    B3_13_R = B3_13_R,
    B4_12_B = B4_12_B,
    B4_12_M = B4_12_M,
    B4_12_R = B4_12_R,
    C1_10_B = C1_10_B,
    C1_10_R = C1_10_R,
)

fun defaultTypography(
    H1_32_B: TextStyle = BASE_H1_32_B,
    H1_24_B: TextStyle = BASE_H1_24_B,
    SH1_20_B: TextStyle = BASE_SH1_20_B,
    SH1_20_M: TextStyle = BASE_SH1_20_M,
    SH2_18_B: TextStyle = BASE_SH2_18_B,
    SH2_18_R: TextStyle = BASE_SH2_18_R,
    SH3_16_B: TextStyle = BASE_SH3_16_B,
    SH3_16_R: TextStyle = BASE_SH3_16_R,
    B1_15_B: TextStyle = BASE_B1_15_B,
    B1_15_R: TextStyle = BASE_B1_15_R,
    B2_14_B: TextStyle = BASE_B2_14_B,
    B2_14_M: TextStyle = BASE_B2_14_M,
    B2_14_R: TextStyle = BASE_B2_14_R,
    B3_13_B: TextStyle = BASE_B3_13_B,
    B3_13_M: TextStyle = BASE_B3_13_M,
    B3_13_R: TextStyle = BASE_B3_13_R,
    B4_12_B: TextStyle = BASE_B4_12_B,
    B4_12_M: TextStyle = BASE_B4_12_M,
    B4_12_R: TextStyle = BASE_B4_12_R,
    C1_10_B: TextStyle = BASE_C1_10_B,
    C1_10_R: TextStyle = BASE_C1_10_R,
): AppTypography = AppTypography(
    H1_32_B = H1_32_B,
    H1_24_B = H1_24_B,
    SH1_20_B = SH1_20_B,
    SH1_20_M = SH1_20_M,
    SH2_18_B = SH2_18_B,
    SH2_18_R = SH2_18_R,
    SH3_16_B = SH3_16_B,
    SH3_16_R = SH3_16_R,
    B1_15_B = B1_15_B,
    B1_15_R = B1_15_R,
    B2_14_B = B2_14_B,
    B2_14_M = B2_14_M,
    B2_14_R = B2_14_R,
    B3_13_B = B3_13_B,
    B3_13_M = B3_13_M,
    B3_13_R = B3_13_R,
    B4_12_B = B4_12_B,
    B4_12_M = B4_12_M,
    B4_12_R = B4_12_R,
    C1_10_B = C1_10_B,
    C1_10_R = C1_10_R,
)

private val Pretendard = FontFamily(
    Font(R.font.pretendard_jp_regular, FontWeight.Normal),
    Font(R.font.pretendard_jp_medium, FontWeight.Medium),
    Font(R.font.pretendard_jp_bold, FontWeight.Bold)
)

private val BASE_H1_32_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (32.sp).tu,
    lineHeight = (40.sp).tu,
)

private val BASE_H1_24_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (24.sp).tu,
    lineHeight = (32.sp).tu
)

private val BASE_SH1_20_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu
)

private val BASE_SH1_20_M: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (20.sp).tu,
    lineHeight = (28.sp).tu
)

private val BASE_SH2_18_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu
)

private val BASE_SH2_18_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (18.sp).tu,
    lineHeight = (26.sp).tu
)

private val BASE_SH3_16_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu
)

private val BASE_SH3_16_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (16.sp).tu,
    lineHeight = (22.sp).tu
)

private val BASE_B1_15_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu
)

private val BASE_B1_15_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (15.sp).tu,
    lineHeight = (20.sp).tu
)

private val BASE_B2_14_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu
)

private val BASE_B2_14_M: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu
)

private val BASE_B2_14_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (14.sp).tu,
    lineHeight = (20.sp).tu
)

private val BASE_B3_13_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu
)

private val BASE_B3_13_M: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu
)

private val BASE_B3_13_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (13.sp).tu,
    lineHeight = (18.sp).tu
)

private val BASE_B4_12_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu
)

private val BASE_B4_12_M: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu
)

private val BASE_B4_12_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = (12.sp).tu,
    lineHeight = (18.sp).tu
)

private val BASE_C1_10_B: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu
)

private val BASE_C1_10_R: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = (10.sp).tu,
    lineHeight = (14.sp).tu
)
