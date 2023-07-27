package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.actionbar.CoreActionBarLayout
import net.deali.designsystem.theme.AppTheme

@Composable
fun ActionBar(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    title: String = "",
    backgroundColor: Color = AppTheme.colors.primary04,
    titleColor: Color = AppTheme.colors.text01,
    backButtonColor: Color = AppTheme.colors.primary05,
    menuContent: @Composable (ActionBarScope.() -> Unit)? = null,
) {
    CoreActionBarLayout(
        modifier = modifier,
        backgroundBrush = SolidColor(backgroundColor),
        mainContent = {
            Row(
                modifier = modifier,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon24(
                    iconRes = R.drawable.ic_arrow_left_24_ver01,
                    color = backButtonColor,
                    onClick = onBack,
                )
                DealiText(
                    text = title,
                    style = AppTheme.typography.sh3b16,
                    color = titleColor,
                )
            }
        },
        menuContent = if (menuContent != null) {
            { ActionBarScopeImpl.menuContent() }
        } else {
            null
        },
    )
}

@Composable
fun ProductDetailsActionBar(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    menuContent: @Composable (ActionBarScope.() -> Unit)? = null,
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
                modifier = modifier,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon24(
                    iconRes = R.drawable.ic_arrow_left_24_ver01,
                    color = Color(0xFFFFFFFF),
                    onClick = onBack,
                )
            }
        },
        menuContent = if (menuContent != null) {
            { ActionBarScopeImpl.menuContent() }
        } else {
            null
        },
    )
}

@LayoutScopeMarker
@Immutable
interface ActionBarScope {
    /**
     * Composable 우측 상단에 숫자가 표기되는 배지 추가.
     *
     * @param count 배지에 표시 할 숫자.
     */
    @Stable
    fun Modifier.badge(count: Int): Modifier
}

@Immutable
private object ActionBarScopeImpl : ActionBarScope {
    @OptIn(ExperimentalTextApi::class)
    override fun Modifier.badge(count: Int): Modifier = composed {
        require(count > 0) { "badge count must be positive." }

        val badgeColor = AppTheme.colors.primary01
        val textColor = AppTheme.colors.primary04

        val textMeasurer = rememberTextMeasurer()
        val textStyle = AppTheme.typography.c1b10.merge(
            TextStyle(color = textColor)
        )

        val isSingleDigit = count < 10
        val singleDigitBadgeRadius = with(LocalDensity.current) {
            8.dp.toPx()
        }
        val multiDigitBadgeSize = with(LocalDensity.current) {
            DpSize(21.dp, 14.dp).toSize()
        }

        drawWithCache {
            val measuredText = textMeasurer.measure(
                text = count.toString(),
                style = textStyle
            )
            val badgeCenter = Offset(x = size.width, y = 0f)
            val badgeRadius = CornerRadius(x = 100f, y = 100f)

            onDrawWithContent {
                drawContent()

                if (isSingleDigit) {
                    drawCircle(
                        color = badgeColor,
                        radius = singleDigitBadgeRadius,
                        center = badgeCenter,
                    )
                } else {
                    drawRoundRect(
                        color = badgeColor,
                        topLeft = Offset(
                            x = badgeCenter.x - multiDigitBadgeSize.width / 2f,
                            y = badgeCenter.y - multiDigitBadgeSize.height / 2f
                        ),
                        size = multiDigitBadgeSize,
                        cornerRadius = badgeRadius,
                    )
                }

                drawText(
                    textLayoutResult = measuredText,
                    topLeft = Offset(
                        x = badgeCenter.x - measuredText.size.width / 2f,
                        y = badgeCenter.y - measuredText.size.height / 2f
                    ),
                )
            }
        }
    }
}

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
                iconRes = R.drawable.ic_search_24_ver01,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart_24_ver01,
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
                iconRes = R.drawable.ic_search_24_ver01,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_bookmark_24_ver01,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart_24_ver01,
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
        backgroundColor = AppTheme.colors.secondary02,
        titleColor = AppTheme.colors.primary04,
        backButtonColor = AppTheme.colors.primary04,
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
                iconRes = R.drawable.ic_search_24_ver01,
                color = AppTheme.colors.primary04,
            )
            Icon24(
                onClick = {},
                iconRes = R.drawable.ic_cart_24_ver01,
                modifier = Modifier.badge(count = 1),
                color = AppTheme.colors.primary04,
            )
        }
    )
}
