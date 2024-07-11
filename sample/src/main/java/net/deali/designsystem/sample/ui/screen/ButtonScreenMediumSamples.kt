package net.deali.designsystem.sample.ui.screen

import android.widget.TextView
import androidx.appcompat.view.ContextThemeWrapper
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import net.deali.designsystem.R
import net.deali.designsystem.component.btnFilledMedium01
import net.deali.designsystem.component.btnFilledMedium02
import net.deali.designsystem.component.btnFilledMedium03
import net.deali.designsystem.component.btnFilledTonalMedium01
import net.deali.designsystem.component.btnFilledTonalMedium02
import net.deali.designsystem.component.btnFilledTonalMedium03
import net.deali.designsystem.component.btnFilledTonalMedium04
import net.deali.designsystem.component.btnFilledTonalMedium05
import net.deali.designsystem.component.btnFilledTonalMedium06
import net.deali.designsystem.component.btnOutlineBgMedium01
import net.deali.designsystem.component.btnOutlineBgMedium03
import net.deali.designsystem.component.btnOutlineBgMedium04
import net.deali.designsystem.component.btnOutlineBgMedium05
import net.deali.designsystem.component.btnOutlineBgMedium06
import net.deali.designsystem.component.btnOutlineMedium01
import net.deali.designsystem.component.btnOutlineMedium02
import net.deali.designsystem.component.btnOutlineMedium03
import net.deali.designsystem.component.btnOutlineMedium04
import net.deali.designsystem.component.btnOutlineMedium05
import net.deali.designsystem.component.btnOutlineMedium06
import net.deali.designsystem.component.btnTextMedium01
import net.deali.designsystem.component.btnTextMedium02
import net.deali.designsystem.component.btnTextMedium03
import net.deali.designsystem.component.btnTextMedium04
import net.deali.designsystem.component.btnTextMedium05
import net.deali.designsystem.component.btnTextMedium06
import net.deali.designsystem.component.btnTextMedium07
import net.deali.designsystem.theme.DealiColor

@Composable
fun MediumButtonSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledMedium01Samples()
        }
        item {
            BtnFilledMedium02Samples()
        }
        item {
            BtnFilledMedium03Samples()
        }
        item {
            BtnFilledTonalMedium01Samples()
        }
        item {
            BtnFilledTonalMedium02Samples()
        }
        item {
            BtnFilledTonalMedium03Samples()
        }
        item {
            BtnFilledTonalMedium04Samples()
        }
        item {
            BtnFilledTonalMedium05Samples()
        }
        item {
            BtnFilledTonalMedium06Samples()
        }
        item {
            BtnOutlineMedium01Samples()
        }
        item {
            BtnOutlineMedium02Samples()
        }
        item {
            BtnOutlineMedium03Samples()
        }
        item {
            BtnOutlineMedium04Samples()
        }
        item {
            BtnOutlineMedium05Samples()
        }
        item {
            BtnOutlineMedium06Samples()
        }

        item {
            BtnOutlineBgMedium01Samples()
        }
        item {
            BtnOutlineBgMedium03Samples()
        }
        item {
            BtnOutlineBgMedium04Samples()
        }
        item {
            BtnOutlineBgMedium05Samples()
        }
        item {
            BtnOutlineBgMedium06Samples()
        }

        item {
            BtnTextMedium01Samples()
        }
        item {
            BtnTextMedium02Samples()
        }
        item {
            BtnTextMedium03Samples()
        }
        item {
            BtnTextMedium04Samples()
        }
        item {
            BtnTextMedium05Samples()
        }
        item {
            BtnTextMedium06Samples()
        }
        item {
            BtnTextMedium07Samples()
        }
    }
}

@Composable
private fun BtnFilledMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}


@Composable
private fun BtnFilledMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledMedium02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalMedium01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalMedium02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalMedium03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalMedium04Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalMedium05Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnFilledTonalMedium06Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineMedium02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )

                AndroidView(
                    factory = { context ->
                        TextView(ContextThemeWrapper(context, R.style.btnOutlineMedium06)).apply {
                            setText(text)
                            isEnabled = enabled
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgMedium01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgMedium01",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgMedium03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgMedium03",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgMedium04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgMedium04",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgMedium05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgMedium05",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnOutlineBgMedium06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineBgMedium06",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
                scrollEnabled = true,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineBgMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium01Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium01(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium02Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium02(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium03Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium03(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium04Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium04(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium05Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium05(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium06Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium06(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}

@Composable
private fun BtnTextMedium07Samples() {
    ButtonSampleLayout(
        title = "btnTextMedium07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextMedium07(
                    onClick = {},
                    text = text,
                    leftIcon = leftIcon,
                    rightIcon = rightIcon,
                    enabled = enabled,
                    loading = loading,
                )
            }
        }
    }
}
