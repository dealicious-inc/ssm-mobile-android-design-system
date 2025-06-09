package net.deali.designsystem.util.icon

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.Icon
import net.deali.designsystem.component.badge
import net.deali.designsystem.theme.DealiColor

@Composable
fun CountIcon(
    @DrawableRes iconRes: Int,
    size: Dp,
    count: Int,
    modifier: Modifier = Modifier,
    color: Color = DealiColor.primary05,
    onClick: () -> Unit,
) {
    val offset = DpOffset(x = (-3).dp, y = 4.dp)

    val badgeModifier = when {
        count > 99 -> modifier.badge(
            text = "99+",
            offset = offset
        )

        count > 0 -> modifier.badge(
            count = count,
            offset = offset
        )

        else -> Modifier
    }

    Icon(
        modifier = modifier
            .then(badgeModifier),
        iconRes = iconRes,
        size = size,
        color = color,
        onClick = onClick,
    )
}

private class CountPreviewProvider : PreviewParameterProvider<Int> {
    override val values: Sequence<Int>
        get() = sequenceOf(
            0,
            9,
            99,
            999,
        )
}

@Preview(showBackground = true)
@Composable
private fun Preview(
    @PreviewParameter(CountPreviewProvider::class) value: Int
) {
    Box(
        modifier = Modifier
            .size(48.dp),
    ) {
        CountIcon(
            modifier = Modifier
                .align(Alignment.Center),
            count = value,
            iconRes = R.drawable.ic_alarm,
            size = 24.dp,
            onClick = {}
        )
    }
}
