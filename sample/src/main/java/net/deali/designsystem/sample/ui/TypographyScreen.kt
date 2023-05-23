package net.deali.designsystem.sample.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import net.deali.appresource.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.sample.datastore.DataStoreUtil
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.white100
import net.deali.designsystem.unit.getRandomText
import java.util.Locale

@Composable
fun TypographyScreen(
    onBackPress: () -> Unit,
    dataStoreUtil: DataStoreUtil
) {
    val typographyScreenItems = listOf(
        TypographyScreenItem("H1_32_B", AppTheme.typography.H1_32_B),
        TypographyScreenItem("H1_24_B", AppTheme.typography.H1_24_B),
        TypographyScreenItem("SH1_20_B", AppTheme.typography.SH1_20_B),
        TypographyScreenItem("SH1_20_M", AppTheme.typography.SH1_20_M),
        TypographyScreenItem("SH2_18_B", AppTheme.typography.SH2_18_B),
        TypographyScreenItem("SH2_18_R", AppTheme.typography.SH2_18_R),
        TypographyScreenItem("SH3_16_B", AppTheme.typography.SH3_16_B),
        TypographyScreenItem("SH3_16_R", AppTheme.typography.SH3_16_R),
        TypographyScreenItem("B1_15_B", AppTheme.typography.B1_15_B),
        TypographyScreenItem("B1_15_R", AppTheme.typography.B1_15_R),
        TypographyScreenItem("B2_14_B", AppTheme.typography.B2_14_B),
        TypographyScreenItem("B2_14_M", AppTheme.typography.B2_14_M),
        TypographyScreenItem("B2_14_R", AppTheme.typography.B2_14_R),
        TypographyScreenItem("B3_13_B", AppTheme.typography.B3_13_B),
        TypographyScreenItem("B3_13_M", AppTheme.typography.B3_13_M),
        TypographyScreenItem("B4_12_B", AppTheme.typography.B4_12_B),
        TypographyScreenItem("B4_12_M", AppTheme.typography.B4_12_M),
        TypographyScreenItem("B4_12_R", AppTheme.typography.B4_12_R),
        TypographyScreenItem("C1_10_B", AppTheme.typography.C1_10_B),
        TypographyScreenItem("C1_10_R", AppTheme.typography.C1_10_R),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Typography",
                navigationIcon = {
                    Icon24(
                        painter = painterResource(id = R.drawable.ic_arrow_left_16_ver01),
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        LocaleContainer(
            dataStoreUtil = dataStoreUtil
        )

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .background(color = gray20),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(typographyScreenItems.size) { index ->
                val typographyScreenItem = typographyScreenItems[index]

                Item(
                    name = typographyScreenItem.name,
                    style = typographyScreenItem.style
                )
            }
        }
    }
}

@Composable
private fun LocaleContainer(
    dataStoreUtil: DataStoreUtil
) {
    val scope = rememberCoroutineScope()

    val languageOptions = listOf(
        Locale.KOREA.language,
        Locale.US.language,
        Locale.SIMPLIFIED_CHINESE.language,
        Locale.JAPAN.language
    )

    var selectedItem by remember {
        mutableStateOf("")
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = white100)
            .padding(10.dp)
            .selectableGroup(),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        languageOptions.forEach { language ->
            RadioButton(
                text = language.toString(),
                selected = (selectedItem == language),
                onClick = {
                    scope.launch {
                        dataStoreUtil.putLanguage(language)
                        selectedItem = language
                    }
                }
            )
        }
    }
}

@Composable
private fun Item(
    name: String,
    style: TextStyle
) {
    var isVisible by remember { mutableStateOf(false) }
    val rotate: Float by animateFloatAsState(if (isVisible) 90f else 270f)

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(white100)
            .clickable(
                onClick = { isVisible = !isVisible }
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DealiText(
                modifier = Modifier
                    .weight(1f),
                text = name,
                style = style,
                color = style.color
            )

            Icon24(
                modifier = Modifier
                    .rotate(rotate),
                painter = painterResource(id = R.drawable.ic_arrow_left_24_ver01)
            )
        }

        AnimatedVisibility(
            visible = isVisible,
            enter = expandVertically(expandFrom = Alignment.Top),
            exit = shrinkVertically(shrinkTowards = Alignment.Top)
        ) {
            Column {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = gray30)
                )

                DealiText(
                    modifier = Modifier
                        .padding(30.dp),
                    text = getRandomText(),
                    style = style
                )
            }
        }
    }
}

private data class TypographyScreenItem(
    val name: String,
    val style: TextStyle
)
