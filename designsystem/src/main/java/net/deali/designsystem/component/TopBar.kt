package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.actionbar.CoreActionBarLayout
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 타이틀 텍스트, 우측 아이콘으로 구성된 TopBar.
 * 엔지니어 모드를 사용하기 위해서는 디자인 시스템이 아닌 프로젝트 내 TopBar를 사용하세요.
 */
@Composable
fun TopBarWithoutEngineerMode(
    modifier: Modifier = Modifier,
    title: String = "",
    firstIconRes: Int? = null,
    secondIconRes: Int? = null,
    thirdIconRes: Int? = null,
    onClickFirstIcon: () -> Unit = {},
    onClickSecondIcon: () -> Unit = {},
    onClickThirdIcon: () -> Unit = {},
    firstIconBadgeCount: Int? = null,
    secondIconBadgeCount: Int? = null,
    thirdIconBadgeCount: Int? = null,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = DealiColor.primary04),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        HorizontalSpacer(width = 16.dp)

        DealiText(
            modifier = Modifier
                .weight(1f)
                .padding(end = 20.dp),
            text = title,
            style = DealiFont.sh3sb16,
            color = DealiColor.g100,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        firstIconRes?.let {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clickable(onClick = onClickFirstIcon),
            ) {
                Icon24(
                    modifier = Modifier.align(Alignment.Center),
                    iconRes = firstIconRes,
                )
            }

            HorizontalSpacer(width = 10.dp)


        }

    }
}

/**
 * 뒤로가기 버튼, 타이틀 텍스트, 우측 아이콘으로 구성된 TopBar.
 * 엔지니어 모드를 사용하기 위해서는 디자인 시스템이 아닌 프로젝트 내 TopBar를 사용하세요.
 */
@Composable
fun TopBarWithoutEngineerMode(
    modifier: Modifier = Modifier,
    title: String = "",
    titleColor: Color = DealiColor.g100,
    backgroundColor: Color = DealiColor.primary04,
    backButtonColor: Color = DealiColor.primary05,
    onBack: () -> Unit,
    menuContent: @Composable (() -> Unit)? = null,
) {
    CoreActionBarLayout(
        modifier = modifier,
        backgroundBrush = SolidColor(backgroundColor),
        mainContent = {
            Row(
                modifier = modifier,
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
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
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

@Preview
@Composable
fun PreviewTopBarDesign1() {
    TopBarWithoutEngineerMode(
        title = "타이틀입니당 타이틀입니당 타이틀입니당 타이틀입니당 타이틀입니당 ",
        firstIconRes = R.drawable.ic_bookmark_2,
        onClickFirstIcon = {},
        firstIconBadgeCount = 9
    )
}

@Preview
@Composable
fun PreviewTopBarDesign2() {
    TopBarWithoutEngineerMode(
        title = "타이틀입니당 타이틀입니당 타이틀입니당 타이틀입니당 타이틀입니당 ",
        onBack = {},
    )
}