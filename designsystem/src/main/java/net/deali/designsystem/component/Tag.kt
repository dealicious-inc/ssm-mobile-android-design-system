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

/** 구 TagLargePrimaryFilledPink */
@Composable
fun TagFilledLarge01(
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

/** 구 TagLargePrimaryFilledBlue */
@Composable
fun TagFilledLarge02(
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
fun TagFilledLarge03(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary04,
        backgroundColor = DealiColor.secondary06
    )
}

/** 구 TagLargePrimaryFilledGray */
@Composable
fun TagFilledLarge04(
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

/** 구 TagLargeSecondaryOutlinedPink */
@Composable
fun TagOutlineLarge01(
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

/** 구 TagLargeSecondaryOutlinedBlue */
@Composable
fun TagOutlineLarge02(
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
fun TagOutlineLarge03(
    text: String,
    modifier: Modifier = Modifier
) {
    TagLarge(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary04,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.secondary04
    )
}

/** 구 TagLargeSecondaryOutlinedGray */
@Composable
fun TagOutlineLarge04(
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

/** 구 TagMediumPrimaryFilledPink */
@Composable
fun TagFilledMedium01(
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

/** 구 TagMediumPrimaryFilledBlue */
@Composable
fun TagFilledMedium02(
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
fun TagFilledMedium03(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary04,
        backgroundColor = DealiColor.secondary06
    )
}

/** 구 TagMediumPrimaryFilledGray */
@Composable
fun TagFilledMedium04(
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

/** 구 TagMediumSecondaryOutlinedPink */
@Composable
fun TagOutlinedMedium01(
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

/** 구 TagMediumSecondaryOutlinedBlue */
@Composable
fun TagOutlinedMedium02(
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
fun TagOutlinedMedium03(
    text: String,
    modifier: Modifier = Modifier
) {
    TagMedium(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary04,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.secondary04
    )
}

/** 구 TagMediumSecondaryOutlinedGray */
@Composable
fun TagOutlinedMedium04(
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

/** 구 TagSmallPrimaryFilledPink */
@Composable
fun TagFilledSmall01(
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

/** 구 TagSmallPrimaryFilledBlue */
@Composable
fun TagFilledSmall02(
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
fun TagFilledSmall03(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary04,
        backgroundColor = DealiColor.secondary06
    )
}

/** 구 TagSmallPrimaryFilledGray */
@Composable
fun TagFilledSmall04(
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

/** 구 TagSmallSecondaryOutlinedPink */
@Composable
fun TagOutlineSmall01(
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

/** 구 TagSmallSecondaryOutlinedBlue */
@Composable
fun TagOutlineSmall02(
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
fun TagOutlineSmall03(
    text: String,
    modifier: Modifier = Modifier
) {
    TagSmall(
        modifier = modifier,
        text = text,
        textColor = DealiColor.secondary04,
        backgroundColor = DealiColor.primary04,
        borderColor = DealiColor.secondary04
    )
}

/** 구 TagSmallSecondaryOutlinedGray */
@Composable
fun TagOutlineSmall04(
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
        TagFilledLarge01(
            text = getRandomText(1)
        )

        TagFilledLarge02(
            text = getRandomText(1)
        )

        TagFilledLarge03(
            text = getRandomText(1)
        )

        TagFilledLarge04(
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
        TagOutlineLarge01(
            text = getRandomText(1)
        )

        TagOutlineLarge02(
            text = getRandomText(1)
        )

        TagOutlineLarge03(
            text = getRandomText(1)
        )

        TagOutlineLarge04(
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
        TagFilledMedium01(
            text = getRandomText(1)
        )

        TagFilledMedium02(
            text = getRandomText(1)
        )

        TagFilledMedium03(
            text = getRandomText(1)
        )

        TagFilledMedium04(
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
        TagOutlinedMedium01(
            text = getRandomText(1)
        )

        TagOutlinedMedium02(
            text = getRandomText(1)
        )

        TagOutlinedMedium03(
            text = getRandomText(1)
        )

        TagOutlinedMedium04(
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
        TagFilledSmall01(
            text = getRandomText(1)
        )

        TagFilledSmall02(
            text = getRandomText(1)
        )

        TagFilledSmall03(
            text = getRandomText(1)
        )

        TagFilledSmall04(
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
        TagOutlineSmall01(
            text = getRandomText(1)
        )

        TagOutlineSmall02(
            text = getRandomText(1)
        )

        TagOutlineSmall03(
            text = getRandomText(1)
        )

        TagOutlineSmall04(
            text = getRandomText(1)
        )
    }
}
