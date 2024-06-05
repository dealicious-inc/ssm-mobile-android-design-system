package net.deali.designsystem.sample.ui.screen

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
import net.deali.designsystem.component.chipFilledDepthMedium01
import net.deali.designsystem.component.chipFilledImageDepthMedium01
import net.deali.designsystem.component.chipFilledImageMedium01
import net.deali.designsystem.component.chipFilledMedium01
import net.deali.designsystem.component.chipFilledSquareMedium01
import net.deali.designsystem.component.chipFilledSquareMedium02
import net.deali.designsystem.component.chipOutlineImageMedium01
import net.deali.designsystem.component.chipOutlineMedium01
import net.deali.designsystem.component.chipOutlineMedium02
import net.deali.designsystem.component.chipOutlineSquareMedium01
import net.deali.designsystem.theme.DealiColor

@Composable
fun MediumChipSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipOutlineMedium01Samples() }
        item { ChipOutlineMedium02Samples() }
        item { ChipSquareBoldMedium01Samples() }
        item { ChipFilledMedium01Samples() }
        item { ChipFilledSquareMedium01Samples() }
        item { ChipFilledSquareMedium02Samples() }
        item { ChipFilledDepthMedium01Samples() }
        item { ChipFilledImageMedium01Samples() }
        item { ChipFilledImageDepthMedium01Samples() }
        item { ChipOutlineImageMedium01Samples() }
    }
}

@Composable
private fun ChipOutlineMedium01Samples() {
    ChipSampleLayout(title = "chipOutlineMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                )
            }
            Box {
                chipOutlineMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipOutlineMedium02Samples() {
    ChipSampleLayout(title = "chipOutlineMedium02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium02(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipOutlineMedium02(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                )
            }
            Box {
                chipOutlineMedium02(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipOutlineMedium02(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}


@Composable
private fun ChipSquareBoldMedium01Samples() {
    ChipSampleLayout(title = "chipSquareBoldMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipOutlineSquareMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipOutlineSquareMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipFilledMedium01Samples() {
    ChipSampleLayout(title = "chipFilledMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipFilledMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipFilledMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipFilledMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipFilledMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                )
            }
            Box {
                chipFilledMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipFilledMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipFilledSquareMedium01Samples() {
    ChipSampleLayout(title = "chipFilledSquareMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                )
            }
            Box {
                chipFilledSquareMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium01(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipFilledSquareMedium02Samples() {
    ChipSampleLayout(title = "chipFilledSquareMedium02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_1_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipFilledSquareMedium02(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                )
            }
            Box {
                chipFilledSquareMedium02(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipFilledSquareMedium02(
                    icon = R.drawable.ic_refresh_1,
                    onClick = {},
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipFilledDepthMedium01Samples() {
    ChipSampleLayout(title = "chipFilledDepthMedium01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", null),
                    Triple(R.drawable.ic_bookmark_1, "Second", null),
                    Triple(R.drawable.ic_bookmark_1, "Third", null),
                ),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Third", R.drawable.ic_check),
                ),
            )

            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", null),
                    Triple(R.drawable.ic_bookmark_1, "Second", null),
                    Triple(R.drawable.ic_bookmark_1, "Third", null),
                ),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", null),
                    Triple(R.drawable.ic_bookmark_1, "Second", null),
                    Triple(R.drawable.ic_bookmark_1, "Third", null),
                ),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledImageMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipFilledImageMedium01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipFilledImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipFilledImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipFilledImageMedium01(
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
private fun ChipFilledImageDepthMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageDepthMedium01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipFilledImageDepthMedium01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipFilledImageDepthMedium01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipFilledImageDepthMedium01(
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
private fun ChipOutlineImageMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipOutlineImageMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipOutlineImageMedium01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipOutlineImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipOutlineImageMedium01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipOutlineImageMedium01(
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
