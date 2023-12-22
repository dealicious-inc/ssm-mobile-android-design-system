package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.BottomSheet
import net.deali.designsystem.component.BottomSheetSingleSelectOption
import net.deali.designsystem.component.BottomSheetWithHandle
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.SingleSelectOption
import net.deali.designsystem.component.btnOutlineMediumPrimary01

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetScreen(onBackPress: () -> Unit) {
    val coroutineScope = rememberCoroutineScope()
    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    var bottomSheetType by remember { mutableStateOf(BottomSheetType.Plain) }
    val hideBottomSheet: () -> Unit = {
        coroutineScope.launch { bottomSheetState.hide() }
    }
    var selectedOptionIndex: Int? by remember { mutableStateOf(null) }

    ModalBottomSheetLayout(
        sheetContent = when (bottomSheetType) {
            BottomSheetType.Plain -> {
                {
                    BottomSheet {
                        EmptyBox()
                    }
                }
            }

            BottomSheetType.Title -> {
                {
                    BottomSheet(
                        title = "타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀타이틀",
                        onDismiss = hideBottomSheet,
                    ) {
                        EmptyBox()
                    }
                }
            }

            BottomSheetType.TwoButton -> {
                {
                    BottomSheet(
                        primaryButtonText = "탈퇴",
                        secondaryButtonText = "취소",
                        onPrimaryButtonClick = {},
                        onSecondaryButtonClick = {},
                        content = { EmptyBox() }
                    )
                }
            }

            BottomSheetType.TitleAndButton -> {
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

            BottomSheetType.TitleAndTwoButton -> {
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

            BottomSheetType.TitleWithHandle -> {
                {
                    BottomSheetWithHandle(
                        title = "타이틀",
                        onDismiss = hideBottomSheet,
                    ) {
                        EmptyBox()
                    }
                }
            }

            BottomSheetType.SingleSelectOption -> {
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
                                    Icon16(iconRes = net.deali.designsystem.R.drawable.ic_category_filled)
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

            BottomSheetType.MultiSelectOption -> {
                {

                }
            }
        },
        sheetState = bottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
    ) {

        @Composable
        fun OpenBottomSheetButton(
            text: String,
            type: BottomSheetType,
            modifier: Modifier = Modifier,
        ) {
            btnOutlineMediumPrimary01(
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
                    text = "타이틀X 버튼 X",
                    type = BottomSheetType.Plain,
                )
                OpenBottomSheetButton(
                    text = "타이틀X, 버튼 2개",
                    type = BottomSheetType.TwoButton,
                )
                OpenBottomSheetButton(
                    text = "타이틀O 버튼 X",
                    type = BottomSheetType.Title,
                )
                OpenBottomSheetButton(
                    text = "타이틀O 버튼 1개",
                    type = BottomSheetType.TitleAndButton,
                )
                OpenBottomSheetButton(
                    text = "타이틀O 버튼 2개",
                    type = BottomSheetType.TitleAndTwoButton,
                )
                OpenBottomSheetButton(
                    text = "타이틀O 버튼 X 핸들O",
                    type = BottomSheetType.TitleWithHandle,
                )
                OpenBottomSheetButton(
                    text = "단일 옵션 선택",
                    type = BottomSheetType.SingleSelectOption,
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
    Plain,
    TwoButton,
    Title,
    TitleAndButton,
    TitleAndTwoButton,
    TitleWithHandle,
    SingleSelectOption,
    MultiSelectOption,
}
