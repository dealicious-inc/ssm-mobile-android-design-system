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
import kotlinx.collections.immutable.persistentListOf
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
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineMedium01(
                onClick = {},
                text = "Text",
            )
            chipOutlineMedium01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipOutlineMedium01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipOutlineMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineMedium01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipOutlineMedium01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineMedium01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipOutlineMedium02Samples() {
    ChipSampleLayout(title = "chipOutlineMedium02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineMedium02(
                onClick = {},
                text = "Text",
            )
            chipOutlineMedium02(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipOutlineMedium02(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipOutlineMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineMedium02(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipOutlineMedium02(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineMedium02(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineMedium02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineMedium02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineMedium02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}


@Composable
private fun ChipSquareBoldMedium01Samples() {
    ChipSampleLayout(title = "chipSquareBoldMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineSquareMedium01(
                onClick = {},
                text = "Text",
            )
            chipOutlineSquareMedium01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipOutlineSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSquareMedium01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipOutlineSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipOutlineSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipOutlineSquareMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipOutlineSquareMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipOutlineSquareMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledMedium01Samples() {
    ChipSampleLayout(title = "chipFilledMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledMedium01(
                onClick = {},
                text = "Text",
            )
            chipFilledMedium01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledMedium01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledMedium01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledMedium01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledMedium01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )

        }
    }
}

@Composable
private fun ChipFilledSquareMedium01Samples() {
    ChipSampleLayout(title = "chipFilledSquareMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareMedium01(
                onClick = {},
                text = "Text",
            )
            chipFilledSquareMedium01(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareMedium01(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareMedium01(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledSquareMedium01(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareMedium01(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareMedium01(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareMedium01(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )
        }
    }
}

@Composable
private fun ChipFilledSquareMedium02Samples() {
    ChipSampleLayout(title = "chipFilledSquareMedium02") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(3, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledSquareMedium02(
                onClick = {},
                text = "Text",
            )
            chipFilledSquareMedium02(
                onClick = {},
                text = "Selected",
                selected = true,
            )
            chipFilledSquareMedium02(
                onClick = {},
                text = "Disabled",
                enabled = false,
            )

            chipFilledSquareMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_star,
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareMedium02(
                onClick = {},
                text = "TTT",
                leftIcon = R.drawable.ic_check,
            )
            chipFilledSquareMedium02(
                onClick = {},
                text = "SSS",
                leftIcon = R.drawable.ic_check,
                selected = true,
            )
            chipFilledSquareMedium02(
                onClick = {},
                text = "DDD",
                leftIcon = R.drawable.ic_check,
                enabled = false,
            )

            chipFilledSquareMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "TTT",
                rightIcon = R.drawable.ic_x_s,
            )
            chipFilledSquareMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "SSS",
                rightIcon = R.drawable.ic_x_s,
                selected = true,
            )
            chipFilledSquareMedium02(
                onClick = {},
                onRightIconClick = {},
                text = "DDD",
                rightIcon = R.drawable.ic_x_s,
                enabled = false,
            )

            chipFilledSquareMedium02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
            )
            chipFilledSquareMedium02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                selected = true,
            )
            chipFilledSquareMedium02(
                icon = R.drawable.ic_refresh_1,
                onClick = {},
                enabled = false,
            )

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
                texts = persistentListOf("First", "Second", "Third"),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = persistentListOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(R.drawable.ic_star, "First", null),
                    Triple(R.drawable.ic_star, "Second", null),
                    Triple(R.drawable.ic_star, "Third", null),
                ),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(R.drawable.ic_star, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Third", R.drawable.ic_check),
                ),
            )

            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = persistentListOf("First", "Second", "Third"),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = persistentListOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(R.drawable.ic_star, "First", null),
                    Triple(R.drawable.ic_star, "Second", null),
                    Triple(R.drawable.ic_star, "Third", null),
                ),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(R.drawable.ic_star, "First", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Second", R.drawable.ic_check),
                    Triple(R.drawable.ic_star, "Third", R.drawable.ic_check),
                ),
                selected = true,
            )

            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                texts = persistentListOf("First", "Second", "Third"),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                icons = persistentListOf(
                    R.drawable.ic_category,
                    R.drawable.ic_edit_line,
                    R.drawable.ic_file_copy,
                ),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(R.drawable.ic_star, "First", null),
                    Triple(R.drawable.ic_star, "Second", null),
                    Triple(R.drawable.ic_star, "Third", null),
                ),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
                    Triple(null, "First", R.drawable.ic_check),
                    Triple(null, "Second", R.drawable.ic_check),
                    Triple(null, "Third", R.drawable.ic_check),
                ),
                enabled = false,
            )
            chipFilledDepthMedium01(
                onClick = {},
                onRemoveClick = {},
                contents = persistentListOf(
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
private fun ChipFilledImageMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"
    ChipSampleLayout(title = "chipFilledImageMedium01") {
        VerticalGrid(
            columns = SimpleGridCells.Fixed(2, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipFilledImageMedium01(
                onClick = {},
                imageUrl = sampleImage,
                text = "Default",
            )
            chipFilledImageMedium01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Default",
                useRemoveIcon = true,
            )
            chipFilledImageMedium01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Selected",
                useRemoveIcon = true,
                selected = true,
            )
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
                texts = persistentListOf("Default", "Text", "999,999"),
            )
            chipFilledImageDepthMedium01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = persistentListOf("Selected", "Text", "999,999"),
                selected = true,
            )
            chipFilledImageDepthMedium01(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                texts = persistentListOf("Disabled", "Text", "999,999"),
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
            columns = SimpleGridCells.Fixed(2, false),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            chipOutlineImageMedium01(
                onClick = {},
                imageUrl = sampleImage,
                text = "Default",
            )
            chipOutlineImageMedium01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Default",
                useRemoveIcon = true,
            )
            chipOutlineImageMedium01(
                onClick = {},
                onRemoveClick = {},
                imageUrl = sampleImage,
                text = "Selected",
                useRemoveIcon = true,
                selected = true,
            )
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
