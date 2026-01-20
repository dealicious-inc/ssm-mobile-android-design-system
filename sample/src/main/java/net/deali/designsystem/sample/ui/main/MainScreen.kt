package net.deali.designsystem.sample.ui.main

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.btnFilledTonalLarge01
import net.deali.designsystem.internal.topbar.TOP_BAR_HEIGHT
import net.deali.designsystem.sample.data.model.Screen
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.topbar.rememberTopBarNestedScrollConnection

@Composable
fun MainScreen(
    tokens: List<Screen>,
    atoms: List<Screen>,
    molecules: List<Screen>,
    others: List<Screen>,
    onClickMenu: (screen: Screen) -> Unit,
) {
    val lazyGridState = rememberLazyGridState()
    val nestedScrollConnection = rememberTopBarNestedScrollConnection(
        topBarHeightPx = with(LocalDensity.current) { TOP_BAR_HEIGHT.toPx() },
        scrollState = lazyGridState,
    )

    val topBarOffset by animateFloatAsState(
        targetValue = nestedScrollConnection.topBarOffset,
        label = ""
    )

    Box(
        modifier = Modifier
            .nestedScroll(nestedScrollConnection)
    ) {
        Column {
            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer { translationY = topBarOffset },
                state = lazyGridState,
                columns = GridCells.Fixed(2),
            ) {
                item(
                    span = { GridItemSpan(2) }
                ) {
                    DealiText(
                        modifier = Modifier.padding(8.dp),
                        text = "Tokens",
                        style = DealiFont.sh3sb16,
                        color = DealiColor.g100,
                    )
                }

                itemsIndexed(tokens) { index, item ->
                    btnFilledTonalLarge01(
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f),
                        text = item.route,
                        onClick = { onClickMenu(item) }
                    )
                }

                item(
                    span = { GridItemSpan(2) }
                ) {
                    DealiText(
                        modifier = Modifier.padding(8.dp),
                        text = "Atoms",
                        style = DealiFont.sh3sb16,
                        color = DealiColor.g100,
                    )
                }

                itemsIndexed(atoms) { index, item ->
                    btnFilledTonalLarge01(
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f),
                        onClick = { onClickMenu(item) },
                        text = item.route.apply {
                            first().uppercaseChar()
                        }
                    )
                }

                item(
                    span = { GridItemSpan(2) }
                ) {
                    DealiText(
                        modifier = Modifier.padding(8.dp),
                        text = "Molecules",
                        style = DealiFont.sh3sb16,
                        color = DealiColor.g100,
                    )
                }

                itemsIndexed(molecules) { index, item ->
                    btnFilledTonalLarge01(
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f),
                        text = item.route,
                        onClick = { onClickMenu(item) }
                    )
                }

                item(
                    span = { GridItemSpan(2) }
                ) {
                    DealiText(
                        modifier = Modifier.padding(8.dp),
                        text = "Others",
                        style = DealiFont.sh3sb16,
                        color = DealiColor.g100,
                    )
                }

                itemsIndexed(others) { index, item ->
                    btnFilledTonalLarge01(
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f),
                        onClick = { onClickMenu(item) },
                        text = item.route.apply {
                            first().uppercaseChar()
                        }
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(TOP_BAR_HEIGHT)
                .padding(start = 20.dp)
                .graphicsLayer { translationY = topBarOffset - TOP_BAR_HEIGHT.toPx() }
        ) {
            DealiText(
                modifier = Modifier.align(Alignment.CenterStart),
                text = "Deali Design System Sample",
                style = DealiFont.sh3sb16,
                color = DealiColor.primary05,
            )
        }
    }
}

@Composable
@Preview(showBackground = true, widthDp = 360, backgroundColor = 0XFFFFFF)
private fun MainScreenPreview() {
    MainScreen(
        tokens = listOf(
            Screen.Typography,
            Screen.Colors,
            Screen.Shadows,
            Screen.Icons,
        ),
        atoms = listOf(
            Screen.Buttons,
            Screen.ButtonsRound,
            Screen.TextLink,
            Screen.Chips,
            Screen.ImageChips,
            Screen.CheckBox,
            Screen.CheckCircle,
            Screen.RadioButton,
            Screen.Switch,
            Screen.TextInput,
            Screen.SearchInput,
            Screen.TextArea,
            Screen.Dropdown,
            Screen.Indicator,
            Screen.Rating,
            Screen.Tooltip,
            Screen.Tag,
            Screen.Divider,
        ),
        molecules = listOf(
            Screen.TopBar,
            Screen.TabBar,
            Screen.SearchBar,
            Screen.FilterBar,
            Screen.ErrorCase,
            Screen.BottomSheet,
            Screen.DateTimePicker,
            Screen.TextInputWithButton,
            Screen.TextAreaButton,
            Screen.SearchInputWithTag,
            Screen.Alert,
            Screen.Slider,
            Screen.LabeledText,
            Screen.Accordion,
            Screen.Notice,
            Screen.PlaceholderImage,
        ),
        others = listOf(
            Screen.SwipeRefresh,
        ),
        onClickMenu = {},
    )
}
