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
import net.deali.designsystem.component.chipFilledDepthLarge01
import net.deali.designsystem.component.chipFilledImageDepthLarge01
import net.deali.designsystem.component.chipOutlineSquareImageLarge01
import net.deali.designsystem.component.chipFilledLarge01
import net.deali.designsystem.component.chipFilledSquareLarge01
import net.deali.designsystem.component.chipFilledSquareLarge02
import net.deali.designsystem.component.chipFilledSquareLarge03
import net.deali.designsystem.component.chipOutlineImageLarge01
import net.deali.designsystem.component.chipOutlineLarge01
import net.deali.designsystem.component.chipOutlineSquareLarge01
import net.deali.designsystem.theme.DealiColor

@Composable
fun LargeChipSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ChipOutlineLarge01Samples() }
        item { ChipOutlineSquareLarge01Samples() }
        item { ChipFilledLarge01Samples() }
        item { ChipFilledSquareLarge01Samples() }
        item { ChipFilledSquareLarge02Samples() }
        item { ChipFilledSquareLarge03Samples() }
        item { ChipFilledDepthLarge01Samples() }
        item { ChipFilledImageLarge01Samples() }
        item { ChipFilledImageDepthLarge01Samples() }
        item { ChipOutlineImageLarge01Samples() }
    }
}

@Composable
private fun ChipOutlineLarge01Samples() {
    ChipSampleLayout(title = "chipOutlineLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineLarge01(
                onClick = {},
                text = "테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트",
            )
            chipOutlineLarge01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipOutlineLarge01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipOutlineLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트테스트",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )
            chipOutlineLarge01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipOutlineLarge01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineLarge01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipOutlineSquareLarge01Samples() {
    ChipSampleLayout(title = "chipOutlineSquareLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineSquareLarge01(
                onClick = {},
                text = "Text",
            )
            chipOutlineSquareLarge01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipOutlineSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSquareLarge01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSquareLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineSquareLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineSquareLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )

        }
    }
}

@Composable
private fun ChipFilledLarge01Samples() {
    ChipSampleLayout(title = "chipFilledLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledLarge01(
                onClick = {},
                text = "Text",
            )
            chipFilledLarge01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledLarge01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledLarge01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledLarge01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledLarge01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSquareLarge01Samples() {
    ChipSampleLayout(title = "chipFilledSquareLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareLarge01(
                onClick = {},
                text = "Text",
            )
            chipFilledSquareLarge01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareLarge01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareLarge01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledSquareLarge01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareLarge01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareLarge01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareLarge01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSquareLarge02Samples() {
    ChipSampleLayout(title = "chipFilledSquareLarge02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareLarge02(
                onClick = {},
                text = "Text",
            )
            chipFilledSquareLarge02(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareLarge02(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareLarge02(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareLarge02(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareLarge02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareLarge02(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledSquareLarge02(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareLarge02(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareLarge02(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareLarge02(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareLarge02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareLarge02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareLarge02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareLarge02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSquareLarge03Samples() {
    ChipSampleLayout(title = "chipFilledSquareLarge03") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareLarge03(
                onClick = {},
                text = "Text",
            )
            chipFilledSquareLarge03(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareLarge03(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareLarge03(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareLarge03(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareLarge03(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareLarge03(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledSquareLarge03(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareLarge03(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareLarge03(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareLarge03(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareLarge03(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareLarge03(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareLarge03(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareLarge03(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledDepthLarge01Samples() {
    ChipSampleLayout(title = "chipFilledDepthLarge01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_star, "First", null),
                    Triple(R.drawable.ic_star, "Second", null),
                    Triple(R.drawable.ic_star, "Third", null),
                ),
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_star, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Third", R.drawable.ic_check),
                ),
            )

            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                selected = true,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_star, "First", null),
                    Triple(R.drawable.ic_star, "Second", null),
                    Triple(R.drawable.ic_star, "Third", null),
                ),
                selected = true,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_star, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                texts = listOf("First", "Second", "Third"),
                enabled = false,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                icons = listOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_star, "First", null),
                    Triple(R.drawable.ic_star, "Second", null),
                    Triple(R.drawable.ic_star, "Third", null),
                ),
                enabled = false,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipFilledDepthLarge01(
                onClick = {},
                onRemoveClick = {},
                contents = listOf(
                    Triple(R.drawable.ic_star, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledImageLarge01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineSquareImageLarge01(
                onClick = {},
                imageUrl = sampleImage,
                text = "Default",
            )
            chipOutlineSquareImageLarge01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Default",
                useRemoveIcon = true,
            )
            chipOutlineSquareImageLarge01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Selected",
                useRemoveIcon = true,
                selected = true,
            )
            chipOutlineSquareImageLarge01(
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
private fun ChipFilledImageDepthLarge01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageDepthLarge01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            chipFilledImageDepthLarge01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Default", "Text", "999,999"),
            )
            chipFilledImageDepthLarge01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = listOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipFilledImageDepthLarge01(
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
private fun ChipOutlineImageLarge01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipOutlineImageLarge01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineImageLarge01(
                onClick = {},
                imageUrl = sampleImage,
                text = "Default",
            )
            chipOutlineImageLarge01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Default",
                useRemoveIcon = true,
            )
            chipOutlineImageLarge01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Selected",
                useRemoveIcon = true,
                selected = true,
            )
            chipOutlineImageLarge01(
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
