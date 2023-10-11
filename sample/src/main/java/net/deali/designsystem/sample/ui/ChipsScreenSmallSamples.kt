package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.chipsFilledSmallPrimary01
import net.deali.designsystem.component.chipsFilledSquareSmallPrimary01
import net.deali.designsystem.component.chipsFilledSquareSmallSecondary01
import net.deali.designsystem.component.chipsOutlineSmallPrimary01
import net.deali.designsystem.component.chipsSquareSmallPrimary01
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun SmallChipsSamples(
    modifier: Modifier = Modifier,
) {
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
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
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
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsOutlineSmallPrimary01(
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
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
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
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsSquareSmallPrimary01(
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
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
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
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSmallPrimary01(
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
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
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
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallPrimary01(
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
                    onRemoveClick = {},
                    text = "TTT",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "DDD",
                    leftIcon = R.drawable.ic_bookmark_filled,
                    useRemoveIcon = true,
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
                    onRemoveClick = {},
                    text = "TTT",
                    useRemoveIcon = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
                    onClick = {},
                    onRemoveClick = {},
                    text = "SSS",
                    useRemoveIcon = true,
                    selected = true,
                )
            }
            Box {
                chipsFilledSquareSmallSecondary01(
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
private fun ChipsFilledDepthSmallSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledDepthSmallSecondary01") {
        DealiText(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "TODO",
            style = DealiFont.sh3sb16,
            color = DealiColor.g100
        )
    }
}

@Composable
private fun ChipsFilledImageSmallSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledImageSmallSecondary01") {
        DealiText(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "TODO",
            style = DealiFont.sh3sb16,
            color = DealiColor.g100
        )
    }
}

@Composable
private fun ChipsFilledImageDepthSmallSecondary01Samples() {
    ChipsSampleLayout(title = "chipsFilledImageDepthSmallSecondary01") {
        DealiText(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "TODO",
            style = DealiFont.sh3sb16,
            color = DealiColor.g100
        )
    }
}
