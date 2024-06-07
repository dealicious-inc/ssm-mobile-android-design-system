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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    title: String,
    contentText: String,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Alert(
        title = title,
        contentText = AnnotatedString(contentText),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties,
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param content 팝업 커스텀 컨텐츠 슬롯.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    title: String,
    contentText: String,
    leftButtonText: String,
    rightButtonText: String,
    content: @Composable () -> Unit,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Alert(
        title = title,
        contentText = AnnotatedString(contentText),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        content = content,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    title: String,
    contentText: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposeAlert(
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
            text = contentText,
            style = DealiFont.b1r15,
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
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param content 팝업 커스텀 컨텐츠 슬롯.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    title: String,
    contentText: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    content: @Composable () -> Unit,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposeAlert(
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
            text = contentText,
            style = DealiFont.b1r15,
            color = DealiColor.g70
        )
        Spacer(modifier = Modifier.height(16.dp))
        content()
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
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    contentText: String,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Alert(
        contentText = AnnotatedString(contentText),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param content 팝업 커스텀 컨텐츠 슬롯.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    contentText: String,
    leftButtonText: String,
    rightButtonText: String,
    content: @Composable () -> Unit,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    Alert(
        contentText = AnnotatedString(contentText),
        leftButtonText = leftButtonText,
        rightButtonText = rightButtonText,
        content = content,
        onLeftButtonClick = onLeftButtonClick,
        onRightButtonClick = onRightButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param content 팝업 커스텀 컨텐츠 슬롯.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    contentText: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    content: @Composable () -> Unit,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposeAlert(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        DealiText(
            text = contentText,
            style = DealiFont.b1r15,
            color = DealiColor.g70
        )
        Spacer(modifier = Modifier.height(16.dp))
        content()
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
 * @param contentText 팝업 문구.
 * @param leftButtonText 팝업의 왼쪽에 위치한 버튼 문구. 일반적으로 왼쪽에 위치한 버튼은 팝업의 부차적인 동작(취소 등)을 위한 버튼입니다.
 * @param rightButtonText 팝업의 오른쪽에 위치한 버튼 문구. 일반적으로 오른쪽 버튼은 팝업이 유도 하고자 하는 동작(확인 등)을 위한 버튼입니다.
 * @param onLeftButtonClick 팝업의 왼쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onRightButtonClick 팝업의 오른쪽에 위치한 버튼 클릭 시 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun Alert(
    contentText: AnnotatedString,
    leftButtonText: String,
    rightButtonText: String,
    onLeftButtonClick: () -> Unit,
    onRightButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposeAlert(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        DealiText(
            text = contentText,
            style = DealiFont.b1r15,
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
 * @param contentText 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 버튼 외의 방법으로 팝업을 닫으려 할 때의 이벤트 콜백.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun AlertSingleButton(
    title: String,
    contentText: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    AlertSingleButton(
        title = title,
        contentText = AnnotatedString(contentText),
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param title 팝업 타이틀.
 * @param contentText 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun AlertSingleButton(
    title: String,
    contentText: AnnotatedString,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposeAlert(
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
            text = contentText,
            style = DealiFont.b1r15,
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
 * @param contentText 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun AlertSingleButton(
    contentText: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    AlertSingleButton(
        contentText = AnnotatedString(contentText),
        buttonText = buttonText,
        onButtonClick = onButtonClick,
        onDismissRequest = onDismissRequest,
        properties = properties
    )
}

/**
 * 신상마켓 디자인 시스템 팝업 컴포넌트.
 *
 * @param contentText 팝업 문구.
 * @param buttonText 팝업의 버튼 문구.
 * @param onButtonClick 팝업의 버튼 클릭 이벤트 콜백.
 * @param onDismissRequest 팝업 외부나 백 버튼 클릭으로 인해 팝업 닫기가 요청되었을 때 실행되는 콜백.
 * [DialogProperties]에서 닫기가 비활성화 된 경우 호출하지 않습니다.
 * @param properties 팝업 다이얼로그의 동작을 정의하는 속성 객체.
 */
@Composable
fun AlertSingleButton(
    contentText: AnnotatedString,
    buttonText: String,
    onButtonClick: () -> Unit,
    onDismissRequest: () -> Unit,
    properties: DialogProperties = DialogProperties(),
) {
    ComposeAlert(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        DealiText(
            text = contentText,
            style = DealiFont.b1r15,
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
private fun ComposeAlert(
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
private fun AlertPreview() {
    Alert(
        title = "title",
        contentText = "댓글을 삭제하시겠습니까?",
        leftButtonText = "취소",
        rightButtonText = "확인",
        onLeftButtonClick = {},
        onRightButtonClick = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun AlertContentPreview() {
    var checked by remember { mutableStateOf(false) }

    Alert(
        title = "title",
        contentText = "해당 주문을 취소하시겠어요?",
        content = {
            CheckBox(
                checked = checked,
                text = "주문 취소 후 장바구니 담기",
                onCheck = {
                    checked = !checked
                }
            )
        },
        leftButtonText = "취소",
        rightButtonText = "확인",
        onLeftButtonClick = {},
        onRightButtonClick = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun AlertWithoutTitlePreview() {
    Alert(
        contentText = "댓글을 삭제하시겠습니까?",
        leftButtonText = "취소",
        rightButtonText = "확인",
        onLeftButtonClick = {},
        onRightButtonClick = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun AlertContentWithoutTitlePreview() {
    var checked by remember { mutableStateOf(false) }

    Alert(
        contentText = "해당 주문을 취소하시겠어요?",
        content = {
            CheckBox(
                checked = checked,
                text = "주문 취소 후 장바구니 담기",
                onCheck = {
                    checked = !checked
                }
            )
        },
        leftButtonText = "취소",
        rightButtonText = "확인",
        onLeftButtonClick = {},
        onRightButtonClick = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun AlertSingleButtonPreview() {
    AlertSingleButton(
        title = "title",
        contentText = "댓글을 삭제하시겠습니까?",
        buttonText = "확인",
        onButtonClick = {},
        onDismissRequest = {}
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun AlertSingleButtonWithoutTitlePreview() {
    AlertSingleButton(
        contentText = "댓글을 삭제하시겠습니까?",
        buttonText = "확인",
        onButtonClick = {},
        onDismissRequest = {}
    )
}
