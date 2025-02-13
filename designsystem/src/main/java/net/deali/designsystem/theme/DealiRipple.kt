package net.deali.designsystem.theme

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.RippleConfiguration
import androidx.compose.material.ripple.RippleAlpha

/**
 * RippleAlpha의 최대값은 0.5f임. 그 이상은 0.5f로 바뀜.
 * 사용하는 컬러에 Alpha값이 있더라도, RippleAlpha를 통해 컬러 Alpha값은 무시하고 RippleAlpha값으로 변경됨.
 */
private val dealiRippleAlpha = RippleAlpha(
    pressedAlpha = 0.5f,
    focusedAlpha = 0.5f,
    draggedAlpha = 0.5f,
    hoveredAlpha = 0.5f,
)

@OptIn(ExperimentalMaterialApi::class)
internal val dealiRippleConfiguration = RippleConfiguration(color = DealiColor.ripple, dealiRippleAlpha)
