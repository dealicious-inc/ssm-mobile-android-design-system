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
import androidx.compose.runtime.DisposableEffect
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
import net.deali.designsystem.component.BottomSheetWithHandle
import net.deali.designsystem.component.btnOutlineMediumPrimary01

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetScreen(onBackPress: () -> Unit) {
    val coroutineScope = rememberCoroutineScope()
    val bottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    var bottomSheetType by remember { mutableStateOf(BottomSheetType.Plain) }
    val hideBottomSheet: () -> Unit = remember {
        {
            coroutineScope.launch {
                bottomSheetState.hide()
            }
        }
    }

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
        },
        sheetState = bottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
    ) {
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
                btnOutlineMediumPrimary01(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                    text = "타이틀X 버튼 X 핸들X",
                    onClick = remember {
                        {
                            coroutineScope.launch {
                                bottomSheetType = BottomSheetType.Plain
                                bottomSheetState.show()
                            }
                        }
                    },
                )

                btnOutlineMediumPrimary01(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                    text = "타이틀O 버튼 X",
                    onClick = remember {
                        {
                            coroutineScope.launch {
                                bottomSheetType = BottomSheetType.Title
                                bottomSheetState.show()
                            }
                        }
                    },
                )

                btnOutlineMediumPrimary01(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                    text = "타이틀O 버튼 1개",
                    onClick = remember {
                        {
                            coroutineScope.launch {
                                bottomSheetType = BottomSheetType.TitleAndButton
                                bottomSheetState.show()
                            }
                        }
                    },
                )

                btnOutlineMediumPrimary01(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                    text = "타이틀O 버튼 2개",
                    onClick = remember {
                        {
                            coroutineScope.launch {
                                bottomSheetType = BottomSheetType.TitleAndTwoButton
                                bottomSheetState.show()
                            }
                        }
                    },
                )

                btnOutlineMediumPrimary01(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                    text = "타이틀X 버튼 X 핸들O",
                    onClick = remember {
                        {
                            coroutineScope.launch {
                                bottomSheetType = BottomSheetType.TitleWithHandle
                                bottomSheetState.show()
                            }
                        }
                    },
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
    Title,
    TitleAndButton,
    TitleAndTwoButton,
    TitleWithHandle,
}
