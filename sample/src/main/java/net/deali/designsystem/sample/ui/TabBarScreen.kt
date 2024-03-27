package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.SubTabBarLayout
import net.deali.designsystem.component.TabBarLayout
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun TabBarScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Tab Bar",
                onBack = onBackPress,
            )
        }
    ) {
        val titles1 = listOf("Fixed0", "Fixed1", "Fixed2")
        val titles2 = listOf(
            "Scrollable0", "Scrollable1", "Scrollable2", "Scrollable3", "Scrollable4", "Scrollable5"
        )
        val titles3 = listOf("NoSwipe0", "NoSwipe1", "NoSwipe2", "NoSwipe3", "NoSwipe4", "NoSwipe5")
        val titles4 = listOf("Main0", "Main1", "Main2", "Main3")
        val titles5 = listOf("Sub0", "Sub1", "Sub2", "Sub3")
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g30)
                .verticalScroll(scrollState)
        ) {
            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "고정 탭바",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            TabBarLayout(
                tabTitles = titles1,
                onSelectTab = {},
                isScrollableTab = false,
                userSwipeEnabled = false,
            ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(DealiColor.primary03)
                ) {
                    DealiText(
                        modifier = Modifier.align(Alignment.Center),
                        text = titles1[page],
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )

                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바1",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            TabBarLayout(
                tabTitles = titles2,
                onSelectTab = {},
                isScrollableTab = true,
                userSwipeEnabled = true,
            ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(DealiColor.primary03)
                ) {
                    DealiText(
                        modifier = Modifier.align(Alignment.Center),
                        text = titles2[page],
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )

                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바2",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            TabBarLayout(
                tabTitles = titles3,
                onSelectTab = {},
                isScrollableTab = true,
                userSwipeEnabled = false,

                ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(DealiColor.primary03)
                ) {
                    DealiText(
                        modifier = Modifier.align(Alignment.Center),
                        text = titles3[page],
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )

                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바3",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            TabBarLayout(
                tabTitles = titles4,
                onSelectTab = {},
                isScrollableTab = true,
                userSwipeEnabled = true,
            ) { page ->

                SubTabBarLayout(
                    tabTitles = titles5,
                    onSelectTab = {},
                ) { subPage ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .background(DealiColor.primary03)
                    ) {
                        DealiText(
                            modifier = Modifier.align(Alignment.Center),
                            text = "${titles4[page]}/${titles5[subPage]}",
                            style = DealiFont.h1sb32,
                            color = DealiColor.g100,
                        )

                    }
                }
            }

            VerticalSpacer(height = 40.dp)
        }
    }
}

@Composable
@Preview
private fun PreviewTabBarScreenLayout() {
    TabBarScreen {}
}
