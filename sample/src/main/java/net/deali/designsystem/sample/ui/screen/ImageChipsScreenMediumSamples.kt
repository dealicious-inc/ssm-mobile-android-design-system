package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon
import net.deali.designsystem.component.imgChipMedium01
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun MediumImageChipSamples(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { ImageChipMedium01Samples() }
    }
}

@Composable
private fun ImageChipMedium01Samples() {
    val sampleImage =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Eo_circle_green_blank.svg/512px-Eo_circle_green_blank.svg.png"

    ImageChipSampleLayout(title = "imgChipMedium01") {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                selected = true,
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                enabled = false,
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                subContent = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            iconRes = R.drawable.ic_arrow_close_1_filled,
                            size = 16.dp,
                            color = DealiColor.primary01
                        )
                        DealiText(
                            text = "999%",
                            style = DealiFont.b2sb14,
                            color = DealiColor.primary01
                        )
                    }
                },
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                subContent = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            iconRes = R.drawable.ic_arrow_close_1_filled,
                            size = 16.dp,
                            color = DealiColor.primary01
                        )
                        DealiText(
                            text = "999%",
                            style = DealiFont.b2sb14,
                            color = DealiColor.primary01
                        )
                    }
                },
                selected = true,
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                subContent = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            iconRes = R.drawable.ic_arrow_close_1_filled,
                            size = 16.dp,
                            color = DealiColor.primary01
                        )
                        DealiText(
                            text = "999%",
                            style = DealiFont.b2sb14,
                            color = DealiColor.primary01
                        )
                    }
                },
                enabled = false,
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                subContent = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            iconRes = R.drawable.ic_arrow_close_1_filled,
                            size = 16.dp,
                            color = DealiColor.primary01
                        )
                        DealiText(
                            text = "999%",
                            style = DealiFont.b2sb14,
                            color = DealiColor.primary01
                        )
                    }
                },
                rightIcon = R.drawable.ic_x,
                onRightIconClick = {},
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                subContent = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            iconRes = R.drawable.ic_arrow_close_1_filled,
                            size = 16.dp,
                            color = DealiColor.primary01
                        )
                        DealiText(
                            text = "999%",
                            style = DealiFont.b2sb14,
                            color = DealiColor.primary01
                        )
                    }
                },
                rightIcon = R.drawable.ic_x,
                onRightIconClick = {},
                selected = true,
                onClick = {},
            )

            imgChipMedium01(
                imageUrl = sampleImage,
                placeholder = R.drawable.ic_home_filled,
                text = "imgChipMedium01",
                subContent = {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            iconRes = R.drawable.ic_arrow_close_1_filled,
                            size = 16.dp,
                            color = DealiColor.primary01
                        )
                        DealiText(
                            text = "999%",
                            style = DealiFont.b2sb14,
                            color = DealiColor.primary01
                        )
                    }
                },
                rightIcon = R.drawable.ic_x,
                onRightIconClick = {},
                enabled = false,
                onClick = {},
            )
        }
    }
}
