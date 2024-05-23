package net.deali.designsystem.sample.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.IndicatorMedium
import net.deali.designsystem.component.IndicatorPinkDot
import net.deali.designsystem.component.IndicatorSmall
import net.deali.designsystem.component.IndicatorTransparent
import net.deali.designsystem.component.IndicatorWhiteDot
import net.deali.designsystem.component.rememberPageDataState
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun NavigationScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Navigation",
                onBack = onBackPress,
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DealiColor.g10),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            item {
                PagerContainer()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun PagerContainer() {
    val colors = listOf(
        DealiColor.primary01,
        DealiColor.secondary01,
        DealiColor.g100,
        DealiColor.g30,
        DealiColor.g100
    )

    val pagerDataState = rememberPageDataState(
        initialPageCount = colors.size
    )
    val pagerState = rememberPagerState(
        pagerDataState.maxCount / 2
    )

    var currentIndex by remember { mutableStateOf(0) }

    Container(
        name = "Indicator",
        backgroundColor = DealiColor.g40
    ) {
        HorizontalPager(
            pageCount = pagerDataState.pagerCount,
            state = pagerState
        ) { index ->
            Spacer(
                modifier = Modifier
                    .background(colors[pagerDataState.pageMapper(index)])
                    .aspectRatio(1f)
            )
        }

        IndicatorPinkDot(
            modifier = Modifier
                .padding(6.dp),
            pagerState = pagerState,
            pageCount = pagerDataState.pageCount,
            pageIndexMapping = { currentPage ->
                pagerDataState.pageMapper(currentPage)
            }
        )

        IndicatorWhiteDot(
            modifier = Modifier
                .padding(6.dp),
            pagerState = pagerState,
            pageCount = pagerDataState.pageCount,
            pageIndexMapping = { currentPage ->
                pagerDataState.pageMapper(currentPage)
            }
        )

        IndicatorTransparent(
            modifier = Modifier
                .padding(6.dp),
            currentIndex = currentIndex,
            totalCount = colors.size,
        )

        IndicatorMedium(
            modifier = Modifier
                .padding(6.dp),
            currentIndex = currentIndex,
            totalCount = colors.size,
        )

        IndicatorSmall(
            modifier = Modifier
                .padding(6.dp),
            currentIndex = currentIndex,
            totalCount = colors.size,
        )
    }

    LaunchedEffect(key1 = pagerState.currentPage) {
        currentIndex = ((pagerState.currentPage - pagerDataState.startIndex) % colors.size)
    }
}

@Composable
private fun Container(
    name: String,
    backgroundColor: Color = DealiColor.g10,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(DealiColor.primary04)
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(6.dp))
                .background(backgroundColor)
                .border(1.dp, DealiColor.g30, RoundedCornerShape(6.dp)),
            content = content,
            horizontalAlignment = Alignment.CenterHorizontally
        )

        Spacer(modifier = Modifier.height(10.dp))

        DealiText(
            text = name,
            style = DealiFont.b1r15,
            color = DealiColor.g100
        )
    }
}

@Composable
@Preview
private fun NavigationScreenScreenPreview() {
    NavigationScreen(
        onBackPress = {}
    )
}
