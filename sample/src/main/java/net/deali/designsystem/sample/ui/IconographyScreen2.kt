package net.deali.designsystem.sample.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.Icon32
import net.deali.designsystem.component.btnOutlineSmall01
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun IconographyScreen2(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            ActionBar(
                title = "Iconography",
                onBack = onBackPress,
            )
        }
    ) {
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .background(DealiColor.g10)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {

            Container(
                iconList = outlineIcons,
                height = 600,
                containerTitle = "아이콘",
            )


            Container(
                iconList = noStrokeIcons,
                height = 120,
                containerTitle = "No Stroke",
            )


            Container(
                iconList = filledIcons,
                height = 300,
                containerTitle = "Filled",
            )


            Container(
                iconList = categoryIcons,
                height = 120,
                containerTitle = "카테고리",
            )


            Container(
                iconList = myPageIcons,
                height = 120,
                containerTitle = "마이페이지",
            )


            Container(
                iconList = etcIcons,
                height = 120,
                containerTitle = "Etc",
            )
        }
    }
}

@Composable
private fun Container(
    iconList: List<IconItem>,
    height: Int,
    containerTitle: String,
) {
    var currentIconColor by remember { mutableStateOf(DealiColor.primary05) }
    var currentBackgroundColor by remember { mutableStateOf(DealiColor.primary04) }
    var currentIconSize by remember { mutableStateOf(SIZE_16) }

    val lazyGridState = rememberLazyGridState()

    Column(
        Modifier
            .height(height.dp)
    ) {
        DealiText(
            text = containerTitle,
            style = DealiFont.sh3sb16,
            color = DealiColor.g100,
        )

        Row {
            btnOutlineSmall01(
                onClick = {
                    currentIconColor = when (currentIconColor) {
                        DealiColor.primary05 -> DealiColor.primary04
                        DealiColor.primary04 -> DealiColor.primary05
                        else -> DealiColor.primary01
                    }

                },
                text = "아이콘 색상"
            )

            Spacer(modifier = Modifier.width(4.dp))

            btnOutlineSmall01(
                onClick = {
                    currentBackgroundColor = when (currentBackgroundColor) {
                        DealiColor.primary04 -> DealiColor.primary05
                        DealiColor.primary05 -> DealiColor.primary04
                        else -> DealiColor.primary01
                    }
                },
                text = "배경 색상"
            )

            Spacer(modifier = Modifier.width(4.dp))

            btnOutlineSmall01(
                onClick = {
                    currentIconSize = when (currentIconSize) {
                        SIZE_16 -> SIZE_24
                        SIZE_24 -> SIZE_32
                        else -> SIZE_16
                    }
                },
                text = "사이즈 $currentIconSize"
            )
        }

        LazyVerticalGrid(
            modifier = Modifier
                .wrapContentWidth()
                .clip(RoundedCornerShape(6.dp))
                .background(currentBackgroundColor)
                .border(1.dp, DealiColor.g30, RoundedCornerShape(6.dp))
                .padding(horizontal = 10.dp),
            columns = GridCells.Fixed(11),
            state = lazyGridState,
        ) {
            items(items = iconList) { icon ->
                Item(
                    name = icon.name,
                    size = currentIconSize,
                    iconColor = currentIconColor,
                    iconRes = icon.iconRes,
                )
            }
        }
    }
}

@Composable
private fun Item(
    name: String,
    size: Int,
    iconColor: Color,
    @DrawableRes iconRes: Int,
) {
    Box(
        modifier = Modifier
            .size(48.dp)
    ) {
        when (size) {
            SIZE_16 -> {
                Icon16(
                    modifier = Modifier.align(Alignment.Center),
                    iconRes = iconRes,
                    color = iconColor,
                    onClick = {}
                )
            }

            SIZE_24 -> {
                Icon24(
                    modifier = Modifier.align(Alignment.Center),
                    iconRes = iconRes,
                    color = iconColor,
                    onClick = {}
                )
            }

            SIZE_32 -> {
                Icon32(
                    modifier = Modifier.align(Alignment.Center),
                    iconRes = iconRes,
                    color = iconColor,
                    onClick = {}
                )
            }

            else -> {
                Icon16(
                    modifier = Modifier.align(Alignment.Center),
                    iconRes = iconRes,
                    color = iconColor,
                    onClick = {}
                )
            }
        }
    }
}

@Composable
@Preview
private fun IconographyScreenPreview() {
    IconographyScreen(
        onBackPress = {}
    )
}

data class IconItem(
    val name: String,
    @DrawableRes val iconRes: Int,
)

val outlineIcons = listOf(
    IconItem("ic_ssmk", R.drawable.ic_ssmk),
    IconItem("ic_spay", R.drawable.ic_spay),
    IconItem("ic_scash", R.drawable.ic_scash),
    IconItem("ic_cart", R.drawable.ic_cart),
    IconItem("ic_alarm_order", R.drawable.ic_alarm_order),
    IconItem("ic_search", R.drawable.ic_search),
    IconItem("ic_category", R.drawable.ic_category),
    IconItem("ic_profile", R.drawable.ic_profile),
    IconItem("ic_store1", R.drawable.ic_store1),
    IconItem("ic_home", R.drawable.ic_home),
    IconItem("ic_store2", R.drawable.ic_store2),

    IconItem("ic_alarm", R.drawable.ic_alarm),
    IconItem("ic_notify", R.drawable.ic_notify),
    IconItem("ic_trash", R.drawable.ic_trash),
    IconItem("ic_bookmark1", R.drawable.ic_bookmark1),
    IconItem("ic_heart", R.drawable.ic_heart),
    IconItem("ic_star", R.drawable.ic_star),
    IconItem("ic_talk", R.drawable.ic_talk),
    IconItem("ic_alarm_request", R.drawable.ic_alarm_request),
    IconItem("ic_alarm_etc", R.drawable.ic_alarm_etc),
    IconItem("ic_plus_circle", R.drawable.ic_plus_circle),
    IconItem("ic_minus_circle", R.drawable.ic_minus_circle),

    IconItem("ic_lens", R.drawable.ic_lens),
    IconItem("ic_info", R.drawable.ic_info),
    IconItem("ic_x_circle", R.drawable.ic_x_circle),
    IconItem("ic_checkcircle", R.drawable.ic_checkcircle),
    IconItem("ic_money_kr", R.drawable.ic_money_kr),
    IconItem("ic_money_jpy", R.drawable.ic_money_jpy),
    IconItem("ic_money_usa", R.drawable.ic_money_usa),
    IconItem("ic_cash", R.drawable.ic_cash),
    IconItem("ic_time", R.drawable.ic_time),
    IconItem("ic_download1", R.drawable.ic_download1),
    IconItem("ic_up", R.drawable.ic_up),

    IconItem("ic_restore", R.drawable.ic_restore),
    IconItem("ic_recentproduct", R.drawable.ic_recentproduct),
    IconItem("ic_refresh2", R.drawable.ic_refresh2),
    IconItem("ic_mypage_editimage", R.drawable.ic_mypage_editimage),
    IconItem("ic_error", R.drawable.ic_error),
    IconItem("ic_location", R.drawable.ic_location),
    IconItem("ic_phone", R.drawable.ic_phone),
    IconItem("ic_alarm_announce", R.drawable.ic_alarm_announce),
    IconItem("ic_alarm_ad", R.drawable.ic_alarm_ad),
    IconItem("ic_speechbubble", R.drawable.ic_speechbubble),
    IconItem("ic_thumbsup", R.drawable.ic_thumbsup),

    IconItem("ic_thumbsdw", R.drawable.ic_thumbsdw),
    IconItem("ic_pen", R.drawable.ic_pen),
    IconItem("ic_edit_line", R.drawable.ic_edit_line),
    IconItem("ic_setting", R.drawable.ic_setting),
    IconItem("ic_global", R.drawable.ic_global),
    IconItem("ic_bic_speechbubble", R.drawable.ic_bic_speechbubble),
    IconItem("ic_frequentchat", R.drawable.ic_frequentchat),
    IconItem("ic_comment", R.drawable.ic_comment),
    IconItem("ic_calendar", R.drawable.ic_calendar),
    IconItem("ic_cshelp", R.drawable.ic_cshelp),
    IconItem("ic_memo", R.drawable.ic_memo),

    IconItem("ic_history", R.drawable.ic_history),
    IconItem("ic_file_text", R.drawable.ic_file_text),
    IconItem("ic_certificate", R.drawable.ic_certificate),
    IconItem("ic_bookmark2", R.drawable.ic_bookmark2),
    IconItem("ic_orderlist", R.drawable.ic_orderlist),
    IconItem("ic_restocked", R.drawable.ic_restocked),
    IconItem("ic_soldout", R.drawable.ic_soldout),
    IconItem("ic_deliverybox", R.drawable.ic_deliverybox),
    IconItem("ic_file_copy", R.drawable.ic_file_copy),
    IconItem("ic_orderdetail_ac_copy", R.drawable.ic_orderdetail_ac_copy),
    IconItem("ic_folder", R.drawable.ic_folder),

    IconItem("ic_folder_move", R.drawable.ic_folder_move),
    IconItem("ic_folder_add", R.drawable.ic_folder_add),
    IconItem("ic_wallet", R.drawable.ic_wallet),
    IconItem("ic_accountnumber_bank", R.drawable.ic_accountnumber_bank),
    IconItem("ic_accountnumber_account", R.drawable.ic_accountnumber_account),
    IconItem("ic_smartphone", R.drawable.ic_smartphone),
    IconItem("ic_website", R.drawable.ic_website),
    IconItem("ic_loading", R.drawable.ic_loading),
    IconItem("ic_message", R.drawable.ic_message),
    IconItem("ic_preview_yes", R.drawable.ic_preview_yes),
    IconItem("ic_preview_no", R.drawable.ic_preview_no),

    IconItem("ic_outlink", R.drawable.ic_outlink),
    IconItem("ic_out", R.drawable.ic_out),
    IconItem("ic_download2", R.drawable.ic_download2), //TODO filled 확인
    IconItem("ic_share3", R.drawable.ic_share3),
    IconItem("ic_share2", R.drawable.ic_share2),
    IconItem("ic_x", R.drawable.ic_x),
    IconItem("ic_check", R.drawable.ic_check),
    IconItem("ic_plus", R.drawable.ic_plus),
    IconItem("ic_minus", R.drawable.ic_minus),
    IconItem("ic_arrow_left", R.drawable.ic_arrow_left),
    IconItem("ic_arrow_right", R.drawable.ic_arrow_right),

    IconItem("ic_arrow_open", R.drawable.ic_arrow_open),
    IconItem("ic_arrow_close", R.drawable.ic_arrow_close),
    IconItem("ic_refresh1", R.drawable.ic_refresh1),
    IconItem("ic_repeat", R.drawable.ic_repeat),
    IconItem("ic_plus_ad_forward", R.drawable.ic_plus_ad_forward),
    IconItem("ic_arrow_up_left", R.drawable.ic_arrow_up_left),
    IconItem("ic_listorder", R.drawable.ic_listorder),
    IconItem("ic_controller", R.drawable.ic_controller),
    IconItem("ic_arrowhead", R.drawable.ic_arrowhead),
    IconItem("ic_hashtag", R.drawable.ic_hashtag),
    IconItem("ic_listview", R.drawable.ic_listview),

    IconItem("ic_3gridview_4", R.drawable.ic_3gridview),
    IconItem("ic_2gridview_4", R.drawable.ic_2gridview),
    IconItem("ic_more_horiz", R.drawable.ic_more_horiz),
    IconItem("ic_more_vert", R.drawable.ic_more_vert),
    IconItem("ic_share1", R.drawable.ic_share1),
    IconItem("ic_manage", R.drawable.ic_manage),
    IconItem("ic_register", R.drawable.ic_register),
    IconItem("ic_myaccount", R.drawable.ic_myaccount),
    IconItem("ic_addaccount", R.drawable.ic_addaccount),
    IconItem("ic_waitaccount", R.drawable.ic_waitaccount),
    IconItem("ic_adcenter", R.drawable.ic_adcenter),

    IconItem("ic_report", R.drawable.ic_report),
    IconItem("ic_camera", R.drawable.ic_camera),
    IconItem("ic_image", R.drawable.ic_image),
    IconItem("ic_notice", R.drawable.ic_notice), //TODO error 중복 이름확인
)

/** Stroke 에외 아이콘 */
val noStrokeIcons = listOf(
    IconItem("ic_x_s", R.drawable.ic_x_s),
    IconItem("ic_filter", R.drawable.ic_filter),
    IconItem("ic_list_sort", R.drawable.ic_list_sort),
    IconItem("ic_check_s", R.drawable.ic_check_s),
)

/** Filled 아이콘 */
val filledIcons = listOf(
    IconItem("ic_x_s", R.drawable.ic_x_s),
)

/** 카테고리 아이콘 */
val categoryIcons = listOf(
    IconItem("ic_dresses", R.drawable.ic_dresses),
    IconItem("ic_womenshoes", R.drawable.ic_womenshoes),
    IconItem("ic_womenbags", R.drawable.ic_womenbags),
    IconItem("ic_menshoes", R.drawable.ic_menshoes),
    IconItem("ic_tsharts", R.drawable.ic_tsharts),
    IconItem("ic_kidsclothes", R.drawable.ic_kidsclothes),
    IconItem("ic_kidshats", R.drawable.ic_kidshats),
    IconItem("ic_earrings", R.drawable.ic_earrings),
    IconItem("ic_womenacc", R.drawable.ic_womenacc),
    IconItem("ic_watches", R.drawable.ic_watches),
    IconItem("ic_menbags", R.drawable.ic_menbags),
)

/** 마이페이지 아이콘 */
val myPageIcons = listOf(
    IconItem("ic_x_s", R.drawable.ic_x_s),
    IconItem("ic_filter", R.drawable.ic_filter),
    IconItem("ic_list_sort", R.drawable.ic_list_sort),
    IconItem("ic_check_s", R.drawable.ic_check_s),
)

/** Etc 아이콘 */
val etcIcons = listOf(
    IconItem("ic_x_s", R.drawable.ic_x_s),
    IconItem("ic_filter", R.drawable.ic_filter),
    IconItem("ic_list_sort", R.drawable.ic_list_sort),
    IconItem("ic_check_s", R.drawable.ic_check_s),
)

val SIZE_16 = 16
val SIZE_24 = 24
val SIZE_32 = 32