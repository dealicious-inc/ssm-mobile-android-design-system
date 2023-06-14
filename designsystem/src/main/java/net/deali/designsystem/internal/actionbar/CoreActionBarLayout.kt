package net.deali.designsystem.internal.actionbar

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.theme.AppTheme

@Composable
internal fun CoreActionBarLayout(
    modifier: Modifier = Modifier,
    mainContent: @Composable RowScope.() -> Unit,
    menuContent: @Composable RowScope.() -> Unit,
) {
    Box(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(56.dp)
                .padding(start = 16.dp, end = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MainRow(
                modifier = Modifier.weight(1f),
                content = mainContent,
            )
            MenuRow(
                modifier = Modifier,
                content = menuContent,
            )
        }
    }
}

@Composable
private fun MainRow(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) = Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically,
    content = content,
)

@Composable
private fun MenuRow(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) = Row(
    modifier = modifier,
    horizontalArrangement = Arrangement.spacedBy(20.dp),
    verticalAlignment = Alignment.CenterVertically,
    content = content,
)

@Composable
private fun MenuIcon(
    @DrawableRes iconRes: Int,
    badgeCount: Int,
    modifier: Modifier = Modifier
) {
    Icon24(
        iconRes = iconRes,
        modifier = modifier.drawNumberBadge(count = badgeCount),
    )
}

@OptIn(ExperimentalTextApi::class)
@Stable
private fun Modifier.drawNumberBadge(count: Int = 1): Modifier = composed {
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
