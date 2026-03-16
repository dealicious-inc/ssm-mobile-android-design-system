package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.tag.CoreTag
import net.deali.designsystem.internal.tag.TagSize
import net.deali.designsystem.internal.tag.TagStyle
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun TagFilledLarge01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.primary01,
        backgroundColor = DealiColor.primary03,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledLarge02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary01,
        backgroundColor = DealiColor.secondary03,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledLarge03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary04,
        backgroundColor = DealiColor.secondary06,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledLarge04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g80,
        backgroundColor = DealiColor.g10,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledLarge05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g100,
        backgroundColor = DealiColor.g10,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineLarge01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.primary02,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.primary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineLarge02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary02,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineLarge03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary04,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary04,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineLarge04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g80,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineLarge05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g100,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextLarge01(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.primary01,
        backgroundColor = DealiColor.transparent,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextLarge02(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary01,
        backgroundColor = DealiColor.transparent,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextLarge03(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary04,
        backgroundColor = DealiColor.transparent,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextLarge04(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g80,
        backgroundColor = DealiColor.transparent,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextLarge05(
    text: String,
    modifier: Modifier = Modifier,
    @DrawableRes leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    iconColor: Color = Color.Unspecified,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g100,
        backgroundColor = DealiColor.transparent,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFF)
private fun TagLargePreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledLarge01(text = getRandomText(1))
            TagFilledLarge02(text = getRandomText(1))
            TagFilledLarge03(text = getRandomText(1))
            TagFilledLarge04(text = getRandomText(1))
            TagFilledLarge05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagOutlineLarge01(text = getRandomText(1))
            TagOutlineLarge02(text = getRandomText(1))
            TagOutlineLarge03(text = getRandomText(1))
            TagOutlineLarge04(text = getRandomText(1))
            TagOutlineLarge05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagTextLarge01(text = getRandomText(1))
            TagTextLarge02(text = getRandomText(1))
            TagTextLarge03(text = getRandomText(1))
            TagTextLarge04(text = getRandomText(1))
            TagTextLarge05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledLarge01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
                rightIcon = R.drawable.ic_heart_filled,
            )
            TagTextLarge01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
            )
        }
    }
}
