package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.btnFilledSmall02
import net.deali.designsystem.component.btnFilledSmall01
import net.deali.designsystem.component.btnFilledSmall03
import net.deali.designsystem.component.btnFilledTonalSmall01
import net.deali.designsystem.component.btnFilledTonalSmall02
import net.deali.designsystem.component.btnFilledTonalSmall03
import net.deali.designsystem.component.btnFilledTonalSmall04
import net.deali.designsystem.component.btnFilledTonalSmall05
import net.deali.designsystem.component.btnOutlineSmall01
import net.deali.designsystem.component.btnOutlineSmall02
import net.deali.designsystem.component.btnOutlineSmall03
import net.deali.designsystem.component.btnOutlineSmall04
import net.deali.designsystem.component.btnOutlineSmall05
import net.deali.designsystem.component.btnOutlineSmall06
import net.deali.designsystem.component.btnRoundFilledSmall02
import net.deali.designsystem.component.btnRoundFilledSmall01
import net.deali.designsystem.component.btnRoundFilledSmall03
import net.deali.designsystem.component.btnRoundFilledTonalSmall01
import net.deali.designsystem.component.btnRoundFilledTonalSmall02
import net.deali.designsystem.component.btnRoundFilledTonalSmall03
import net.deali.designsystem.component.btnRoundFilledTonalSmall04
import net.deali.designsystem.component.btnRoundFilledTonalSmall05
import net.deali.designsystem.component.btnRoundOutlineSmall01
import net.deali.designsystem.component.btnRoundOutlineSmall02
import net.deali.designsystem.component.btnRoundOutlineSmall03
import net.deali.designsystem.component.btnRoundOutlineSmall04
import net.deali.designsystem.component.btnRoundOutlineSmall05
import net.deali.designsystem.component.btnRoundOutlineSmall06
import net.deali.designsystem.component.btnTextSmall01
import net.deali.designsystem.component.btnTextSmall02
import net.deali.designsystem.component.btnTextSmall03
import net.deali.designsystem.component.btnTextSmall04
import net.deali.designsystem.component.btnTextSmall05
import net.deali.designsystem.component.btnTextSmall06
import net.deali.designsystem.component.btnTextSmall07
import net.deali.designsystem.theme.DealiColor

@Composable
fun SmallButtonSamples(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = DealiColor.g10),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item {
            BtnFilledSmall01Samples()
        }
        item {
            BtnFilledSmall02Samples()
        }
        item {
            BtnFilledSmall03Samples()
        }
        item {
            BtnRoundFilledSmall01Samples()
        }
        item {
            BtnRoundFilledSmall02Samples()
        }
        item {
            BtnRoundFilledSmall03Samples()
        }
        item {
            BtnFilledTonalSmall01Samples()
        }
        item {
            BtnFilledTonalSmall02Samples()
        }
        item {
            BtnFilledTonalSmall03Samples()
        }
        item {
            BtnFilledTonalSmall04Samples()
        }
        item {
            BtnFilledTonalSmall05Samples()
        }
        item {
            BtnRoundFilledTonalSmall01Samples()
        }
        item {
            BtnRoundFilledTonalSmall02Samples()
        }
        item {
            BtnRoundFilledTonalSmall03Samples()
        }
        item {
            BtnRoundFilledTonalSmall04Samples()
        }
        item {
            BtnRoundFilledTonalSmall05Samples()
        }

        item {
            BtnOutlineSmall01Samples()
        }
        item {
            BtnOutlineSmall02Samples()
        }
        item {
            BtnOutlineSmall03Samples()
        }
        item {
            BtnOutlineSmall04Samples()
        }
        item {
            BtnOutlineSmall05Samples()
        }
        item {
            BtnOutlineSmall06Samples()
        }
        item {
            BtnRoundOutlineSmall01Samples()
        }
        item {
            BtnRoundOutlineSmall02Samples()
        }
        item {
            BtnRoundOutlineSmall03Samples()
        }
        item {
            BtnRoundOutlineSmall04Samples()
        }
        item {
            BtnRoundOutlineSmall05Samples()
        }
        item {
            BtnRoundOutlineSmall06Samples()
        }

        item {
            BtnTextSmall01Samples()
        }
        item {
            BtnTextSmall02Samples()
        }
        item {
            BtnTextSmall03Samples()
        }
        item {
            BtnTextSmall04Samples()
        }
        item {
            BtnTextSmall05Samples()
        }
        item {
            BtnTextSmall06Samples()
        }
        item {
            BtnTextSmall07Samples()
        }
    }
}

@Composable
private fun BtnFilledSmall01Samples() {
    ButtonSampleLayout(
        title = "btnFilledSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSmall01(
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
private fun BtnFilledSmall02Samples() {
    ButtonSampleLayout(
        title = "btnFilledSmall02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSmall02(
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
private fun BtnFilledSmall03Samples() {
    ButtonSampleLayout(
        title = "btnFilledSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledSmall03(
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
private fun BtnRoundFilledSmall01Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledSmall01(
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
private fun BtnRoundFilledSmall02Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledSmall02",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledSmall02(
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
private fun BtnRoundFilledSmall03Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledSmall03(
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
private fun BtnFilledTonalSmall01Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmall01(
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
private fun BtnFilledTonalSmall02Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmall02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmall02(
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
private fun BtnFilledTonalSmall03Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmall03(
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
private fun BtnFilledTonalSmall04Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmall04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmall04(
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
private fun BtnFilledTonalSmall05Samples() {
    ButtonSampleLayout(
        title = "btnFilledTonalSmall05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnFilledTonalSmall05(
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
private fun BtnRoundFilledTonalSmall01Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmall01(
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
private fun BtnRoundFilledTonalSmall02Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmall02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmall02(
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
private fun BtnRoundFilledTonalSmall03Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmall03(
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
private fun BtnRoundFilledTonalSmall04Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmall04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmall04(
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
private fun BtnRoundFilledTonalSmall05Samples() {
    ButtonSampleLayout(
        title = "btnRoundFilledTonalSmall05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundFilledTonalSmall05(
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
private fun BtnOutlineSmall01Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmall01(
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
private fun BtnOutlineSmall02Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmall02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmall02(
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
private fun BtnOutlineSmall03Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmall03(
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
private fun BtnOutlineSmall04Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmall04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmall04(
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
private fun BtnOutlineSmall05Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmall05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmall05(
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
private fun BtnOutlineSmall06Samples() {
    ButtonSampleLayout(
        title = "btnOutlineSmall06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnOutlineSmall06(
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
private fun BtnRoundOutlineSmall01Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmall01(
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
private fun BtnRoundOutlineSmall02Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmall02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmall02(
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
private fun BtnRoundOutlineSmall03Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmall03(
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
private fun BtnRoundOutlineSmall04Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmall04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmall04(
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
private fun BtnRoundOutlineSmall05Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmall05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmall05(
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
private fun BtnRoundOutlineSmall06Samples() {
    ButtonSampleLayout(
        title = "btnRoundOutlineSmall06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnRoundOutlineSmall06(
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
private fun BtnTextSmall01Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall01",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall01(
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
private fun BtnTextSmall02Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall02",
        dark = true,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall02(
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
private fun BtnTextSmall03Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall03",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall03(
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
private fun BtnTextSmall04Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall04",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall04(
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
private fun BtnTextSmall05Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall05",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall05(
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
private fun BtnTextSmall06Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall06",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall06(
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
private fun BtnTextSmall07Samples() {
    ButtonSampleLayout(
        title = "btnTextSmall07",
        dark = false,
    ) {
        for (i in 0 until 3) {
            ButtonsByStatus(
                leftIcon = if (i == 1) R.drawable.ic_arrow_left else null,
                rightIcon = if (i == 2) R.drawable.ic_arrow_right else null,
            ) { text, leftIcon, rightIcon, enabled, loading ->
                btnTextSmall07(
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
