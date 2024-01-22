package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.woong.compose.grid.SimpleGridCells
import io.woong.compose.grid.VerticalGrid
import net.deali.designsystem.R
import net.deali.designsystem.component.chipsFilledDepthLarge01
import net.deali.designsystem.component.chipsFilledImageDepthLarge01
import net.deali.designsystem.component.chipsFilledImageLarge01
import net.deali.designsystem.component.chipsFilledLarge01
import net.deali.designsystem.component.chipsFilledSquareLarge01
import net.deali.designsystem.component.chipsFilledSquareLarge02
import net.deali.designsystem.component.chipsFilledSquareLarge03
import net.deali.designsystem.component.chipsOutlineImageLarge01
import net.deali.designsystem.component.chipsOutlineLarge01
import net.deali.designsystem.component.chipsSquareLarge01
import net.deali.designsystem.theme.DealiColor

@Composable
fun LargeChipsSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipsOutlineLarge01Samples() }
        item { ChipsSquareLarge01Samples() }
        item { ChipsFilledLarge01Samples() }
        item { ChipsFilledSquareLarge01Samples() }
        item { ChipsFilledSquareLarge02Samples() }
        item { ChipsFilledSquareLarge03Samples() }
        item { ChipsFilledDepthLarge01Samples() }
        item { ChipsFilledImageLarge01Samples() }
        item { ChipsFilledImageDepthLarge01Samples() }
        item { ChipsOutlineImageLarge01Samples() }
    }
}

@Composable
private fun ChipsOutlineLarge01Samples() {
    ChipsSampleLayout(title = "chipsOutlineLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    text = "테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트",
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsOutlineLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsOutlineLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsSquareLarge01Samples() {
    ChipsSampleLayout(title = "chipsSquareLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsSquareLarge01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsSquareLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsSquareLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsSquareLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipsFilledLarge01Samples() {
    ChipsSampleLayout(title = "chipsFilledLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLarge01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareLarge01Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareLarge02Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareLarge02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareLarge03Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareLarge03") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLarge03(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLarge03(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledDepthLarge01Samples() {
    ChipsSampleLayout(title = "chipsFilledDepthLarge01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
            )

            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                selected = true,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                enabled = false,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipsFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipsFilledImageLarge01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledImageLarge01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsFilledImageLarge01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledImageLarge01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledImageLarge01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Disabled",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledImageDepthLarge01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageDepthLarge01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipsFilledImageDepthLarge01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipsFilledImageDepthLarge01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipsFilledImageDepthLarge01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Disabled", "Text", "999,999"),
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipsOutlineImageLarge01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsOutlineImageLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineImageLarge01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsOutlineImageLarge01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineImageLarge01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineImageLarge01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Disabled",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}
