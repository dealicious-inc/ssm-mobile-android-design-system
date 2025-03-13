package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
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
    )
}

@Composable
fun DealiPlaceholderImage(
    imageUrl: String,
    shape: Shape,
    @DrawableRes customPlaceholder: Int,
    colorState: PlaceholderColorState,
    modifier: Modifier = Modifier,
) {
    val backgroundColor = PlaceholderImageDefaults.backgroundColor(colorState)

    CoreDealiPlaceholderImage(
        modifier = modifier,
        imageUrl = imageUrl,
        shape = shape,
        placeholder = customPlaceholder,
        placeholderColor = null,
        backgroundColor = backgroundColor,
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    val width = 210.dp
    val height = 280.dp

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        DealiPlaceholderImage(
            modifier = Modifier
                .width(width)
                .height(height),
            imageUrl = "",
            shape = RoundedCornerShape(6.dp),
            state = PlaceholderState.GOODS,
            colorState = PlaceholderColorState.WHITE,
        )

        DealiPlaceholderImage(
            modifier = Modifier
                .width(width)
                .height(height),
            imageUrl = "",
            shape = RoundedCornerShape(6.dp),
            state = PlaceholderState.STORE,
            colorState = PlaceholderColorState.GRAY,
        )

        DealiPlaceholderImage(
            modifier = Modifier
                .width(width)
                .height(height),
            imageUrl = "",
            shape = RoundedCornerShape(6.dp),
            customPlaceholder = R.drawable.img_mbs_filled,
            colorState = PlaceholderColorState.GRAY,
        )
    }
}
