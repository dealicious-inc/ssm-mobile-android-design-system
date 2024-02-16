package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * 컴포저블 사이에 가로로 공간을 띄우기 위한 컴포저블.
 *
 * @param width 공간을 띄울 너비.
 * @param modifier [Modifier].
 */
@Composable
fun HorizontalSpacer(
    width: Dp,
    modifier: Modifier = Modifier,
) {
    val isInspectionMode = LocalInspectionMode.current
    val spacerModifier = if (isInspectionMode) {
        // Inspection Mode 에서는 spacer의 모습이 눈에 보이도록 색상 추가.
        modifier
            .width(width)
            .height(1.dp)
            .background(color = Color.Yellow)
    } else {
        modifier.width(width)
    }

    Spacer(modifier = spacerModifier)
}

/**
 * 컴포저블 사이에 세로로 공간을 띄우기 위한 컴포저블.
 *
 * @param height 공간을 띄울 높이.
 * @param modifier [Modifier].
 */
@Composable
fun VerticalSpacer(
    height: Dp,
    modifier: Modifier = Modifier,
) {
    val isInspectionMode = LocalInspectionMode.current
    val spacerModifier = if (isInspectionMode) {
        // Inspection Mode 에서는 spacer의 모습이 눈에 보이도록 색상 추가.
        modifier
            .height(height)
            .width(1.dp)
            .background(color = Color.Yellow)
    } else {
        modifier.height(height)
    }

    Spacer(modifier = spacerModifier)
}

@Preview(showBackground = true)
@Composable
private fun HorizontalSpacerPreview() {
    Row {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Red)
        )
        HorizontalSpacer(8.dp)
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Green)
        )
        HorizontalSpacer(16.dp)
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun VerticalSpacerPreview() {
    Column {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Red)
        )
        VerticalSpacer(12.dp)
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Green)
        )
        VerticalSpacer(16.dp)
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Blue)
        )
    }
}
