package net.deali.designsystem.sample.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import net.deali.designsystem.R
import net.deali.designsystem.component.ActionBar
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.Icon32
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_16
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_24
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_32
import net.deali.designsystem.theme.DealiColor
import net.deali.designsystem.theme.DealiFont

@Composable
fun IconographyScreen(
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(DealiColor.g10),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(iconographyScreenItems.size) { index ->
                val icon = iconographyScreenItems[index]

                Container(
                    name = icon.name,
                    size = icon.size,
                    outlinedIconRes = icon.outlinedIconRes,
                    filledIconRes = icon.filledIconRes
                )
            }
        }
    }
}

@Composable
private fun Container(
    name: String,
    size: Dp,
    @DrawableRes filledIconRes: Int?,
    @DrawableRes outlinedIconRes: Int?,
) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(DealiColor.primary04)
            .padding(10.dp)
    ) {
        val scrollState = rememberScrollState()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(5 / 2f)
                .clip(RoundedCornerShape(6.dp))
                .background(DealiColor.g10)
                .border(1.dp, DealiColor.g30, RoundedCornerShape(6.dp))
                .horizontalScroll(scrollState),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
        ) {
            val colors = listOf(
                DealiColor.g100,
                DealiColor.primary01,
                DealiColor.g60,
                DealiColor.primary04,
            )

            Spacer(modifier = Modifier.width(10.dp))
            colors.forEach { color ->
                Item(
                    size = size,
                    color = color,
                    filledIconRes = filledIconRes,
                    outlinedIconRes = outlinedIconRes,
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
        }

        Spacer(modifier = Modifier.height(10.dp))

        DealiText(
            text = name,
            style = DealiFont.b1r15,
            color = DealiColor.g100
        )
    }
}

@Composable
private fun Item(
    size: Dp,
    color: Color,
    @DrawableRes filledIconRes: Int?,
    @DrawableRes outlinedIconRes: Int?,
) {
    when (size) {
        SIZE_16 -> {
            if (filledIconRes != null) {
                Icon16(
                    modifier = Modifier
                        .background(if (color == DealiColor.primary04) DealiColor.g100 else DealiColor.transparent),
                    iconRes = filledIconRes,
                    color = color,
                    onClick = {}
                )
            }

            if (outlinedIconRes != null) {
                Icon16(
                    modifier = Modifier
                        .background(if (color == DealiColor.primary04) DealiColor.g100 else DealiColor.transparent),
                    iconRes = outlinedIconRes,
                    color = color,
                    onClick = {}
                )
            }
        }

        SIZE_24 -> {
            if (filledIconRes != null) {
                Icon24(
                    modifier = Modifier
                        .background(if (color == DealiColor.primary04) DealiColor.g100 else DealiColor.transparent),
                    iconRes = filledIconRes,
                    color = color,
                    onClick = {}
                )
            }

            if (outlinedIconRes != null) {
                Icon24(
                    modifier = Modifier
                        .background(if (color == DealiColor.primary04) DealiColor.g100 else DealiColor.transparent),
                    iconRes = outlinedIconRes,
                    color = color,
                    onClick = {}
                )
            }
        }

        SIZE_32 -> {
            if (filledIconRes != null) {
                Icon32(
                    modifier = Modifier
                        .background(if (color == DealiColor.primary04) DealiColor.g100 else DealiColor.transparent),
                    iconRes = filledIconRes,
                    color = color,
                    onClick = {}
                )
            }

            if (outlinedIconRes != null) {
                Icon32(
                    modifier = Modifier
                        .background(if (color == DealiColor.primary04) DealiColor.g100 else DealiColor.transparent),
                    iconRes = outlinedIconRes,
                    color = color,
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

data class IconographyScreenItem(
    val name: String,
    val size: Dp,
    @DrawableRes val filledIconRes: Int?,
    @DrawableRes val outlinedIconRes: Int?
) {
    companion object {
        val SIZE_16 = 16.dp
        val SIZE_24 = 24.dp
        val SIZE_32 = 32.dp
    }
}



val iconographyScreenItems = listOf(
    IconographyScreenItem("ic_ssmk", SIZE_24, R.drawable.ic_ssmk_filled, R.drawable.ic_ssmk),
    IconographyScreenItem("ic_spay", SIZE_24, null, R.drawable.ic_spay),
    IconographyScreenItem("ic_scash", SIZE_24, null, R.drawable.ic_scash),
    IconographyScreenItem("ic_cart", SIZE_24, R.drawable.ic_cart_filled, R.drawable.ic_cart),
    IconographyScreenItem("ic_alarm_order", SIZE_24, R.drawable.ic_alarm_order_filled, R.drawable.ic_alarm_order),
    IconographyScreenItem("ic_search", SIZE_24, R.drawable.ic_search_filled, R.drawable.ic_search),
    IconographyScreenItem("ic_category", SIZE_24, R.drawable.ic_category_filled, R.drawable.ic_category),
    IconographyScreenItem("ic_profile", SIZE_24, R.drawable.ic_profile_filled, R.drawable.ic_profile),
    IconographyScreenItem("ic_store1", SIZE_24, R.drawable.ic_store1_filled, R.drawable.ic_store1),
    IconographyScreenItem("ic_home", SIZE_24, R.drawable.ic_home_filled, R.drawable.ic_home),
    IconographyScreenItem("ic_store2", SIZE_24, null, R.drawable.ic_store2),

    IconographyScreenItem("ic_alarm", SIZE_24, R.drawable.ic_alarm_filled, R.drawable.ic_alarm),
    IconographyScreenItem("ic_notify", SIZE_24, R.drawable.ic_notify_filled, R.drawable.ic_notify),
    IconographyScreenItem("ic_trash", SIZE_24, R.drawable.ic_trash_filled, R.drawable.ic_trash),
    IconographyScreenItem("ic_bookmark1", SIZE_24, R.drawable.ic_bookmark1_filled, R.drawable.ic_bookmark1),
    IconographyScreenItem("ic_heart", SIZE_24, R.drawable.ic_heart_filled, R.drawable.ic_heart),
    IconographyScreenItem("ic_star", SIZE_24, R.drawable.ic_star_filled, R.drawable.ic_star),
    IconographyScreenItem("ic_talk", SIZE_24, R.drawable.ic_talk_filled, R.drawable.ic_talk),
    IconographyScreenItem("ic_alarm_request", SIZE_24, R.drawable.ic_alarm_request_filled, R.drawable.ic_alarm_request),
    IconographyScreenItem("ic_alarm_etc", SIZE_24, R.drawable.ic_alarm_etc_filled, R.drawable.ic_alarm_etc),
    IconographyScreenItem("ic_plus_circle", SIZE_24, R.drawable.ic_plus_circle_filled, R.drawable.ic_plus_circle),
    IconographyScreenItem("ic_minus_circle", SIZE_24, R.drawable.ic_minus_circle_filled, R.drawable.ic_minus_circle),

    IconographyScreenItem("ic_lens", SIZE_24, R.drawable.ic_lens_filled, R.drawable.ic_lens),
    IconographyScreenItem("ic_info", SIZE_24, R.drawable.ic_info_filled, R.drawable.ic_info),
    IconographyScreenItem("ic_x_circle", SIZE_24, R.drawable.ic_x_circle_filled, R.drawable.ic_x_circle),
    IconographyScreenItem("ic_checkcircle", SIZE_24, R.drawable.ic_checkcircle_filled, R.drawable.ic_checkcircle),
    IconographyScreenItem("ic_money_kr", SIZE_24, R.drawable.ic_money_kr_filled, R.drawable.ic_money_kr),
    IconographyScreenItem("ic_money_jpy", SIZE_24, R.drawable.ic_money_jpy_filled, R.drawable.ic_money_jpy),
    IconographyScreenItem("ic_money_usa", SIZE_24, R.drawable.ic_money_usa_filled, R.drawable.ic_money_usa),
    IconographyScreenItem("ic_cash", SIZE_24, R.drawable.ic_cash_filled, R.drawable.ic_cash),
    IconographyScreenItem("ic_time", SIZE_24, null, R.drawable.ic_time),
    IconographyScreenItem("ic_download1", SIZE_24, R.drawable.ic_download1_filled, R.drawable.ic_download1),
    IconographyScreenItem("ic_up", SIZE_24, null, R.drawable.ic_up),

    IconographyScreenItem("ic_restore", SIZE_24, null, R.drawable.ic_restore),
    IconographyScreenItem("ic_recentproduct", SIZE_24, null, R.drawable.ic_recentproduct),
    IconographyScreenItem("ic_refresh2", SIZE_24, null, R.drawable.ic_refresh2),
    IconographyScreenItem("ic_mypage_editimage", SIZE_24, null, R.drawable.ic_mypage_editimage),
    IconographyScreenItem("ic_error", SIZE_24, R.drawable.ic_error_filled, R.drawable.ic_error),
    IconographyScreenItem("ic_location", SIZE_24, R.drawable.ic_location_filled, R.drawable.ic_location),
    IconographyScreenItem("ic_phone", SIZE_24, R.drawable.ic_phone_filled, R.drawable.ic_phone),
    IconographyScreenItem("ic_alarm_announce", SIZE_24, R.drawable.ic_alarm_announce_filled, R.drawable.ic_alarm_announce),
    IconographyScreenItem("ic_alarm_ad", SIZE_24, R.drawable.ic_alarm_ad_filled, R.drawable.ic_alarm_ad),
    IconographyScreenItem("ic_speechbubble", SIZE_24, R.drawable.ic_speechbubble_filled, R.drawable.ic_speechbubble),
    IconographyScreenItem("ic_thumbsup", SIZE_24, R.drawable.ic_thumbsup_filled, R.drawable.ic_thumbsup),

    IconographyScreenItem("ic_thumbsdw", SIZE_24, R.drawable.ic_thumbsdw_filled, R.drawable.ic_thumbsdw),
    IconographyScreenItem("ic_pen", SIZE_24, R.drawable.ic_pen_filled, R.drawable.ic_pen),
    IconographyScreenItem("ic_edit_line", SIZE_24, null, R.drawable.ic_edit_line),
    IconographyScreenItem("ic_setting", SIZE_24, null, R.drawable.ic_setting),
    IconographyScreenItem("ic_global", SIZE_24, null, R.drawable.ic_global),
    IconographyScreenItem("ic_bic_speechbubble", SIZE_24, null, R.drawable.ic_bic_speechbubble),
    IconographyScreenItem("ic_frequentchat", SIZE_24, null, R.drawable.ic_frequentchat),
    IconographyScreenItem("ic_comment", SIZE_24, null, R.drawable.ic_comment),
    IconographyScreenItem("ic_calendar", SIZE_24, R.drawable.ic_calendar_filled, R.drawable.ic_calendar),
    IconographyScreenItem("ic_cshelp", SIZE_24, null, R.drawable.ic_cshelp),
    IconographyScreenItem("ic_memo", SIZE_24, null, R.drawable.ic_memo),

    IconographyScreenItem("ic_history", SIZE_24, null, R.drawable.ic_history),
    IconographyScreenItem("ic_file_text", SIZE_24, null, R.drawable.ic_file_text),
    IconographyScreenItem("ic_certificate", SIZE_24, null, R.drawable.ic_certificate),
    IconographyScreenItem("ic_bookmark2", SIZE_24, null, R.drawable.ic_bookmark2),
    IconographyScreenItem("ic_orderlist", SIZE_24, R.drawable.ic_orderlist_filled, R.drawable.ic_orderlist),
    IconographyScreenItem("ic_restocked", SIZE_24, null, R.drawable.ic_restocked),
    IconographyScreenItem("ic_soldout", SIZE_24, null, R.drawable.ic_soldout),
    IconographyScreenItem("ic_deliverybox", SIZE_24, R.drawable.ic_deliverybox_filled, R.drawable.ic_deliverybox),
    IconographyScreenItem("ic_file_copy", SIZE_24, null, R.drawable.ic_file_copy),
    IconographyScreenItem("ic_orderdetail_ac_copy", SIZE_24, null, R.drawable.ic_orderdetail_ac_copy),
    IconographyScreenItem("ic_folder", SIZE_24, null, R.drawable.ic_folder),

    IconographyScreenItem("ic_folder_move", SIZE_24, null, R.drawable.ic_folder_move),
    IconographyScreenItem("ic_folder_add", SIZE_24, null, R.drawable.ic_folder_add),
    IconographyScreenItem("ic_wallet", SIZE_24, null, R.drawable.ic_wallet),
    IconographyScreenItem("ic_accountnumber_bank", SIZE_24, null, R.drawable.ic_accountnumber_bank),
    IconographyScreenItem("ic_accountnumber_account", SIZE_24, null, R.drawable.ic_accountnumber_account),
    IconographyScreenItem("ic_smartphone", SIZE_24, null, R.drawable.ic_smartphone),
    IconographyScreenItem("ic_website", SIZE_24, null, R.drawable.ic_website),
    IconographyScreenItem("ic_loading", SIZE_24, null, R.drawable.ic_loading),
    IconographyScreenItem("ic_message", SIZE_24, R.drawable.ic_message1_filled, R.drawable.ic_message),
    IconographyScreenItem("ic_preview_yes", SIZE_24, null, R.drawable.ic_preview_yes),
    IconographyScreenItem("ic_preview_no", SIZE_24, null, R.drawable.ic_preview_no),

    IconographyScreenItem("ic_outlink", SIZE_24, null, R.drawable.ic_outlink),
    IconographyScreenItem("ic_out", SIZE_24, null, R.drawable.ic_out),
    IconographyScreenItem("ic_download2", SIZE_24, R.drawable.ic_download1_filled, R.drawable.ic_download2),
    IconographyScreenItem("ic_share3", SIZE_24, null, R.drawable.ic_share3),
    IconographyScreenItem("ic_share2", SIZE_24, null, R.drawable.ic_share2),
    IconographyScreenItem("ic_x", SIZE_24, null, R.drawable.ic_x),
    IconographyScreenItem("ic_check", SIZE_24, null, R.drawable.ic_check),
    IconographyScreenItem("ic_plus", SIZE_24, null, R.drawable.ic_plus),
    IconographyScreenItem("ic_minus", SIZE_24, null, R.drawable.ic_minus),
    IconographyScreenItem("ic_arrow_left", SIZE_24, null, R.drawable.ic_arrow_left),
    IconographyScreenItem("ic_arrow_right", SIZE_24, null, R.drawable.ic_arrow_right),

    IconographyScreenItem("ic_arrow_open", SIZE_24, null, R.drawable.ic_arrow_open),
    IconographyScreenItem("ic_arrow_close", SIZE_24, null, R.drawable.ic_arrow_close),
    IconographyScreenItem("ic_refresh1", SIZE_24, null, R.drawable.ic_refresh1),
    IconographyScreenItem("ic_repeat", SIZE_24, null, R.drawable.ic_repeat),
    IconographyScreenItem("ic_plus_ad_forward", SIZE_24, null, R.drawable.ic_plus_ad_forward),
    IconographyScreenItem("ic_arrow_up_left", SIZE_24, null, R.drawable.ic_arrow_up_left),
    IconographyScreenItem("ic_listorder", SIZE_24, null, R.drawable.ic_listorder),
    IconographyScreenItem("ic_controller", SIZE_24, null, R.drawable.ic_controller),
    IconographyScreenItem("ic_arrowhead", SIZE_24, null, R.drawable.ic_arrowhead),
    IconographyScreenItem("ic_hashtag", SIZE_24, null, R.drawable.ic_hashtag),
    IconographyScreenItem("ic_listview", SIZE_24, null, R.drawable.ic_listview),

    IconographyScreenItem("ic_3gridview_4", SIZE_24, null, R.drawable.ic_3gridview),
    IconographyScreenItem("ic_2gridview_4", SIZE_24, null, R.drawable.ic_2gridview),
    IconographyScreenItem("ic_more_horiz", SIZE_24, null, R.drawable.ic_more_horiz),
    IconographyScreenItem("ic_more_vert", SIZE_24, null, R.drawable.ic_more_vert),
    IconographyScreenItem("ic_share1", SIZE_24, null, R.drawable.ic_share1),
    IconographyScreenItem("ic_manage", SIZE_24, null, R.drawable.ic_manage),
    IconographyScreenItem("ic_register", SIZE_24, null, R.drawable.ic_register),
    IconographyScreenItem("ic_myaccount", SIZE_24, null, R.drawable.ic_myaccount),
    IconographyScreenItem("ic_addaccount", SIZE_24, null, R.drawable.ic_addaccount),
    IconographyScreenItem("ic_waitaccount", SIZE_24, null, R.drawable.ic_waitaccount),
    IconographyScreenItem("ic_adcenter", SIZE_24, null, R.drawable.ic_adcenter),
    IconographyScreenItem("ic_adcenter", SIZE_24, null, R.drawable.ic_adcenter),
    IconographyScreenItem("ic_report", SIZE_24, null, R.drawable.ic_report),
    IconographyScreenItem("ic_camera", SIZE_24, null, R.drawable.ic_camera),
    IconographyScreenItem("ic_image", SIZE_24, null, R.drawable.ic_image),
    IconographyScreenItem("ic_notice", SIZE_24, null, R.drawable.ic_notice),

    //Stroke 에외
    IconographyScreenItem("ic_x_s", SIZE_24, null, R.drawable.ic_x_s),
    IconographyScreenItem("ic_filter", SIZE_24, null, R.drawable.ic_filter),
    IconographyScreenItem("ic_list_sort", SIZE_24, null, R.drawable.ic_list_sort),
    IconographyScreenItem("ic_check_s", SIZE_24, null, R.drawable.ic_check_s),

    IconographyScreenItem("ic_dresses", SIZE_24, null, R.drawable.ic_dresses),
    IconographyScreenItem("ic_womenshoes", SIZE_24, null, R.drawable.ic_womenshoes),
    IconographyScreenItem("ic_womenbags", SIZE_24, null, R.drawable.ic_womenbags),
    IconographyScreenItem("ic_menshoes", SIZE_24, null, R.drawable.ic_menshoes),
    IconographyScreenItem("ic_tsharts", SIZE_24, null, R.drawable.ic_tsharts),
    IconographyScreenItem("ic_kidsclothes", SIZE_24, null, R.drawable.ic_kidsclothes),
    IconographyScreenItem("ic_kidshats", SIZE_24, null, R.drawable.ic_kidshats),
    IconographyScreenItem("ic_earrings", SIZE_24, null, R.drawable.ic_earrings),
    IconographyScreenItem("ic_womenacc", SIZE_24, null, R.drawable.ic_womenacc),
    IconographyScreenItem("ic_watches", SIZE_24, null, R.drawable.ic_watches),
    IconographyScreenItem("ic_menbags", SIZE_24, null, R.drawable.ic_menbags),
)