package net.deali.designsystem.internal.placeholderimage

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.SubcomposeAsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor

@Composable
internal fun CoreDealiPlaceholderImage(
    imageUrl: String,
    shape: Shape,
    @DrawableRes placeholder: Int,
    placeholderColor: Color?,
    backgroundColor: Color,
    enabled: Boolean,
    contentScale: ContentScale,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(shape),
    ) {
        val imageModifier = Modifier
            .fillMaxSize()
            .border(
                width = 1.dp,
                color = DealiColor.b5,
                shape = shape,
            )
            .background(backgroundColor)

        SubcomposeAsyncImage(
            modifier = imageModifier,
            model = ImageRequest.Builder(LocalContext.current)
                .data(imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = contentScale,
            loading = {
                PlaceholderImage(
                    modifier = imageModifier,
                    placeholder = placeholder,
                    placeholderColor = placeholderColor,
                    contentScale = contentScale,
                )
            },
            error = {
                PlaceholderImage(
                    modifier = imageModifier,
                    placeholder = placeholder,
                    placeholderColor = placeholderColor,
                    contentScale = contentScale,
                )
            }
        )

        if (!enabled) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(DealiColor.b40)
            )
        }
    }
}

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
private fun PlaceholderImage(
    @DrawableRes placeholder: Int,
    placeholderColor: Color?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
) {
    BoxWithConstraints(
        modifier = modifier
    ) {
        val sizes = maxWidth to maxHeight

        val (placeholderWidth, placeholderHeight) = if (placeholder.isCustomPlaceholder) {
            sizes
        } else {
            PlaceholderImageDefaults.placeholderSize(sizes)
        }

        Image(
            modifier = Modifier
                .width(placeholderWidth)
                .height(placeholderHeight)
                .align(Alignment.Center),
            painter = painterResource(placeholder),
            contentScale = contentScale,
            contentDescription = null,
            colorFilter = placeholderColor?.let { ColorFilter.tint(it) }
        )
    }
}

private val Int.isCustomPlaceholder: Boolean
    get() = !(this == R.drawable.ic_empty40 || this == R.drawable.ic_home_filled)
