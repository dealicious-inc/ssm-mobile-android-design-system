package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.imagechip.CoreRegularImageChip
import net.deali.designsystem.internal.imagechip.ImageChipSize
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun imgChipMedium01(
    imageUrl: String,
    @DrawableRes placeholder: Int,
    text: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign? = null,
    @DrawableRes rightIcon: Int? = null,
    rightIconColor: Color? = Color.Unspecified,
    clickable: Boolean = true,
    selected: Boolean = false,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    subContent: @Composable (() -> Unit)? = null,
    onRightIconClick: (() -> Unit)? = null,
) {
    CoreRegularImageChip(
        modifier = modifier,
        imageUrl = imageUrl,
        placeholder = placeholder,
        text = text,
        textAlign = textAlign,
        subContent = subContent,
        rightIcon = rightIcon,
        rightIconColor = rightIconColor,
        clickable = clickable,
        selected = selected,
        enabled = enabled,
        imageChipSize = ImageChipSize.Medium,
        interactionSource = interactionSource,
        onClick = onClick,
        onRightIconClick = onRightIconClick,
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview1() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            onClick = {},
        )

        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            selected = true,
            onClick = {},
        )

        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            enabled = false,
            onClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview2() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            subContent = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon16(
                        iconRes = R.drawable.ic_arrow_close_1_filled,
                        color = DealiColor.primary01
                    )
                    DealiText(
                        text = "999%",
                        style = DealiFont.b2sb14,
                        color = DealiColor.primary01
                    )
                }
            },
            onClick = {},
        )

        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            subContent = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon16(
                        iconRes = R.drawable.ic_arrow_close_1_filled,
                        color = DealiColor.primary01
                    )
                    DealiText(
                        text = "999%",
                        style = DealiFont.b2sb14,
                        color = DealiColor.primary01
                    )
                }
            },
            selected = true,
            onClick = {},
        )

        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            subContent = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon16(
                        iconRes = R.drawable.ic_arrow_close_1_filled,
                        color = DealiColor.primary01
                    )
                    DealiText(
                        text = "999%",
                        style = DealiFont.b2sb14,
                        color = DealiColor.primary01
                    )
                }
            },
            enabled = false,
            onClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview3() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            subContent = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon16(
                        iconRes = R.drawable.ic_arrow_close_1_filled,
                        color = DealiColor.primary01
                    )
                    DealiText(
                        text = "999%",
                        style = DealiFont.b2sb14,
                        color = DealiColor.primary01
                    )
                }
            },
            rightIcon = R.drawable.ic_x,
            onRightIconClick = {},
            onClick = {},
        )

        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            subContent = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon16(
                        iconRes = R.drawable.ic_arrow_close_1_filled,
                        color = DealiColor.primary01
                    )
                    DealiText(
                        text = "999%",
                        style = DealiFont.b2sb14,
                        color = DealiColor.primary01
                    )
                }
            },
            rightIcon = R.drawable.ic_x,
            onRightIconClick = {},
            selected = true,
            onClick = {},
        )

        imgChipMedium01(
            imageUrl = "https://test.com",
            placeholder = R.drawable.ic_home_filled,
            text = "imgChipMedium01",
            subContent = {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon16(
                        iconRes = R.drawable.ic_arrow_close_1_filled,
                        color = DealiColor.primary01
                    )
                    DealiText(
                        text = "999%",
                        style = DealiFont.b2sb14,
                        color = DealiColor.primary01
                    )
                }
            },
            rightIcon = R.drawable.ic_x,
            onRightIconClick = {},
            enabled = false,
            onClick = {},
        )
    }
}