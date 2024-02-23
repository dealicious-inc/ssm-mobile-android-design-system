package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.theme.DealiShape

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param content 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismiss 버튼 외의 방법으로 팝업을 닫으려 할 때의 이벤트 콜백.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Popup(
    title: String,
    content: String,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 60.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            DealiText(
                text = title,
                style = DealiFont.sh2sb18,
                color = DealiColor.g100
            )
            Spacer(modifier = Modifier.height(10.dp))
        }
        Spacer(modifier = Modifier.height(4.dp))
        DealiText(
            text = content,
            style = DealiFont.sh3r16,
            color = DealiColor.g70
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            btnOutlineMedium01(
                modifier = Modifier.weight(1f),
                text = leftButtonText,
                enabled = true,
                onClick = onLeftButtonClick
            )
            btnFilledMedium01(
                modifier = Modifier.weight(1f),
                text = rightButtonText,
                enabled = true,
                onClick = onRightButtonClick
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param content 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismiss 버튼 외의 방법으로 팝업을 닫으려 할 때의 이벤트 콜백.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Popup(
    content: String,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        DealiText(
            text = content,
            style = DealiFont.sh3r16,
            color = DealiColor.g70
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            btnOutlineMedium01(
                modifier = Modifier.weight(1f),
                text = leftButtonText,
                enabled = true,
                onClick = onLeftButtonClick
            )
            btnFilledMedium01(
                modifier = Modifier.weight(1f),
                text = rightButtonText,
                enabled = true,
                onClick = onRightButtonClick
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param content 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismiss 버튼 외의 방법으로 팝업을 닫으려 할 때의 이벤트 콜백.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun PopupSingleButton(
    title: String,
    content: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 60.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            DealiText(
                text = title,
                style = DealiFont.sh2sb18,
                color = DealiColor.g100
            )
            Spacer(modifier = Modifier.height(10.dp))
        }
        Spacer(modifier = Modifier.height(4.dp))
        DealiText(
            text = content,
            style = DealiFont.sh3r16,
            color = DealiColor.g70
        )
        Spacer(modifier = Modifier.height(24.dp))
        btnFilledMedium01(
            modifier = Modifier.fillMaxWidth(),
            text = buttonText,
            enabled = true,
            onClick = onButtonClick
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param content 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismiss 버튼 외의 방법으로 팝업을 닫으려 할 때의 이벤트 콜백.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun PopupSingleButton(
    content: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Popup(
        onDismissRequest = onDismiss,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        DealiText(
            text = content,
            style = DealiFont.sh3r16,
            color = DealiColor.g70
        )
        Spacer(modifier = Modifier.height(24.dp))
        btnFilledMedium01(
            modifier = Modifier.fillMaxWidth(),
            text = buttonText,
            enabled = true,
            onClick = onButtonClick
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
private fun Popup(
    properties: DialogProperties = DialogProperties(),
    onDismissRequest: () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Column(
            modifier = Modifier
                .clip(DealiShape.radius10)
                .background(DealiColor.primary04)
                .width(280.dp)
                .padding(horizontal = 20.dp),
            content = content
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupPreview() {
    Popup(
        title = "title",
        content = "댓글을 삭제하시겠습니까?",
        leftButtonText = "취소",
        rightButtonText = "확인",
        onLeftButtonClick = {},
        onRightButtonClick = {},
        onDismiss = {},
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupWithoutTitlePreview() {
    Popup(
        content = "댓글을 삭제하시겠습니까?",
        leftButtonText = "취소",
        rightButtonText = "확인",
        onLeftButtonClick = {},
        onRightButtonClick = {},
        onDismiss = {},
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupSingleButtonPreview() {
    PopupSingleButton(
        title = "title",
        content = "댓글을 삭제하시겠습니까?",
        buttonText = "확인",
        onButtonClick = {},
        onDismiss = {},
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupSingleButtonWithoutTitlePreview() {
    PopupSingleButton(
        content = "댓글을 삭제하시겠습니까?",
        buttonText = "확인",
        onButtonClick = {},
        onDismiss = {},
    )
}
