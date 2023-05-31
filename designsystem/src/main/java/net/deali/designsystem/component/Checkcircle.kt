package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.appresource.R

@Composable
fun Checkcircle(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: () -> Unit
) {
    CheckcircleIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = false,
        onCheck = onCheck
    )
}

@Composable
fun CheckcircleAd(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onCheck: () -> Unit
) {
    CheckcircleIcon(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        isAd = true,
        onCheck = onCheck
    )
}

@Composable
private fun CheckcircleIcon(
    checked: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isAd: Boolean,
    onCheck: () -> Unit
) {
    Icon24(
        modifier = modifier,
        painter = when {
            enabled.not() -> painterResource(id = R.drawable.ic_checkcircle_disabled_ver01)
            checked && isAd -> painterResource(id = R.drawable.ic_checkcircle_on_ad_ver01)
            checked && isAd.not() -> painterResource(id = R.drawable.ic_checkcircle_on_ver01)
            else -> painterResource(id = R.drawable.ic_checkcircle_off_ver01)
        },
        enabled = enabled,
        onClick = onCheck
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