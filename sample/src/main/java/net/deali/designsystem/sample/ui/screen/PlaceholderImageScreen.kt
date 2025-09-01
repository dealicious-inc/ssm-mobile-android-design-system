package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DealiPlaceholderImage
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.internal.placeholderimage.PlaceholderColorState
import net.deali.designsystem.internal.placeholderimage.PlaceholderState
import net.deali.designsystem.theme.DealiFont

@Composable
fun PlaceholderImageScreen(onBackPress: () -> Unit) {
    val sizes = listOf(
        210.dp to 280.dp,
        165.dp to 220.dp,
        159.dp to 212.dp,
        135.dp to 180.dp,
        108.dp to 144.dp,
        105.dp to 140.dp,
        90.dp to 120.dp,
        328.dp to 200.dp,
        216.dp to 180.dp,
        166.dp to 166.dp,
        158.dp to 158.dp,
        113.dp to 113.dp,
        108.dp to 108.dp,
        107.dp to 107.dp,
        105.dp to 105.dp,
        100.dp to 100.dp,
        96.dp to 96.dp,
        84.dp to 84.dp,
        80.dp to 80.dp,
        72.dp to 72.dp,
        68.dp to 68.dp,
        60.dp to 60.dp,
        54.dp to 54.dp,
        52.dp to 52.dp,
        50.dp to 50.dp,
        48.dp to 48.dp,
        40.dp to 40.dp,
        32.dp to 32.dp,
    )

    Column {
        TopBar(
            modifier = Modifier.fillMaxWidth(),
            onBack = onBackPress,
            title = "PlaceholderImage",
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(4.dp),
        ) {
            items(items = sizes) { (width, height) ->
                DealiText(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    text = "width: $width, height: $height",
                    style = DealiFont.b1sb15,
                )

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    item {
                        DealiPlaceholderImage(
                            modifier = Modifier
                                .width(width)
                                .height(height),
                            imageUrl = "https://cdn.pixabay.com/photo/2014/11/04/13/21/lego-516559_1280.jpg",
                            shape = RoundedCornerShape(6.dp),
                            state = PlaceholderState.GOODS,
                            colorState = PlaceholderColorState.WHITE,
                            contentScale = ContentScale.Crop,
                        )
                    }

                    item {
                        DealiPlaceholderImage(
                            modifier = Modifier
                                .width(width)
                                .height(height),
                            imageUrl = "",
                            shape = RoundedCornerShape(6.dp),
                            state = PlaceholderState.GOODS,
                            colorState = PlaceholderColorState.WHITE,
                            contentScale = ContentScale.Crop,
                        )
                    }

                    item {
                        DealiPlaceholderImage(
                            modifier = Modifier
                                .width(width)
                                .height(height),
                            imageUrl = "",
                            shape = RoundedCornerShape(6.dp),
                            state = PlaceholderState.GOODS,
                            colorState = PlaceholderColorState.GRAY,
                            contentScale = ContentScale.Crop,
                        )
                    }

                    if (width == height) {
                        item {
                            DealiPlaceholderImage(
                                modifier = Modifier
                                    .width(width)
                                    .height(height),
                                imageUrl = "https://cdn.pixabay.com/photo/2014/11/04/13/21/lego-516559_1280.jpg",
                                shape = CircleShape,
                                state = PlaceholderState.STORE,
                                colorState = PlaceholderColorState.WHITE,
                                contentScale = ContentScale.Crop,
                            )
                        }

                        item {
                            DealiPlaceholderImage(
                                modifier = Modifier
                                    .width(width)
                                    .height(height),
                                imageUrl = "",
                                shape = CircleShape,
                                state = PlaceholderState.STORE,
                                colorState = PlaceholderColorState.WHITE,
                                contentScale = ContentScale.Crop,
                            )
                        }

                        item {
                            DealiPlaceholderImage(
                                modifier = Modifier
                                    .width(width)
                                    .height(height),
                                imageUrl = "",
                                shape = CircleShape,
                                state = PlaceholderState.STORE,
                                colorState = PlaceholderColorState.GRAY,
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    PlaceholderImageScreen(onBackPress = {})
}
