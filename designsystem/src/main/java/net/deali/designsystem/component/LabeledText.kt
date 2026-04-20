package net.deali.designsystem.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import net.deali.designsystem.R
import net.deali.designsystem.internal.labeledtext.LabeledTextContainer
import net.deali.designsystem.internal.labeledtext.SingleLabeledTextBullet
import net.deali.designsystem.internal.labeledtext.SingleLabeledTextIcon01
import net.deali.designsystem.internal.labeledtext.SingleLabeledTextNumber
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont


/**
 * Bullet 라벨을 가지고 있는 g80 컬러의 텍스트 리스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextBullet01(
    textList: ImmutableList<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textStyle = DealiFont.b3r13,
        textContent = { index ->
            SingleLabeledTextBullet(
                text = textList[index],
                color = DealiColor.g80,
                textStyle = DealiFont.b3r13,
            )
        }
    )
}

/**
 * Bullet 라벨을 가지고 있는 g80 컬러의 단일 텍스트.
 *
 * @param text 라벨을 붙여 보여줄 텍스트.
 * @param modifier Modifier.
 * @param highlightText 강조할 텍스트. 없을 시 미표기.
 * @param highlightColor 강조할 컬러. 없을 시 미표기.
 * @param isHighlightBold 강조할 텍스트를 굵게 표기할지 여부. 기본값은 false.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextBullet01(
    text: String,
    modifier: Modifier = Modifier,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextBullet(
            text = text,
            color = DealiColor.g80,
            textStyle = DealiFont.b3r13,
            highlightText = highlightText,
            highlightColor = highlightColor,
            isHighlightBold = isHighlightBold,
        )
    }
}

/**
 * Bullet 라벨을 가지고 있는 g80 컬러의 단일 [annotatedString] 텍스트.
 *
 * @param annotatedString 라벨을 붙여 보여줄 텍스트.
 * @param modifier Modifier.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextBullet01(
    annotatedString: AnnotatedString,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextBullet(
            annotatedString = annotatedString,
            color = DealiColor.g80,
            textStyle = DealiFont.b3r13,
        )
    }
}

/**
 * Bullet 라벨을 가지고 있는 g100 컬러의 텍스트 리스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * @param textStyle DealiFont 텍스트 스타일.
 *
 * */
@Composable
fun labeledTextBullet02(
    textList: ImmutableList<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textStyle = DealiFont.b3r13,
        textContent = { index ->
            SingleLabeledTextBullet(
                text = textList[index],
                color = DealiColor.g100,
                textStyle = DealiFont.b3r13,
            )
        }
    )
}

/**
 * Bullet 라벨을 가지고 있는 g100 컬러의 단일 텍스트.
 *
 * @param text 라벨을 붙여 보여줄 텍스트.
 * @param modifier Modifier.
 * @param highlightText 강조할 텍스트. 없을 시 미표기.
 * @param highlightColor 강조할 컬러. 없을 시 미표기.
 * @param isHighlightBold 강조할 텍스트를 굵게 표기할지 여부. 기본값은 false.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextBullet02(
    text: String,
    modifier: Modifier = Modifier,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextBullet(
            text = text,
            color = DealiColor.g100,
            textStyle = DealiFont.b3r13,
            highlightText = highlightText,
            highlightColor = highlightColor,
            isHighlightBold = isHighlightBold,
        )
    }
}

/**
 * Bullet 라벨을 가지고 있는 g100 컬러의 단일 [annotatedString] 텍스트.
 *
 * @param annotatedString 라벨을 붙여 보여줄 텍스트.
 * @param modifier Modifier.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextBullet02(
    annotatedString: AnnotatedString,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextBullet(
            annotatedString = annotatedString,
            color = DealiColor.g100,
            textStyle = DealiFont.b3r13,
        )
    }
}


/**
 * 숫자 라벨을 가지고 있는 g80 컬러의 텍스트 리스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextNumber01(
    textList: ImmutableList<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textStyle = DealiFont.b3r13,
        textContent = { index ->
            SingleLabeledTextNumber(
                text = textList[index],
                color = DealiColor.g80,
                textStyle = DealiFont.b3r13,
                number = index + 1,
            )
        }
    )
}

/**
 * 숫자 라벨을 가지고 있는 g80 컬러의 단일 텍스트.
 *
 * @param text 라벨을 붙여 보여줄 텍스트.
 * @param number 라벨로 표기할 숫자.
 * @param modifier Modifier.
 * @param highlightText 강조할 텍스트. 없을 시 미표기.
 * @param highlightColor 강조할 컬러. 없을 시 미표기.
 * @param isHighlightBold 강조할 텍스트를 굵게 표기할지 여부. 기본값은 false.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextNumber01(
    text: String,
    number: Int,
    modifier: Modifier = Modifier,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextNumber(
            text = text,
            color = DealiColor.g80,
            number = number,
            textStyle = DealiFont.b3r13,
            highlightText = highlightText,
            highlightColor = highlightColor,
            isHighlightBold = isHighlightBold,
        )
    }
}

/**
 * 숫자 라벨을 가지고 있는 g80 컬러의 단일 [annotatedString] 텍스트.
 *
 * @param annotatedString 라벨을 붙여 보여줄 텍스트.
 * @param number 라벨로 표기할 숫자.
 * @param modifier Modifier.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextNumber01(
    annotatedString: AnnotatedString,
    number: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextNumber(
            annotatedString = annotatedString,
            number = number,
            color = DealiColor.g80,
            textStyle = DealiFont.b3r13,
        )
    }
}

/**
 * 숫자 라벨을 가지고 있는 g100 컬러의 텍스트.
 * 최상단에 아이콘 + 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param iconRes 타이틀 아이콘 리소스. 없을 시 미표기.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextNumber02(
    textList: ImmutableList<String>,
    modifier: Modifier = Modifier,
    title: String = "",
    @DrawableRes iconRes: Int = 0,
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        titleIconRes = iconRes,
        textStyle = DealiFont.b3r13,
        textContent = { index ->
            SingleLabeledTextNumber(
                text = textList[index],
                color = DealiColor.g100,
                number = index + 1,
                textStyle = DealiFont.b3r13,
            )
        }
    )
}

/**
 * 숫자 라벨을 가지고 있는 g100 컬러의 단일 텍스트.
 *
 * @param text 라벨을 붙여 보여줄 텍스트.
 * @param number 라벨로 표기할 숫자.
 * @param modifier Modifier.
 * @param highlightText 강조할 텍스트. 없을 시 미표기.
 * @param highlightColor 강조할 컬러. 없을 시 미표기.
 * @param isHighlightBold 강조할 텍스트를 굵게 표기할지 여부. 기본값은 false.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextNumber02(
    text: String,
    number: Int,
    modifier: Modifier = Modifier,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextNumber(
            text = text,
            color = DealiColor.g100,
            number = number,
            textStyle = DealiFont.b3r13,
            highlightText = highlightText,
            highlightColor = highlightColor,
            isHighlightBold = isHighlightBold,
        )
    }
}

/**
 * 숫자 라벨을 가지고 있는 g100 컬러의 단일 [annotatedString] 텍스트.
 *
 * @param annotatedString 라벨을 붙여 보여줄 텍스트.
 * @param number 라벨로 표기할 숫자.
 * @param modifier Modifier.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextNumber02(
    annotatedString: AnnotatedString,
    number: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextNumber(
            annotatedString = annotatedString,
            number = number,
            color = DealiColor.g100,
            textStyle = DealiFont.b3r13,
        )
    }
}

/**
 * 아이콘 라벨을 가지고 있는 g80 컬러의 텍스트.
 * 최상단에 타이틀 영역을 추가할 수 있다.
 *
 * @param textList 라벨을 붙여 보여줄 텍스트의 리스트.
 * @param iconRes 텍스트 리스트 앞에 보여줄 아이콘 리소스.
 * @param modifier Modifier.
 * @param title 타이틀. 없을 시 미표기.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextIcon01(
    textList: ImmutableList<String>,
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    LabeledTextContainer(
        textList = textList,
        modifier = modifier,
        title = title,
        textStyle = DealiFont.b3r13,
        textContent = { index ->
            SingleLabeledTextIcon01(
                text = textList[index],
                color = DealiColor.g80,
                iconRes = iconRes,
                textStyle = DealiFont.b3r13,
            )
        }
    )
}

/**
 * 아이콘 라벨을 가지고 있는 g80 컬러의 단일 텍스트.
 *
 * @param text 라벨을 붙여 보여줄 텍스트.
 * @param iconRes 텍스트 앞에 보여줄 아이콘 리소스.
 * @param modifier Modifier.
 * @param highlightText 강조할 텍스트. 없을 시 미표기.
 * @param highlightColor 강조할 컬러. 없을 시 미표기.
 * @param isHighlightBold 강조할 텍스트를 굵게 표기할지 여부. 기본값은 false.
 * @param textStyle DealiFont 텍스트 스타일.
 * */
@Composable
fun labeledTextIcon01(
    text: String,
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    highlightText: String = "",
    highlightColor: Color = Color.Unspecified,
    isHighlightBold: Boolean = false,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextIcon01(
            text = text,
            color = DealiColor.g80,
            iconRes = iconRes,
            highlightText = highlightText,
            highlightColor = highlightColor,
            isHighlightBold = isHighlightBold,
            textStyle = DealiFont.b3r13,
        )
    }
}

/**
 * 아이콘 라벨을 가지고 있는 g80 컬러의 단일 [annotatedString] 텍스트.
 *
 * @param annotatedString 라벨을 붙여 보여줄 텍스트.
 * @param iconRes 텍스트 앞에 보여줄 아이콘 리소스.
 * @param modifier Modifier.
 * */
@Composable
fun labeledTextIcon01(
    annotatedString: AnnotatedString,
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SingleLabeledTextIcon01(
            annotatedString = annotatedString,
            color = DealiColor.g80,
            iconRes = iconRes,
            textStyle = DealiFont.b3r13,
        )
    }
}



@Preview(showBackground = true, name = "labeledTextBullet01")
@Composable
private fun Preview1() {
    labeledTextBullet01(
        textList = persistentListOf(
            "LabeledTextBullet01",
            "LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 ",
            "LabeledTextBullet01",
        ),
    )
}

@Preview(showBackground = true, name = "labeledTextBullet01")
@Composable
private fun Preview1_1() {
    labeledTextBullet01(
        text = "LabeledTextBullet01 HIGHLIGHT LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 ",
        highlightText = "HIGHLIGHT",
        highlightColor = DealiColor.primary01,
        isHighlightBold = true,
    )
}

@Preview(showBackground = true, name = "labeledTextBullet01")
@Composable
private fun Preview1_2() {
    val annotatedString = buildAnnotatedString {
        val text = "annotatedString을 테스트 중입니다. 테스트 중입니다."
        val boldTarget1 = "annotatedString"
        val boldStart1 = text.indexOf(boldTarget1)
        val boldEnd1 = boldStart1 + boldTarget1.length
        val boldTarget2 = "테스트"
        val boldStart2 = text.indexOf(boldTarget2)
        val boldEnd2 = boldStart2 + boldTarget2.length

        append(text)
        addStyle(
            style = SpanStyle(
                color = DealiColor.primary01,
            ),
            start = boldStart1,
            end = boldEnd1
        )
        addStyle(
            style = SpanStyle(
                color = DealiColor.secondary01,
            ),
            start = boldStart2,
            end = boldEnd2
        )
    }

    labeledTextBullet01(
        annotatedString = annotatedString,
    )
}

@Preview(showBackground = true, name = "labeledTextBullet02")
@Composable
private fun Preview2() {
    labeledTextBullet02(
        title = "타이틀이 있는 라벨텍스트",
        textList = persistentListOf(
            "LabeledTextBullet02",
            "LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 LabeledTextBullet02 ",
            "LabeledTextBullet02",
        ),
        iconRes = R.drawable.ic_info,
    )
}

@Preview(showBackground = true, name = "labeledTextNumber01")
@Composable
private fun Preview3() {
    labeledTextNumber01(
        title = "타이틀이 있는 라벨텍스트",
        textList = persistentListOf(
            "labeledTextNumber01",
            "labeledTextNumber01 labeledTextNumber01 labeledTextNumber01 labeledTextNumber01 labeledTextNumber01 labeledTextNumber01",
            "labeledTextNumber01",
        ),
    )
}

@Preview(showBackground = true, name = "labeledTextNumber02")
@Composable
private fun Preview4() {
    labeledTextNumber02(
        title = "타이틀과 아이콘이 있는 라벨텍스트",
        textList = persistentListOf(
            "labeledTextNumber02",
            "labeledTextNumber02 labeledTextNumber02 labeledTextNumber02 labeledTextNumber02 labeledTextNumber02 labeledTextNumber02",
            "labeledTextNumber02",
        ),
        iconRes = R.drawable.ic_info,
    )
}

@Preview(showBackground = true, name = "labeledTextIcon01")
@Composable
private fun Preview5() {
    labeledTextIcon01(
        title = "타이틀이 있는 라벨텍스트",
        textList = persistentListOf(
            "labeledTextIcon01",
            "labeledTextIcon01 labeledTextIcon01 labeledTextIcon01 labeledTextIcon01 labeledTextIcon01 labeledTextIcon01",
            "labeledTextIcon01",
        ),
        iconRes = R.drawable.ic_error,
    )
}

@Preview(showBackground = true, name = "labeledTextIcon01")
@Composable
private fun Preview5_1() {
    labeledTextIcon01(
        text = "LabeledTextBullet01 HIGHLIGHT LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 LabeledTextBullet01 ",
        highlightText = "HIGHLIGHT",
        iconRes = R.drawable.ic_info,
        highlightColor = DealiColor.primary01,
        isHighlightBold = true,
    )
}


@Preview(showBackground = true, name = "labeledTextIcon01")
@Composable
private fun Preview5_2() {
    val annotatedString = buildAnnotatedString {
        val text = "annotatedString을 테스트 중입니다. 테스트 중입니다."
        val boldTarget1 = "annotatedString"
        val boldStart1 = text.indexOf(boldTarget1)
        val boldEnd1 = boldStart1 + boldTarget1.length
        val boldTarget2 = "테스트"
        val boldStart2 = text.indexOf(boldTarget2)
        val boldEnd2 = boldStart2 + boldTarget2.length

        append(text)
        addStyle(
            style = SpanStyle(
                color = DealiColor.primary01,
            ),
            start = boldStart1,
            end = boldEnd1
        )
        addStyle(
            style = SpanStyle(
                color = DealiColor.secondary01,
            ),
            start = boldStart2,
            end = boldEnd2
        )
    }

    labeledTextIcon01(
        annotatedString = annotatedString,
        iconRes = R.drawable.ic_info,
    )
}