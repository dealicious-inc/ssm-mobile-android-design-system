package net.deali.designsystem.sample.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.deali.designsystem.R
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.BottomSheet
import net.deali.designsystem.component.BottomSheetHeaderArrowClose
import net.deali.designsystem.component.BottomSheetSingleSelectOption
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.SingleSelectOption
import net.deali.designsystem.component.btnOutlineMedium01
import net.deali.designsystem.theme.DealiShape

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetScreen(onBackPress: () -> Unit) {
    val coroutineScope = rememberCoroutineScope()
    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    var bottomSheetType by remember { mutableStateOf(BottomSheetType.Empty) }
    val hideBottomSheet: () -> Unit = {
        coroutineScope.launch { bottomSheetState.hide() }
    }
    var selectedOptionIndex: Int? by remember { mutableStateOf(null) }

    ModalBottomSheetLayout(
        sheetContent = when (bottomSheetType) {
            BottomSheetType.Empty -> {
                {
                    BottomSheet {
                        EmptyBox()
                    }
                }
            }

            BottomSheetType.TextNoButton -> {
                {
                    BottomSheet(
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        text = "텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트텍스트",
                        onDismiss = hideBottomSheet,
                    )
                }
            }

            BottomSheetType.TextOneButton -> {
                {
                    BottomSheet(
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        text = "텍스트",
                        buttonText = "버튼명",
                        onButtonClick = {},
                        onDismiss = hideBottomSheet,
                    )
                }
            }

            BottomSheetType.TextTwoButtons -> {
                {
                    BottomSheet(
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        text = "텍스트",
                        primaryButtonText = "버튼1",
                        secondaryButtonText = "버튼2",
                        onPrimaryButtonClick = {},
                        onSecondaryButtonClick = {},
                        onDismiss = hideBottomSheet,
                    )
                }
            }

            BottomSheetType.NoButton -> {
                {
                    BottomSheet(
                        title = "타이틀",
                        onDismiss = hideBottomSheet,
                        content = { EmptyBox() }
                    )
                }
            }

            BottomSheetType.OneButton -> {
                {
                    var isLoading by remember { mutableStateOf(false) }
                    var delayJob by remember { mutableStateOf<Job?>(null) }

                    BottomSheet(
                        title = "타이틀",
                        buttonText = "확인",
                        isButtonLoading = isLoading,
                        onButtonClick = remember {
                            {
                                delayJob = coroutineScope.launch {
                                    isLoading = true
                                    delay(1_000L)
                                    bottomSheetState.hide()
                                }
                            }
                        },
                        onDismiss = hideBottomSheet,
                    ) {
                        EmptyBox()
                    }

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
                        title = "타이틀",
                        primaryButtonText = "탈퇴",
                        secondaryButtonText = "취소",
                        isPrimaryButtonLoading = isLoading,
                        onPrimaryButtonClick = remember {
                            {
                                delayJob = coroutineScope.launch {
                                    isLoading = true
                                    delay(1_000L)
                                    bottomSheetState.hide()
                                }
                            }
                        },
                        onSecondaryButtonClick = hideBottomSheet,
                        onDismiss = hideBottomSheet,
                    ) {
                        EmptyBox()
                    }

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
                    BottomSheetSingleSelectOption(
                        title = "단일 옵션",
                        singleSelectOptionList = listOf(
                            SingleSelectOption(
                                text = "옵션1",
                                isSelected = selectedOptionIndex == 0,
                            ),

                            SingleSelectOption(
                                text = "옵션2",
                                isSelected = selectedOptionIndex == 1,
                            ),

                            SingleSelectOption(
                                text = "옵션3",
                                isSelected = selectedOptionIndex == 2,
                                icon = {
                                    Icon16(iconRes = R.drawable.ic_category_filled)
                                }
                            ),
                        ),
                        onSelectOption = {
                            selectedOptionIndex = it
                        },
                        onDismiss = hideBottomSheet
                    )
                }
            }

            BottomSheetType.HeaderArrowClose -> {
                {
                    BottomSheetHeaderArrowClose(
                        onDismiss = hideBottomSheet,
                    )
                }
            }
        },
        sheetState = bottomSheetState,
        sheetShape = DealiShape.radius20,
    ) {

        @Composable
        fun OpenBottomSheetButton(
            text: String,
            type: BottomSheetType,
            modifier: Modifier = Modifier,
        ) {
            btnOutlineMedium01(
                modifier = modifier.fillMaxWidth(),
                enabled = true,
                text = text,
                onClick = {
                    coroutineScope.launch {
                        bottomSheetType = type
                        bottomSheetState.show()
                    }
                },
            )
        }

        Column {
            ActionBar(
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
                    text = "단일 옵션 선택",
                    type = BottomSheetType.SingleSelect,
                )

                OpenBottomSheetButton(
                    text = "Header Arrow Close",
                    type = BottomSheetType.HeaderArrowClose,
                )
            }
        }
    }
}


@Composable
private fun EmptyBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(104.dp)
            .background(color = Color(0xFFFFE0E0))
            .padding(start = 16.dp, top = 4.dp, end = 16.dp)
    )
}

private enum class BottomSheetType {
    Empty,
    TextNoButton,
    TextOneButton,
    TextTwoButtons,
    NoButton,
    OneButton,
    TwoButton,
    SingleSelect,
    HeaderArrowClose,
}
