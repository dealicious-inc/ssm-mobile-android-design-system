package net.deali.designsystem.util.icon

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
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

/**
 * @param contentDescription 접근성 라벨. 배지 수량값은 [badge] 모디파이어가 `drawText`로 직접 그려
 * 별도 semantics 노드가 없으므로, 수량을 노출하려면 호출부에서 문맥에 맞는 라벨(예: "장바구니 ${count}개")을
 * 넘긴다. 스크린리더 접근성과 QA E2E 자동화(수량 검증)에 함께 쓰인다. `null`이면 라벨을 부여하지 않는다.
 */
@Composable
fun CountIcon(
    @DrawableRes iconRes: Int,
    size: Dp,
    count: Int,
    modifier: Modifier = Modifier,
    color: Color = DealiColor.primary05,
    contentDescription: String? = null,
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
            .then(badgeModifier)
            .then(
                contentDescription?.let { description ->
                    Modifier.semantics { this.contentDescription = description }
                } ?: Modifier
            ),
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
