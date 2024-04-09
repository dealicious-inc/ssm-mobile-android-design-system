package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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

/**
 * 텍스트만 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    modifier: Modifier = Modifier,
    content: String,
    paddingBottomDp: Int = 100,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
    ) {
        Content(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(start = 40.dp, end = 40.dp, bottom = paddingBottomDp.dp),
            text = content,
        )
    }
}

/**
 * 아이콘, 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    iconColor: Color = DealiColor.g60,
    content: String,
    paddingBottomDp: Int = 100,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(start = 40.dp, end = 40.dp, bottom = paddingBottomDp.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon32(
                modifier = Modifier,
                iconRes = icon,
                color = iconColor,
            )

            VerticalSpacer(height = 12.dp)

            Content(
                modifier = Modifier
                    .fillMaxWidth(),
                text = content
            )
        }
    }
}

/**
 * 아이콘, 텍스트, 버튼이 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    iconColor: Color = DealiColor.g60,
    content: String,
    buttonText: String,
    paddingBottomDp: Int = 100,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(start = 40.dp, end = 40.dp, bottom = paddingBottomDp.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon32(
                modifier = Modifier,
                iconRes = icon,
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
}

/**
 * 아이콘, 타이틀 텍스트, 서브 텍스트, 버튼이 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    iconColor: Color = DealiColor.g60,
    title: String,
    content: String,
    buttonText: String,
    paddingBottomDp: Int = 100,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(start = 40.dp, end = 40.dp, bottom = paddingBottomDp.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon32(
                modifier = Modifier,
                iconRes = icon,
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
}

/**
 * 아이콘, 타이틀 텍스트, 서브 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    iconColor: Color = DealiColor.g60,
    title: String,
    content: String,
    paddingBottomDp: Int = 40,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DealiColor.primary04),
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(start = 40.dp, end = 40.dp, bottom = paddingBottomDp.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon32(
                modifier = Modifier,
                iconRes = icon,
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
}

@Composable
private fun Content(
    text: String,
    modifier: Modifier = Modifier
) {
    DealiText(
        modifier = modifier,
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
    modifier: Modifier = Modifier,
    text: String,
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
@Preview(heightDp = 500)
private fun ErrorCasePreview1() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요."
    )
}

@Composable
@Preview(heightDp = 500)
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
@Preview(heightDp = 500)
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
@Preview(heightDp = 500)
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
@Preview(heightDp = 500)
private fun ErrorCasePreview5() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        title = "타이틀이 들어가는 영역이예요.",
        content = "데이터를 불러오지 못했어요. 네트워크 확인 후 새로고침 버튼을 눌러주세요.",
        icon = R.drawable.ic_refresh_2_filled,
        iconColor = DealiColor.g60,
        buttonText = "재시도",
        onClick = {},
    )
}
