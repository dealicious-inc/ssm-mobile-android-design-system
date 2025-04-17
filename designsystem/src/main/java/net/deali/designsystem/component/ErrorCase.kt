package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.errorcase.CoreErrorCase
import net.deali.designsystem.internal.errorcase.ErrorCaseDefaults
import net.deali.designsystem.internal.errorcase.ErrorCaseDefaults.iconColor
import net.deali.designsystem.internal.errorcase.ErrorCaseState
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

/**
 * 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    content: String,
    modifier: Modifier = Modifier,
) {
    CoreErrorCase(
        modifier = modifier,
    ) {
        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )
    }
}

/**
 * 아이콘, 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    content: String,
    state: ErrorCaseState,
    modifier: Modifier = Modifier,
) {
    val iconRes = ErrorCaseDefaults.icon(state = state)

    CoreErrorCase(
        modifier = modifier,
    ) {
        Icon32(
            modifier = Modifier,
            iconRes = iconRes,
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

/**
 * 아이콘, 텍스트, 버튼이 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    content: String,
    buttonText: String,
    state: ErrorCaseState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val iconRes = ErrorCaseDefaults.icon(state = state)

    CoreErrorCase(
        modifier = modifier,
    ) {
        Icon32(
            modifier = Modifier,
            iconRes = iconRes,
            color = iconColor,
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

/**
 * 아이콘, 타이틀 텍스트, 서브 텍스트, 버튼이 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    title: String,
    content: String,
    buttonText: String,
    state: ErrorCaseState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val iconRes = ErrorCaseDefaults.icon(state = state)

    CoreErrorCase(
        modifier = modifier,
    ) {
        Icon32(
            modifier = Modifier,
            iconRes = iconRes,
            color = iconColor,
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

/**
 * 아이콘, 타이틀 텍스트, 서브 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    title: String,
    content: String,
    state: ErrorCaseState,
    modifier: Modifier = Modifier,
) {
    val iconRes = ErrorCaseDefaults.icon(state = state)

    CoreErrorCase(
        modifier = modifier,
    ) {
        Icon32(
            modifier = Modifier,
            iconRes = iconRes,
            color = iconColor,
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

/**
 * 이미지, 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    content: String,
    @DrawableRes imageRes: Int,
    modifier: Modifier = Modifier,
) {
    CoreErrorCase(
        modifier = modifier,
    ) {
        ErrorImage(imageRes)

        VerticalSpacer(height = 12.dp)

        Content(
            modifier = Modifier
                .fillMaxWidth(),
            text = content
        )
    }
}

/**
 * 이미지, 텍스트, 버튼이 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    content: String,
    buttonText: String,
    @DrawableRes imageRes: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    CoreErrorCase(
        modifier = modifier,
    ) {
        ErrorImage(imageRes)

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

/**
 * 이미지, 타이틀 텍스트, 서브 텍스트, 버튼이 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    title: String,
    content: String,
    buttonText: String,
    @DrawableRes imageRes: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    CoreErrorCase(
        modifier = modifier,
    ) {
        ErrorImage(imageRes)

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

/**
 * 이미지, 타이틀 텍스트, 서브 텍스트가 있는 ErrorCase
 */
@Composable
fun ErrorCase(
    title: String,
    content: String,
    @DrawableRes imageRes: Int,
    modifier: Modifier = Modifier,
) {
    CoreErrorCase(
        modifier = modifier,
    ) {
        ErrorImage(imageRes)

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
    modifier: Modifier = Modifier,
) {
    DealiText(
        modifier = modifier,
        text = text,
        style = DealiFont.b2r14,
        color = DealiColor.g70,
        textAlign = TextAlign.Center
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
private fun ErrorImage(@DrawableRes imageRes: Int) {
    Image(
        modifier = Modifier
            .size(68.dp),
        painter = painterResource(imageRes),
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
private fun ErrorCasePreview1() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요.",
    )
}

@Preview(showBackground = true)
@Composable
private fun ErrorCasePreview2() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요.",
        state = ErrorCaseState.REFRESH,
    )
}

@Preview(showBackground = true)
@Composable
private fun ErrorCasePreview3() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        content = "등록된 상품이 없어요.",
        buttonText = "재시도",
        state = ErrorCaseState.REFRESH,
        onClick = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun ErrorCasePreview4() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        title = "타이틀이 들어가는 영역이예요.",
        content = "데이터를 불러오지 못했어요. 네트워크 확인 후 새로고침 버튼을 눌러주세요.",
        state = ErrorCaseState.NOTICE,
    )
}

@Preview(showBackground = true)
@Composable
private fun ErrorCasePreview5() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        title = "타이틀이 들어가는 영역이예요.",
        content = "데이터를 불러오지 못했어요. 네트워크 확인 후 새로고침 버튼을 눌러주세요.",
        buttonText = "재시도",
        state = ErrorCaseState.NOTICE,
        onClick = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun ErrorCasePreview6() {
    ErrorCase(
        modifier = Modifier
            .fillMaxWidth(),
        title = "타이틀이 들어가는 영역이예요.",
        content = "데이터를 불러오지 못했어요. 네트워크 확인 후 새로고침 버튼을 눌러주세요.",
        buttonText = "재시도",
        imageRes = R.drawable.img_mbs_filled,
        onClick = {},
    )
}
