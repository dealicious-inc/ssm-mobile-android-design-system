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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.IndicatorPinkDot
import net.deali.designsystem.component.IndicatorWhiteDot
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.IndicatorNumber
import net.deali.designsystem.component.IndicatorPagination
import net.deali.designsystem.component.rememberPageDataState
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.blue70
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray50
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.white100

@Composable
fun NavigationScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Navigation",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = gray20),
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
    Container(
        name = "Indicator",
        backgroundColor = gray50
    ) {
        val colors = listOf(
            pink60, blue70, gray100, black100, white100
        )

        val pagerDataState = rememberPageDataState(
            initialPageCount = colors.size
        )
        val pagerState = rememberPagerState(
            pagerDataState.maxCount / 2
        )

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

        IndicatorNumber(
            modifier = Modifier
                .padding(6.dp),
            pageCount = pagerDataState.pageCount,
            pagerDataState = pagerDataState,
            pagerState = pagerState
        )

        IndicatorPagination(
            modifier = Modifier
                .padding(6.dp),
            pageCount = pagerDataState.pageCount,
            pagerDataState = pagerDataState,
            pagerState = pagerState
        )
    }
}

@Composable
private fun Container(
    name: String,
    backgroundColor: Color = gray10,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(white100)
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(6.dp))
                .background(backgroundColor)
                .border(1.dp, gray30, RoundedCornerShape(6.dp)),
            content = content,
            horizontalAlignment = Alignment.CenterHorizontally
        )

        Spacer(modifier = Modifier.height(10.dp))

        DealiText(
            text = name,
            style = AppTheme.typography.b1r15,
            color = gray100
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
