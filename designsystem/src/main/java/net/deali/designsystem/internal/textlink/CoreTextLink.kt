package net.deali.designsystem.internal.textlink

import androidx.annotation.DrawableRes
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.click.singleClickable

@Composable
internal fun CoreTextLink(
    modifier: Modifier = Modifier,
    text: String,
    @DrawableRes leftIcon: Int?,
    @DrawableRes rightIcon: Int?,
    clickable: Boolean,
    enabled: Boolean,
    textLinkStyle: TextLinkStyle,
    textLinkSize: TextLinkSize,
    defaultColor: Color,
    disabledColor: Color,
    onClick: () -> Unit,
    contentAlignment: Alignment = Alignment.Center,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val color = if (enabled) defaultColor else disabledColor

    Box(
        modifier = modifier
            .then(
                if (clickable) {
                    Modifier
                        .singleClickable(
                            interactionSource = interactionSource,
                            indication = ripple(),
                            enabled = enabled,
                            role = Role.Button,
                            onClick = onClick,
                        )
                } else {
                    Modifier
                }
            ),
        contentAlignment = contentAlignment,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (leftIcon != null) {
                Icon(
                    iconRes = leftIcon,
                    size = 16.dp,
                    color = color,
                )
            }

            val textStyle = when (textLinkSize) {
                TextLinkSize.Large -> DealiFont.b1sb15
                TextLinkSize.Medium -> DealiFont.b2r14
                TextLinkSize.Small -> DealiFont.b3r13
            }.copy(
                textDecoration = if (textLinkStyle == TextLinkStyle.Line) {
                    TextDecoration.Underline
                } else {
                    TextDecoration.None
                },
            )

            DealiText(
                text = text,
                style = textStyle,
                color = color,
            )
            if (rightIcon != null) {
                Icon(
                    iconRes = rightIcon,
                    size = 16.dp,
                    color = color,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    Column {
        CoreTextLink(
            text = "CoreTextLink",
            leftIcon = null,
            rightIcon = null,
            clickable = true,
            enabled = true,
            textLinkStyle = TextLinkStyle.Default,
            textLinkSize = TextLinkSize.Large,
            defaultColor = Color.Black,
            disabledColor = Color.Gray,
            onClick = {},
        )

        CoreTextLink(
            text = "CoreTextLink",
            leftIcon = R.drawable.ic_heart_filled,
            rightIcon = R.drawable.ic_heart_filled,
            clickable = true,
            enabled = true,
            textLinkStyle = TextLinkStyle.Line,
            textLinkSize = TextLinkSize.Small,
            defaultColor = DealiColor.primary01,
            disabledColor = Color.Gray,
            onClick = {},
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun Preview2() {
    Column {
        CoreTextLink(
            modifier = Modifier
                .width(120.dp)
                .height(60.dp),
            text = "가운데(기본)",
            leftIcon = null,
            rightIcon = null,
            clickable = true,
            enabled = true,
            textLinkStyle = TextLinkStyle.Default,
            textLinkSize = TextLinkSize.Large,
            defaultColor = Color.Black,
            disabledColor = Color.Gray,
            onClick = {},
        )

        CoreTextLink(
            modifier = Modifier
                .width(120.dp)
                .height(60.dp),
            text = "왼쪽 위로 정렬",
            leftIcon = null,
            rightIcon = null,
            clickable = true,
            enabled = true,
            textLinkStyle = TextLinkStyle.Line,
            textLinkSize = TextLinkSize.Small,
            defaultColor = DealiColor.primary01,
            disabledColor = Color.Gray,
            contentAlignment = Alignment.TopStart,
            onClick = {},
        )
    }

}
