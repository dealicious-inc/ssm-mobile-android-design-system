package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import net.deali.designsystem.preview.getRandomText
import net.deali.designsystem.theme.blue10
import net.deali.designsystem.theme.blue70
import net.deali.designsystem.theme.blue90
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray80
import net.deali.designsystem.theme.pink10
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.pink90
import net.deali.designsystem.theme.white100
import net.deali.designsystem.unit.tu

@Composable
fun LargePrimaryFulledPinkTag(
    text: String,
    modifier: Modifier = Modifier
) {
    LargeTag(
        modifier = modifier,
        text = text,
        textColor = pink60,
        backgroundColor = pink10
    )
}

@Composable
fun LargePrimaryFulledBlueTag(
    text: String,
    modifier: Modifier = Modifier
) {
    LargeTag(
        modifier = modifier,
        text = text,
        textColor = blue70,
        backgroundColor = blue10
    )
}

@Composable
fun LargePrimaryFulledGrayTag(
    text: String,
    modifier: Modifier = Modifier
) {
    LargeTag(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = gray20
    )
}

@Composable
fun LargeSecondaryOutlinedPinkTag(
    text: String,
    modifier: Modifier = Modifier
) {
    LargeTag(
        modifier = modifier,
        text = text,
        textColor = pink90,
        backgroundColor = white100,
        borderColor = pink60
    )
}

@Composable
fun LargeSecondaryOutlinedBlueTag(
    text: String,
    modifier: Modifier = Modifier
) {
    LargeTag(
        modifier = modifier,
        text = text,
        textColor = blue90,
        backgroundColor = white100,
        borderColor = blue70
    )
}

@Composable
fun LargeSecondaryOutlinedGrayTag(
    text: String,
    modifier: Modifier = Modifier
) {
    LargeTag(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = white100,
        borderColor = gray20
    )
}

@Composable
fun MediumPrimaryFulledPinkTag(
    text: String,
    modifier: Modifier = Modifier
) {
    MediumTag(
        modifier = modifier,
        text = text,
        textColor = pink60,
        backgroundColor = pink10
    )
}

@Composable
fun MediumPrimaryFulledBlueTag(
    text: String,
    modifier: Modifier = Modifier
) {
    MediumTag(
        modifier = modifier,
        text = text,
        textColor = blue70,
        backgroundColor = blue10
    )
}

@Composable
fun MediumPrimaryFulledGrayTag(
    text: String,
    modifier: Modifier = Modifier
) {
    MediumTag(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = gray20
    )
}

@Composable
fun MediumSecondaryOutlinedPinkTag(
    text: String,
    modifier: Modifier = Modifier
) {
    MediumTag(
        modifier = modifier,
        text = text,
        textColor = pink90,
        backgroundColor = white100,
        borderColor = pink60
    )
}

@Composable
fun MediumSecondaryOutlinedBlueTag(
    text: String,
    modifier: Modifier = Modifier
) {
    MediumTag(
        modifier = modifier,
        text = text,
        textColor = blue90,
        backgroundColor = white100,
        borderColor = blue70
    )
}

@Composable
fun MediumSecondaryOutlinedGrayTag(
    text: String,
    modifier: Modifier = Modifier
) {
    MediumTag(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = white100,
        borderColor = gray20
    )
}

@Composable
fun SmallPrimaryFulledPinkTag(
    text: String,
    modifier: Modifier = Modifier
) {
    SmallTag(
        modifier = modifier,
        text = text,
        textColor = pink60,
        backgroundColor = pink10
    )
}

@Composable
fun SmallPrimaryFulledBlueTag(
    text: String,
    modifier: Modifier = Modifier
) {
    SmallTag(
        modifier = modifier,
        text = text,
        textColor = blue70,
        backgroundColor = blue10
    )
}

@Composable
fun SmallPrimaryFulledGrayTag(
    text: String,
    modifier: Modifier = Modifier
) {
    SmallTag(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = gray20
    )
}

@Composable
fun SmallSecondaryOutlinedPinkTag(
    text: String,
    modifier: Modifier = Modifier
) {
    SmallTag(
        modifier = modifier,
        text = text,
        textColor = pink90,
        backgroundColor = white100,
        borderColor = pink60
    )
}

@Composable
fun SmallSecondaryOutlinedBlueTag(
    text: String,
    modifier: Modifier = Modifier
) {
    SmallTag(
        modifier = modifier,
        text = text,
        textColor = blue90,
        backgroundColor = white100,
        borderColor = blue70
    )
}

@Composable
fun SmallSecondaryOutlinedGrayTag(
    text: String,
    modifier: Modifier = Modifier
) {
    SmallTag(
        modifier = modifier,
        text = text,
        textColor = gray80,
        backgroundColor = white100,
        borderColor = gray20
    )
}

@Composable
private fun SmallTag(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    borderColor: Color? = null
) {
    Tag(
        modifier = modifier,
        text = text,
        textColor = textColor,
        fontSize = 10.tu,
        fontWeight = FontWeight.Bold,
        paddingValues = PaddingValues(4.dp, 1.dp),
        backgroundColor = backgroundColor,
        borderColor = borderColor
    )
}

@Composable
private fun MediumTag(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    borderColor: Color? = null
) {
    Tag(
        modifier = modifier,
        text = text,
        textColor = textColor,
        fontSize = 12.tu,
        fontWeight = FontWeight.Bold,
        paddingValues = PaddingValues(8.dp, 4.dp),
        backgroundColor = backgroundColor,
        borderColor = borderColor
    )
}

@Composable
private fun LargeTag(
    modifier: Modifier,
    text: String,
    textColor: Color,
    backgroundColor: Color,
    borderColor: Color? = null
) {
    Tag(
        modifier = modifier,
        text = text,
        textColor = textColor,
        fontSize = 14.tu,
        fontWeight = FontWeight.Bold,
        paddingValues = PaddingValues(8.dp, 4.dp),
        backgroundColor = backgroundColor,
        borderColor = borderColor
    )
}

@Composable
private fun Tag(
    modifier: Modifier,
    text: String,
    textColor: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    paddingValues: PaddingValues,
    backgroundColor: Color,
    borderColor: Color? = null,
) {
    val style = compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }.current

    val mergedStyle = style.merge(
        TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontWeight = fontWeight
        )
    )

    val borderModifier = if (borderColor != null) {
        Modifier.border(
            width = 1.dp,
            color = borderColor,
            shape = RoundedCornerShape(4.dp)
        )
    } else {
        Modifier
    }

    BasicText(
        text = text,
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(4.dp)
            )
            .then(borderModifier)
            .padding(paddingValues),
        style = mergedStyle,
        maxLines = 1
    )
}

@Composable
@Preview(showBackground = true, widthDp = 270, backgroundColor = 0XFFFFFF)
private fun LargePrimaryFulledTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        LargePrimaryFulledPinkTag(
            text = getRandomText(1)
        )

        LargePrimaryFulledBlueTag(
            text = getRandomText(1)
        )

        LargePrimaryFulledGrayTag(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 270, backgroundColor = 0XFFFFFF)
private fun LargeSecondaryOutlinedTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        LargeSecondaryOutlinedPinkTag(
            text = getRandomText(1)
        )

        LargeSecondaryOutlinedBlueTag(
            text = getRandomText(1)
        )

        LargeSecondaryOutlinedGrayTag(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 270, backgroundColor = 0XFFFFFF)
private fun MediumPrimaryFulledTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MediumPrimaryFulledPinkTag(
            text = getRandomText(1)
        )

        MediumPrimaryFulledBlueTag(
            text = getRandomText(1)
        )

        MediumPrimaryFulledGrayTag(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 270, backgroundColor = 0XFFFFFF)
private fun MediumSecondaryOutlinedTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MediumSecondaryOutlinedPinkTag(
            text = getRandomText(1)
        )

        MediumSecondaryOutlinedBlueTag(
            text = getRandomText(1)
        )

        MediumSecondaryOutlinedGrayTag(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 180, backgroundColor = 0XFFFFFF)
private fun SmallPrimaryFulledTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        SmallPrimaryFulledPinkTag(
            text = getRandomText(1)
        )

        SmallPrimaryFulledBlueTag(
            text = getRandomText(1)
        )

        SmallPrimaryFulledGrayTag(
            text = getRandomText(1)
        )
    }
}

@Composable
@Preview(showBackground = true, widthDp = 180, backgroundColor = 0XFFFFFF)
private fun SmallSecondaryOutlinedTagPreview() {
    Row(
        modifier = Modifier
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        SmallSecondaryOutlinedPinkTag(
            text = getRandomText(1)
        )

        SmallSecondaryOutlinedBlueTag(
            text = getRandomText(1)
        )

        SmallSecondaryOutlinedGrayTag(
            text = getRandomText(1)
        )
    }
}
