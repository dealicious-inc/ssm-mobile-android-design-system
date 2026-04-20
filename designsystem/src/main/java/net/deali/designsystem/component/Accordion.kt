package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.collections.immutable.persistentListOf
import net.deali.designsystem.R
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.click.noRippleClickable
import net.deali.designsystem.util.getRandomText

/**
 * 아코디언 컴포넌트.
 *
 * var isExpanded by rememberSaveable { mutableStateOf(false) }
 * 위 코드를 이용하면 아코디언이 확장되었는지 여부를 저장할 수 있습니다.
 * 클릭 시 확장/축소 기능이 필요 없다면 [Notice]를 사용합니다.
 *
 * @param title 아코디언 타이틀
 * @param isExpanded 아코디언이 확장되었는지 여부
 * @param modifier Modifier
 * @param titleIconRes 타이틀 아이콘 리소스
 * @param onClickExpand 아코디언 확장 여부 변경 콜백
 * @param content 아코디언 내용
 */
@Composable
fun Accordion(
    title: String,
    isExpanded: Boolean,
    onClickExpand: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes titleIconRes: Int = R.drawable.ic_notice,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = modifier
            .background(
                color = DealiColor.g10,
                shape = RoundedCornerShape(10.dp),
            )
            .clip(RoundedCornerShape(10.dp)),
    ) {
        Title(
            title = title,
            isExpanded = isExpanded,
            titleIconRes = titleIconRes,
            onClickExpand = onClickExpand
        )

        AnimatedVisibility(
            visible = isExpanded,
            enter = expandVertically(expandFrom = Alignment.Top),
            exit = shrinkVertically(shrinkTowards = Alignment.Top),
        ) {
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                color = DealiColor.g30
            )

            Box(
                modifier = Modifier.padding(16.dp),
            ) {
                content()
            }
        }
    }
}

@Composable
private fun Title(
    title: String,
    isExpanded: Boolean,
    onClickExpand: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes titleIconRes: Int = 0,
) {
    val degrees by animateFloatAsState(
        targetValue = if (isExpanded) 180f else 0f,
        label = "degrees"
    )

    Row(
        modifier = modifier
            .noRippleClickable(
                onClick = onClickExpand
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (titleIconRes != 0) {
            Icon(
                iconRes = titleIconRes,
                size = 16.dp,
            )

            HorizontalSpacer(width = 8.dp)
        }

        DealiText(
            modifier = Modifier
                .weight(1f),
            text = title,
            style = DealiFont.b2sb14
        )

        HorizontalSpacer(width = 16.dp)

        Icon(
            modifier = Modifier
                .graphicsLayer { rotationZ = degrees },
            iconRes = R.drawable.ic_arrow_open,
            size = 16.dp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview1() {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Accordion(
        title = "타이틀",
        isExpanded = isExpanded,
        onClickExpand = {
            isExpanded = !isExpanded
        },
        content = {
            Box(modifier = Modifier.height(200.dp))
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview2() {
    var isExpanded by rememberSaveable { mutableStateOf(true) }

    Accordion(
        title = "타이틀",
        isExpanded = isExpanded,
        onClickExpand = {
            isExpanded = !isExpanded
        },
        content = {
            Box(modifier = Modifier.height(200.dp))
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview3() {
    var isExpanded by rememberSaveable { mutableStateOf(true) }

    Accordion(
        title = "타이틀",
        isExpanded = isExpanded,
        onClickExpand = {
            isExpanded = !isExpanded
        },
        content = {
            val texts = persistentListOf(
                "신분증 이미지를 가이드 영역에 맞춰 가로로 촬영 후 등록해주세요.",
                getRandomText(9),
                getRandomText(13),
                getRandomText(15),
            )

            labeledTextBullet01(
                textList = texts,
                title = getRandomText(3),
            )
        }
    )
}
