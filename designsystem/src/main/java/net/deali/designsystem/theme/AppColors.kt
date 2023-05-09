package net.deali.designsystem.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class AppColors(
    primary: Color,
    background: Color,
    ripple: Color,
    isLight: Boolean
) {
    var primary by mutableStateOf(primary)
        private set

    var background by mutableStateOf(background)
        private set

    var ripple by mutableStateOf(ripple)
        private set

    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        primary: Color = this.primary,
        background: Color = this.background,
        ripple: Color = this.ripple,
        isLight: Boolean = this.isLight
    ) = AppColors(
        primary,
        background,
        ripple,
        isLight
    )

    fun updateColorsFrom(other: AppColors) {
        primary = other.primary
        background = other.background
        ripple = other.ripple
        isLight = other.isLight
    }
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

fun lightColors(
    primary: Color = colorLightPrimary,
    background: Color = colorLightBackground,
    ripple: Color = colorLightRipple,
): AppColors = AppColors(
    primary = primary,
    background = background,
    ripple = ripple,
    isLight = true
)

fun darkColors(
    primary: Color = colorDarkPrimary,
    background: Color = colorDarkBackground,
    ripple: Color = colorDarkRipple,
): AppColors = AppColors(
    primary = primary,
    background = background,
    ripple = ripple,
    isLight = false
)

// color palette
val pink10 = Color(0xFFFEECEF) // Pink 타입의 뱃지 적용시, 배경색으로 활용됨
val pink20 = Color(0xFFFEDADF)
val pink30 = Color(0xFFFDB5BF)
val pink40 = Color(0xFFFD91A0)
val pink50 = Color(0xFFFC6C80)
val pink60 = Color(0xFFFB4760) // brand color로, CTA 버튼에 적용됨
val pink70 = Color(0xFFFB3A55)
val pink80 = Color(0xFFF42844)
val pink90 = Color(0xFFEC2843) // Red dot, Count Badge에 적용됨
val blue10 = Color(0xFFEAEFFF) // Blue 타입의 뱃지 적용시, 배경색으로 활용됨
val blue20 = Color(0xFFDEE6FF)
val blue30 = Color(0xFFB9CBFF)
val blue40 = Color(0xFF7C9EFD)
val blue50 = Color(0xFF618AFF)
val blue60 = Color(0xFF4B7AFF)
val blue70 = Color(0xFF3668F4)
val blue80 = Color(0xFF255CF9) // 툴팁 BG
val blue90 = Color(0xFF0E46E4)
val gray10 = Color(0xFFF5F6FB) // Divider / BG / Input / Search Bar
val gray15 = Color(0xFFF0F2F8)
val gray20 = Color(0xFFEBEEF6) // Divider / Border
val gray30 = Color(0xFFDFE3ED) // Divider / Border
val gray40 = Color(0xFFD0D6E1)
val gray50 = Color(0xFFBEC5D2) // Dimmed / 비활성화 상태 문구로 활용
val gray60 = Color(0xFFA6ADBD)
val gray70 = Color(0xFF8F97A7) // Placeholder 문구로 활용
val gray80 = Color(0xFF686E7B) // 툴팁 BG
val gray90 = Color(0xFF3E4149)
val gray100 = Color(0xFF222222) // 텍스트 기본 컬러로 사용합니다. (폰트 컬러로 Black, #000000 사용하지 않습니다)

val black005 = Color(0x0D000000) // 상품 이미지 위에 올라오는 라인 컬러
val black010 = Color(0x1A000000)
val black020 = Color(0x33000000) // 쉐도우
val black030 = Color(0x4D000000)
val black040 = Color(0x66000000)
val black050 = Color(0x80000000) // 팝업 / 바텀시트 BG
val black060 = Color(0x99000000)
val black070 = Color(0xB3000000)
val black080 = Color(0xCC000000)
val black100 = Color(0xFF000000)

val white015 = Color(0x26FFFFFF)
val white020 = Color(0x33FFFFFF)
val white030 = Color(0x4DFFFFFF)
val white040 = Color(0x66FFFFFF)
val white050 = Color(0x80FFFFFF)
val white060 = Color(0x99FFFFFF)
val white070 = Color(0xB3FFFFFF)
val white080 = Color(0xCCFFFFFF)
val white090 = Color(0xE6FFFFFF)
val white100 = Color(0xFFFFFFFF) // Popup, List, BG, Text, Bottom Sheet

val orange10 = Color(0xFFFFECDB)
val orange20 = Color(0xFFFFE3CA)
val orange30 = Color(0xFFFFD0A6)
val orange40 = Color(0xFFFF9C72)
val orange50 = Color(0xFFFF7C44)
val orange60 = Color(0xFFFF6827)

val globalError = Color(0xFFFF0000)


val mbsgra = Color(0xFFFF7051)

val transparent = Color(0x00FFFFFF)

// light color
private val colorLightPrimary = pink60
private val colorLightBackground = white100
private val colorLightRipple = Color(0x22000000)

// dark color
private val colorDarkPrimary = pink60
private val colorDarkBackground = white100
private val colorDarkRipple = Color(0x22000000)
