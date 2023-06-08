package net.deali.designsystem.util

import android.content.res.Resources
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * Sp(Scalable Pixel 또는 Scale Independent Pixel)와 다르게, 사용자 지정 글꼴 크기에 영향을 받지 않는 [TextUnit].
 */
@Stable
val Int.tu: TextUnit
    @Composable
    get() = with(LocalDensity.current) { (this@tu / fontScale).sp }

/**
 * Sp(Scalable Pixel 또는 Scale Independent Pixel)와 다르게, 사용자 지정 글꼴 크기에 영향을 받지 않는 [TextUnit].
 */
@Stable
val Float.tu: TextUnit
    @Composable
    get() = with(LocalDensity.current) { (this@tu / fontScale).sp }

/**
 * Sp(Scalable Pixel 또는 Scale Independent Pixel)와 다르게, 사용자 지정 글꼴 크기에 영향을 받지 않는 [TextUnit].
 */
@Stable
val Double.tu: TextUnit
    @Composable
    get() = with(LocalDensity.current) { (this@tu / fontScale).sp }

/**
 * sp to dp
 */
val TextUnit.tu: TextUnit
    get() = (this * Resources.getSystem().displayMetrics.density) / Resources.getSystem().displayMetrics.scaledDensity