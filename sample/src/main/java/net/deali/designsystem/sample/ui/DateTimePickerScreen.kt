package net.deali.designsystem.sample.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DatePicker
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.TimePicker
import net.deali.designsystem.component.TimePickerFormat
import net.deali.designsystem.component.rememberDatePickerState
import net.deali.designsystem.component.rememberTimePickerState
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun DateTimePickerScreen(onBackPress: () -> Unit) {
    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "DateTimePicker",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        var expanded1 by remember { mutableStateOf(true) }
        var expanded2 by remember { mutableStateOf(false) }
        var expanded3 by remember { mutableStateOf(true) }
        var expanded4 by remember { mutableStateOf(false) }

        val datePicker1State = rememberDatePickerState()
        val datePicker2State = rememberDatePickerState(2000, 1, 1)
        val timePicker1State = rememberTimePickerState()
        val timePicker2State = rememberTimePickerState(12, 12, 12)

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                SampleAccordion(
                    onHeaderClick = { expanded1 = !expanded1 },
                    expanded = expanded1,
                    modifier = Modifier.fillMaxWidth(),
                    headerContent = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            DealiText(
                                text = "DatePicker Sample 1",
                                style = DealiFont.sh1sb20,
                                color = DealiColor.g100
                            )
                        }
                    },
                    collapsableContent = {
                        Column {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                val timeFormat = remember { SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()) }
                                val displayTime by remember(datePicker1State.currentAsTimeStamp) {
                                    derivedStateOf {
                                        val timeStamp = datePicker1State.currentAsTimeStamp
                                        timeFormat.format(timeStamp)
                                    }
                                }

                                DealiText(
                                    text = "Selected Date:",
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                DealiText(
                                    text = displayTime,
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                            }

                            DatePicker(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                                    .border(
                                        width = 1.dp,
                                        color = DealiColor.g20,
                                        shape = AppTheme.shapes.radius10
                                    ),
                                state = datePicker1State,
                                contentPadding = PaddingValues(horizontal = 36.dp),
                            )
                        }
                    }
                )
            }

            item {
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 1.dp,
                    color = DealiColor.g10
                )
            }

            item {
                SampleAccordion(
                    onHeaderClick = { expanded2 = !expanded2 },
                    expanded = expanded2,
                    modifier = Modifier.fillMaxWidth(),
                    headerContent = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            DealiText(
                                text = "DatePicker Sample 2",
                                style = DealiFont.sh1sb20,
                                color = DealiColor.g100
                            )
                        }
                    },
                    collapsableContent = {
                        Column {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                val timeFormat = remember { SimpleDateFormat("yyyy/MM", Locale.getDefault()) }
                                val displayTime by remember(datePicker2State.currentAsTimeStamp) {
                                    derivedStateOf {
                                        val timeStamp = datePicker2State.currentAsTimeStamp
                                        timeFormat.format(timeStamp)
                                    }
                                }

                                DealiText(
                                    text = "Selected Date:",
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                DealiText(
                                    text = displayTime,
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                            }

                            DatePicker(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                                    .border(
                                        width = 1.dp,
                                        color = DealiColor.g20,
                                        shape = AppTheme.shapes.radius10
                                    ),
                                state = datePicker2State,
                                dateEnabled = false
                            )
                        }
                    }
                )
            }

            item {
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 1.dp,
                    color = DealiColor.g10
                )
            }

            item {
                SampleAccordion(
                    onHeaderClick = { expanded3 = !expanded3 },
                    expanded = expanded3,
                    modifier = Modifier.fillMaxWidth(),
                    headerContent = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            DealiText(
                                text = "TimePicker Sample 1",
                                style = DealiFont.sh1sb20,
                                color = DealiColor.g100
                            )
                        }
                    },
                    collapsableContent = {
                        Column {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                val timeFormat = remember { SimpleDateFormat("HH:mm:ss", Locale.getDefault()) }
                                val displayTime by remember(timePicker1State.currentAsTimeStamp) {
                                    derivedStateOf {
                                        val timeStamp = timePicker1State.currentAsTimeStamp
                                        timeFormat.format(timeStamp)
                                    }
                                }

                                DealiText(
                                    text = "Selected Time:",
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                DealiText(
                                    text = displayTime,
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                            }

                            TimePicker(
                                timeFormat = TimePickerFormat.Format24Hour,
                                state = timePicker1State,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                                    .border(
                                        width = 1.dp,
                                        color = DealiColor.g20,
                                        shape = AppTheme.shapes.radius10
                                    ),
                                minuteInterval = 5,
                                secondInterval = 30,
                                decorationBox = { innerPickers ->
                                    Row(
                                        modifier = Modifier
                                            .align(Alignment.Center)
                                            .fillMaxWidth()
                                            .height(26.dp)
                                            .background(color = DealiColor.g10),
                                        horizontalArrangement = Arrangement.SpaceEvenly,
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        DealiText(
                                            text = ":",
                                            style = DealiFont.sh3sb16,
                                            color = DealiColor.g100
                                        )
                                        DealiText(
                                            text = ":",
                                            style = DealiFont.sh3sb16,
                                            color = DealiColor.g100
                                        )
                                    }
                                    innerPickers()
                                },
                            )
                        }
                    }
                )
            }

            item {
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 1.dp,
                    color = DealiColor.g10
                )
            }

            item {
                SampleAccordion(
                    onHeaderClick = { expanded4 = !expanded4 },
                    expanded = expanded4,
                    modifier = Modifier.fillMaxWidth(),
                    headerContent = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            DealiText(
                                text = "TimePicker Sample 2",
                                style = DealiFont.sh1sb20,
                                color = DealiColor.g100
                            )
                        }
                    },
                    collapsableContent = {
                        Column {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                val timeFormat = remember { SimpleDateFormat("a hh:mm:ss", Locale.US) }
                                val displayTime by remember(timePicker2State.currentAsTimeStamp) {
                                    derivedStateOf {
                                        val timeStamp = timePicker2State.currentAsTimeStamp
                                        timeFormat.format(timeStamp)
                                    }
                                }

                                DealiText(
                                    text = "Selected Time:",
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                DealiText(
                                    text = displayTime,
                                    style = DealiFont.sh3r16,
                                    color = DealiColor.g80
                                )
                            }

                            TimePicker(
                                timeFormat = TimePickerFormat.Format12Hour,
                                state = timePicker2State,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                                    .border(
                                        width = 1.dp,
                                        color = DealiColor.g20,
                                        shape = AppTheme.shapes.radius10
                                    ),
                                decorationBox = { innerPickers ->
                                    Row(
                                        modifier = Modifier
                                            .align(Alignment.Center)
                                            .fillMaxWidth()
                                            .height(26.dp)
                                            .background(color = DealiColor.g10),
                                        horizontalArrangement = Arrangement.SpaceEvenly,
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Box {}
                                        DealiText(
                                            text = ":",
                                            style = DealiFont.sh3sb16,
                                            color = DealiColor.g100
                                        )
                                        DealiText(
                                            text = ":",
                                            style = DealiFont.sh3sb16,
                                            color = DealiColor.g100
                                        )
                                    }
                                    innerPickers()
                                },
                            )
                        }
                    }
                )
            }

        }
    }
}

@Composable
private fun SampleAccordion(
    onHeaderClick: () -> Unit,
    expanded: Boolean,
    modifier: Modifier = Modifier,
    headerContent: @Composable () -> Unit,
    collapsableContent: @Composable () -> Unit
) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.clickable(onClick = onHeaderClick)) {
            headerContent()
        }

        AnimatedVisibility(
            visible = expanded,
            enter = expandVertically(),
            exit = shrinkVertically(),
            modifier = Modifier.fillMaxWidth()
        ) {
            collapsableContent()
        }
    }
}

@Stable
private fun Int.toTimePickerContentText(): String {
    return if (this < 10) "0${this}" else this.toString()
}
