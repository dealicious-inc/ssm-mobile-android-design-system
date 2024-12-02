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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Tab
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.tabBarChip01
import net.deali.designsystem.component.tabBarChip01Layout
import net.deali.designsystem.component.tabBarChip02
import net.deali.designsystem.component.tabBarImageChip
import net.deali.designsystem.component.tabBarSegment01Layout
import net.deali.designsystem.component.tabBarSlider01
import net.deali.designsystem.component.tabBarSlider01Layout
import net.deali.designsystem.component.tabBarSlider02
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
            TopBar(
                title = "Tab Bar",
                onBack = onBackPress,
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g30)
                .verticalScroll(rememberScrollState())
        ) {
            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "tabBarSlider",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            val tabsSlide = List(15) { index ->
                "Tab$index"
            }

            var tabBarSlider01Index by remember { mutableIntStateOf(1) }
            tabBarSlider01(
                tabTitles = tabsSlide,
                currentIndex = tabBarSlider01Index,
                onSelectTab = {
                    tabBarSlider01Index = it
                },
            )

            var tabBarSlider02Index by remember { mutableIntStateOf(1) }
            tabBarSlider02(
                tabTitles = tabsSlide,
                currentIndex = tabBarSlider02Index,
                onSelectTab = {
                    tabBarSlider02Index = it
                },
            )

            var tabBarChip01Index by remember { mutableIntStateOf(1) }
            tabBarChip01(
                tabTitles = tabsSlide,
                currentIndex = tabBarChip01Index,
                onSelectTab = {
                    tabBarChip01Index = it
                },
            )

            var tabBarChip02Index by remember { mutableIntStateOf(1) }
            tabBarChip02(
                tabTitles = tabsSlide,
                currentIndex = tabBarChip02Index,
                onSelectTab = {
                    tabBarChip02Index = it
                },
            )

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "tabBarImageChip",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            var tabBarImageChipIndex by remember { mutableIntStateOf(1) }
            val imageUrl =
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
            tabBarImageChip(
                imageChipSets = listOf(
                    setOf("이미지칩1", imageUrl),
                    setOf("이미지칩2", imageUrl),
                    setOf("이미지칩3", imageUrl),
                    setOf("이미지칩4", imageUrl),
                    setOf("이미지칩5", imageUrl),
                    setOf("이미지칩6", imageUrl),
                    setOf("이미지칩7", imageUrl),
                    setOf("이미지칩8", imageUrl),
                ),
                currentIndex = tabBarImageChipIndex,
                onSelectTab = {
                    tabBarImageChipIndex = it
                },
            )

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "고정 탭바 Layout",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            val tabs = List(3) { index ->
                Tab("Title$index", index == 1)
            }

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

            val tabsScrollable = List(7) { index ->
                Tab("Title$index", index == 1)
            }

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바(primary01) Layout",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            tabBarSlider01Layout(
                tabs = tabsScrollable,
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
                        text = tabsScrollable[page].text,
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )
                }
            }

            VerticalSpacer(height = 40.dp)

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "스크롤 탭바(g100) Layout",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            tabBarSlider02Layout(
                tabs = tabsScrollable,
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
                        text = tabsScrollable[page].text,
                        style = DealiFont.h1sb32,
                        color = DealiColor.g100,
                    )
                }
            }

            VerticalSpacer(height = 40.dp)

            val subTitles = List(9) { index ->
                "Sub$index"
            }

            DealiText(
                modifier = Modifier.padding(10.dp),
                text = "2뎁스 탭바 Layout",
                style = DealiFont.sh1sb20,
                color = DealiColor.g100,
            )

            tabBarSlider02Layout(
                tabs = tabsScrollable,
                onSelectTab = {},
                userSwipeEnabled = true,
            ) { page ->

                tabBarChip01Layout(
                    tabTitles = subTitles,
                    userSwipeEnabled = false,
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
                            text = "${tabsScrollable[page]}/${subTitles[subPage]}",
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
