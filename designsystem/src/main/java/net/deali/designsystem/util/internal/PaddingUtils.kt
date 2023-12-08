package net.deali.designsystem.util.internal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * 두 [PaddingValues]를 쉽게 합칠 수 있는 operator function.
 *
 * ```
 * val p1 = PaddingValues()
 * val p2 = PaddingValues()
 * val newPadding = p1 + p2
 * ```
 */
@Stable
@Composable
internal operator fun PaddingValues.plus(other: PaddingValues): PaddingValues {
    val self = this
    return with(LocalLayoutDirection.current) {
        PaddingValues(
            start = self.calculateStartPadding(this) + other.calculateStartPadding(this),
            top = self.calculateTopPadding() + other.calculateTopPadding(),
            end = self.calculateEndPadding(this) + other.calculateEndPadding(this),
            bottom = self.calculateBottomPadding() + other.calculateBottomPadding()
        )
    }
}

/**
 * 두 [PaddingValues]를 쉽게 합칠 수 있는 operator function.
 *
 * ```
 * val p1 = PaddingValues()
 * val p2 = PaddingValues()
 * val newPadding = p1 - p2
 * ```
 *
 * 단, 패딩은 0 이하로 내려갈 수 없기 때문에 계산 결과 0보다 작은 패딩 값이 나올 경우 0으로 설정합니다.
 */
@Stable
@Composable
internal operator fun PaddingValues.minus(other: PaddingValues): PaddingValues {
    val self = this
    return with(LocalLayoutDirection.current) {
        PaddingValues(
            start = (self.calculateStartPadding(this) - other.calculateStartPadding(this))
                .coerceAtLeast(0.dp),
            top = (self.calculateTopPadding() - other.calculateTopPadding())
                .coerceAtLeast(0.dp),
            end = (self.calculateEndPadding(this) - other.calculateEndPadding(this))
                .coerceAtLeast(0.dp),
            bottom = (self.calculateBottomPadding() - other.calculateBottomPadding())
                .coerceAtLeast(0.dp)
        )
    }
}

/**
 * 패딩에서 수평 방향의 패딩 값만 추출해 [PaddingValues]로 반환.
 */
@Stable
@Composable
internal fun PaddingValues.calculateHorizontalPadding(): PaddingValues {
    return with(LocalLayoutDirection.current) {
        PaddingValues(
            start = calculateStartPadding(this),
            end = calculateEndPadding(this)
        )
    }
}

/**
 * 패딩에서 수평 방향의 패딩 값만 추출해 [PaddingValues]로 반환.
 */
@Stable
internal fun PaddingValues.calculateHorizontalPadding(layoutDirection: LayoutDirection): PaddingValues {
    return PaddingValues(
        start = calculateStartPadding(layoutDirection),
        end = calculateEndPadding(layoutDirection)
    )
}

/**
 * 패딩에서 수직 방향의 패딩 값만 추출해 [PaddingValues]로 반환.
 */
@Stable
internal fun PaddingValues.calculateVerticalPadding(): PaddingValues {
    return PaddingValues(
        top = calculateTopPadding(),
        bottom = calculateBottomPadding()
    )
}
