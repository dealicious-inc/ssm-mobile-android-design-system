package net.deali.designsystem.util.internal

import androidx.compose.runtime.Stable

@Stable
internal fun BooleanArray.countTrue(): Int = count { it }
