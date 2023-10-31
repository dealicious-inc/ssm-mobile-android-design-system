package net.deali.designsystem.sample.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
        val datePicker1State = rememberDatePickerState()
        val datePicker2State = rememberDatePickerState()
        val timePicker1State = rememberTimePickerState(TimePickerFormat.Format24Hour)
        val timePicker2State = rememberTimePickerState(TimePickerFormat.Format12Hour)

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                DealiText(
                    text = "DatePicker",
                    style = DealiFont.sh1sb20,
                    color = DealiColor.g100
                )
            }

            item {
                Row(modifier = Modifier.fillMaxWidth()) {
                    DealiText(
                        text = "Selected Date:",
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    DealiText(
                        text = "${datePicker1State.currentYear}/${datePicker1State.currentMonth}/${datePicker1State.currentDate}",
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                }
            }

            item {
                DatePicker(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .border(
                            width = 1.dp,
                            color = DealiColor.g20,
                            shape = AppTheme.shapes.radius10
                        ),
                    state = datePicker1State,
                    contentPadding = PaddingValues(horizontal = 36.dp),
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
                DealiText(
                    text = "DatePicker (Year & Month)",
                    style = DealiFont.sh1sb20,
                    color = DealiColor.g100
                )
            }

            item {
                Row(modifier = Modifier.fillMaxWidth()) {
                    DealiText(
                        text = "Selected Date:",
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    DealiText(
                        text = "${datePicker2State.currentYear}/${datePicker2State.currentMonth}/${datePicker2State.currentDate}",
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                }
            }

            item {
                DatePicker(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .border(
                            width = 1.dp,
                            color = DealiColor.g20,
                            shape = AppTheme.shapes.radius10
                        ),
                    state = datePicker2State,
                    dateEnabled = false,
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
                DealiText(
                    text = "TimePicker (24Hours)",
                    style = DealiFont.sh1sb20,
                    color = DealiColor.g100
                )
            }

            item {
                Row(modifier = Modifier.fillMaxWidth()) {
                    DealiText(
                        text = "Selected Time:",
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    DealiText(
                        text = "${timePicker1State.currentHour.toTimePickerContentText()}:" +
                                "${timePicker1State.currentMinute.toTimePickerContentText()}:" +
                                timePicker1State.currentSecond.toTimePickerContentText(),
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                }
            }

            item {
                TimePicker(
                    timeFormat = TimePickerFormat.Format24Hour,
                    state = timePicker1State,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
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

            item {
                DealiText(
                    text = "TimePicker (12 Hours)",
                    style = DealiFont.sh1sb20,
                    color = DealiColor.g100
                )
            }

            item {
                Row(modifier = Modifier.fillMaxWidth()) {
                    DealiText(
                        text = "Selected Time:",
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    DealiText(
                        text = "${timePicker2State.currentHour.toTimePickerContentText()}:" +
                                "${timePicker2State.currentMinute.toTimePickerContentText()}:" +
                                timePicker2State.currentSecond.toTimePickerContentText(),
                        style = DealiFont.sh3r16,
                        color = DealiColor.g80
                    )
                }
            }

            item {
                TimePicker(
                    timeFormat = TimePickerFormat.Format12Hour,
                    state = timePicker2State,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
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
    }
}

@Stable
private fun Int.toTimePickerContentText(): String {
    return if (this < 10) "0${this}" else this.toString()
}
