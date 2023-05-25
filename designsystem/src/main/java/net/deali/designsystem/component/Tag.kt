package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.unit.getRandomText
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.blue10
import net.deali.designsystem.theme.blue70
import net.deali.designsystem.theme.blue90
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray80
import net.deali.designsystem.theme.pink10
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.pink90
import net.deali.designsystem.theme.white100

@Composable
fun TagLargePrimaryFulledPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = pink60,
        backgroundColor = pink10
    )
}

@Composable
fun TagLargePrimaryFulledBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = blue70,
        backgroundColor = blue10
    )
}

@Composable
fun TagLargePrimaryFulledGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = gray20
    )
}

@Composable
fun TagLargeSecondaryOutlinedPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = pink90,
        backgroundColor = white100,
        borderColor = pink60
    )
}

@Composable
fun TagLargeSecondaryOutlinedBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = blue90,
        backgroundColor = white100,
        borderColor = blue70
    )
}

@Composable
fun TagLargeSecondaryOutlinedGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = white100,
        borderColor = gray20
    )
}

@Composable
fun TagMediumPrimaryFulledPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = pink60,
        backgroundColor = pink10
    )
}

@Composable
fun TagMediumPrimaryFulledBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = blue70,
        backgroundColor = blue10
    )
}

@Composable
fun TagMediumPrimaryFulledGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = gray20
    )
}

@Composable
fun TagMediumSecondaryOutlinedPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = pink90,
        backgroundColor = white100,
        borderColor = pink60
    )
}

@Composable
fun TagMediumSecondaryOutlinedBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = blue90,
        backgroundColor = white100,
        borderColor = blue70
    )
}

@Composable
fun TagMediumSecondaryOutlinedGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = white100,
        borderColor = gray20
    )
}

@Composable
fun TagSmallPrimaryFulledPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = pink60,
        backgroundColor = pink10
    )
}

@Composable
fun TagSmallPrimaryFulledBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = blue70,
        backgroundColor = blue10
    )
}

@Composable
fun TagSmallPrimaryFulledGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = gray20
    )
}

@Composable
fun TagSmallSecondaryOutlinedPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = pink90,
        backgroundColor = white100,
        borderColor = pink60
    )
}

@Composable
fun TagSmallSecondaryOutlinedBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = blue90,
        backgroundColor = white100,
        borderColor = blue70
    )
}

@Composable
fun TagSmallSecondaryOutlinedGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = white100,
        borderColor = gray20
    )
}

@Composable
private fun TagSmall(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    borderColor: Color? = null
) {
    Tag(
        modifier = modifier,
        text = text,
        color = textColor,
        style = AppTheme.typography.C1_10_B,
        paddingValues = PaddingValues(4.dp, 1.dp),
        backgroundColor = backgroundColor,
        borderColor = borderColor
    )
}

@Composable
private fun TagMedium(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    borderColor: Color? = null
) {
    Tag(
        modifier = modifier,
        text = text,
        color = textColor,
        style = AppTheme.typography.B4_12_M,
        paddingValues = PaddingValues(8.dp, 4.dp),
        backgroundColor = backgroundColor,
        borderColor = borderColor
    )
}

@Composable
private fun TagLarge(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    borderColor: Color? = null
) {
    Tag(
        modifier = modifier,
        text = text,
        color = textColor,
        style = AppTheme.typography.B2_14_M,
        paddingValues = PaddingValues(8.dp, 4.dp),
        backgroundColor = backgroundColor,
        borderColor = borderColor
    )
}

@Composable
private fun Tag(
    modifier: Modifier,
    text: String,
    color: Color,
    style: TextStyle,
    paddingValues: PaddingValues,
    backgroundColor: Color,
    borderColor: Color? = null,
) {
    DealiText(
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(4.dp)
            )
            .then(
                if (borderColor != null) {
                    Modifier.border(
                        width = 1.dp,
                        color = borderColor,
                        shape = RoundedCornerShape(4.dp)
                    )
                } else {
                    Modifier
                }
            )
            .padding(paddingValues),
        text = text,
        color = color,
        style = style,
        maxLines = 1
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun LargePrimaryFulledTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagLargePrimaryFulledPink(
            text = getRandomText(1)
        )

        TagLargePrimaryFulledBlue(
            text = getRandomText(1)
        )

        TagLargePrimaryFulledGray(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun TagLargeSecondaryOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagLargeSecondaryOutlinedPink(
            text = getRandomText(1)
        )

        TagLargeSecondaryOutlinedBlue(
            text = getRandomText(1)
        )

        TagLargeSecondaryOutlinedGray(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun TagMediumPrimaryFulledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagMediumPrimaryFulledPink(
            text = getRandomText(1)
        )

        TagMediumPrimaryFulledBlue(
            text = getRandomText(1)
        )

        TagMediumPrimaryFulledGray(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun TagMediumSecondaryOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagMediumSecondaryOutlinedPink(
            text = getRandomText(1)
        )

        TagMediumSecondaryOutlinedBlue(
            text = getRandomText(1)
        )

        TagMediumSecondaryOutlinedGray(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun TagSmallPrimaryFulledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagSmallPrimaryFulledPink(
            text = getRandomText(1)
        )

        TagSmallPrimaryFulledBlue(
            text = getRandomText(1)
        )

        TagSmallPrimaryFulledGray(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun TagSmallSecondaryOutlinedPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagSmallSecondaryOutlinedPink(
            text = getRandomText(1)
        )

        TagSmallSecondaryOutlinedBlue(
            text = getRandomText(1)
        )

        TagSmallSecondaryOutlinedGray(
            text = getRandomText(1)
        )
    }
}
