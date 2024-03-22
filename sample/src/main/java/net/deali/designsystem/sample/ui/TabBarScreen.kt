package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.CheckBox
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TabBarLayout
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
        var selectedIndex by remember { mutableStateOf(0) }
        val titles = listOf("탭 타이틀1","탭 타이틀2","탭 타이틀3","탭 타이틀4")
        
        TabBarLayout(
            tabTitles = titles,
            onSelectTab = remember {
                { selectedIndex = it }
            }
        ) { page ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(DealiColor.g60)
            ) {
                DealiText(
                    modifier = Modifier.align(Alignment.Center),
                    text = "${titles[page]}\n(index: $page)",
                    style = DealiFont.h1sb32,
                    color = DealiColor.g100,
                )

            }
        }
    }
}

@Composable
@Preview
private fun PreviewTabBarLayout() {
    val titles = listOf("탭 타이틀1","탭 타이틀2","탭 타이틀3","탭 타이틀4")
    TabBarLayout(
        tabTitles = titles,
        onSelectTab = {}
    ) { page ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g60)
        ) {
            DealiText(
                modifier = Modifier.align(Alignment.Center),
                text = "${titles[page]}\n(index: $page)",
                style = DealiFont.h1sb32,
                color = DealiColor.g100,
            )

        }
    }
}
