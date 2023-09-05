package net.deali.designsystem.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// primary
private val primary01 = Color(0xFFFB4760)
private val primary02 = Color(0xFFEC2843)
private val primary03 = Color(0xFFFEECEF)
private val primary04 = Color(0xFFFFFFFF)
private val primary05 = Color(0xFF000000)

// secondary
private val secondary01 = Color(0xFF4759FB)
private val secondary02 = Color(0xFF2B3EE7)
private val secondary03 = Color(0xFFEAEFFF)
private val secondary04 = Color(0xFFFF7C44)
private val secondary05 = Color(0xFFFF6827)
private val secondary06 = Color(0xFFFFECDB)

// gray
private val g100 = Color(0xFF222222)
private val g80 = Color(0xFF686E7B)
private val g70 = Color(0xFF8F97A7)
private val g60 = Color(0xFFA6ADBD)
private val g50 = Color(0xFFBEC5D2)
private val g40 = Color(0xFFD0D6E1)
private val g30 = Color(0xFFDFE3ED)
private val g20 = Color(0xFFEBEEF6)
private val g10 = Color(0xFFF5F6FB)
private val g05 = Color(0xFFF6F6F7)

private val gradientStart = Color(0xFFFB4760)
private val gradientEnd = Color(0xFFFE1EA4)

// service
private val error = Color(0xFFFA1818)
private val linkAndInfo = Color(0xFF2B66FD)
private val warning = Color(0xFFFFD600)
private val success = Color(0xFF1BDA17)

// etc
private val etc01 = Color(0x1A000000)
private val etc02 = Color(0x33000000)
private val etc03 = Color(0x66000000)
private val etc04 = Color(0x33FFFFFF)
private val etc05 = Color(0x80FFFFFF)
private val etc06 = Color(0xB2000000)
private val etc07 = Color(0xE5FFFFFF)
private val etc08 = Color(0x0DFFFFFF)
private val etc09 = Color(0x1AFFFFFF)

// transparent
private val transparent = Color(0x00FFFFFF)

// ripple
private val ripple = Color(0x22000000)

@Stable
class AppColors(
    primary01: Color,
    primary02: Color,
    primary03: Color,
    primary04: Color,
    primary05: Color,
    secondary01: Color,
    secondary02: Color,
    secondary03: Color,
    secondary04: Color,
    secondary05: Color,
    secondary06: Color,
    g100: Color,
    g80: Color,
    g70: Color,
    g60: Color,
    g50: Color,
    g40: Color,
    g30: Color,
    g20: Color,
    g10: Color,
    g05: Color,
    gradientStart: Color,
    gradientEnd: Color,
    error: Color,
    linkAndInfo: Color,
    warning: Color,
    success: Color,
    etc01: Color,
    etc02: Color,
    etc03: Color,
    etc04: Color,
    etc05: Color,
    etc06: Color,
    etc07: Color,
    transparent: Color,
    ripple: Color,
    isLight: Boolean
) {
    var primary01 by mutableStateOf(primary01)
        private set

    var primary02 by mutableStateOf(primary02)
        private set

    var primary03 by mutableStateOf(primary03)
        private set

    var primary04 by mutableStateOf(primary04)
        private set

    var primary05 by mutableStateOf(primary05)
        private set

    var secondary01 by mutableStateOf(secondary01)
        private set

    var secondary02 by mutableStateOf(secondary02)
        private set

    var secondary03 by mutableStateOf(secondary03)
        private set

    var secondary04 by mutableStateOf(secondary04)
        private set

    var secondary05 by mutableStateOf(secondary05)
        private set

    var secondary06 by mutableStateOf(secondary06)
        private set

    var g100 by mutableStateOf(g100)
        private set

    var g80 by mutableStateOf(g80)
        private set

    var g70 by mutableStateOf(g70)
        private set

    var g60 by mutableStateOf(g60)
        private set

    var g50 by mutableStateOf(g50)
        private set

    var g40 by mutableStateOf(g40)
        private set

    var g30 by mutableStateOf(g30)
        private set

    var g20 by mutableStateOf(g20)
        private set

    var g10 by mutableStateOf(g10)
        private set

    var g05 by mutableStateOf(g05)
        private set

    private var gradientStart by mutableStateOf(gradientStart)

    private var gradientEnd by mutableStateOf(gradientEnd)

    val gradient: Brush by mutableStateOf(
        Brush.horizontalGradient(colors = listOf(gradientStart, gradientEnd))
    )

    var error by mutableStateOf(error)
        private set

    var linkAndInfo by mutableStateOf(linkAndInfo)
        private set

    var warning by mutableStateOf(warning)
        private set

    var success by mutableStateOf(success)
        private set

    var etc01 by mutableStateOf(etc01)
        private set

    var etc02 by mutableStateOf(etc02)
        private set

    var etc03 by mutableStateOf(etc03)
        private set

    var etc04 by mutableStateOf(etc04)
        private set

    var etc05 by mutableStateOf(etc05)
        private set

    var etc06 by mutableStateOf(etc06)
        private set

    var etc07 by mutableStateOf(etc07)
        private set

    var transparent by mutableStateOf(transparent)
        private set

    var ripple by mutableStateOf(ripple)
        private set

    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        primary01: Color = this.primary01,
        primary02: Color = this.primary02,
        primary03: Color = this.primary03,
        primary04: Color = this.primary04,
        primary05: Color = this.primary05,
        secondary01: Color = this.secondary01,
        secondary02: Color = this.secondary02,
        secondary03: Color = this.secondary03,
        secondary04: Color = this.secondary04,
        secondary05: Color = this.secondary05,
        secondary06: Color = this.secondary06,
        g100: Color = this.g100,
        g80: Color = this.g80,
        g70: Color = this.g70,
        g60: Color = this.g60,
        g50: Color = this.g50,
        g40: Color = this.g40,
        g30: Color = this.g30,
        g20: Color = this.g20,
        g10: Color = this.g10,
        g05: Color = this.g05,
        gradientStart: Color = this.gradientStart,
        gradientEnd: Color = this.gradientEnd,
        error: Color = this.error,
        linkAndInfo: Color = this.linkAndInfo,
        warning: Color = this.warning,
        success: Color = this.success,
        etc01: Color = this.etc01,
        etc02: Color = this.etc02,
        etc03: Color = this.etc03,
        etc04: Color = this.etc04,
        etc05: Color = this.etc05,
        etc06: Color = this.etc06,
        etc07: Color = this.etc07,
        transparent: Color = this.transparent,
        ripple: Color = this.ripple,
        isLight: Boolean = this.isLight
    ) = AppColors(
        primary01,
        primary02,
        primary03,
        primary04,
        primary05,
        secondary01,
        secondary02,
        secondary03,
        secondary04,
        secondary05,
        secondary06,
        g100,
        g80,
        g70,
        g60,
        g50,
        g40,
        g30,
        g20,
        g10,
        g05,
        gradientStart,
        gradientEnd,
        error,
        linkAndInfo,
        warning,
        success,
        etc01,
        etc02,
        etc03,
        etc04,
        etc05,
        etc06,
        etc07,
        transparent,
        ripple,
        isLight,
    )

    fun updateColorsFrom(other: AppColors) {
        primary01 = other.primary01
        primary02 = other.primary02
        primary03 = other.primary03
        primary04 = other.primary04
        primary05 = other.primary05
        secondary01 = other.secondary01
        secondary02 = other.secondary02
        secondary03 = other.secondary03
        secondary04 = other.secondary04
        secondary05 = other.secondary05
        secondary06 = other.secondary06
        g100 = other.g100
        g80 = other.g80
        g70 = other.g70
        g60 = other.g60
        g50 = other.g50
        g40 = other.g40
        g30 = other.g30
        g20 = other.g20
        g10 = other.g10
        g05 = other.g05
        gradientStart = other.gradientStart
        gradientEnd = other.gradientEnd
        error = other.error
        linkAndInfo = other.linkAndInfo
        warning = other.warning
        success = other.success
        etc01 = other.etc01
        etc02 = other.etc02
        etc03 = other.etc03
        etc04 = other.etc04
        etc05 = other.etc05
        etc06 = other.etc06
        transparent = other.transparent
        ripple = other.ripple
        isLight = other.isLight
    }
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

fun lightColors(
    primary01: Color = primary01Light,
    primary02: Color = primary02Light,
    primary03: Color = primary03Light,
    primary04: Color = primary04Light,
    primary05: Color = primary05Light,
    secondary01: Color = secondary01Light,
    secondary02: Color = secondary02Light,
    secondary03: Color = secondary03Light,
    secondary04: Color = secondary04Light,
    secondary05: Color = secondary05Light,
    secondary06: Color = secondary06Light,
    g100: Color = g100Common,
    g80: Color = g80Common,
    g70: Color = g70Common,
    g60: Color = g60Common,
    g50: Color = g50Common,
    g40: Color = g40Common,
    g30: Color = g30Common,
    g20: Color = g20Common,
    g10: Color = g10Common,
    g05: Color = g05Common,
    gradientStart: Color = gradientStartLight,
    gradientEnd: Color = gradientEndLight,
    error: Color = errorLight,
    linkAndInfo: Color = linkAndInfoLight,
    warning: Color = warningLight,
    success: Color = successLight,
    etc01: Color = etc01Light,
    etc02: Color = etc02Light,
    etc03: Color = etc03Light,
    etc04: Color = etc04Light,
    etc05: Color = etc05Light,
    etc06: Color = etc06Light,
    etc07: Color = etc07Light,
    transparent: Color = transparentLight,
    ripple: Color = rippleLight,
): AppColors = AppColors(
    primary01 = primary01,
    primary02 = primary02,
    primary03 = primary03,
    primary04 = primary04,
    primary05 = primary05,
    secondary01 = secondary01,
    secondary02 = secondary02,
    secondary03 = secondary03,
    secondary04 = secondary04,
    secondary05 = secondary05,
    secondary06 = secondary06,
    g100 = g100,
    g80 = g80,
    g70 = g70,
    g60 = g60,
    g50 = g50,
    g40 = g40,
    g30 = g30,
    g20 = g20,
    g10 = g10,
    g05 = g05,
    gradientStart,
    gradientEnd,
    error = error,
    linkAndInfo = linkAndInfo,
    warning = warning,
    success = success,
    etc01 = etc01,
    etc02 = etc02,
    etc03 = etc03,
    etc04 = etc04,
    etc05 = etc05,
    etc06 = etc06,
    etc07 = etc07,
    transparent = transparent,
    ripple = ripple,
    isLight = true,
)

fun darkColors(
    primary01: Color = primary01Dark,
    primary02: Color = primary02Dark,
    primary03: Color = primary03Dark,
    primary04: Color = primary04Dark,
    primary05: Color = primary05Dark,
    secondary01: Color = secondary01Dark,
    secondary02: Color = secondary02Dark,
    secondary03: Color = secondary03Dark,
    secondary04: Color = secondary04Dark,
    secondary05: Color = secondary05Dark,
    secondary06: Color = secondary06Dark,
    g100: Color = g100Common,
    g80: Color = g80Common,
    g70: Color = g70Common,
    g60: Color = g60Common,
    g50: Color = g50Common,
    g40: Color = g40Common,
    g30: Color = g30Common,
    g20: Color = g20Common,
    g10: Color = g10Common,
    g05: Color = g05Common,
    gradientStart: Color = gradientStartDark,
    gradientEnd: Color = gradientEndDark,
    error: Color = errorDark,
    linkAndInfo: Color = linkAndInfoDark,
    warning: Color = warningDark,
    success: Color = successDark,
    etc01: Color = etc01Dark,
    etc02: Color = etc02Dark,
    etc03: Color = etc03Dark,
    etc04: Color = etc04Dark,
    etc05: Color = etc05Dark,
    etc06: Color = etc06Dark,
    etc07: Color = etc07Dark,
    transparent: Color = transparentDark,
    ripple: Color = rippleDark,
): AppColors = AppColors(
    primary01 = primary01,
    primary02 = primary02,
    primary03 = primary03,
    primary04 = primary04,
    primary05 = primary05,
    secondary01 = secondary01,
    secondary02 = secondary02,
    secondary03 = secondary03,
    secondary04 = secondary04,
    secondary05 = secondary05,
    secondary06 = secondary06,
    g100 = g100,
    g80 = g80,
    g70 = g70,
    g60 = g60,
    g50 = g50,
    g40 = g40,
    g30 = g30,
    g20 = g20,
    g10 = g10,
    g05 = g05,
    gradientStart,
    gradientEnd,
    error = error,
    linkAndInfo = linkAndInfo,
    warning = warning,
    success = success,
    etc01 = etc01,
    etc02 = etc02,
    etc03 = etc03,
    etc04 = etc04,
    etc05 = etc05,
    etc06 = etc06,
    etc07 = etc07,
    transparent = transparent,
    ripple = ripple,
    isLight = false,
)

// common color
private val g100Common = g100
private val g80Common = g80
private val g70Common = g70
private val g60Common = g60
private val g50Common = g50
private val g40Common = g40
private val g30Common = g30
private val g20Common = g20
private val g10Common = g10
private val g05Common = g05

// light color
private val primary01Light = primary01
private val primary02Light = primary02
private val primary03Light = primary03
private val primary04Light = primary04
private val primary05Light = primary05
private val secondary01Light = secondary01
private val secondary02Light = secondary02
private val secondary03Light = secondary03
private val secondary04Light = secondary04
private val secondary05Light = secondary05
private val secondary06Light = secondary06
private val gradientStartLight = gradientStart
private val gradientEndLight = gradientEnd
private val errorLight = error
private val linkAndInfoLight = linkAndInfo
private val warningLight = warning
private val successLight = success
private val etc01Light = etc01
private val etc02Light = etc02
private val etc03Light = etc03
private val etc04Light = etc04
private val etc05Light = etc05
private val etc06Light = etc06
private val etc07Light = etc07
private val transparentLight = transparent
private val rippleLight = ripple

// dark color
private val primary01Dark = primary01
private val primary02Dark = primary02
private val primary03Dark = primary03
private val primary04Dark = primary04
private val primary05Dark = primary05
private val secondary01Dark = secondary01
private val secondary02Dark = secondary02
private val secondary03Dark = secondary03
private val secondary04Dark = secondary04
private val secondary05Dark = secondary05
private val secondary06Dark = secondary06
private val gradientStartDark = gradientStart
private val gradientEndDark = gradientEnd
private val errorDark = error
private val linkAndInfoDark = linkAndInfo
private val warningDark = warning
private val successDark = success
private val etc01Dark = etc01
private val etc02Dark = etc02
private val etc03Dark = etc03
private val etc04Dark = etc04
private val etc05Dark = etc05
private val etc06Dark = etc06
private val etc07Dark = etc07
private val transparentDark = transparent
private val rippleDark = ripple
