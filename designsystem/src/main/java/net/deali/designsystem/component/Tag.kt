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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

@Composable
fun TagLargePrimaryFilledPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = DealiColor.primary01,
        backgroundColor = DealiColor.primary03
    )
}

@Composable
fun TagLargePrimaryFilledBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary01,
        backgroundColor = DealiColor.secondary03
    )
}

@Composable
fun TagLargePrimaryFilledGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = DealiColor.g80,
        backgroundColor = DealiColor.g10
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
        textColor = DealiColor.primary02,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.primary01
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
        textColor = DealiColor.secondary02,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.secondary01
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
        textColor = DealiColor.g80,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.g20
    )
}

@Composable
fun TagMediumPrimaryFilledPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = DealiColor.primary01,
        backgroundColor = DealiColor.primary03
    )
}

@Composable
fun TagMediumPrimaryFilledBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary01,
        backgroundColor = DealiColor.secondary03
    )
}

@Composable
fun TagMediumPrimaryFilledGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = DealiColor.g80,
        backgroundColor = DealiColor.g10
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
        textColor = DealiColor.primary02,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.primary01
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
        textColor = DealiColor.secondary02,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.secondary01
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
        textColor = DealiColor.g80,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.g20
    )
}

@Composable
fun TagSmallPrimaryFilledPink(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = DealiColor.primary01,
        backgroundColor = DealiColor.primary03
    )
}

@Composable
fun TagSmallPrimaryFilledBlue(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary01,
        backgroundColor = DealiColor.secondary03
    )
}

@Composable
fun TagSmallPrimaryFilledGray(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = DealiColor.g80,
        backgroundColor = DealiColor.g10
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
        textColor = DealiColor.primary02,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.primary01
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
        textColor = DealiColor.secondary02,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.secondary01
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
        textColor = DealiColor.g80,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.g20
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
        style = DealiFont.c1sb10,
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
        style = DealiFont.b4sb12,
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
        style = DealiFont.b2sb14,
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
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun LargePrimaryFilledTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagLargePrimaryFilledPink(
            text = getRandomText(1)
        )

        TagLargePrimaryFilledBlue(
            text = getRandomText(1)
        )

        TagLargePrimaryFilledGray(
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
private fun TagMediumPrimaryFilledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagMediumPrimaryFilledPink(
            text = getRandomText(1)
        )

        TagMediumPrimaryFilledBlue(
            text = getRandomText(1)
        )

        TagMediumPrimaryFilledGray(
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
private fun TagSmallPrimaryFilledPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TagSmallPrimaryFilledPink(
            text = getRandomText(1)
        )

        TagSmallPrimaryFilledBlue(
            text = getRandomText(1)
        )

        TagSmallPrimaryFilledGray(
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
