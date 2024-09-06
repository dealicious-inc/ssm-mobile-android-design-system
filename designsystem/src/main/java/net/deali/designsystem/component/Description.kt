package net.deali.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import net.deali.designsystem.component.DescriptionFormat.DOT
import net.deali.designsystem.component.DescriptionFormat.NUMBER
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import net.deali.designsystem.util.getRandomText

/**
 * Bullet을 달고 있는 컴포넌트
 *
 * @param text 텍스트
 * @param format Bullet 타입
 * @param title 제목
 */
@JvmName("DescriptionString")
@Composable
fun Description(
    text: String,
    format: DescriptionFormat,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        if (title.isNotEmpty()) {
            Title(
                title = title,
            )
        }

        when (format) {
            DOT -> {
                DotText(
                    text = text,
                )
            }

            NUMBER -> {
                NumberText(
                    text = text,
                    number = 1,
                )
            }
        }
    }
}

/**
 * Bullet을 달고 있는 컴포넌트
 *
 * @param text 텍스트
 * @param format Bullet 타입
 * @param title 제목
 */
@JvmName("DescriptionAnnotatedString")
@Composable
fun Description(
    text: AnnotatedString,
    format: DescriptionFormat,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        if (title.isNotEmpty()) {
            Title(
                title = title,
            )
        }

        when (format) {
            DOT -> {
                DotText(
                    text = text,
                )
            }

            NUMBER -> {
                NumberText(
                    text = text,
                    number = 1,
                )
            }
        }
    }
}

/**
 * Bullet을 달고 있는 컴포넌트
 *
 * @param texts 텍스트 리스트
 * @param format Bullet 타입
 * @param title 제목
 */
@JvmName("DescriptionStrings")
@Composable
fun Description(
    texts: List<String>,
    format: DescriptionFormat,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        if (title.isNotEmpty()) {
            Title(
                title = title,
            )
        }

        texts.forEachIndexed { index, text ->
            when (format) {
                DOT -> {
                    DotText(
                        text = text,
                    )
                }

                NUMBER -> {
                    NumberText(
                        text = text,
                        number = index + 1,
                    )
                }
            }
        }
    }
}

/**
 * Bullet을 달고 있는 컴포넌트
 *
 * @param texts 텍스트 리스트
 * @param format Bullet 타입
 * @param title 제목
 */
@JvmName("DescriptionAnnotatedStrings")
@Composable
fun Description(
    texts: List<AnnotatedString>,
    format: DescriptionFormat,
    modifier: Modifier = Modifier,
    title: String = "",
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        if (title.isNotEmpty()) {
            Title(
                title = title,
            )
        }

        texts.forEachIndexed { index, text ->
            when (format) {
                DOT -> {
                    DotText(
                        text = text,
                    )
                }

                NUMBER -> {
                    NumberText(
                        text = text,
                        number = index + 1,
                    )
                }
            }
        }
    }
}

@Composable
private fun Title(
    title: String,
    modifier: Modifier = Modifier,
) {
    DealiText(
        modifier = modifier,
        text = title,
        style = DealiFont.b3sb13,
        color = DealiColor.g100,
    )
}

@Composable
private fun DotText(
    text: String,
    modifier: Modifier = Modifier,
) {
    var width by remember { mutableIntStateOf(0) }
    val textMeasurer = rememberTextMeasurer()
    val height = with(LocalDensity.current) {
        textMeasurer.measure(
            text = text,
            style = DealiFont.b3r13,
            constraints = Constraints(maxWidth = width),
            maxLines = 1,
        ).size.height.toDp()
    }

    Row(
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box(
                modifier = Modifier
                    .height(height),
            ) {
                Box(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(DealiColor.g80)
                )
            }

            DealiText(
                modifier = Modifier
                    .onSizeChanged { size ->
                        width = size.width
                    },
                text = text,
                style = DealiFont.b3r13,
                color = DealiColor.g80,
            )
        }
    }
}

@Composable
private fun DotText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
) {
    var width by remember { mutableIntStateOf(0) }
    val textMeasurer = rememberTextMeasurer()
    val height = with(LocalDensity.current) {
        textMeasurer.measure(
            text = text,
            style = DealiFont.b3r13,
            constraints = Constraints(maxWidth = width),
            maxLines = 1,
        ).size.height.toDp()
    }

    Row(
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box(
                modifier = Modifier
                    .height(height),
            ) {
                Box(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(3.dp)
                        .clip(CircleShape)
                        .background(DealiColor.g80)
                )
            }

            DealiText(
                modifier = Modifier
                    .onSizeChanged { size ->
                        width = size.width
                    },
                text = text,
                style = DealiFont.b3r13,
                color = DealiColor.g80,
            )
        }
    }
}

@Composable
private fun NumberText(
    text: String,
    number: Int,
    modifier: Modifier = Modifier,
) {
    var width by remember { mutableIntStateOf(0) }
    val textMeasurer = rememberTextMeasurer()
    val height = with(LocalDensity.current) {
        textMeasurer.measure(
            text = text,
            style = DealiFont.b3r13,
            constraints = Constraints(maxWidth = width),
            maxLines = 1,
        ).size.height.toDp()
    }

    Row(
        modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Box(
                modifier = Modifier
                    .height(height),
            ) {
                DealiText(
                    modifier = Modifier
                        .align(Alignment.Center),
                    text = "$number.",
                    style = DealiFont.b3r13,
                    color = DealiColor.g80,
                )
            }

            DealiText(
                modifier = Modifier
                    .onSizeChanged { size ->
                        width = size.width
                    },
                text = text,
                style = DealiFont.b3r13,
                color = DealiColor.g80,
            )
        }
    }
}

@Composable
private fun NumberText(
    text: AnnotatedString,
    number: Int,
    modifier: Modifier = Modifier,
) {
    var width by remember { mutableIntStateOf(0) }
    val textMeasurer = rememberTextMeasurer()
    val height = with(LocalDensity.current) {
        textMeasurer.measure(
            text = text,
            style = DealiFont.b3r13,
            constraints = Constraints(maxWidth = width),
            maxLines = 1,
        ).size.height.toDp()
    }

    Row(
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Box(
                modifier = Modifier
                    .height(height),
            ) {
                DealiText(
                    text = "$number.",
                    style = DealiFont.b3r13,
                    color = DealiColor.g80,
                )
            }

            DealiText(
                modifier = Modifier
                    .onSizeChanged { size ->
                        width = size.width
                    },
                text = text,
                style = DealiFont.b3r13,
                color = DealiColor.g80,
            )
        }
    }
}

/**
 * [Description] 컴포넌트에서 사용하는 Bullet 타입.
 *
 * @property DOT 점
 * @property NUMBER 숫자
 */
enum class DescriptionFormat {
    DOT,
    NUMBER,
}

private class DescriptionFormatPreviewProvider : PreviewParameterProvider<DescriptionFormat> {
    override val values: Sequence<DescriptionFormat>
        get() = sequenceOf(
            DOT,
            NUMBER,
        )
}

@Preview(showBackground = true, widthDp = 360)
@Composable
private fun Preview(
    @PreviewParameter(DescriptionFormatPreviewProvider::class) value: DescriptionFormat
) {
    val texts = listOf(
        "신분증 이미지를 가이드 영역에 맞춰 가로로 촬영 후 등록해주세요.",
        getRandomText(9),
        getRandomText(13),
        getRandomText(15),
    )

    Description(
        texts = texts,
        format = value,
        title = getRandomText(3),
    )
}

@Preview(showBackground = true, widthDp = 360)
@Composable
private fun PreviewAnnotatedString() {
    val text = buildAnnotatedString {
        val text = "신분증 이미지를 가이드 영역에 맞춰 가로로 촬영 후 등록해주세요."
        val boldTarget1 = "가이드 영역"
        val boldStart1 = text.indexOf(boldTarget1)
        val boldEnd1 = boldStart1 + boldTarget1.length
        val boldTarget2 = "가로로 촬영"
        val boldStart2 = text.indexOf(boldTarget2)
        val boldEnd2 = boldStart2 + boldTarget2.length

        append(text)
        addStyle(style = SpanStyle(color = DealiColor.g100), start = boldStart1, end = boldEnd1)
        addStyle(style = SpanStyle(color = DealiColor.g100), start = boldStart2, end = boldEnd2)
    }

    Description(
        text = text,
        format = DOT,
        title = getRandomText(3),
    )
}
