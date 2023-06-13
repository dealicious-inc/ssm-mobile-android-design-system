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
import net.deali.designsystem.component.DealiText
import net.deali.designsystem.component.Icon16
import net.deali.designsystem.component.Icon24
import net.deali.designsystem.component.Icon32
import net.deali.designsystem.component.NavigationBar
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_16
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_24
import net.deali.designsystem.sample.ui.IconographyScreenItem.Companion.SIZE_32
import net.deali.designsystem.theme.AppTheme
import net.deali.designsystem.theme.black100
import net.deali.designsystem.theme.gray10
import net.deali.designsystem.theme.gray100
import net.deali.designsystem.theme.gray20
import net.deali.designsystem.theme.gray30
import net.deali.designsystem.theme.gray60
import net.deali.designsystem.theme.pink60
import net.deali.designsystem.theme.transparent
import net.deali.designsystem.theme.white100

@Composable
fun IconographyScreen(
    onBackPress: () -> Unit
) {
    val iconographyScreenItems = listOf(
        IconographyScreenItem("ic_arrow_16", SIZE_16, null, R.drawable.ic_arrow_left_16_ver01),
        IconographyScreenItem("ic_ssmk_16", SIZE_16, R.drawable.ic_ssmk_filled_16_ver02, R.drawable.ic_ssmk_16_ver02),

        IconographyScreenItem("ic_ssmk_24", SIZE_24, R.drawable.ic_ssmk_filled_24_ver02, R.drawable.ic_ssmk_24_ver02),
        IconographyScreenItem("ic_cart_24", SIZE_24, R.drawable.ic_cart_filled_24_ver01, R.drawable.ic_cart_24_ver01),
        IconographyScreenItem("ic_bookmark_24", SIZE_24, R.drawable.ic_bookmark_filled_24_ver01, R.drawable.ic_bookmark_24_ver01),
        IconographyScreenItem("ic_search_24", SIZE_24, R.drawable.ic_search_filled_24_ver01, R.drawable.ic_search_24_ver01),
        IconographyScreenItem("ic_category_24", SIZE_24, R.drawable.ic_category_filled_24_ver01, R.drawable.ic_category_24_ver01),
        IconographyScreenItem("ic_store_24", SIZE_24, R.drawable.ic_store_filled_24_ver01, R.drawable.ic_store_24_ver01),
        IconographyScreenItem("ic_talk_24", SIZE_24, R.drawable.ic_talk_filled_24_ver01, R.drawable.ic_talk_24_ver01),
        IconographyScreenItem("ic_profile_24", SIZE_24, R.drawable.ic_profile_filled_24_ver01, R.drawable.ic_profile_24_ver01),
        IconographyScreenItem("ic_orderlist_24", SIZE_24, R.drawable.ic_orderlist_filled_24_ver01, R.drawable.ic_orderlist_24_ver01),
        IconographyScreenItem("ic_home_24", SIZE_24, R.drawable.ic_home_filled_24_ver01, R.drawable.ic_home_24_ver01),
        IconographyScreenItem("ic_alarm_24", SIZE_24, R.drawable.ic_alarm_filled_24_ver01, R.drawable.ic_alarm_24_ver01),
        IconographyScreenItem("ic_plus_circle_24", SIZE_24, R.drawable.ic_plus_circle_filled_24_ver01, R.drawable.ic_plus_circle_24_ver01),
        IconographyScreenItem("ic_minus_circle_24", SIZE_24, R.drawable.ic_minus_circle_filled_24_ver01, R.drawable.ic_minus_circle_24_ver01),
        IconographyScreenItem("ic_lens_24", SIZE_24, R.drawable.ic_lens_filled_24_ver01, R.drawable.ic_lens_24_ver01),
        IconographyScreenItem("ic_info_24", SIZE_24, R.drawable.ic_info_filled_24_ver01, R.drawable.ic_info_24_ver01),
        IconographyScreenItem("ic_trash_24", SIZE_24, R.drawable.ic_trash_filled_24_ver01, R.drawable.ic_trash_24_ver01),
        IconographyScreenItem("ic_x_circle_24", SIZE_24, R.drawable.ic_x_circle_filled_24_ver01, R.drawable.ic_x_circle_24_ver01),
        IconographyScreenItem("ic_checkcircle_24", SIZE_24, R.drawable.ic_checkcircle_filled_24_ver01, R.drawable.ic_checkcircle_24_ver01),
        IconographyScreenItem("ic_heart_24", SIZE_24, R.drawable.ic_heart_filled_24_ver01, R.drawable.ic_heart_24_ver01),
        IconographyScreenItem("ic_star_24", SIZE_24, R.drawable.ic_star_filled_24_ver01, R.drawable.ic_star_24_ver01),
        IconographyScreenItem("ic_money_kr_24", SIZE_24, R.drawable.ic_money_kr_filled_24_ver01, R.drawable.ic_money_kr_24_ver01),
        IconographyScreenItem("ic_money_jpy_24", SIZE_24, R.drawable.ic_money_jpy_filled_24_ver01, R.drawable.ic_money_jpy_24_ver01),
        IconographyScreenItem("ic_money_usa_24", SIZE_24, R.drawable.ic_money_usa_filled_24_ver01, R.drawable.ic_money_usa_24_ver01),
        IconographyScreenItem("ic_cash_24", SIZE_24, R.drawable.ic_cash_filled_24_ver01, R.drawable.ic_cash_24_ver01),
        IconographyScreenItem("ic_notify_24", SIZE_24, R.drawable.ic_notify_filled_24_ver01, R.drawable.ic_notify_24_ver01),
        IconographyScreenItem("ic_calendar_24", SIZE_24, R.drawable.ic_calendar_filled_24_ver01, R.drawable.ic_calendar_24_ver01),
        IconographyScreenItem("ic_location_24", SIZE_24, R.drawable.ic_location_filled_24_ver01, R.drawable.ic_location_24_ver01),
        IconographyScreenItem("ic_phone_24", SIZE_24, R.drawable.ic_phone_filled_24_ver01, R.drawable.ic_phone_24_ver01),
        IconographyScreenItem("ic_error_24", SIZE_24, R.drawable.ic_error_filled_24_ver01, R.drawable.ic_error_24_ver01),
        IconographyScreenItem("ic_alarm_announce_24", SIZE_24, R.drawable.ic_alarm_announce_filled_24_ver01, R.drawable.ic_alarm_announce_24_ver01),
        IconographyScreenItem("ic_alarm_order_24", SIZE_24, R.drawable.ic_alarm_order_filled_24_ver01, R.drawable.ic_alarm_order_24_ver01),
        IconographyScreenItem("ic_alarm_etc_24", SIZE_24, R.drawable.ic_alarm_etc_filled_24_ver01, R.drawable.ic_alarm_etc_24_ver01),
        IconographyScreenItem("ic_alarm_request_24", SIZE_24, R.drawable.ic_alarm_request_filled_24_ver01, R.drawable.ic_alarm_request_24_ver01),
        IconographyScreenItem("ic_alarm_ad_24", SIZE_24, R.drawable.ic_alarm_ad_filled_24_ver01, R.drawable.ic_alarm_ad_24_ver01),
        IconographyScreenItem("ic_store_24", SIZE_24, R.drawable.ic_store_filled_24_ver01, R.drawable.ic_store_24_ver01), // TODO DRG 아이콘 명칭 중복으로 다시 해야 함
        IconographyScreenItem("ic_checkcircleno1_24", SIZE_24, R.drawable.ic_checkcircleno1_filled_24_ver01, null),
        IconographyScreenItem("ic_checkcircleno2_24", SIZE_24, R.drawable.ic_checkcircleno2_filled_24_ver01, null),
        IconographyScreenItem("ic_checkcircleno3_24", SIZE_24, R.drawable.ic_checkcircleno3_filled_24_ver01, null),
        IconographyScreenItem("ic_speechbubble_24", SIZE_24, R.drawable.ic_speechbubble_filled_24_ver01, R.drawable.ic_speechbubble_24_ver01),
        IconographyScreenItem("ic_thumbsup_24", SIZE_24, R.drawable.ic_thumbsup_filled_24_ver01, R.drawable.ic_thumbsup_24_ver01),
        IconographyScreenItem("ic_thumbsdw_24", SIZE_24, R.drawable.ic_thumbsdw_filled_24_ver01, R.drawable.ic_thumbsdw_24_ver01),
        IconographyScreenItem("ic_deliverybox_24", SIZE_24, R.drawable.ic_deliverybox_filled_24_ver01, R.drawable.ic_deliverybox_24_ver01),
        IconographyScreenItem("ic_up_24", SIZE_24, R.drawable.ic_up_filled_24_ver01, R.drawable.ic_up_24_ver01),
        IconographyScreenItem("ic_x_24", SIZE_24, null, R.drawable.ic_x_24_ver01),
        IconographyScreenItem("ic_arrow_24", SIZE_24, null, R.drawable.ic_arrow_left_24_ver01),
        IconographyScreenItem("ic_plus_24", SIZE_24, null, R.drawable.ic_plus_24_ver01),
        IconographyScreenItem("ic_minus_24", SIZE_24, null, R.drawable.ic_minus_24_ver01),
        IconographyScreenItem("ic_check_24", SIZE_24, null, R.drawable.ic_check_24_ver01),
        IconographyScreenItem("ic_edit_24", SIZE_24, null, R.drawable.ic_edit_24_ver01),
        IconographyScreenItem("ic_restocked_24", SIZE_24, null, R.drawable.ic_restocked_24_ver01),
        IconographyScreenItem("ic_soldout_24", SIZE_24, null, R.drawable.ic_soldout_24_ver01),
        IconographyScreenItem("ic_scash_24", SIZE_24, null, R.drawable.ic_scash_24_ver01),
        IconographyScreenItem("ic_spay_24", SIZE_24, null, R.drawable.ic_spay_24_ver01),
        IconographyScreenItem("ic_global_24", SIZE_24, null, R.drawable.ic_global_24_ver01),
        IconographyScreenItem("ic_dresses_24", SIZE_24, null, R.drawable.ic_dresses_24_ver01),
        IconographyScreenItem("ic_tsharts_24", SIZE_24, null, R.drawable.ic_tsharts_24_ver01),
        IconographyScreenItem("ic_womenshoes_24", SIZE_24, null, R.drawable.ic_womenshoes_24_ver01),
        IconographyScreenItem("ic_womenbags_24", SIZE_24, null, R.drawable.ic_womenbags_24_ver01),
        IconographyScreenItem("ic_kidsclothes_24", SIZE_24, null, R.drawable.ic_kidsclothes_24_ver01),
        IconographyScreenItem("ic_menshoes_24", SIZE_24, null, R.drawable.ic_menshoes_24_ver01),
        IconographyScreenItem("ic_watches_24", SIZE_24, null, R.drawable.ic_watches_24_ver01),
        IconographyScreenItem("ic_kidshats_24", SIZE_24, null, R.drawable.ic_kidshats_24_ver01),
        IconographyScreenItem("ic_earrings_24", SIZE_24, null, R.drawable.ic_earrings_24_ver01),
        IconographyScreenItem("ic_menbags_24", SIZE_24, null, R.drawable.ic_men_bags_24_ver01),
        IconographyScreenItem("ic_womenacc_24", SIZE_24, null, R.drawable.ic_womenacc_24_ver01),
        IconographyScreenItem("ic_memo_24", SIZE_24, null, R.drawable.ic_memo_24_ver01),
        IconographyScreenItem("ic_outlink_24", SIZE_24, null, R.drawable.ic_outlink_24_ver01),
        IconographyScreenItem("ic_refresh_24", SIZE_24, null, R.drawable.ic_refresh_24_ver01),
        IconographyScreenItem("ic_share_24", SIZE_24, null, R.drawable.ic_share_24_ver01),
        IconographyScreenItem("ic_2gridview_4", SIZE_24, null, R.drawable.ic_2gridview_24_ver01),
        IconographyScreenItem("ic_3gridview_4", SIZE_24, null, R.drawable.ic_3gridview_24_ver01),
        IconographyScreenItem("ic_listview_24", SIZE_24, null, R.drawable.ic_listview_24_ver01),
        IconographyScreenItem("ic_up_24", SIZE_24, null, R.drawable.ic_up_24_ver01),    // TODO DRG 아이콘 명칭 중복으로 다시 해야 함
        IconographyScreenItem("ic_restore_24", SIZE_24, null, R.drawable.ic_restore_24_ver01),
        IconographyScreenItem("ic_preview_yes_24", SIZE_24, null, R.drawable.ic_preview_yes_24_ver01),
        IconographyScreenItem("ic_preview_no_24", SIZE_24, null, R.drawable.ic_preview_no_24_ver01),
        IconographyScreenItem("ic_more_24", SIZE_24, null, R.drawable.ic_more_24_ver01),
        IconographyScreenItem("ic_listorder_24", SIZE_24, null, R.drawable.ic_listorder_24_ver01),
        IconographyScreenItem("ic_loading_24", SIZE_24, null, R.drawable.ic_loading_24_ver01),
        IconographyScreenItem("ic_time_24", SIZE_24, null, R.drawable.ic_time_24_ver01),
        IconographyScreenItem("ic_star_24", SIZE_24, null, R.drawable.ic_star_24_gray04_ver01),
        IconographyScreenItem("ic_comment_24", SIZE_24, null, R.drawable.ic_comment_24_ver01),
        IconographyScreenItem("ic_file_copy_24", SIZE_24, null, R.drawable.ic_file_copy_24_ver01),
        IconographyScreenItem("ic_cshelp_24", SIZE_24, null, R.drawable.ic_cshelp_24_ver01),
        IconographyScreenItem("ic_folder_24", SIZE_24, null, R.drawable.ic_folder_24_ver01),
        IconographyScreenItem("ic_folder_add_24", SIZE_24, null, R.drawable.ic_folder_add_24_ver01),
        IconographyScreenItem("ic_folder_move_24", SIZE_24, null, R.drawable.ic_folder_move_24_ver01),
        IconographyScreenItem("ic_arrowhead_24", SIZE_24, null, R.drawable.ic_arrowhead_24_ver01),
        IconographyScreenItem("ic_repeat_24", SIZE_24, null, R.drawable.ic_repeat_24_ver01),
        IconographyScreenItem("ic_file_text_24", SIZE_24, null, R.drawable.ic_file_text_24_ver01),
        IconographyScreenItem("ic_setting_24", SIZE_24, null, R.drawable.ic_setting_24_ver01),
        IconographyScreenItem("ic_smartphone_24", SIZE_24, null, R.drawable.ic_smartphone_24_ver01),
        IconographyScreenItem("ic_website_24", SIZE_24, null, R.drawable.ic_website_24_ver01),
        IconographyScreenItem("ic_certificate_24", SIZE_24, null, R.drawable.ic_certificate_24_ver01),
        IconographyScreenItem("ic_wallet_24", SIZE_24, null, R.drawable.ic_wallet_24_ver01),
        IconographyScreenItem("ic_bookmark_24", SIZE_24, null, R.drawable.ic_bookmark_24_ver01),    // TODO DRG 아이콘 명칭 중복으로 다시 해야 함
        IconographyScreenItem("ic_arrow_up_left_24", SIZE_24, null, R.drawable.ic_arrow_up_left_24_ver01),
        IconographyScreenItem("ic_bic_speechbubble_24", SIZE_24, null, R.drawable.ic_speechbubble_filled_24_ver01),    // TODO DRG 아이콘 bic_speechbubble로 바꿔야 함
        IconographyScreenItem("ic_stockcheck_24", SIZE_24, null, R.drawable.ic_stockcheck_24_ver01),    // TODO DRG 아이콘 네이밍 확인
        IconographyScreenItem("ic_stockanswer_24", SIZE_24, null, R.drawable.ic_stockanswer_24_ver01),    // TODO DRG 아이콘 네이밍 확인
        IconographyScreenItem("ic_accountnumber_bank_24", SIZE_24, null, R.drawable.ic_accountnumber_bank_24_ver01),
        IconographyScreenItem("ic_accountnumber_account_24", SIZE_24, null, R.drawable.ic_accountnumber_account_24_ver01),
        IconographyScreenItem("ic_orderdetail_ac_copy_24", SIZE_24, null, net.deali.designsystem.sample.R.drawable.ic_orderdetail_ac_copy_24_ver01),
        IconographyScreenItem("ic_frequentchat_24", SIZE_24, null, R.drawable.ic_frequentchat_24_ver01),
        IconographyScreenItem("ic_out_24", SIZE_24, null, R.drawable.ic_out_24_ver01),
        IconographyScreenItem("ic_pen_large_24", SIZE_24, null, R.drawable.ic_pen_large_24_ver01),
        IconographyScreenItem("ic_plus_ad_forward_24", SIZE_24, null, R.drawable.ic_plus_ad_forward_24_ver01),
        IconographyScreenItem("ic_movelist_24", SIZE_24, null, R.drawable.ic_movelist_24_ver01),
        IconographyScreenItem("ic_more_horiz_24", SIZE_24, null, R.drawable.ic_more_horiz_24_ver01),
        IconographyScreenItem("ic_more_vert_24", SIZE_24, null, R.drawable.ic_more_vert_24_ver01),
        IconographyScreenItem("ic_hashtag_24", SIZE_24, null, R.drawable.ic_hashtag_24_ver01),

        // TODO DRG 밑은 정해지지 않음
        IconographyScreenItem("ic_ssmk_32", SIZE_32, R.drawable.ic_ssmk_filled_32_ver02, R.drawable.ic_ssmk_32_ver02),
        IconographyScreenItem("ic_cart_32", SIZE_32, R.drawable.ic_cart_filled_32_ver01, R.drawable.ic_cart_32_ver01),
        IconographyScreenItem("ic_bookmark_32", SIZE_32, R.drawable.ic_bookmark_filled_32_ver01, R.drawable.ic_bookmark_32_ver01),
        IconographyScreenItem("ic_error_32", SIZE_32, R.drawable.ic_error_filled_32_ver01, R.drawable.ic_error_32_ver01),
        IconographyScreenItem("ic_call_32", SIZE_32, R.drawable.ic_call_filled_32_ver01, R.drawable.ic_call_32_ver01),
        IconographyScreenItem("ic_info_32", SIZE_32, R.drawable.ic_info_filled_32_ver01, R.drawable.ic_info_32_ver01),
    )

    NavigationContainer(
        navigationBar = {
            NavigationBar(
                title = "Iconography",
                navigationIcon = {
                    Icon24(
                        iconRes = R.drawable.ic_arrow_left_16_ver01,
                        onClick = onBackPress
                    )
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(gray20),
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
            .background(white100)
            .padding(10.dp)
    ) {
        val scrollState = rememberScrollState()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(5 / 2f)
                .clip(RoundedCornerShape(6.dp))
                .background(gray10)
                .border(1.dp, gray30, RoundedCornerShape(6.dp))
                .horizontalScroll(scrollState),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
        ) {
            val colors = listOf(
                gray100, pink60, gray60, white100
            )

            Spacer(modifier = Modifier.width(10.dp))
            colors.forEach { color ->
                Item(
                    size = size,
                    color = color,
                    filledIconRes = filledIconRes,
                    outlinedIconRes = outlinedIconRes
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
        }

        Spacer(modifier = Modifier.height(10.dp))

        DealiText(
            text = name,
            style = AppTheme.typography.b1r15,
            color = gray100
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
                        .background(if (color == white100) black100 else transparent),
                    iconRes = filledIconRes,
                    color = color,
                    onClick = {}
                )
            }

            if (outlinedIconRes != null) {
                Icon16(
                    modifier = Modifier
                        .background(if (color == white100) black100 else transparent),
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
                        .background(if (color == white100) black100 else transparent),
                    iconRes = filledIconRes,
                    color = color,
                    onClick = {}
                )
            }

            if (outlinedIconRes != null) {
                Icon24(
                    modifier = Modifier
                        .background(if (color == white100) black100 else transparent),
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
                        .background(if (color == white100) black100 else transparent),
                    iconRes = filledIconRes,
                    color = color,
                    onClick = {}
                )
            }

            if (outlinedIconRes != null) {
                Icon32(
                    modifier = Modifier
                        .background(if (color == white100) black100 else transparent),
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

private data class IconographyScreenItem(
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
