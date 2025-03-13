package net.deali.designsystem.internal.placeholderimage

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor

internal object PlaceholderImageDefaults {
    @Composable
    fun backgroundColor(colorState: PlaceholderColorState) = when (colorState) {
        PlaceholderColorState.WHITE -> DealiColor.primary04
        PlaceholderColorState.GRAY -> DealiColor.g20
    }

    @Composable
    fun placeholderColor(colorState: PlaceholderColorState) = when (colorState) {
        PlaceholderColorState.WHITE -> DealiColor.g20
        PlaceholderColorState.GRAY -> DealiColor.primary04
    }

    @Composable
    fun placeholder(
        state: PlaceholderState,
    ) = when (state) {
        PlaceholderState.GOODS -> R.drawable.ic_empty40
        PlaceholderState.STORE -> R.drawable.ic_home_filled
    }

    /**
     * 아이콘 사이즈 계산
     * 1. 이미지 컴포저블이 정사각형일 경우
     * - 70dp 이하 -> 이미지 컴포저블 가로의 1/2 크기로 아이콘 사이즈로 지정
     * - 70dp 이상 -> 이미지 컴포저블 가로의 1/2.5 크기로 아이콘 사이즈로 지정
     *
     * 2. 이미지 컴포저블이 직사각형일 경우 (1:1 아이콘을 3:4 비율로 변경)
     * - 이미지 컴포저블 가로의 1/4 크기로 아이콘 가로 사이즈 지정
     */
    @Composable
    fun placeholderSize(
        sizes: Pair<Dp, Dp>,
    ): Pair<Dp, Dp> {
        val (parentWidth, parentHeight) = sizes
        val parentRatio = parentWidth / parentHeight

        val placeholderRatio = if (parentRatio == 1f) {
            if (parentWidth <= 70.dp) 2f else 2.5f
        } else {
            4f
        }

        val placeholderRatioCorrection = if (parentRatio == 1f) 1f else 4 / 3f

        val width = parentWidth / placeholderRatio * placeholderRatioCorrection
        val height = width * placeholderRatioCorrection

        return width to height
    }
}

/**
 * 색상 상태를 나타내는 enum class
 */
enum class PlaceholderColorState {
    /**
     * 배경 흰색 / 아이콘 회색
     */
    WHITE,

    /**
     * 배경 회색 / 아이콘 흰색
     */
    GRAY,
}

/**
 * placeholder 아이콘 상태를 나타내는 enum class
 */
enum class PlaceholderState {
    GOODS,
    STORE,
}
