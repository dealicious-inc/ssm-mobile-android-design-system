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
import net.deali.designsystem.component.chipsFilledDepthSmallSecondary01
import net.deali.designsystem.component.chipsFilledImageDepthSmallSecondary01
import net.deali.designsystem.component.chipsFilledImageSmallSecondary01
import net.deali.designsystem.component.chipsFilledSmallPrimary01
import net.deali.designsystem.component.chipsFilledSquareSmallPrimary01
import net.deali.designsystem.component.chipsFilledSquareSmallSecondary01
import net.deali.designsystem.component.chipsOutlineSmallPrimary01
import net.deali.designsystem.component.chipsSquareSmallPrimary01
import net.deali.designsystem.theme.DealiColor

@Composable
fun SmallChipsSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipsOutlineSmallPrimary01Samples() }
        item { ChipsSquareSmallPrimary01Samples() }
        item { ChipsFilledSmallPrimary01Samples() }
        item { ChipsFilledSquareSmallPrimary01Samples() }
        item { ChipsFilledSquareSmallSecondary01Samples() }
        item { ChipsFilledDepthSmallSecondary01Samples() }
        item { ChipsFilledImageSmallSecondary01Samples() }
        item { ChipsFilledImageDepthSmallSecondary01Samples() }
    }
}

@Composable
private fun ChipsOutlineSmallPrimary01Samples() {
    ChipsSampleLayout(title = "chipsOutlineSmallPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsSquareSmallPrimary01Samples() {
    ChipsSampleLayout(title = "chipsSquareSmallPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsSquareSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSmallPrimary01Samples() {
    ChipsSampleLayout(title = "chipsFilledSmallPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareSmallPrimary01Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareSmallPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareSmallSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareSmallSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "TTT",
                    rightIcon = R.drawable.ic_x_s,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "SSS",
                    rightIcon = R.drawable.ic_x_s,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRightIconClick = {},
                    text = "DDD",
                    rightIcon = R.drawable.ic_x_s,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareSmallSecondary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    icon = R.drawable.ic_refresh1,
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledDepthSmallSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledDepthSmallSecondary01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
            )

            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                selected = true,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                enabled = false,
            )
            chipsFilledDepthSmallSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipsFilledDepthSmallSecondary01(
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
private fun ChipsFilledImageSmallSecondary01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageSmallSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledImageSmallSecondary01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsFilledImageSmallSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledImageSmallSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledImageSmallSecondary01(
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
private fun ChipsFilledImageDepthSmallSecondary01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageDepthSmallSecondary01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipsFilledImageDepthSmallSecondary01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipsFilledImageDepthSmallSecondary01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipsFilledImageDepthSmallSecondary01(
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
