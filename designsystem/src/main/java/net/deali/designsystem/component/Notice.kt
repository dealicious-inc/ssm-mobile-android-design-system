package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

/**
 * 아이콘, 타이틀, 텍스트링크를 추가할 수 있는 Notice 컨테이너.
 * 클릭 시 확장/축소 기능이 필요하다면 [Accordion]을 사용합니다.
 *
 * @param title 타이틀
 * @param onClickTextLink 아코디언 확장 여부 변경 콜백
 * @param content 아코디언 내용
 */
@Composable
fun Notice(
    title: String,
    modifier: Modifier = Modifier,
    @DrawableRes titleIconRes: Int = R.drawable.ic_notice,
    textLinkText: String = "",
    onClickTextLink: () -> Unit = {},
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .background(
                color = DealiColor.g10,
                shape = RoundedCornerShape(10.dp),
            )
            .clip(RoundedCornerShape(10.dp)),
    ) {
        Title(
            title = title,
            titleIconRes = titleIconRes,
            textLinkText = textLinkText,
            onClickTextLink = onClickTextLink,
        )

        HorizontalDivider(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            color = DealiColor.g30
        )

        Box(
            modifier = Modifier.padding(16.dp),
        ) {
            content()
        }
    }
}

/**
 * 타이틀 영역이 없이 [labeledTextBullet01] 리스트만 있는 Notice 컨테이너.
 *
 * @param
 */
@Composable
fun Notice(
    textList: List<String>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .background(
                color = DealiColor.g10,
                shape = RoundedCornerShape(10.dp),
            )
            .clip(RoundedCornerShape(10.dp))
            .padding(16.dp),
    ) {
        labeledTextBullet01(
            textList = textList
        )
    }
}

@Composable
private fun Title(
    title: String,
    modifier: Modifier = Modifier,
    @DrawableRes titleIconRes: Int = R.drawable.ic_notice,
    textLinkText: String = "",
    onClickTextLink: () -> Unit,
) {
    Row(
        modifier = modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon16(iconRes = titleIconRes)

        HorizontalSpacer(width = 8.dp)

        DealiText(
            modifier = Modifier
                .weight(1f),
            text = title,
            style = DealiFont.b2sb14
        )

        HorizontalSpacer(width = 16.dp)

        if (textLinkText.isNotEmpty()) {
            textLinkSmall05(
                text = textLinkText,
                onClick = onClickTextLink,
            )
        }
    }
}

@Preview
@Composable
private fun Preview1() {
    Notice(
        title = "타이틀",
        onClickTextLink = {},
        content = {
            Box(
                modifier = Modifier.height(200.dp)
            )
        }
    )
}

@Preview
@Composable
private fun Preview2() {
    Notice(
        title = "타이틀",
        textLinkText = "텍스트링크",
        content = {
            val texts = listOf(
                getRandomText(9),
                getRandomText(13),
                getRandomText(15),
            )

            labeledTextBullet01(
                textList = texts,
            )
        }
    )
}

@Preview(name = "타이틀 없이 텍스트 리스트만 있는 notice")
@Composable
private fun Preview3() {
    Notice(
        textList = listOf(
            getRandomText(9),
            getRandomText(13),
            getRandomText(15),
        )
    )
}
