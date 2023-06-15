package net.deali.designsystem.sample.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

fun Color.toHexString() = String.format("#%08X", (0xFFFFFFFF and toArgb().toLong()))