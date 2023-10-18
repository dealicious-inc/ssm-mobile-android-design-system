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
import net.deali.designsystem.component.chipsFilledDepthLargeSecondary01
import net.deali.designsystem.component.chipsFilledImageDepthLargeSecondary01
import net.deali.designsystem.component.chipsFilledImageLargeSecondary01
import net.deali.designsystem.component.chipsFilledLargePrimary01
import net.deali.designsystem.component.chipsFilledLargeSquarePrimary01
import net.deali.designsystem.component.chipsFilledLargeSquarePrimary02
import net.deali.designsystem.component.chipsFilledSquareLargeSecondary01
import net.deali.designsystem.component.chipsOutlineImageLargeSecondary01
import net.deali.designsystem.component.chipsOutlineLargePrimary01
import net.deali.designsystem.component.chipsSquareLargePrimary01
import net.deali.designsystem.theme.DealiColor

@Composable
fun LargeChipsSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipsOutlineLargePrimary01Samples() }
        item { ChipsSquareLargePrimary01Samples() }
        item { ChipsFilledLargePrimary01Samples() }
        item { ChipsFilledLargeSquarePrimary01Samples() }
        item { ChipsFilledLargeSquarePrimary02Samples() }
        item { ChipsFilledSquareLargeSecondary01Samples() }
        item { ChipsFilledDepthLargeSecondary01Samples() }
        item { ChipsFilledImageLargeSecondary01Samples() }
        item { ChipsFilledImageDepthLargeSecondary01Samples() }
        item { ChipsOutlineImageLargeSecondary01Samples() }
    }
}

@Composable
private fun ChipsOutlineLargePrimary01Samples() {
    ChipsSampleLayout(title = "chipsOutlineLargePrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsSquareLargePrimary01Samples() {
    ChipsSampleLayout(title = "chipsSquareLargePrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledLargePrimary01Samples() {
    ChipsSampleLayout(title = "chipsFilledLargePrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledLargeSquarePrimary01Samples() {
    ChipsSampleLayout(title = "chipsFilledLargeSquarePrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledLargeSquarePrimary02Samples() {
    ChipsSampleLayout(title = "chipsFilledLargeSquarePrimary02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledLargeSquarePrimary02(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareLargeSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareLargeSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledDepthLargeSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledDepthLargeSecondary01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
            )

            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                selected = true,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                enabled = false,
            )
            chipsFilledDepthLargeSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipsFilledDepthLargeSecondary01(
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
private fun ChipsFilledImageLargeSecondary01Samples() {
    val sampleImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageLargeSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledImageLargeSecondary01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsFilledImageLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledImageLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledImageLargeSecondary01(
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
private fun ChipsFilledImageDepthLargeSecondary01Samples() {
    val sampleImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageDepthLargeSecondary01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipsFilledImageDepthLargeSecondary01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipsFilledImageDepthLargeSecondary01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipsFilledImageDepthLargeSecondary01(
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
private fun ChipsOutlineImageLargeSecondary01Samples() {
    val sampleImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsOutlineImageLargeSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineImageLargeSecondary01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsOutlineImageLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineImageLargeSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineImageLargeSecondary01(
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
