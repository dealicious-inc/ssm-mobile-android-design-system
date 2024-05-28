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
import androidx.compose.ui.text.AnnotatedString
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
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
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
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Popup(
        title = title,
        content = AnnotatedString(content),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties,
    )
}

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("Popup(\n" +
            "title = title,\n" +
            "content = content,\n" +
            "leftButtonText = leftButtonText,\n" +
            "rightButtonText = rightButtonText,\n" +
            "onLeftButtonClick = onLeftButtonClick,\n" +
            "onRightButtonClick = onRightButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    ),
)
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
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    Popup(
        title = title,
        content = AnnotatedString(content),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismiss,
        properties = properties,
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param content 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Popup(
    title: String,
    content: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposePopup(
        onDismissRequest = onDismissRequest,
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

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("Popup(\n" +
            "title = title,\n" +
            "content = content,\n" +
            "leftButtonText = leftButtonText,\n" +
            "rightButtonText = rightButtonText,\n" +
            "onLeftButtonClick = onLeftButtonClick,\n" +
            "onRightButtonClick = onRightButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    ),
)
@Composable
fun Popup(
    title: String,
    content: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    Popup(
        title = title,
        content = content,
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismiss,
        properties = properties,
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param content 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Popup(
    content: String,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Popup(
        content = AnnotatedString(content),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("Popup(\n" +
            "content = content,\n" +
            "leftButtonText = leftButtonText,\n" +
            "rightButtonText = rightButtonText,\n" +
            "onLeftButtonClick = onLeftButtonClick,\n" +
            "onRightButtonClick = onRightButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    ),
)
@Composable
fun Popup(
    content: String,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    Popup(
        content = AnnotatedString(content),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismiss,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param content 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Popup(
    content: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposePopup(
        onDismissRequest = onDismissRequest,
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

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("Popup(\n" +
            "content = content,\n" +
            "leftButtonText = leftButtonText,\n" +
            "rightButtonText = rightButtonText,\n" +
            "onLeftButtonClick = onLeftButtonClick,\n" +
            "onRightButtonClick = onRightButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    )
)
@Composable
fun Popup(
    content: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    Popup(
        content = content,
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismiss,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param content 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 버튼 외의 방법으로 팝업을 닫으려 할 때의 이벤트 콜백.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun PopupSingleButton(
    title: String,
    content: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    PopupSingleButton(
        title = title,
        content = AnnotatedString(content),
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("PopupSingleButton(\n" +
            "title = title,\n" +
            "content = content,\n" +
            "buttonText = buttonText,\n" +
            "onButtonClick = onButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    )
)
@Composable
fun PopupSingleButton(
    title: String,
    content: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    PopupSingleButton(
        title = title,
        content = AnnotatedString(content),
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismiss,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param content 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun PopupSingleButton(
    title: String,
    content: AnnotatedString,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposePopup(
        onDismissRequest = onDismissRequest,
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

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("PopupSingleButton(\n" +
            "title = title,\n" +
            "content = content,\n" +
            "buttonText = buttonText,\n" +
            "onButtonClick = onButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    )
)
@Composable
fun PopupSingleButton(
    title: String,
    content: AnnotatedString,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    PopupSingleButton(
        title = title,
        content = content,
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismiss,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param content 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun PopupSingleButton(
    content: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    PopupSingleButton(
        content = AnnotatedString(content),
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("PopupSingleButton(\n" +
            "content = content,\n" +
            "buttonText = buttonText,\n" +
            "onButtonClick = onButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    )
)
@Composable
fun PopupSingleButton(
    content: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    PopupSingleButton(
        content = AnnotatedString(content),
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismiss,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param content 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun PopupSingleButton(
    content: AnnotatedString,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposePopup(
        onDismissRequest = onDismissRequest,
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

@Deprecated(
    message = "onDismiss 콜백을 onDismissRequest로 변경해 주세요.",
    replaceWith = ReplaceWith("PopupSingleButton(\n" +
            "content = content,\n" +
            "buttonText = buttonText,\n" +
            "onButtonClick = onButtonClick,\n" +
            "onDismissRequest = onDismiss,\n" +
            "properties = properties\n" +
            ")"
    )
)
@Composable
fun PopupSingleButton(
    content: AnnotatedString,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismiss: () -> Unit,
    properties: DialogProperties = DialogProperties(),
    dummy: Unit = Unit // overloads error 해결용 더미 파라미터. deprecated 함수 제거시 함꼐 제거
) {
    PopupSingleButton(
        content = content,
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismiss,
        properties = properties
    )
}

@Composable
private fun ComposePopup(
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
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
        onDismissRequest = {}
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
        onDismissRequest = {}
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
        onDismissRequest = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun PopupSingleButtonWithoutTitlePreview() {
    PopupSingleButton(
        content = "댓글을 삭제하시겠습니까?",
        buttonText = "확인",
        onButtonClick = {},
        onDismissRequest = {}
    )
}
