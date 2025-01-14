package net.deali.designsystem.util.placeholder

import android.graphics.drawable.LayerDrawable
import android.widget.ImageView
import androidx.compose.ui.graphics.toArgb
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import net.deali.designsystem.theme.DealiColor

/**  */
fun ImageView.setWhiteBackground() {
    val layerDrawable = this.drawable as? LayerDrawable

    //배경 색상 변경
    val backgroundDrawable = layerDrawable?.findDrawableByLayerId(net.deali.designsystem.R.id.background)
    backgroundDrawable?.apply {
        DrawableCompat.setTint(this, DealiColor.primary04.toArgb())
    }

    //로고 색상 변경
    val icon = layerDrawable?.findDrawableByLayerId(net.deali.designsystem.R.id.icon)
    icon?.apply {
        DrawableCompat.setTint(this, DealiColor.g20.toArgb())
    }

    setImageDrawable(layerDrawable)
}


fun ImageView.changeIcon(resId: Int) {
    val layerDrawable = this.drawable as? LayerDrawable

    val newIcon = ContextCompat.getDrawable(context, resId)
    if (newIcon != null) {
        layerDrawable?.setDrawableByLayerId(net.deali.designsystem.R.id.icon, newIcon)
    }

    setImageDrawable(layerDrawable)
}
