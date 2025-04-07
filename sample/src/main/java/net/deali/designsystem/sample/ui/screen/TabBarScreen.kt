package net.deali.designsystem.sample.ui.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.ImgChip
import net.deali.designsystem.component.Tab
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.VerticalSpacer
import net.deali.designsystem.component.tabBarChip01
import net.deali.designsystem.component.tabBarChip01Layout
import net.deali.designsystem.component.tabBarChip02
import net.deali.designsystem.component.tabBarImgChip
import net.deali.designsystem.component.tabBarSegment01Layout
import net.deali.designsystem.component.tabBarSlider01
import net.deali.designsystem.component.tabBarSlider01Layout
import net.deali.designsystem.component.tabBarSlider02
import net.deali.designsystem.component.tabBarSlider02Layout
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

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

            var tabBarImageChipIndex by remember { mutableIntStateOf(0) }
            val context = LocalContext.current
            var toast: Toast? = null
            val imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"

            val imgChips = listOf(
                ImgChip(
                    imageUrl = imageUrl,
                    text = "이미지칩0",
                ),

                ImgChip(
                    imageUrl = imageUrl,
                    text = "이미지칩1",
                    rightIcon = R.drawable.ic_alarm_filled,
                    onRightIconClick = {
                        toast?.cancel()
                        toast = Toast.makeText(
                            context,
                            "Icon clicked 1",
                            Toast.LENGTH_SHORT
                        ).apply { show() }
                    }
                ),

                ImgChip(
                    imageUrl = "",
                    placeholder = R.drawable.ic_home_filled,
                    text = "이미지칩2",
                    rightIcon = R.drawable.ic_x,
                    onRightIconClick = {
                        toast?.cancel()
                        toast = Toast.makeText(
                            context,
                            "Icon clicked 2",
                            Toast.LENGTH_SHORT
                        ).apply { show() }
                    }
                )
            ) + List(5) { i ->
                ImgChip(
                    imageUrl = imageUrl,
                    text = "이미지칩${i + 3}",
                    subContent = {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(2.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon16(
                                iconRes = R.drawable.ic_arrow_close_1_filled,
                                color = DealiColor.primary01
                            )
                            DealiText(
                                text = "999%",
                                style = DealiFont.b2sb14,
                                color = DealiColor.primary01
                            )
                        }
                    }
                )
            }

            tabBarImgChip(
                imgChips = imgChips,
                currentIndex = tabBarImageChipIndex,
                onSelectTab = {
                    tabBarImageChipIndex = it
                }
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
                            .height(150.dp)
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
