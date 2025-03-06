package net.deali.designsystem.internal.placeholderimage

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import net.deali.designsystem.theme.DealiColor

@Composable
internal fun CoreDealiPlaceholderImage(
    imageUrl: String,
    @DrawableRes placeholder: Int,
    placeholderColor: Color,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    SubcomposeAsyncImage(
        modifier = modifier
            .background(backgroundColor)
            .border(
                width = 1.dp,
                color = DealiColor.b5,
            ),
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        loading = {
            PlaceholderImage(
                modifier = modifier
                    .fillMaxSize(),
                placeholder = placeholder,
                placeholderColor = placeholderColor,
            )
        },
        error = {
            PlaceholderImage(
                modifier = modifier
                    .fillMaxSize(),
                placeholder = placeholder,
                placeholderColor = placeholderColor,
            )
        }
    )
}

@Composable
private fun PlaceholderImage(
    @DrawableRes placeholder: Int,
    placeholderColor: Color,
    modifier: Modifier = Modifier,
) {
    BoxWithConstraints(
        modifier = modifier
    ) {
        val width = maxWidth
        val height = maxHeight

        val (placeholderWidth, placeholderHeight) = PlaceholderImageDefaults.placeholderSize(
            width,
            height
        )

        Image(
            modifier = Modifier
                .width(placeholderWidth)
                .height(placeholderHeight)
                .align(Alignment.Center),
            painter = painterResource(placeholder),
            contentScale = ContentScale.Crop,
            contentDescription = null,
            colorFilter = ColorFilter.tint(placeholderColor)
        )
    }
}
