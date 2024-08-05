package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.actionbar.CoreActionBarLayout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun ActionBar(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    title: String = "",
    backgroundColor: Color = DealiColor.primary04,
    titleColor: Color = DealiColor.g100,
    backButtonColor: Color = DealiColor.primary05,
    menuContent: @Composable (() -> Unit)? = null,
) {
    CoreActionBarLayout(
        modifier = modifier,
        backgroundBrush = SolidColor(backgroundColor),
        mainContent = {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon24(
                    iconRes = R.drawable.ic_arrow_left,
                    color = backButtonColor,
                    onClick = onBack,
                )
                DealiText(
                    text = title,
                    style = DealiFont.sh3sb16,
                    color = titleColor,
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
fun ProductDetailsActionBar(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    menuContent: @Composable (() -> Unit)? = null,
) {
    CoreActionBarLayout(
        modifier = modifier,
        backgroundBrush = Brush.verticalGradient(listOf(
            // TODO 구현 당시 디자인 파일에 theme이 아닌 색상 코드로 작업 되어 있었음.
            Color(0xFF000000).copy(alpha = 0.3f),
            Color(0xFF606060).copy(alpha = 0.01f),
        )),
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

val ACTION_BAR_HEIGHT = 56.dp

@Composable
@Preview
private fun ActionBarPreview1() {
    ActionBar(
        onBack = {},
        title = "Preview"
    )
}

@Composable
@Preview
private fun ActionBarPreview2() {
    ActionBar(
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

@Composable
@Preview
private fun ActionBarPreview3() {
    ActionBar(
        onBack = {},
        title = "Preview",
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

@Composable
@Preview
private fun ActionBarPreview4() {
    ActionBar(
        onBack = {},
        title = "Preview",
        backgroundColor = DealiColor.secondary02,
        titleColor = DealiColor.primary04,
        backButtonColor = DealiColor.primary04,
    )
}

@Composable
@Preview(showBackground = true)
private fun ProductDetailsActionBarPreview() {
    ProductDetailsActionBar(
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
