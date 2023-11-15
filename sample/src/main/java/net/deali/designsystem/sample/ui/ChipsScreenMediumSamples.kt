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
import net.deali.designsystem.component.chipsFilledDepthMediumSecondary01
import net.deali.designsystem.component.chipsFilledImageDepthMediumSecondary01
import net.deali.designsystem.component.chipsFilledImageMediumSecondary01
import net.deali.designsystem.component.chipsFilledMediumPrimary01
import net.deali.designsystem.component.chipsFilledMediumSquarePrimary01
import net.deali.designsystem.component.chipsFilledSquareMediumSecondary01
import net.deali.designsystem.component.chipsFilledSquareSmallSecondary01
import net.deali.designsystem.component.chipsOutlineImageMediumSecondary01
import net.deali.designsystem.component.chipsOutlineMediumPrimary01
import net.deali.designsystem.component.chipsSquareBoldMediumPrimary01
import net.deali.designsystem.component.chipsSquareRegularMediumPrimary01
import net.deali.designsystem.theme.DealiColor

@Composable
fun MediumChipsSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipsOutlineMediumPrimary01Samples() }
        item { ChipsSquareBoldMediumPrimary01Samples() }
        item { ChipsSquareRegularMediumPrimary01Samples() }
        item { ChipsFilledMediumPrimary01Samples() }
        item { ChipsFilledMediumSquarePrimary01Samples() }
        item { ChipsFilledSquareMediumSecondary01Samples() }
        item { ChipsFilledDepthMediumSecondary01Samples() }
        item { ChipsFilledImageMediumSecondary01Samples() }
        item { ChipsFilledImageDepthMediumSecondary01Samples() }
        item { ChipsOutlineImageMediumSecondary01Samples() }
    }
}

@Composable
private fun ChipsOutlineMediumPrimary01Samples() {
    ChipsSampleLayout(title = "chipsOutlineMediumPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsOutlineMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    selected = true,
                )
            }
            Box {
                chipsOutlineMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsSquareBoldMediumPrimary01Samples() {
    ChipsSampleLayout(title = "chipsSquareBoldMediumPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsSquareBoldMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    selected = true,
                )
            }
            Box {
                chipsSquareBoldMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsSquareRegularMediumPrimary01Samples() {
    ChipsSampleLayout(title = "chipsSquareRegularMediumPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsSquareRegularMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    selected = true,
                )
            }
            Box {
                chipsSquareRegularMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledMediumPrimary01Samples() {
    ChipsSampleLayout(title = "chipsFilledMediumPrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumPrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipsFilledMediumSquarePrimary01Samples() {
    ChipsSampleLayout(title = "chipsFilledMediumSquarePrimary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledMediumSquarePrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    selected = true,
                )
            }
            Box {
                chipsFilledMediumSquarePrimary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    enabled = false,
                )
            }
        }
    }
}

@Composable
private fun ChipsFilledSquareMediumSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledSquareMediumSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    text = "Text",
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    text = "Selected",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    text = "Disabled",
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_check,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_check,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_check,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    useRemoveIcon = true,
                    enabled = false,
                )
            }

            Box {
                chipsFilledSquareMediumSecondary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareMediumSecondary01(
                    leftIcon = R.drawable.ic_refresh1,
                    onClick = {},
                    text = "",
                    enabled = false,
                )
            }

        }
    }
}

@Composable
private fun ChipsFilledDepthMediumSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledDepthMediumSecondary01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
            )

            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                selected = true,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark, "First", null),
                    Triple(R.drawable.ic_bookmark, "Second", null),
                    Triple(R.drawable.ic_bookmark, "Third", null),
                ),
                enabled = false,
            )
            chipsFilledDepthMediumSecondary01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipsFilledDepthMediumSecondary01(
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
private fun ChipsFilledImageMediumSecondary01Samples() {
    val sampleImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageMediumSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsFilledImageMediumSecondary01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsFilledImageMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledImageMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledImageMediumSecondary01(
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
private fun ChipsFilledImageDepthMediumSecondary01Samples() {
    val sampleImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsFilledImageDepthMediumSecondary01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipsFilledImageDepthMediumSecondary01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipsFilledImageDepthMediumSecondary01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipsFilledImageDepthMediumSecondary01(
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
private fun ChipsOutlineImageMediumSecondary01Samples() {
    val sampleImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipsSampleLayout(title = "chipsOutlineImageMediumSecondary01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box {
                chipsOutlineImageMediumSecondary01(
                    onClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                )
            }
            Box {
                chipsOutlineImageMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Default",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineImageMediumSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    imageUrl = sampleImage,
                    text = "Selected",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineImageMediumSecondary01(
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
