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
fun TagFilledSemiMedium01(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSemiMedium02(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSemiMedium03(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSemiMedium04(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSemiMedium05(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSemiMedium01(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.primary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSemiMedium02(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSemiMedium03(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary04,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSemiMedium04(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSemiMedium05(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSemiMedium01(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSemiMedium02(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSemiMedium03(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSemiMedium04(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSemiMedium05(
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
        tagSize = TagSize.SemiMedium,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFF)
private fun TagSemiMediumPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledSemiMedium01(text = getRandomText(1))
            TagFilledSemiMedium02(text = getRandomText(1))
            TagFilledSemiMedium03(text = getRandomText(1))
            TagFilledSemiMedium04(text = getRandomText(1))
            TagFilledSemiMedium05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagOutlineSemiMedium01(text = getRandomText(1))
            TagOutlineSemiMedium02(text = getRandomText(1))
            TagOutlineSemiMedium03(text = getRandomText(1))
            TagOutlineSemiMedium04(text = getRandomText(1))
            TagOutlineSemiMedium05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagTextSemiMedium01(text = getRandomText(1))
            TagTextSemiMedium02(text = getRandomText(1))
            TagTextSemiMedium03(text = getRandomText(1))
            TagTextSemiMedium04(text = getRandomText(1))
            TagTextSemiMedium05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledSemiMedium01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
                rightIcon = R.drawable.ic_heart_filled,
            )
            TagTextSemiMedium01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
            )
        }
    }
}
