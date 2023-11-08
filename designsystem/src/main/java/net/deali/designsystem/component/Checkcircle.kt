package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R

@Composable
fun Checkcircle(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: () -> Unit = {},
    noRipple: Boolean = false,
) {
    CheckcircleIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = false,
        onCheck = onCheck,
        noRipple = noRipple,
    )
}

@Composable
fun CheckcircleAd(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: () -> Unit = {},
    noRipple: Boolean = false,
) {
    CheckcircleIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = true,
        onCheck = onCheck,
        noRipple = noRipple,
    )
}

@Composable
private fun CheckcircleIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isAd: Boolean,
    onCheck: () -> Unit = {},
    noRipple: Boolean = false,
) {
    Icon24(
        modifier = modifier,
        iconRes = when {
            enabled.not() -> R.drawable.ic_checkcircle_disabled
            checked && isAd -> R.drawable.ic_checkcircle_on_ad
            checked && isAd.not() -> R.drawable.ic_checkcircle_on
            else -> R.drawable.ic_checkcircle_off
        },
        enabled = enabled,
        onClick = onCheck,
        noRipple = noRipple,
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = 0XFFFFFF)
private fun CheckcirclePreview() {
    Column(
        modifier = Modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Checkcircle(
            checked = false,
            onCheck = {}
        )
        Checkcircle(
            checked = true,
            onCheck = {}
        )
        Checkcircle(
            checked = false,
            enabled = false,
            onCheck = {}
        )
        CheckcircleAd(
            checked = true,
            onCheck = {}
        )
    }
}
