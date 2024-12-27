package net.deali.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.internal.labeledtext.CoreLabeledTextBullet
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun labeledTextBullet01(
    text: String,
    modifier: Modifier = Modifier,
    title: String = "",
    iconRes: Int = 0,
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (iconRes != 0) {
                Icon16(
                    iconRes = iconRes,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    color = DealiColor.g100,
                )

                HorizontalSpacer(8.dp)
            }

            if (title.isNotEmpty()) {
                DealiText(
                    text = title,
                    style = DealiFont.b3sb13,
                    color = DealiColor.g100,
                )
            }
        }

        VerticalSpacer(8.dp)

        CoreLabeledTextBullet(
            text = text,
            color = DealiColor.g80,
        )
    }
}

@Composable
fun labeledTextBullet01(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    iconRes: Int = 0,
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (iconRes != 0) {
                Icon16(
                    iconRes = iconRes,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    color = DealiColor.g100,
                )

                HorizontalSpacer(8.dp)
            }

            if (title.isNotEmpty()) {
                DealiText(
                    text = title,
                    style = DealiFont.b3sb13,
                    color = DealiColor.g100,
                )
            }
        }

        VerticalSpacer(8.dp)

        textList.forEachIndexed { index, it ->
            CoreLabeledTextBullet(
                text = it,
                color = DealiColor.g80,
            )

            if (index < textList.size - 1) {
                VerticalSpacer(8.dp)
            }
        }

    }
}


@Composable
fun labeledTextBullet02(
    text: String,
    modifier: Modifier = Modifier,
    title: String = "",
    iconRes: Int = 0,
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (iconRes != 0) {
                Icon16(
                    iconRes = iconRes,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    color = DealiColor.g100,
                )

                HorizontalSpacer(8.dp)
            }

            if (title.isNotEmpty()) {
                DealiText(
                    text = title,
                    style = DealiFont.b3sb13,
                    color = DealiColor.g100,
                )
            }
        }

        VerticalSpacer(8.dp)

        CoreLabeledTextBullet(
            text = text,
            color = DealiColor.g80,
        )
    }
}

@Composable
fun labeledTextBullet02(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    iconRes: Int = 0,
) {
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            if (iconRes != 0) {
                Icon16(
                    iconRes = iconRes,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    color = DealiColor.g100,
                )

                HorizontalSpacer(8.dp)
            }

            if (title.isNotEmpty()) {
                DealiText(
                    text = title,
                    style = DealiFont.b3sb13,
                    color = DealiColor.g100,
                )
            }
        }

        VerticalSpacer(8.dp)

        textList.forEachIndexed { index, it ->
            CoreLabeledTextBullet(
                text = it,
                color = DealiColor.g100,
            )

            if (index < textList.size - 1) {
                VerticalSpacer(8.dp)
            }
        }

    }
}


@Preview(showBackground = true, name = "LabeledTextBullet01")
@Composable
private fun Preview1() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        labeledTextBullet01(
            title = "타이틀이 있는 라벨텍스트",
            text = "텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다.",
            iconRes = R.drawable.ic_info,
        )

        labeledTextBullet01(
            title = "타이틀이 있는 라벨텍스트",
            textList = listOf(
                "텍스트 리스트를 사용한 케이스",
                "텍스트 리스트를 사용한 케이스",
                "텍스트 리스트를 사용한 케이스",
            ),
        )
    }
}


@Preview(showBackground = true, name = "LabeledTextBullet02")
@Composable
private fun Preview2() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        labeledTextBullet02(
            title = "타이틀이 있는 라벨텍스트",
            text = "텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다. 텍스트가 아주 깁니다.",
            iconRes = R.drawable.ic_info,
        )

        labeledTextBullet02(
            title = "타이틀이 있는 라벨텍스트",
            textList = listOf(
                "텍스트 리스트를 사용한 케이스",
                "텍스트 리스트를 사용한 케이스",
                "텍스트 리스트를 사용한 케이스",
            ),
        )
    }
}
