package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.internal.tag.CoreTag
import net.deali.designsystem.internal.tag.TagSize
import net.deali.designsystem.internal.tag.TagStyle
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.util.getRandomText

@Composable
fun TagFilledLarge01(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.primary01,
        backgroundColor = DealiColor.primary03,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagFilledLarge02(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary01,
        backgroundColor = DealiColor.secondary03,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagFilledLarge03(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary04,
        backgroundColor = DealiColor.secondary06,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagFilledLarge04(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g80,
        backgroundColor = DealiColor.g10,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Filled,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagOutlineLarge01(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.primary02,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.primary01,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagOutlineLarge02(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary02,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary01,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagOutlineLarge03(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.secondary04,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.secondary04,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
    )
}

@Composable
fun TagOutlineLarge04(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null,
) {
    CoreTag(
        modifier = modifier,
        text = text,
        color = DealiColor.g80,
        backgroundColor = DealiColor.primary04,
        tagSize = TagSize.Large,
        tagStyle = TagStyle.Outline,
        borderColor = DealiColor.g20,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
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
