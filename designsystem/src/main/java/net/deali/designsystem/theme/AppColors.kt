package net.deali.designsystem.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// primary
private val primary01 = Color(0xFFFB4760)
private val primary02 = Color(0xFFEC2843)
private val primary03 = Color(0xFFFEECEF)
private val primary04 = Color(0xFFFFFFFF)
private val primary05 = Color(0xFF000000)

// secondary
private val secondary01 = Color(0xFF3668F4)
private val secondary02 = Color(0xFF0E46E4)
private val secondary03 = Color(0xFFEAEFFF)
private val secondary04 = Color(0xFFFF7C44)
private val secondary05 = Color(0xFFFF6827)
private val secondary06 = Color(0xFFFFECDB)

// text
private val text01 = Color(0xFF222222)
private val text02 = Color(0xFF686E7B)
private val text03 = Color(0xFF8F97A7)
private val text04 = Color(0xFFA6ADBD)
private val text05 = Color(0xFFBEC5D2)

// divider
private val divider01 = Color(0xFFDFE3ED)
private val divider02 = Color(0xFFEBEEF6)
private val divider03 = Color(0xFFF5F6FB)

// line
private val line01 = Color(0xFF222222)
private val line02 = Color(0xFFBEC5D2)
private val line03 = Color(0xFFDFE3ED)
private val line04 = Color(0xFFEBEEF6)

// bg
private val bg01 = Color(0xFF222222)
private val bg02 = Color(0xFFA6ADBD)
private val bg03 = Color(0xFFBEC5D2)
private val bg04 = Color(0xFFD0D6E1)
private val bg05 = Color(0xFFDFE3ED)
private val bg06 = Color(0xFFEBEEF6)
private val bg07 = Color(0xFFF5F6FB)
private val bg08 = Color(0xFFF6F6F7)

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

// transparent
private val transparent = Color(0x00FFFFFF)

// ripple
private val ripple = Color(0x22000000)

val gray30 = Color(0xFFDFE3ED)
val gray40 = Color(0xFFD0D6E1)
val gray50 = Color(0xFFBEC5D2)
val gray60 = Color(0xFFA6ADBD)
val gray70 = Color(0xFF8F97A7)
val gray80 = Color(0xFF686E7B)
val gray100 = Color(0xFF222222)

val black010 = Color(0x1A000000)
val black015 = Color(0x26000000)    // TODO DRG figma에 없음
val black020 = Color(0x33000000)
val black022 = Color(0x38000000)    // TODO DRG figma에 없음
val black040 = Color(0x66000000)
val black100 = Color(0xFF000000)

val white020 = Color(0x33FFFFFF)
val white060 = Color(0x99FFFFFF)
val white100 = Color(0xFFFFFFFF)

val orange10 = Color(0xFFFFECDB)
val orange50 = Color(0xFFFF7C44)
val orange60 = Color(0xFFFF6827)

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
    text01: Color,
    text02: Color,
    text03: Color,
    text04: Color,
    text05: Color,
    divider01: Color,
    divider02: Color,
    divider03: Color,
    line01: Color,
    line02: Color,
    line03: Color,
    line04: Color,
    bg01: Color,
    bg02: Color,
    bg03: Color,
    bg04: Color,
    bg05: Color,
    bg06: Color,
    bg07: Color,
    bg08: Color,
    error: Color,
    linkAndInfo: Color,
    warning: Color,
    success: Color,
    etc01: Color,
    etc02: Color,
    etc03: Color,
    etc04: Color,
    etc05: Color,
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

    var text01 by mutableStateOf(text01)
        private set

    var text02 by mutableStateOf(text02)
        private set

    var text03 by mutableStateOf(text03)
        private set

    var text04 by mutableStateOf(text04)
        private set

    var text05 by mutableStateOf(text05)
        private set

    var divider01 by mutableStateOf(divider01)
        private set

    var divider02 by mutableStateOf(divider02)
        private set

    var divider03 by mutableStateOf(divider03)
        private set

    var line01 by mutableStateOf(line01)
        private set

    var line02 by mutableStateOf(line02)
        private set

    var line03 by mutableStateOf(line03)
        private set

    var line04 by mutableStateOf(line04)
        private set

    var bg01 by mutableStateOf(bg01)
        private set

    var bg02 by mutableStateOf(bg02)
        private set

    var bg03 by mutableStateOf(bg03)
        private set

    var bg04 by mutableStateOf(bg04)
        private set

    var bg05 by mutableStateOf(bg05)
        private set

    var bg06 by mutableStateOf(bg06)
        private set

    var bg07 by mutableStateOf(bg07)
        private set

    var bg08 by mutableStateOf(bg08)
        private set

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
        text01: Color = this.text01,
        text02: Color = this.text02,
        text03: Color = this.text03,
        text04: Color = this.text04,
        text05: Color = this.text05,
        divider01: Color = this.divider01,
        divider02: Color = this.divider02,
        divider03: Color = this.divider03,
        line01: Color = this.line01,
        line02: Color = this.line02,
        line03: Color = this.line03,
        line04: Color = this.line04,
        bg01: Color = this.bg01,
        bg02: Color = this.bg02,
        bg03: Color = this.bg03,
        bg04: Color = this.bg04,
        bg05: Color = this.bg05,
        bg06: Color = this.bg06,
        bg07: Color = this.bg07,
        bg08: Color = this.bg08,
        error: Color = this.error,
        linkAndInfo: Color = this.linkAndInfo,
        warning: Color = this.warning,
        success: Color = this.success,
        etc01: Color = this.etc01,
        etc02: Color = this.etc02,
        etc03: Color = this.etc03,
        etc04: Color = this.etc04,
        etc05: Color = this.etc05,
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
        text01,
        text02,
        text03,
        text04,
        text05,
        divider01,
        divider02,
        divider03,
        line01,
        line02,
        line03,
        line04,
        bg01,
        bg02,
        bg03,
        bg04,
        bg05,
        bg06,
        bg07,
        bg08,
        error,
        linkAndInfo,
        warning,
        success,
        etc01,
        etc02,
        etc03,
        etc04,
        etc05,
        transparent,
        ripple,
        isLight
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
        text01 = other.text01
        text02 = other.text02
        text03 = other.text03
        text04 = other.text04
        text05 = other.text05
        divider01 = other.divider01
        divider02 = other.divider02
        divider03 = other.divider03
        line01 = other.line01
        line02 = other.line02
        line03 = other.line03
        line04 = other.line04
        bg01 = other.bg01
        bg02 = other.bg02
        bg03 = other.bg03
        bg04 = other.bg04
        bg05 = other.bg05
        bg06 = other.bg06
        bg07 = other.bg07
        bg08 = other.bg08
        error = other.error
        linkAndInfo = other.linkAndInfo
        warning = other.warning
        success = other.success
        etc01 = other.etc01
        etc02 = other.etc02
        etc03 = other.etc03
        etc04 = other.etc04
        etc05 = other.etc05
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
    text01: Color = text01Light,
    text02: Color = text02Light,
    text03: Color = text03Light,
    text04: Color = text04Light,
    text05: Color = text05Light,
    divider01: Color = divider01Light,
    divider02: Color = divider02Light,
    divider03: Color = divider03Light,
    line01: Color = line01Light,
    line02: Color = line02Light,
    line03: Color = line03Light,
    line04: Color = line04Light,
    bg01: Color = bg01Light,
    bg02: Color = bg02Light,
    bg03: Color = bg03Light,
    bg04: Color = bg04Light,
    bg05: Color = bg05Light,
    bg06: Color = bg06Light,
    bg07: Color = bg07Light,
    bg08: Color = bg08Light,
    error: Color = errorLight,
    linkAndInfo: Color = linkAndInfoLight,
    warning: Color = warningLight,
    success: Color = successLight,
    etc01: Color = etc01Light,
    etc02: Color = etc02Light,
    etc03: Color = etc03Light,
    etc04: Color = etc04Light,
    etc05: Color = etc05Light,
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
    text01 = text01,
    text02 = text02,
    text03 = text03,
    text04 = text04,
    text05 = text05,
    divider01 = divider01,
    divider02 = divider02,
    divider03 = divider03,
    line01 = line01,
    line02 = line02,
    line03 = line03,
    line04 = line04,
    bg01 = bg01,
    bg02 = bg02,
    bg03 = bg03,
    bg04 = bg04,
    bg05 = bg05,
    bg06 = bg06,
    bg07 = bg07,
    bg08 = bg08,
    error = error,
    linkAndInfo = linkAndInfo,
    warning = warning,
    success = success,
    etc01 = etc01,
    etc02 = etc02,
    etc03 = etc03,
    etc04 = etc04,
    etc05 = etc05,
    transparent = transparent,
    ripple = ripple,
    isLight = true
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
    text01: Color = text01Dark,
    text02: Color = text02Dark,
    text03: Color = text03Dark,
    text04: Color = text04Dark,
    text05: Color = text05Dark,
    divider01: Color = divider01Dark,
    divider02: Color = divider02Dark,
    divider03: Color = divider03Dark,
    line01: Color = line01Dark,
    line02: Color = line02Dark,
    line03: Color = line03Dark,
    line04: Color = line04Dark,
    bg01: Color = bg01Dark,
    bg02: Color = bg02Dark,
    bg03: Color = bg03Dark,
    bg04: Color = bg04Dark,
    bg05: Color = bg05Dark,
    bg06: Color = bg06Dark,
    bg07: Color = bg07Dark,
    bg08: Color = bg08Dark,
    error: Color = errorDark,
    linkAndInfo: Color = linkAndInfoDark,
    warning: Color = warningDark,
    success: Color = successDark,
    etc01: Color = etc01Dark,
    etc02: Color = etc02Dark,
    etc03: Color = etc03Dark,
    etc04: Color = etc04Dark,
    etc05: Color = etc05Dark,
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
    text01 = text01,
    text02 = text02,
    text03 = text03,
    text04 = text04,
    text05 = text05,
    divider01 = divider01,
    divider02 = divider02,
    divider03 = divider03,
    line01 = line01,
    line02 = line02,
    line03 = line03,
    line04 = line04,
    bg01 = bg01,
    bg02 = bg02,
    bg03 = bg03,
    bg04 = bg04,
    bg05 = bg05,
    bg06 = bg06,
    bg07 = bg07,
    bg08 = bg08,
    error = error,
    linkAndInfo = linkAndInfo,
    warning = warning,
    success = success,
    etc01 = etc01,
    etc02 = etc02,
    etc03 = etc03,
    etc04 = etc04,
    etc05 = etc05,
    transparent = transparent,
    ripple = ripple,
    isLight = false
)

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
private val text01Light = text01
private val text02Light = text02
private val text03Light = text03
private val text04Light = text04
private val text05Light = text05
private val divider01Light = divider01
private val divider02Light = divider02
private val divider03Light = divider03
private val line01Light = line01
private val line02Light = line02
private val line03Light = line03
private val line04Light = line04
private val bg01Light = bg01
private val bg02Light = bg02
private val bg03Light = bg03
private val bg04Light = bg04
private val bg05Light = bg05
private val bg06Light = bg06
private val bg07Light = bg07
private val bg08Light = bg08
private val errorLight = error
private val linkAndInfoLight = linkAndInfo
private val warningLight = warning
private val successLight = success
private val etc01Light = etc01
private val etc02Light = etc02
private val etc03Light = etc03
private val etc04Light = etc04
private val etc05Light = etc05
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
private val text01Dark = text01
private val text02Dark = text02
private val text03Dark = text03
private val text04Dark = text04
private val text05Dark = text05
private val divider01Dark = divider01
private val divider02Dark = divider02
private val divider03Dark = divider03
private val line01Dark = line01
private val line02Dark = line02
private val line03Dark = line03
private val line04Dark = line04
private val bg01Dark = bg01
private val bg02Dark = bg02
private val bg03Dark = bg03
private val bg04Dark = bg04
private val bg05Dark = bg05
private val bg06Dark = bg06
private val bg07Dark = bg07
private val bg08Dark = bg08
private val errorDark = error
private val linkAndInfoDark = linkAndInfo
private val warningDark = warning
private val successDark = success
private val etc01Dark = etc01
private val etc02Dark = etc02
private val etc03Dark = etc03
private val etc04Dark = etc04
private val etc05Dark = etc05
private val transparentDark = transparent
private val rippleDark = ripple
