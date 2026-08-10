package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.click.singleClickable

/**
 * 컨텐츠, 푸터를 외부에서 직접 구성하는 BottomSheet
 *
 * 버튼 정보를 파라미터로 넘기는 대신 [footer] 슬롯에 버튼 컴포저블을 직접 선언해서 사용한다.
 * 버튼이 필요 없는 경우 [footer]를 생략한다.
 */
@Composable
fun BottomSheet(
    content: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit = {},
    title: String? = null,
    hideXButton: Boolean = false,
    footer: @Composable ColumnScope.() -> Unit = {},
) {
    Column(modifier = modifier) {
        if (title != null) {
            BottomSheetHeader(
                title = title,
                hideXButton = hideXButton,
                onDismiss = onDismiss,
            )
        } else {
            Spacer(modifier = Modifier.height(16.dp))
        }

        Column(
            modifier = Modifier
                .weight(1f, false)
        ) {
            content()
        }

        footer()
    }
}


@Composable
fun BottomSheetHeader(
    title: String,
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit = {},
    hideXButton: Boolean = false,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(top = 24.dp)
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        DealiText(
            modifier = Modifier.weight(1f),
            text = title,
            style = DealiFont.sh2sb18,
            color = DealiColor.g100,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
        )
        Spacer(modifier = Modifier.width(16.dp))

        if (hideXButton.not()) {
            Icon(
                iconRes = R.drawable.ic_x,
                size = 24.dp,
                onClick = onDismiss,
            )
        }
    }
}

/** 텍스트 + 우측 체크 아이콘을 갖고 있는 바텀시트 옵션 */
@Composable
fun BottomSheetOption(
    text: String,
    onClick: () -> Unit,
    isSelected: Boolean = false,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp)
            .background(DealiColor.primary04)
            .singleClickable(onClick = onClick)
            .padding(horizontal = 16.dp)
    ) {
        DealiText(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            text = text,
            style = if (isSelected) DealiFont.b1sb15 else DealiFont.b1r15,
            color = if (isSelected) DealiColor.primary01 else DealiColor.g100,
        )

        if (isSelected) {
            Icon(
                modifier = Modifier.align(Alignment.CenterVertically),
                iconRes = R.drawable.ic_check,
                size = 24.dp,
                color = DealiColor.primary01,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheet() {
    BottomSheet(
        title = "타이틀",
        onDismiss = {},
        content = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(DealiColor.primary03)
            )
        },
        footer = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(74.dp)
                    .background(DealiColor.primary04)
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                btnOutlineLarge01(
                    modifier = Modifier.weight(1f),
                    text = "취소",
                    onClick = {},
                )
                Spacer(modifier = Modifier.width(8.dp))
                btnFilledLarge01(
                    modifier = Modifier.weight(1f),
                    text = "확인",
                    onClick = {},
                )
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetHeader() {
    BottomSheetHeader(
        title = "헤더"
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewBottomSheetOption() {
    Column {
        BottomSheetOption(
            text = "옵션입니다.",
            onClick = {},
            isSelected = true
        )

        BottomSheetOption(
            text = "옵션입니다.",
            onClick = {},
            isSelected = false
        )
    }
}