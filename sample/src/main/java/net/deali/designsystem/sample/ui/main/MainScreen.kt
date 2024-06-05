package net.deali.designsystem.sample.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.btnFilledTonalLarge01
import net.deali.designsystem.sample.data.model.Screen
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun MainScreen(
    tokens: List<Screen>,
    atoms: List<Screen>,
    molecules: List<Screen>,
    others: List<Screen>,
    onClickMenu: (screen: Screen) -> Unit,
) {
    NavigationContainer(
        navigationBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(start = 20.dp)
            ) {
                DealiText(
                    modifier = Modifier.align(Alignment.CenterStart),
                    text = "Deali Design System Sample",
                    style = DealiFont.sh3sb16,
                    color = DealiColor.primary05,
                )
            }
        }
    ) {
        val lazyGridState = rememberLazyGridState()

        LazyVerticalGrid(
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
                    onClick = { onClickMenu(item) },
                    text = item.route
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
                    onClick = { onClickMenu(item) },
                    text = item.route
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
}

@Composable
@Preview(showBackground = true, widthDp = 360, backgroundColor = 0XFFFFFF)
private fun MainScreenPreview() {
    MainScreen(
        tokens = listOf(
            Screen.Typography,
            Screen.Colors,
            Screen.Indentations,
            Screen.Shadows,
            Screen.CornerRadius,
            Screen.Icons,
        ),
        atoms = listOf(
            Screen.Buttons,
            Screen.Chips,
            Screen.CheckBox,
            Screen.CheckCircle,
            Screen.CheckLine,
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
            Screen.Popup,
            Screen.Slider,
        ),
        others = listOf(
            Screen.SwipeRefresh,
        ),
        onClickMenu = {},
    )
}
