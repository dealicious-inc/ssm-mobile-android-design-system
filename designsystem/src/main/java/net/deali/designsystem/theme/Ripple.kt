package net.deali.designsystem.theme

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.RippleConfiguration
import androidx.compose.material.ripple.RippleAlpha

/**
 * RippleAlpha의 최대값은 0.5f임. 그 이상은 0.5f로 바뀜.
 * 사용하는 컬러에 Alpha값이 있더라도, RippleAlpha를 통해 Alpha값은 무시당함.
 */
private val rippleAlpha = RippleAlpha(
    pressedAlpha = 0.5f,
    focusedAlpha = 0.5f,
    draggedAlpha = 0.5f,
    hoveredAlpha = 0.5f,
)

@OptIn(ExperimentalMaterialApi::class)
internal val myRippleConfiguration = RippleConfiguration(color = DealiColor.ripple, rippleAlpha)
