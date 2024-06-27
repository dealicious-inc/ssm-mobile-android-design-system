package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
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
import net.deali.designsystem.component.Tab
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.tabBarChip01Layout
import net.deali.designsystem.component.tabBarSegment01Layout
import net.deali.designsystem.component.tabBarSlider01Layout
import net.deali.designsystem.component.tabBarSlider02Layout
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@OptIn(ExperimentalFoundationApi::class)
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
        val tabs = listOf(
            Tab("Title0", false),
            Tab("Title1", true),
            Tab("Title2", false),
        )
        val subTitles = listOf("Sub0", "Sub1", "Sub2", "Sub3", "Sub4")
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

            tabBarSegment01Layout(
                tabs = tabs,
                onSelectTab = {},
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
                        text = tabs[page].text,
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )
                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바(primary01)",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            tabBarSlider01Layout(
                tabs = tabs,
                onSelectTab = {},
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
                        text = tabs[page].text,
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )
                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바(g100)",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            tabBarSlider02Layout(
                tabs = tabs,
                onSelectTab = {},
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
                        text = tabs[page].text,
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )
                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "2뎁스 탭바",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            tabBarSlider02Layout(
                tabs = tabs,
                onSelectTab = {},
                userSwipeEnabled = true,
            ) { page ->

                tabBarChip01Layout(
                    tabTitles = subTitles,
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
                            text = "${tabs[page]}/${subTitles[subPage]}",
                            style = DealiFont.h1sb32,
                            color = DealiColor.g100,
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview
private fun PreviewTabBarScreenLayout() {
    TabBarScreen {}
}
