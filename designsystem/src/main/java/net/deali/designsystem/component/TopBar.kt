package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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

@Composable
fun ProductDetailsTopBar(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    menuContent: @Composable (() -> Unit)? = null,
) {
    CoreTopBarLayout(
        modifier = modifier,
        backgroundBrush = Brush.verticalGradient(
            listOf(
                // TODO 구현 당시 디자인 파일에 theme이 아닌 색상 코드로 작업 되어 있었음.
                Color(0xFF000000).copy(alpha = 0.3f),
                Color(0xFF606060).copy(alpha = 0.01f),
            )
        ),
        mainContent = {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon24(
                    iconRes = R.drawable.ic_arrow_left,
                    color = Color(0xFFFFFFFF),
                    onClick = onBack,
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
        onBack = {},
        title = "Preview"
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarPreview2() {
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
private fun TopBarrPreview3() {
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

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun TopBarPreview4() {
    TopBar(
        onBack = {},
        title = "Preview",
        backgroundColor = DealiColor.secondary02,
        titleColor = DealiColor.primary04,
        backButtonColor = DealiColor.primary04,
    )
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun ProductDetailsTopBarPreview() {
    ProductDetailsTopBar(
        onBack = {},
        menuContent = {
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_search,
                color = DealiColor.primary04,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart,
                modifier = Modifier.badge(count = 1),
                color = DealiColor.primary04,
            )
        }
    )
}
