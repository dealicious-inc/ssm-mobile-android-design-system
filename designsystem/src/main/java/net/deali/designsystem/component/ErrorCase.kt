package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun ErrorCase(
    content: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(DealiColor.primary04),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )
    }
}

@Composable
fun ErrorCase(
    @DrawableRes icon: Int,
    iconColor: Color,
    content: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(DealiColor.primary04),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier,
            res = icon,
            color = iconColor
        )

        VerticalSpacer(height = 12.dp)

        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )
    }
}

@Composable
fun ErrorCase(
    @DrawableRes icon: Int,
    iconColor: Color,
    content: String,
    buttonText: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .background(DealiColor.primary04),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier,
            res = icon,
            color = iconColor
        )

        VerticalSpacer(height = 12.dp)

        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )

        VerticalSpacer(height = 24.dp)

        Button(
            modifier = Modifier,
            text = buttonText,
            onClick = onClick
        )
    }
}

@Composable
fun ErrorCase(
    @DrawableRes icon: Int,
    iconColor: Color,
    title: String,
    content: String,
    buttonText: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .background(DealiColor.primary04),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier,
            res = icon,
            color = iconColor
        )

        VerticalSpacer(height = 12.dp)

        Title(
            modifier = Modifier
                .fillMaxWidth(),
            text = title
        )

        VerticalSpacer(height = 8.dp)

        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )

        VerticalSpacer(height = 24.dp)

        Button(
            modifier = Modifier,
            text = buttonText,
            onClick = onClick
        )
    }
}

@Composable
fun ErrorCase(
    @DrawableRes icon: Int,
    iconColor: Color,
    title: String,
    content: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .background(DealiColor.primary04),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier,
            res = icon,
            color = iconColor
        )

        VerticalSpacer(height = 12.dp)

        Title(
            modifier = Modifier
                .fillMaxWidth(),
            text = title
        )

        VerticalSpacer(height = 8.dp)

        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )
    }
}

@Composable
private fun Content(
    text: String,
    modifier: Modifier = Modifier
) {
    DealiText(
        modifier = modifier
            .padding(horizontal = 40.dp),
        text = text,
        style = DealiFont.b2r14,
        color = DealiColor.g60,
        textAlign = TextAlign.Center
    )
}

@Composable
private fun Icon(
    @DrawableRes res: Int,
    color: Color,
    modifier: Modifier = Modifier
) {
    Icon32(
        modifier = modifier,
        iconRes = res,
        color = color
    )
}

@Composable
private fun Title(
    text: String,
    modifier: Modifier = Modifier
) {
    DealiText(
        modifier = modifier,
        text = text,
        style = DealiFont.sh3sb16,
        color = DealiColor.g100,
        textAlign = TextAlign.Center
    )
}

@Composable
private fun Button(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    btnFilledLarge01(
        modifier = modifier
            .widthIn(min = 170.dp),
        text = text,
        onClick = onClick
    )
}

@Composable
@Preview
private fun ErrorCasePreview1() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요."
    )
}

@Composable
@Preview
private fun ErrorCasePreview2() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요.",
        icon = R.drawable.ic_notice_filled,
        iconColor = DealiColor.g60
    )
}

@Composable
@Preview
private fun ErrorCasePreview3() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요.",
        icon = R.drawable.ic_notice_filled,
        iconColor = DealiColor.g60,
        buttonText = "재시도",
        onClick = {}
    )
}

@Composable
@Preview
private fun ErrorCasePreview4() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        title = "타이틀이 들어가는 영역이예요.",
        content = "데이터를 불러오지 못했어요. 네트워크 확인 후 새로고침 버튼을 눌러주세요.",
        icon = R.drawable.ic_refresh_2_filled,
        iconColor = DealiColor.g60,
    )
}

@Composable
@Preview
private fun ErrorCasePreview5() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        title = "타이틀이 들어가는 영역이예요.",
        content = "데이터를 불러오지 못했어요. 네트워크 확인 후 새로고침 버튼을 눌러주세요.",
        icon = R.drawable.ic_refresh_2_filled,
        iconColor = DealiColor.g60,
        buttonText = "재시도",
        onClick = {}
    )
}
