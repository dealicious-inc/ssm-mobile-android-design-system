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
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.sample.datastore.DataStoreUtil
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.gray100
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
        TypographyScreenItem("H1B32", AppTheme.typography.h1b32),
        TypographyScreenItem("H2B24", AppTheme.typography.h2b24),
        TypographyScreenItem("SH1B20", AppTheme.typography.sh1b20),
        TypographyScreenItem("SH1M20", AppTheme.typography.sh1m20),
        TypographyScreenItem("SH2B18", AppTheme.typography.sh2b18),
        TypographyScreenItem("SH2R18", AppTheme.typography.sh2r18),
        TypographyScreenItem("SH3B16", AppTheme.typography.sh3b16),
        TypographyScreenItem("SH3R16", AppTheme.typography.sh3r16),
        TypographyScreenItem("B1B15", AppTheme.typography.b1b15),
        TypographyScreenItem("B1R15", AppTheme.typography.b1r15),
        TypographyScreenItem("B2B14", AppTheme.typography.b2b14),
        TypographyScreenItem("B2M14", AppTheme.typography.b2m14),
        TypographyScreenItem("B2R14", AppTheme.typography.b2r14),
        TypographyScreenItem("B3B13", AppTheme.typography.b3b13),
        TypographyScreenItem("B3M13", AppTheme.typography.b3m13),
        TypographyScreenItem("B3R13", AppTheme.typography.b3r13),
        TypographyScreenItem("B4B12", AppTheme.typography.b4b12),
        TypographyScreenItem("B4M12", AppTheme.typography.b4m12),
        TypographyScreenItem("B4R12", AppTheme.typography.b4r12),
        TypographyScreenItem("C1B10", AppTheme.typography.c1b10),
        TypographyScreenItem("C1R10", AppTheme.typography.c1r10),
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
                    style = style,
                    color = gray100
                )
            }
        }
    }
}

private data class TypographyScreenItem(
    val name: String,
    val style: TextStyle
)
