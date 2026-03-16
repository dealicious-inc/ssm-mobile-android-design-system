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
fun TagFilledSmall01(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSmall02(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSmall03(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagFilledSmall04(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Filled,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSmall01(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.primary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSmall02(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary01,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSmall03(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary04,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagOutlineSmall04(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSmall01(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSmall02(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSmall03(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSmall04(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
fun TagTextSmall05(
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
        tagSize = TagSize.Small,
        tagStyle = TagStyle.Text,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        iconColor = iconColor,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFF)
private fun TagSmallPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledSmall01(text = getRandomText(1))
            TagFilledSmall02(text = getRandomText(1))
            TagFilledSmall03(text = getRandomText(1))
            TagFilledSmall04(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagOutlineSmall01(text = getRandomText(1))
            TagOutlineSmall02(text = getRandomText(1))
            TagOutlineSmall03(text = getRandomText(1))
            TagOutlineSmall04(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagTextSmall01(text = getRandomText(1))
            TagTextSmall02(text = getRandomText(1))
            TagTextSmall03(text = getRandomText(1))
            TagTextSmall04(text = getRandomText(1))
            TagTextSmall05(text = getRandomText(1))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TagFilledSmall01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
                rightIcon = R.drawable.ic_heart_filled,
            )
            TagTextSmall01(
                text = getRandomText(1),
                leftIcon = R.drawable.ic_star_filled,
            )
        }
    }
}
