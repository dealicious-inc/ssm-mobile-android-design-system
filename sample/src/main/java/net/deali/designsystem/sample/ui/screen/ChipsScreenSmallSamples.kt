package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cheonjaeung.compose.grid.SimpleGridCells
import com.cheonjaeung.compose.grid.VerticalGrid
import net.deali.designsystem.R
import net.deali.designsystem.component.chipFilledDepthSmall01
import net.deali.designsystem.component.chipFilledImageDepthSmall01
import net.deali.designsystem.component.chipFilledImageSmall01
import net.deali.designsystem.component.chipFilledSmall01
import net.deali.designsystem.component.chipFilledSmall02
import net.deali.designsystem.component.chipFilledSmall03
import net.deali.designsystem.component.chipFilledSquareSmall01
import net.deali.designsystem.component.chipFilledSquareSmall02
import net.deali.designsystem.component.chipOutlineSmall01
import net.deali.designsystem.component.chipOutlineSquareSmall01
import net.deali.designsystem.theme.DealiColor

@Composable
fun SmallChipSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipOutlineSmall01Samples() }
        item { ChipOutlineSquareSmall01Samples() }
        item { ChipFilledSmall01Samples() }
        item { ChipFilledSmall02Samples() }
        item { ChipFilledSmall03Samples() }
        item { ChipFilledSquareSmall01Samples() }
        item { ChipFilledSquareSmall02Samples() }
        item { ChipFilledDepthSmall01Samples() }
        item { ChipFilledImageSmall01Samples() }
        item { ChipFilledImageDepthSmall01Samples() }
    }
}

@Composable
private fun ChipOutlineSmall01Samples() {
    ChipSampleLayout(title = "chipOutlineSmall01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineSmall01(
                text = "Text",
                onClick = {},
            )
            chipOutlineSmall01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipOutlineSmall01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipOutlineSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSmall01(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipOutlineSmall01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineSmall01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipOutlineSquareSmall01Samples() {
    ChipSampleLayout(title = "chipOutlineSquareSmall01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineSquareSmall01(
                text = "Text",
                onClick = {},
            )
            chipOutlineSquareSmall01(
                text = "Selected",
                selected = true,
                onClick = {},
            )
            chipOutlineSquareSmall01(
                text = "Disabled",
                enabled = false,
                onClick = {},
            )

            chipOutlineSquareSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSquareSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSquareSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSquareSmall01(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipOutlineSquareSmall01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineSquareSmall01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineSquareSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSquareSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSquareSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSquareSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineSquareSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineSquareSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSmall01Samples() {
    ChipSampleLayout(title = "chipFilledSmall01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSmall01(
                text = "Text",
                onClick = {},
            )
            chipFilledSmall01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSmall01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSmall01(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipFilledSmall01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSmall01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}


@Composable
private fun ChipFilledSmall02Samples() {
    ChipSampleLayout(title = "chipFilledSmall02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSmall02(
                text = "Text",
                onClick = {},
            )
            chipFilledSmall02(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSmall02(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSmall02(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSmall02(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSmall02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSmall02(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipFilledSmall02(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSmall02(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSmall02(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSmall02(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSmall02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSmall02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSmall02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSmall02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSmall03Samples() {
    ChipSampleLayout(title = "chipFilledSmall03") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSmall03(
                text = "Text",
                onClick = {},
            )
            chipFilledSmall03(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSmall03(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSmall03(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSmall03(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSmall03(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSmall03(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipFilledSmall03(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSmall03(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSmall03(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSmall03(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSmall03(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSmall03(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSmall03(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSmall03(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}


@Composable
private fun ChipFilledSquareSmall01Samples() {
    ChipSampleLayout(title = "chipFilledSquareSmall01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareSmall01(
                text = "Text",
                onClick = {},
            )
            chipFilledSquareSmall01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareSmall01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareSmall01(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipFilledSquareSmall01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareSmall01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareSmall01(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareSmall01(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareSmall01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareSmall01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSquareSmall02Samples() {
    ChipSampleLayout(title = "chipFilledSquareSmall02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareSmall02(
                text = "Text",
                onClick = {},
            )
            chipFilledSquareSmall02(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareSmall02(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareSmall02(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareSmall02(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareSmall02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_bookmark_1_filled,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareSmall02(
                text = "TTT",
                leftIcon = R.drawable.ic_check,
                onClick = {},
            )
            chipFilledSquareSmall02(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareSmall02(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareSmall02(
                text = "TTT",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareSmall02(
                text = "SSS",
                onClick = {},
                onRightIconClick = {},
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareSmall02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareSmall02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareSmall02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareSmall02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledDepthSmall01Samples() {
    ChipSampleLayout(title = "chipFilledDepthSmall01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", null),
                    Triple(R.drawable.ic_bookmark_1, "Second", null),
                    Triple(R.drawable.ic_bookmark_1, "Third", null),
                ),
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Third", R.drawable.ic_check),
                ),
            )

            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", null),
                    Triple(R.drawable.ic_bookmark_1, "Second", null),
                    Triple(R.drawable.ic_bookmark_1, "Third", null),
                ),
                selected = true,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_bookmark_1, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_bookmark_1, "First", null),
                    Triple(R.drawable.ic_bookmark_1, "Second", null),
                    Triple(R.drawable.ic_bookmark_1, "Third", null),
                ),
                enabled = false,
            )
            chipFilledDepthSmall01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipFilledDepthSmall01(
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
private fun ChipFilledImageSmall01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageSmall01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledImageSmall01(
                onClick = {},
                imageUrl = sampleImage,
                text = "Default",
            )
            chipFilledImageSmall01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Default",
                useRemoveIcon = true,
            )
            chipFilledImageSmall01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Selected",
                useRemoveIcon = true,
                selected = true,
            )
            chipFilledImageSmall01(
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

@Composable
private fun ChipFilledImageDepthSmall01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageDepthSmall01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipFilledImageDepthSmall01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipFilledImageDepthSmall01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipFilledImageDepthSmall01(
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
