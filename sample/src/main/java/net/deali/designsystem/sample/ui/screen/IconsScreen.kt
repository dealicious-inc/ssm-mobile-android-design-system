package net.deali.designsystem.sample.ui.screen

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon
import net.deali.designsystem.component.TopBar
import net.deali.designsystem.component.btnOutlineSmall01
import net.deali.designsystem.sample.ui.NavigationContainer
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun IconsScreen(
    onBackPress: () -> Unit
) {
    NavigationContainer(
        navigationBar = {
            TopBar(
                title = "Iconography",
                onBack = onBackPress,
            )
        }
    ) {
        val scrollState = rememberScrollState()
        val context = LocalContext.current
        var toast by remember { mutableStateOf<Toast?>(null) }

        // 빠르게 연속 클릭해도 토스트가 쌓이지 않도록 이전 토스트를 취소하고 새로 띄운다
        val showIconName: (Int) -> Unit = { iconRes ->
            toast?.cancel()
            toast = Toast.makeText(
                context,
                context.resources.getResourceEntryName(iconRes),
                Toast.LENGTH_SHORT,
            ).apply { show() }
        }

        DisposableEffect(Unit) {
            onDispose { toast?.cancel() }
        }

        Column(
            modifier = Modifier
                .background(DealiColor.g10)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {

            Container(
                iconList = outlineIcons,
                containerTitle = "아이콘",
                onIconClick = showIconName,
            )


            Container(
                iconList = noStrokeIcons,
                containerTitle = "No Stroke",
                onIconClick = showIconName,
            )


            Container(
                iconList = filledIcons,
                containerTitle = "Filled",
                onIconClick = showIconName,
            )


            Container(
                iconList = categoryIcons,
                containerTitle = "카테고리",
                onIconClick = showIconName,
            )


            Container(
                iconList = myPageIcons,
                containerTitle = "마이페이지",
                onIconClick = showIconName,
            )


            Container(
                iconList = etcIcons,
                containerTitle = "Etc",
                onIconClick = showIconName,
                useOriginalStyle = true,
            )
        }
    }
}

@Composable
private fun Container(
    iconList: List<IconItem>,
    containerTitle: String,
    onIconClick: (Int) -> Unit,
    // Etc 아이콘은 아이콘마다 고유 사이즈/컬러가 있어 tint·사이즈 변경 없이 원본 그대로 노출한다
    useOriginalStyle: Boolean = false,
) {
    var isDark by remember { mutableStateOf(false) }
    var currentIconSize by remember { mutableIntStateOf(SIZE_16) }
    val iconColor = if (isDark) DealiColor.primary04 else DealiColor.primary05
    val backgroundColor = when {
        useOriginalStyle -> DealiColor.g20
        isDark -> DealiColor.primary05
        else -> DealiColor.primary04
    }

    val lazyGridState = rememberLazyGridState()

    val rowCount = (iconList.size + GRID_COLUMNS - 1) / GRID_COLUMNS

    Column {
        DealiText(
            text = containerTitle,
            style = DealiFont.sh3sb16,
            color = DealiColor.g100,
        )

        if (!useOriginalStyle) {
            Row {
                btnOutlineSmall01(
                    onClick = { isDark = !isDark },
                    text = "색상"
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
        }

        LazyVerticalGrid(
            modifier = Modifier
                .wrapContentWidth()
                .height((rowCount * ITEM_SIZE + GRID_BORDER * 2).dp)
                .clip(RoundedCornerShape(6.dp))
                .background(backgroundColor)
                .border(GRID_BORDER.dp, DealiColor.g30, RoundedCornerShape(6.dp))
                .padding(horizontal = 10.dp),
            columns = GridCells.Fixed(GRID_COLUMNS),
            userScrollEnabled = false,
            state = lazyGridState,
        ) {
            items(items = iconList) { icon ->
                if (useOriginalStyle) {
                    OriginalItem(
                        iconRes = icon.iconRes,
                        onClick = { onIconClick(icon.iconRes) },
                    )
                } else {
                    Item(
                        size = currentIconSize,
                        iconColor = iconColor,
                        iconRes = icon.iconRes,
                        onClick = { onIconClick(icon.iconRes) },
                    )
                }
            }
        }
    }
}

@Composable
private fun Item(
    size: Int,
    iconColor: Color,
    @DrawableRes iconRes: Int,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .size(ITEM_SIZE.dp)
    ) {
        Icon(
            modifier = Modifier.align(Alignment.Center),
            iconRes = iconRes,
            size = size.dp,
            color = iconColor,
            onClick = onClick,
        )
    }
}

/** drawable 의 원본 사이즈/컬러 그대로 노출 */
@Composable
private fun OriginalItem(
    @DrawableRes iconRes: Int,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .size(ITEM_SIZE.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
        )
    }
}

@Composable
@Preview
private fun IconographyScreenPreview() {
    IconsScreen(
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
    IconItem("ic_store1", R.drawable.ic_store_1),
    IconItem("ic_home", R.drawable.ic_home),
    IconItem("ic_store2", R.drawable.ic_store_2),

    IconItem("ic_alarm", R.drawable.ic_alarm),
    IconItem("ic_notify", R.drawable.ic_notify),
    IconItem("ic_trash", R.drawable.ic_trash),
    IconItem("ic_heart", R.drawable.ic_heart),
    IconItem("ic_star", R.drawable.ic_star),
    IconItem("ic_talk", R.drawable.ic_talk),
    IconItem("ic_alarm_request", R.drawable.ic_alarm_request),
    IconItem("ic_alarm_etc", R.drawable.ic_alarm_etc),
    IconItem("ic_plus_circle", R.drawable.ic_pluscircle),
    IconItem("ic_minus_circle", R.drawable.ic_minuscircle),
    IconItem("ic_lens", R.drawable.ic_lens),

    IconItem("ic_info", R.drawable.ic_info),
    IconItem("ic_x_circle_s", R.drawable.ic_x_circle_s),
    IconItem("ic_checkcircle", R.drawable.ic_checkcircle),
    IconItem("ic_money_kr", R.drawable.ic_money_kr),
    IconItem("ic_money_jpy", R.drawable.ic_money_jpy),
    IconItem("ic_money_usa", R.drawable.ic_money_usa),
    IconItem("ic_cash", R.drawable.ic_cash),
    IconItem("ic_time", R.drawable.ic_time),
    IconItem("ic_download1", R.drawable.ic_download_1),
    IconItem("ic_up", R.drawable.ic_up),
    IconItem("ic_restore", R.drawable.ic_restore),

    IconItem("ic_recentproduct", R.drawable.ic_recentproduct),
    IconItem("ic_refresh2", R.drawable.ic_refresh_2),
    IconItem("ic_mypage_editimage", R.drawable.ic_mypage_editimage),
    IconItem("ic_error", R.drawable.ic_error),
    IconItem("ic_location", R.drawable.ic_location),
    IconItem("ic_phone", R.drawable.ic_phone),
    IconItem("ic_alarm_announce", R.drawable.ic_alarm_announce),
    IconItem("ic_alarm_ad", R.drawable.ic_alarm_ad),
    IconItem("ic_speechbubble", R.drawable.ic_speechbubble),
    IconItem("ic_thumbsup", R.drawable.ic_thumbs_up),
    IconItem("ic_thumbsdw", R.drawable.ic_thumbs_down),

    IconItem("ic_pen", R.drawable.ic_pen),
    IconItem("ic_edit_line", R.drawable.ic_edit_line),
    IconItem("ic_setting", R.drawable.ic_setting),
    IconItem("ic_global", R.drawable.ic_global),
    IconItem("ic_bic_speechbubble", R.drawable.ic_big_speechbubble),
    IconItem("ic_frequentchat", R.drawable.ic_frequentchat),
    IconItem("ic_comment", R.drawable.ic_comment),
    IconItem("ic_calendar", R.drawable.ic_calendar),
    IconItem("ic_cshelp", R.drawable.ic_cshelp),
    IconItem("ic_memo", R.drawable.ic_memo),
    IconItem("ic_history", R.drawable.ic_history),

    IconItem("ic_file_text", R.drawable.ic_file_text),
    IconItem("ic_certificate", R.drawable.ic_certificate),
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
    IconItem("ic_message", R.drawable.ic_message_1),
    IconItem("ic_preview_yes", R.drawable.ic_preview_yes),
    IconItem("ic_preview_no", R.drawable.ic_preview_no),
    IconItem("ic_outlink", R.drawable.ic_outlink),
    IconItem("ic_out", R.drawable.ic_out),

    IconItem("ic_download2", R.drawable.ic_download_2),
    IconItem("ic_share3", R.drawable.ic_share_3),
    IconItem("ic_share2", R.drawable.ic_share_2),
    IconItem("ic_x", R.drawable.ic_x),
    IconItem("ic_check", R.drawable.ic_check),
    IconItem("ic_plus", R.drawable.ic_plus),
    IconItem("ic_minus", R.drawable.ic_minus),
    IconItem("ic_arrow_left", R.drawable.ic_arrow_left),
    IconItem("ic_arrow_right", R.drawable.ic_arrow_right),
    IconItem("ic_arrow_open", R.drawable.ic_arrow_open),
    IconItem("ic_arrow_close", R.drawable.ic_arrow_close),

    IconItem("ic_refresh1", R.drawable.ic_refresh_1),
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
    IconItem("ic_share1", R.drawable.ic_share_1),
    IconItem("ic_manage", R.drawable.ic_manage),
    IconItem("ic_register", R.drawable.ic_register),
    IconItem("ic_myaccount", R.drawable.ic_myaccount),
    IconItem("ic_addaccount", R.drawable.ic_addaccount),
    IconItem("ic_waitaccount", R.drawable.ic_waitaccount),
    IconItem("ic_adcenter", R.drawable.ic_adcenter),
    IconItem("ic_report", R.drawable.ic_report),
    IconItem("ic_camera", R.drawable.ic_camera),

    IconItem("ic_image", R.drawable.ic_image),
    IconItem("ic_notice", R.drawable.ic_notice),
    IconItem("ic_alarmchecked", R.drawable.ic_alarmchecked),
    IconItem("ic_arrow_rightcircle", R.drawable.ic_arrow_rightcircle),
    IconItem("ic_arrow_up", R.drawable.ic_arrow_up),
    IconItem("ic_category_1", R.drawable.ic_category_1),
    IconItem("ic_copytext", R.drawable.ic_copytext),
    IconItem("ic_delivery", R.drawable.ic_delivery),
    IconItem("ic_edit", R.drawable.ic_edit),
    IconItem("ic_flash_auto", R.drawable.ic_flash_auto),
    IconItem("ic_flash_off", R.drawable.ic_flash_off),

    IconItem("ic_flash_on", R.drawable.ic_flash_on),
    IconItem("ic_lock", R.drawable.ic_lock),
    IconItem("ic_movelist", R.drawable.ic_movelist),
    IconItem("ic_noimage", R.drawable.ic_noimage),
    IconItem("ic_send", R.drawable.ic_send),
    IconItem("ic_sinsanglens", R.drawable.ic_sinsanglens),
    IconItem("ic_store_3", R.drawable.ic_store_3),
    IconItem("ic_talk_check", R.drawable.ic_talk_check),
    IconItem("ic_translate", R.drawable.ic_translate),
    IconItem("ic_users_profiles", R.drawable.ic_users_profiles),
)

/** Stroke 에외 아이콘 */
val noStrokeIcons = listOf(
    IconItem("ic_x_s", R.drawable.ic_x_s),
    IconItem("ic_filter", R.drawable.ic_filter),
    IconItem("ic_list_sort", R.drawable.ic_list_sort),
    IconItem("ic_check_s", R.drawable.ic_check_s),
    IconItem("ic_x_ss", R.drawable.ic_x_ss),
)

/** Filled 아이콘 */
val filledIcons = listOf(
    IconItem("ic_ssmk_filled", R.drawable.ic_ssmk_filled),
    IconItem("ic_cart_filled", R.drawable.ic_cart_filled),
    IconItem("ic_alarm_order_filled", R.drawable.ic_alarm_order_filled),
    IconItem("ic_search_filled", R.drawable.ic_search_filled),
    IconItem("ic_category_filled", R.drawable.ic_category_filled),
    IconItem("ic_profile_filled", R.drawable.ic_profile_filled),
    IconItem("ic_store1_filled", R.drawable.ic_store_1_filled),
    IconItem("ic_home_filled", R.drawable.ic_home_filled),
    IconItem("ic_alarm_filled", R.drawable.ic_alarm_filled),
    IconItem("ic_notify_filled", R.drawable.ic_notify_filled),
    IconItem("ic_trash_filled", R.drawable.ic_trash_filled),

    IconItem("ic_heart_filled", R.drawable.ic_heart_filled),
    IconItem("ic_star_filled", R.drawable.ic_star_filled),
    IconItem("ic_talk_filled", R.drawable.ic_talk_filled),
    IconItem("ic_alarm_request_filled", R.drawable.ic_alarm_request_filled),
    IconItem("ic_plus_circle_filled", R.drawable.ic_pluscircle_filled),
    IconItem("ic_minus_circle_filled", R.drawable.ic_minuscircle_filled),
    IconItem("ic_lens_filled", R.drawable.ic_lens_filled),
    IconItem("ic_info_filled", R.drawable.ic_info_filled),
    IconItem("ic_x_circle_filled", R.drawable.ic_x_circle_filled),
    IconItem("ic_x_circle_s_filled", R.drawable.ic_x_circle_s_filled),
    IconItem("ic_checkcircle_filled", R.drawable.ic_checkcircle_filled),

    IconItem("ic_money_kr_filled", R.drawable.ic_money_kr_filled),
    IconItem("ic_money_jpy_filled", R.drawable.ic_money_jpy_filled),
    IconItem("ic_money_usa_filled", R.drawable.ic_money_usa_filled),
    IconItem("ic_cash_filled", R.drawable.ic_cash_filled),
    IconItem("ic_time_filled", R.drawable.ic_time_filled),
    IconItem("ic_download1_filled", R.drawable.ic_download_1_filled),
    IconItem("ic_checkcircleno1_filled", R.drawable.ic_checkcircle_no1_filled),
    IconItem("ic_checkcircleno2_filled", R.drawable.ic_checkcircle_no2_filled),
    IconItem("ic_checkcircleno3_filled", R.drawable.ic_checkcircle_no3_filled),
    IconItem("ic_error_filled", R.drawable.ic_error_filled),
    IconItem("ic_stockcheck_filled", R.drawable.ic_stockcheck_filled),

    IconItem("ic_stockanswer_filled", R.drawable.ic_stockanswer_filled),
    IconItem("ic_orderlist_filled", R.drawable.ic_orderlist_filled),
    IconItem("ic_calendar_filled", R.drawable.ic_calendar_filled),
    IconItem("ic_movelist_filled", R.drawable.ic_movelist_filled),
    IconItem("ic_arrow_open", R.drawable.ic_arrow_open),
    IconItem("ic_location_filled", R.drawable.ic_location_filled),
    IconItem("ic_phone_filled", R.drawable.ic_phone_filled),
    IconItem("ic_alarm_announce_filled", R.drawable.ic_alarm_announce_filled),
    IconItem("ic_alarm_etc_filled", R.drawable.ic_alarm_etc_filled),
    IconItem("ic_alarm_ad_filled", R.drawable.ic_alarm_ad_filled),
    IconItem("ic_store2_filled", R.drawable.ic_store_2_filled),

    IconItem("ic_speechbubble_filled", R.drawable.ic_speechbubble_filled),
    IconItem("ic_thumbsup_filled", R.drawable.ic_thumbs_up_filled),
    IconItem("ic_thumbsdw_filled", R.drawable.ic_thumbs_down_filled),
    IconItem("ic_deliverybox_filled", R.drawable.ic_deliverybox_filled),
    IconItem("ic_pen_filled", R.drawable.ic_pen_filled),
    IconItem("ic_refresh_filled", R.drawable.ic_refresh_2_filled),
    IconItem("ic_message2_filled", R.drawable.ic_message_2_filled),
    IconItem("ic_message1_filled", R.drawable.ic_message_1_filled),
    IconItem("ic_camera_filled", R.drawable.ic_camera_filled),
    IconItem("ic_image1_filled", R.drawable.ic_image_1_filled),
    IconItem("ic_image2_filled", R.drawable.ic_image_2_filled),

    IconItem("ic_notice_filled", R.drawable.ic_notice_filled),
    IconItem("ic_alarmchecked_filled", R.drawable.ic_alarmchecked_filled),
    IconItem("ic_arrow_close_1_filled", R.drawable.ic_arrow_close_1_filled),
    IconItem("ic_arrow_open_1_filled", R.drawable.ic_arrow_open_1_filled),
    IconItem("ic_category_1_filled", R.drawable.ic_category_1_filled),
    IconItem("ic_frequentchat_filled", R.drawable.ic_frequentchat_filled),
    IconItem("ic_image_multi_filled", R.drawable.ic_image_multi_filled),
    IconItem("ic_lock_filled", R.drawable.ic_lock_filled),
    IconItem("ic_pause_filled", R.drawable.ic_pause_filled),
    IconItem("ic_play_filled", R.drawable.ic_play_filled),
    IconItem("ic_report_1_filled", R.drawable.ic_report_1_filled),

    IconItem("ic_send_filled", R.drawable.ic_send_filled),
    IconItem("ic_store_3_filled", R.drawable.ic_store_3_filled),
    IconItem("ic_talk_check_filled", R.drawable.ic_talk_check_filled),
    IconItem("ic_trophy_filled", R.drawable.ic_trophy_filled),
    IconItem("ic_truck_filled", R.drawable.ic_truck_filled),
    IconItem("ic_up_1_filled", R.drawable.ic_up_1_filled),
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
    IconItem("ic_calculate", R.drawable.ic_calculate),
    IconItem("ic_studio", R.drawable.ic_studio),
    IconItem("ic_ad", R.drawable.ic_ad),
)

/** Etc 아이콘 - Figma Etc 섹션 순서 (Figma 에 없는 고정색 아이콘은 뒤에) */
val etcIcons = listOf(
    IconItem("ic_mbs", R.drawable.ic_mbs),
    IconItem("ic_ssmall", R.drawable.ic_ssmall),
    IconItem("ic_qrcode", R.drawable.ic_qrcode),
    IconItem("ic_mbs_filled", R.drawable.ic_mbs_filled),
    IconItem("ic_mbs_filled_w", R.drawable.ic_mbs_filled_w),
    IconItem("ic_flight_filled", R.drawable.ic_flight_filled),
    IconItem("ic_kakaotalk", R.drawable.ic_kakaotalk),
    IconItem("ic_line", R.drawable.ic_line),
    IconItem("ic_wechat", R.drawable.ic_wechat),
    IconItem("ic_email", R.drawable.ic_email),
    IconItem("ic_imgsearch", R.drawable.ic_imgsearch),

    IconItem("ic_checkbox_off", R.drawable.ic_checkbox_off),
    IconItem("ic_checkbox_on", R.drawable.ic_checkbox_on),
    IconItem("ic_checkbox_disable", R.drawable.ic_checkbox_disable),
    IconItem("ic_checkbox_ondisable", R.drawable.ic_checkbox_ondisable),
    IconItem("ic_checkcircle_off", R.drawable.ic_checkcircle_off),
    IconItem("ic_checkcircle_on", R.drawable.ic_checkcircle_on),
    IconItem("ic_checkcircle_onad", R.drawable.ic_checkcircle_onad),
    IconItem("ic_checkcircle_disabled", R.drawable.ic_checkcircle_disabled),
    IconItem("ic_checkcircle_disable", R.drawable.ic_checkcircle_ondisable),
    IconItem("ic_checkline_off", R.drawable.ic_checkline_off),
    IconItem("ic_checkline_on", R.drawable.ic_checkline_on),

    IconItem("ic_checkline_onad", R.drawable.ic_checkline_onad),
    IconItem("ic_checkline_disabled", R.drawable.ic_checkline_disabled),
    IconItem("ic_radiobutton_off", R.drawable.ic_radiobutton_off),
    IconItem("ic_radiobutton_on", R.drawable.ic_radiobutton_on),
    IconItem("ic_radiobutton_disable", R.drawable.ic_radiobutton_disable),
    IconItem("ic_expander_filled", R.drawable.ic_expander_filled),
    IconItem("ic_price_arrow_close", R.drawable.ic_price_arrow_close),
    IconItem("ic_gotop", R.drawable.ic_gotop),
    IconItem("ic_membership", R.drawable.ic_membership),
    IconItem("ic_new_l", R.drawable.ic_new_l),
    IconItem("ic_new_m", R.drawable.ic_new_m),

    IconItem("ic_new_s", R.drawable.ic_new_s),
    IconItem("ic_depth", R.drawable.ic_depth),
    IconItem("ic_kakaoch", R.drawable.ic_kakaoch),
    IconItem("ic_x_circle_solid", R.drawable.ic_x_circle_solid),
    IconItem("ic_arrow_close_2_filled", R.drawable.ic_arrow_close_2_filled),
    IconItem("ic_arrow_open_2_filled", R.drawable.ic_arrow_open_2_filled),
    IconItem("ic_empty40", R.drawable.ic_empty40),
    IconItem("ic_loading_filled", R.drawable.ic_loading_filled),
    IconItem("ic_star_gray04", R.drawable.ic_star_gray04),
    IconItem("ic_stockanswer", R.drawable.ic_stockanswer),
    IconItem("ic_stockcheck", R.drawable.ic_stockcheck),

    IconItem("ic_zzim_16", R.drawable.ic_zzim_16),
    IconItem("ic_zzim_filled_16", R.drawable.ic_zzim_filled_16),
)

private const val SIZE_16 = 16
private const val SIZE_24 = 24
private const val SIZE_32 = 32

private const val GRID_COLUMNS = 11
private const val ITEM_SIZE = 48
private const val GRID_BORDER = 1
