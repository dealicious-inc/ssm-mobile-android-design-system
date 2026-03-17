package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
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
 * @param modifier Modifier.
 * @param title 타이틀.
 * @param titleIconRes 타이틀 아이콘 리소스. (기본값: [R.drawable.ic_notice])
 * @param textLinkText 타이틀 우측 텍스트링크 버튼의 텍스트.
 * @param onClickTextLink 텍스트링크 클릭 시의 액션.
 * @param content 본문 컨텐츠.
 */
@Composable
fun Notice(
    modifier: Modifier = Modifier,
    onClickTextLink: () -> Unit = {},
    title: String = "",
    @DrawableRes titleIconRes: Int = R.drawable.ic_notice,
    textLinkText: String = "",
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = DealiColor.g10,
                shape = RoundedCornerShape(10.dp),
            )
            .clip(RoundedCornerShape(10.dp)),
    ) {
        if (title.isNotEmpty()) {
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
        }

        Box(
            modifier = Modifier.padding(16.dp),
        ) {
            content()
        }
    }
}

/**
 * 아이콘, 타이틀, 텍스트링크를 추가할 수 있고
 * [labeledTextBullet01] 리스트를 사용하는 Notice 컨테이너.
 *
 * @param textList labeledTextBullet01 리스트에 나열할 텍스트 리스트.
 * @param modifier Modifier.
 * @param title 타이틀.
 * @param titleIconRes 타이틀 아이콘 리소스. (기본값: [R.drawable.ic_notice])
 * @param textStyle textList에 적용할 DealiFont 텍스트 스타일
 * @param textLinkText 타이틀 우측 텍스트링크 버튼의 텍스트.
 * @param onClickTextLink 텍스트링크 클릭 시의 액션.
 */
@Composable
fun Notice(
    textList: List<String>,
    modifier: Modifier = Modifier,
    onClickTextLink: () -> Unit = {},
    title: String = "",
    @DrawableRes titleIconRes: Int = R.drawable.ic_notice,
    textStyle: TextStyle = DealiFont.b3r13,
    textLinkText: String = "",
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = DealiColor.g10,
                shape = RoundedCornerShape(10.dp),
            )
            .clip(RoundedCornerShape(10.dp)),
    ) {
        if (title.isNotEmpty()) {
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
        }

        labeledTextBullet01(
            modifier = Modifier.padding(16.dp),
            textList = textList,
        )
    }
}

@Composable
private fun Title(
    title: String,
    onClickTextLink: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes titleIconRes: Int = R.drawable.ic_notice,
    textLinkText: String = "",
) {
    Row(
        modifier = modifier
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            iconRes = titleIconRes,
            size = 16.dp,
        )

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

@Preview(name = "자유 content 형식")
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

@Preview(name = "타이틀 + 텍스트링크 + 자유 형식")
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

@Preview(name = "텍스트 리스트 사용하는 notice")
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
