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
import net.deali.designsystem.component.chipsFilledDepthMedium01
import net.deali.designsystem.component.chipsFilledImageDepthMedium01
import net.deali.designsystem.component.chipsFilledImageMedium01
import net.deali.designsystem.component.chipsFilledMedium01
import net.deali.designsystem.component.chipsFilledSquareMedium01
import net.deali.designsystem.component.chipsFilledSquareMedium02
import net.deali.designsystem.component.chipsOutlineImageMedium01
import net.deali.designsystem.component.chipsOutlineMedium01
import net.deali.designsystem.component.chipsOutlineMedium02
import net.deali.designsystem.component.chipsSquareBoldMedium01
import net.deali.designsystem.theme.DealiColor

@Composable
fun MediumChipsSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipsOutlineMedium01Samples() }
        item { ChipsOutlineMedium02Samples() }
        item { ChipsSquareBoldMedium01Samples() }
        item { ChipsFilledMedium01Samples() }
        item { ChipsFilledSquareMedium01Samples() }
        item { ChipsFilledSquareMedium02Samples() }
        item { ChipsFilledDepthMedium01Samples() }
        item { ChipsFilledImageMedium01Samples() }
        item { ChipsFilledImageDepthMedium01Samples() }
        item { ChipsOutlineImageMedium01Samples() }
    }
}

@Composable
private fun ChipsOutlineMedium01Samples() {
    ChipsSampleLayout(title = "chipsOutlineMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsOutlineMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsOutlineMedium02Samples() {
    ChipsSampleLayout(title = "chipsOutlineMedium02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMedium02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsOutlineMedium02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsOutlineMedium02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}


@Composable
private fun ChipsSquareBoldMedium01Samples() {
    ChipsSampleLayout(title = "chipsSquareBoldMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledMedium01Samples() {
    ChipsSampleLayout(title = "chipsFilledMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipsFilledSquareMedium01Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareMedium02Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareMedium02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMedium02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMedium02(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipsFilledDepthMedium01Samples() {
    ChipsSampleLayout(title = "chipsFilledDepthMedium01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark1, "First", null),
                    Triple(R.drawable.ic_bookmark1, "Second", null),
                    Triple(R.drawable.ic_bookmark1, "Third", null),
                ),
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark1, "Third", R.drawable.ic_check),
                ),
            )

            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark1, "First", null),
                    Triple(R.drawable.ic_bookmark1, "Second", null),
                    Triple(R.drawable.ic_bookmark1, "Third", null),
                ),
                selected = true,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark1, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark1, "First", null),
                    Triple(R.drawable.ic_bookmark1, "Second", null),
                    Triple(R.drawable.ic_bookmark1, "Third", null),
                ),
                enabled = false,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipsFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark1, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipsFilledImageMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledImageMedium01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsFilledImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledImageMedium01(
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
private fun ChipsFilledImageDepthMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageDepthMedium01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipsFilledImageDepthMedium01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipsFilledImageDepthMedium01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipsFilledImageDepthMedium01(
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
private fun ChipsOutlineImageMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsOutlineImageMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineImageMedium01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsOutlineImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineImageMedium01(
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
