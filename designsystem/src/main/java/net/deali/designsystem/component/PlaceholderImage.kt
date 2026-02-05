package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.placeholderimage.CoreDealiPlaceholderImage
import net.deali.designsystem.internal.placeholderimage.PlaceholderColorState
import net.deali.designsystem.internal.placeholderimage.PlaceholderImageDefaults
import net.deali.designsystem.internal.placeholderimage.PlaceholderState

@Composable
fun DealiPlaceholderImage(
    imageUrl: String,
    shape: Shape,
    state: PlaceholderState,
    colorState: PlaceholderColorState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentScale: ContentScale = ContentScale.Fit,
    crossfade: Boolean = true,
) {
    val placeholder = PlaceholderImageDefaults.placeholder(state)
    val placeholderColor = PlaceholderImageDefaults.placeholderColor(colorState)
    val backgroundColor = PlaceholderImageDefaults.backgroundColor(colorState)

    CoreDealiPlaceholderImage(
        modifier = modifier,
        imageUrl = imageUrl,
        shape = shape,
        placeholder = placeholder,
        placeholderColor = placeholderColor,
        backgroundColor = backgroundColor,
        enabled = enabled,
        contentScale = contentScale,
        crossfade = crossfade,
    )
}

@Composable
fun DealiPlaceholderImage(
    imageUrl: String,
    shape: Shape,
    @DrawableRes customPlaceholder: Int,
    colorState: PlaceholderColorState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentScale: ContentScale = ContentScale.Fit,
    crossfade: Boolean = true,
) {
    val backgroundColor = PlaceholderImageDefaults.backgroundColor(colorState)

    CoreDealiPlaceholderImage(
        modifier = modifier,
        imageUrl = imageUrl,
        shape = shape,
        placeholder = customPlaceholder,
        placeholderColor = null,
        backgroundColor = backgroundColor,
        enabled = enabled,
        contentScale = contentScale,
        crossfade = crossfade,
    )
}

private class ParamPreviewProvider : PreviewParameterProvider<ParamPreviewProvider.Param> {
    override val values: Sequence<Param>
        get() = sequenceOf(
            Param(),
            Param(
                state = PlaceholderState.STORE,
                colorState = PlaceholderColorState.GRAY,
            ),
            Param(
                customPlaceholder = R.drawable.img_mbs_filled,
            ),
            Param(
                enabled = false,
            ),
        )

    data class Param(
        @DrawableRes val customPlaceholder: Int? = null,
        val state: PlaceholderState = PlaceholderState.GOODS,
        val colorState: PlaceholderColorState = PlaceholderColorState.WHITE,
        val enabled: Boolean = true,
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview(
    @PreviewParameter(ParamPreviewProvider::class) value: ParamPreviewProvider.Param
) {
    val width = 210.dp
    val height = 280.dp

    if (value.customPlaceholder == null) {
        DealiPlaceholderImage(
            modifier = Modifier
                .width(width)
                .height(height),
            imageUrl = "",
            shape = RoundedCornerShape(6.dp),
            state = value.state,
            colorState = value.colorState,
            enabled = value.enabled,
        )
    } else {
        DealiPlaceholderImage(
            modifier = Modifier
                .width(width)
                .height(height),
            imageUrl = "",
            shape = RoundedCornerShape(6.dp),
            customPlaceholder = value.customPlaceholder,
            colorState = value.colorState,
            enabled = value.enabled,
        )
    }
}