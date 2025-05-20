package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.topbar.CoreTopBarLayout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    backgroundColor: Color = DealiColor.primary04,
    mainContent: @Composable (() -> Unit)? = null,
    menuContent: @Composable (() -> Unit)? = null,
) {
    CoreTopBarLayout(
        modifier = modifier,
        backgroundBrush = SolidColor(backgroundColor),
        mainContent = if (mainContent != null) {
            { mainContent() }
        } else {
            null
        },
        menuContent = if (menuContent != null) {
            { menuContent() }
        } else {
            null
        },
    )
}

@Composable
fun TopBar(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    title: String = "",
    titleColor: Color = DealiColor.g100,
    backgroundColor: Color = DealiColor.primary04,
    @DrawableRes backButtonIcon: Int = R.drawable.ic_arrow_left,
    backButtonColor: Color = DealiColor.primary05,
    menuContent: @Composable (() -> Unit)? = null,
) {
    CoreTopBarLayout(
        modifier = modifier,
        backgroundBrush = SolidColor(backgroundColor),
        mainContent = {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon24(
                    iconRes = backButtonIcon,
                    color = backButtonColor,
                    onClick = onBack,
                )
                DealiText(
                    text = title,
                    style = DealiFont.sh3sb16,
                    color = titleColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        },
        menuContent = if (menuContent != null) {
            { menuContent() }
        } else {
            null
        },
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarPreview1() {
    TopBar(
        mainContent = {
            DealiText(
                text = "Preview",
                style = DealiFont.sh3sb16,
                color = DealiColor.g100,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarPreview11() {
    TopBar(
        menuContent = {
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_search,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart,
                modifier = Modifier.badge(count = 1),
            )
        }
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarPreview3() {
    TopBar(
        onBack = {},
        title = "Preview"
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarPreview4() {
    TopBar(
        onBack = {},
        title = "Preview",
        menuContent = {
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_search,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart,
                modifier = Modifier.badge(count = 1),
            )
        }
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarrPreview5() {
    TopBar(
        onBack = {},
        title = "Preview Preview Preview Preview",
        menuContent = {
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_search,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_bookmark_1,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart,
                modifier = Modifier.badge(count = 99),
            )
        }
    )
}
