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
fun TagFilledMedium01(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledMedium02(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledMedium03(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledMedium04(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlinedMedium01(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.primary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlinedMedium02(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlinedMedium03(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary04,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlinedMedium04(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextMedium01(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextMedium02(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextMedium03(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextMedium04(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextMedium05(
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
        tagSize = TagSize.Medium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFF)
private fun TagMediumPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledMedium01(text = getRandomText(1))
            TagFilledMedium02(text = getRandomText(1))
            TagFilledMedium03(text = getRandomText(1))
            TagFilledMedium04(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagOutlinedMedium01(text = getRandomText(1))
            TagOutlinedMedium02(text = getRandomText(1))
            TagOutlinedMedium03(text = getRandomText(1))
            TagOutlinedMedium04(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagTextMedium01(text = getRandomText(1))
            TagTextMedium02(text = getRandomText(1))
            TagTextMedium03(text = getRandomText(1))
            TagTextMedium04(text = getRandomText(1))
            TagTextMedium05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledMedium01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
                rightIcon = R.drawable.ic_heart_filled,
            )
            TagTextMedium01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
            )
        }
    }
}
