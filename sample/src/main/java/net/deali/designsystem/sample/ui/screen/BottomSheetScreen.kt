package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.collections.immutable.persistentListOf
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.deali.designsystem.component.BottomSheet
import net.deali.designsystem.component.BottomSheetOption
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.btnFilledLarge01
import net.deali.designsystem.component.btnOutlineLarge01
import net.deali.designsystem.component.btnOutlineLarge06
import net.deali.designsystem.component.btnOutlineMedium01
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun BottomSheetScreen(onBackPress: () -> Unit) {
    val coroutineScope = rememberCoroutineScope()
    val bottomSheetState =
        rememberModalBottomSheetState(
            initialValue = ModalBottomSheetValue.Hidden,
            skipHalfExpanded = true,
        )
    var bottomSheetType by remember { mutableStateOf(BottomSheetType.Empty) }
    val hideBottomSheet: () -> Unit = {
        coroutineScope.launch { bottomSheetState.hide() }
    }
    var selectedOptionIndex: Int? by remember { mutableStateOf(null) }

    // ModalBottomSheetLayout은 딤드가 시스템 바까지 덮도록 전체 화면을 차지하고,
    // 시스템 바 인셋은 본문/시트 컨텐츠 안쪽에서 처리한다 (Nav.kt insetComposable 주석 참고)
    ModalBottomSheetLayout(
        sheetContent = {
            val sheetContentByType: @Composable ColumnScope.() -> Unit = when (bottomSheetType) {
            BottomSheetType.Empty -> {
                {
                    BottomSheet(
                        content = { EmptyBox() },
                    )
                }
            }

            BottomSheetType.TextNoButton -> {
                {
                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        content = {
                            SheetText(
                                text = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
                                bottomPadding = 24.dp,
                            )
                        },
                    )
                }
            }

            BottomSheetType.TextOneButton -> {
                {
                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        content = { SheetText(text = "텍스트") },
                        footer = {
                            SheetFooter {
                                btnFilledLarge01(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "버튼명",
                                    onClick = {},
                                )
                            }
                        },
                    )
                }
            }

            BottomSheetType.TextTwoButtons -> {
                {
                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        content = { SheetText(text = "텍스트") },
                        footer = {
                            SheetFooter {
                                btnOutlineLarge01(
                                    modifier = Modifier.weight(1f),
                                    text = "버튼2",
                                    onClick = {},
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                btnFilledLarge01(
                                    modifier = Modifier.weight(1f),
                                    text = "버튼1",
                                    onClick = {},
                                )
                            }
                        },
                    )
                }
            }

            BottomSheetType.NoButton -> {
                {
                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀",
                        content = { EmptyBox() },
                    )
                }
            }

            BottomSheetType.OneButton -> {
                {
                    var isLoading by remember { mutableStateOf(false) }
                    var delayJob by remember { mutableStateOf<Job?>(null) }

                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀",
                        content = { EmptyBox() },
                        footer = {
                            SheetFooter {
                                btnFilledLarge01(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = "확인",
                                    loading = isLoading,
                                    onClick = remember {
                                        {
                                            delayJob = coroutineScope.launch {
                                                isLoading = true
                                                delay(1_000L)
                                                bottomSheetState.hide()
                                            }
                                        }
                                    },
                                )
                            }
                        },
                    )

                    LaunchedEffect(key1 = bottomSheetState.isVisible) {
                        if (!bottomSheetState.isVisible) {
                            isLoading = false
                            delayJob?.cancel()
                            delayJob = null
                        }
                    }
                }
            }

            BottomSheetType.TwoButton -> {
                {
                    var isLoading by remember { mutableStateOf(false) }
                    var delayJob by remember { mutableStateOf<Job?>(null) }

                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀",
                        content = { EmptyBox() },
                        footer = {
                            SheetFooter {
                                btnOutlineLarge01(
                                    modifier = Modifier.weight(1f),
                                    text = "취소",
                                    onClick = hideBottomSheet,
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                btnFilledLarge01(
                                    modifier = Modifier.weight(1f),
                                    text = "탈퇴",
                                    loading = isLoading,
                                    onClick = remember {
                                        {
                                            delayJob = coroutineScope.launch {
                                                isLoading = true
                                                delay(1_000L)
                                                bottomSheetState.hide()
                                            }
                                        }
                                    },
                                )
                            }
                        },
                    )

                    LaunchedEffect(key1 = bottomSheetState.isVisible) {
                        if (!bottomSheetState.isVisible) {
                            isLoading = false
                            delayJob?.cancel()
                            delayJob = null
                        }
                    }
                }
            }

            BottomSheetType.TwoButtonGray -> {
                {
                    var isLoading by remember { mutableStateOf(false) }
                    var delayJob by remember { mutableStateOf<Job?>(null) }

                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "타이틀",
                        content = { EmptyBox() },
                        footer = {
                            SheetFooter {
                                btnOutlineLarge06(
                                    modifier = Modifier.weight(1f),
                                    text = "취소",
                                    onClick = hideBottomSheet,
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                btnFilledLarge01(
                                    modifier = Modifier.weight(1f),
                                    text = "탈퇴",
                                    loading = isLoading,
                                    onClick = remember {
                                        {
                                            delayJob = coroutineScope.launch {
                                                isLoading = true
                                                delay(1_000L)
                                                bottomSheetState.hide()
                                            }
                                        }
                                    },
                                )
                            }
                        },
                    )

                    LaunchedEffect(key1 = bottomSheetState.isVisible) {
                        if (!bottomSheetState.isVisible) {
                            isLoading = false
                            delayJob?.cancel()
                            delayJob = null
                        }
                    }
                }
            }

            BottomSheetType.SingleSelect -> {
                {
                    val options = remember { persistentListOf("옵션1", "옵션2", "옵션3") }

                    BottomSheet(
                        onDismiss = hideBottomSheet,
                        title = "단일 옵션",
                        content = {
                            LazyColumn {
                                itemsIndexed(options) { index, option ->
                                    BottomSheetOption(
                                        text = option,
                                        isSelected = selectedOptionIndex == index,
                                        onClick = {
                                            selectedOptionIndex = index
                                            hideBottomSheet()
                                        },
                                    )
                                }
                            }
                        },
                    )
                }
            }
            }

            // 하단에 붙는 시트이므로 내비바만큼만 아래 패딩을 주고,
            // 시트가 최대로 펼쳐져도 status bar를 침범하지 않도록 최대 높이를 제한한다
            BoxWithConstraints {
                val statusBarHeight = WindowInsets.statusBars.asPaddingValues().calculateTopPadding()
                Column(
                    modifier = Modifier
                        .heightIn(max = maxHeight - statusBarHeight)
                        .navigationBarsPadding(),
                ) {
                    sheetContentByType()
                }
            }
        },
        sheetState = bottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
    ) {

        @Composable
        fun OpenBottomSheetButton(
            text: String,
            type: BottomSheetType,
            modifier: Modifier = Modifier,
        ) {
            btnOutlineMedium01(
                modifier = modifier.fillMaxWidth(),
                text = text,
                enabled = true,
                onClick = {
                    coroutineScope.launch {
                        bottomSheetType = type
                        bottomSheetState.show()
                    }
                },
            )
        }

        Column(modifier = Modifier.systemBarsPadding()) {
            TopBar(
                modifier = Modifier.fillMaxWidth(),
                title = "Bottom Sheet",
                onBack = onBackPress,
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(top = 24.dp, start = 16.dp, bottom = 40.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                OpenBottomSheetButton(
                    text = "Empty",
                    type = BottomSheetType.Empty,
                )

                OpenBottomSheetButton(
                    text = "텍스트 | 버튼X",
                    type = BottomSheetType.TextNoButton,
                )

                OpenBottomSheetButton(
                    text = "텍스트 | 버튼1",
                    type = BottomSheetType.TextOneButton,
                )

                OpenBottomSheetButton(
                    text = "텍스트 | 버튼2",
                    type = BottomSheetType.TextTwoButtons,
                )

                OpenBottomSheetButton(
                    text = "자유형식 | 버튼X",
                    type = BottomSheetType.NoButton,
                )

                OpenBottomSheetButton(
                    text = "자유형식 | 버튼1",
                    type = BottomSheetType.OneButton,
                )

                OpenBottomSheetButton(
                    text = "자유형식 | 버튼2",
                    type = BottomSheetType.TwoButton,
                )

                OpenBottomSheetButton(
                    text = "자유형식 | 버튼2회색",
                    type = BottomSheetType.TwoButtonGray,
                )

                OpenBottomSheetButton(
                    text = "단일 옵션 선택",
                    type = BottomSheetType.SingleSelect,
                )
            }
        }
    }
}

/** 텍스트만 있는 바텀시트의 본문 텍스트 */
@Composable
private fun SheetText(
    text: String,
    modifier: Modifier = Modifier,
    bottomPadding: Dp = 12.dp,
) {
    DealiText(
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = bottomPadding),
        text = text,
        style = DealiFont.b2r14,
        color = DealiColor.g80,
    )
}

/** footer 슬롯에 버튼을 배치할 때 쓰는 공통 컨테이너 */
@Composable
private fun SheetFooter(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(74.dp)
            .background(DealiColor.primary04)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        content = content,
    )
}

@Composable
private fun EmptyBox(modifier: Modifier = Modifier) {
    val items = List(50) { i -> "아이템 ${i + 1}" }

    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xFFFFE0E0))
            .padding(start = 16.dp, top = 4.dp, end = 16.dp)
    ) {
        items(
            items = items,
        ) { item ->
            DealiText(
                modifier = Modifier
                    .fillMaxWidth(),
                text = item,
                color = DealiColor.g100,
                style = DealiFont.sh2sb18
            )
        }
    }
}

private enum class BottomSheetType {
    Empty,
    TextNoButton,
    TextOneButton,
    TextTwoButtons,
    NoButton,
    OneButton,
    TwoButton,
    TwoButtonGray,
    SingleSelect,
}
