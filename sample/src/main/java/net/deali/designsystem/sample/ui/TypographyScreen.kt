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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.component.RadioButton
import net.deali.designsystem.sample.datastore.DataStoreUtil
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.util.getRandomText
import java.util.Locale

@Composable
fun TypographyScreen(
    onBackPress: () -> Unit,
    dataStoreUtil: DataStoreUtil
) {
    val typographyScreenItems = listOf(
        TypographyScreenItem("h1sb32", AppTheme.typography.h1sb32),
        TypographyScreenItem("h3sb28", AppTheme.typography.h3sb28),
        TypographyScreenItem("h2sb24", AppTheme.typography.h2sb24),
        TypographyScreenItem("sh1sb20", AppTheme.typography.sh1sb20),
        TypographyScreenItem("sh1r20", AppTheme.typography.sh1r20),
        TypographyScreenItem("sh2sb18", AppTheme.typography.sh2sb18),
        TypographyScreenItem("sh2r18", AppTheme.typography.sh2r18),
        TypographyScreenItem("sh3sb16", AppTheme.typography.sh3sb16),
        TypographyScreenItem("sh3r16", AppTheme.typography.sh3r16),
        TypographyScreenItem("b1sb15", AppTheme.typography.b1sb15),
        TypographyScreenItem("b1r15", AppTheme.typography.b1r15),
        TypographyScreenItem("b2sb14", AppTheme.typography.b2sb14),
        TypographyScreenItem("b2r14", AppTheme.typography.b2r14),
        TypographyScreenItem("b3sb13", AppTheme.typography.b3sb13),
        TypographyScreenItem("b3r13", AppTheme.typography.b3r13),
        TypographyScreenItem("b4sb12", AppTheme.typography.b4sb12),
        TypographyScreenItem("b4r12", AppTheme.typography.b4r12),
        TypographyScreenItem("c1sb10", AppTheme.typography.c1sb10),
        TypographyScreenItem("c1r10", AppTheme.typography.c1r10),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Typography",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
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
                .background(color = AppTheme.colors.g10),
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
            .background(color = AppTheme.colors.primary04)
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
            .background(AppTheme.colors.primary04)
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
                iconRes = R.drawable.ic_arrow_left_24_ver01
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
                        .background(color = AppTheme.colors.g30)
                )

                DealiText(
                    modifier = Modifier
                        .padding(30.dp),
                    text = getRandomText(),
                    style = style,
                    color = AppTheme.colors.g100
                )
            }
        }
    }
}

private data class TypographyScreenItem(
    val name: String,
    val style: TextStyle
)
