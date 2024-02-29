package net.deali.designsystem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SwipeRefresh(
    isRefreshing: Boolean,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    onRefresh: () -> Unit = {},
    content: @Composable () -> Unit
) {
    val pullRefreshState = rememberPullRefreshState(
        refreshing = isRefreshing,
        onRefresh = onRefresh,
        refreshThreshold = 100.dp, // 얼마만큼 땡겨야지 refresh 동작되게 하는지. 땡기는 최대 거리값은 아닌 것으로 보임.
        refreshingOffset = 100.dp, // 땡긴 이후에 로딩중에 인디케이터의 위치
    )

    Box(
        modifier = modifier
            .pullRefresh(
                state = pullRefreshState,
                enabled = isEnabled
            )
    ) {
        content()

        PullRefreshIndicator(
            modifier = Modifier
                .align(Alignment.TopCenter),
            state = pullRefreshState,
            refreshing = isRefreshing,
            scale = true, // 땡기거나 올릴때 크기가 커졌다 작아졌다 여부
            contentColor = DealiColor.primary01
        )
    }
}
