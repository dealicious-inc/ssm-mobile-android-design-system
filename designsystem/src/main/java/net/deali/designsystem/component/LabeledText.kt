package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.deali.designsystem.R
import net.deali.designsystem.internal.labeledtext.LabeledTextContainer
import net.deali.designsystem.internal.labeledtext.SingleLabeledTextBullet
import net.deali.designsystem.internal.labeledtext.SingleLabeledTextIcon01
import net.deali.designsystem.internal.labeledtext.SingleLabeledTextNumber
import net.deali.designsystem.theme.DealiColor


/**
 * Bullet 라벨을 가지고 있는 g80 컬러의 텍스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * */
@Composable
fun labeledTextBullet01(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textContent = { index ->
            SingleLabeledTextBullet(
                text = textList[index],
                color = DealiColor.g80,
            )
        }
    )
}

/**
 * Bullet 라벨을 가지고 있는 g100 컬러의 텍스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * */
@Composable
fun labeledTextBullet02(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textContent = { index ->
            SingleLabeledTextBullet(
                text = textList[index],
                color = DealiColor.g100,
            )
        }
    )
}

/**
 * 숫자 라벨을 가지고 있는 g80 컬러의 텍스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * */
@Composable
fun labeledTextNumber01(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textContent = { index ->
            SingleLabeledTextNumber(
                text = textList[index],
                color = DealiColor.g80,
                number = index + 1,
            )
        }
    )
}

/**
 * 숫자 라벨을 가지고 있는 g100 컬러의 텍스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * */
@Composable
fun labeledTextNumber02(
    textList: List<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textContent = { index ->
            SingleLabeledTextNumber(
                text = textList[index],
                color = DealiColor.g100,
                number = index + 1,
            )
        }
    )
}

/**
 * 아이콘 라벨을 가지고 있는 g80 컬러의 텍스트.
 * 최상단에 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param iconRes 텍스트 리스트 앞에 보여줄 아이콘 리소스.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * */
@Composable
fun labeledTextIcon01(
    textList: List<String>,
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        textContent = { index ->
            SingleLabeledTextIcon01(
                text = textList[index],
                color = DealiColor.g80,
                iconRes = iconRes,
            )
        }
    )
}


@Preview(showBackground = true)
@Composable
private fun Preview1() {
    labeledTextBullet01(
        textList = listOf(
            "LabeledTextBullet01",
            "LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 ",
            "LabeledTextBullet01",
        ),
    )
}


@Preview(showBackground = true)
@Composable
private fun Preview2() {
    labeledTextBullet02(
        title = "타이틀이 있는 라벨텍스트",
        textList = listOf(
            "LabeledTextBullet02",
            "LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 ",
            "LabeledTextBullet02",
        ),
        iconRes = R.drawable.ic_info,
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview3() {
    labeledTextNumber01(
        title = "타이틀이 있는 라벨텍스트",
        textList = listOf(
            "labeledTextNumber01",
            "labeledTextNumber01 labeledTextNumber01 labeledTextNumber01 labeledTextNumber01 labeledTextNumber01 labeledTextNumber01",
            "labeledTextNumber01",
        ),
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview4() {
    labeledTextNumber02(
        title = "타이틀과 아이콘이 있는 라벨텍스트",
        textList = listOf(
            "labeledTextNumber02",
            "labeledTextNumber02 labeledTextNumber02 labeledTextNumber02 labeledTextNumber02 labeledTextNumber02 labeledTextNumber02",
            "labeledTextNumber02",
        ),
        iconRes = R.drawable.ic_info,
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview5() {
    labeledTextIcon01(
        title = "타이틀이 있는 라벨텍스트",
        textList = listOf(
            "labeledTextIcon01",
            "labeledTextIcon01 labeledTextIcon01 labeledTextIcon01 labeledTextIcon01 labeledTextIcon01 labeledTextIcon01",
            "labeledTextIcon01",
        ),
        iconRes = R.drawable.ic_error,
    )
}