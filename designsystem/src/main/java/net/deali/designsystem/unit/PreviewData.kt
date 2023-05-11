package net.deali.designsystem.unit

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum

fun getRandomText(wordCount: Int = 20) = LoremIpsum(wordCount).values.joinToString()

fun getRandomNumber(
    min: Int = 0,
    max: Int = Int.MAX_VALUE
) = (min..max).random()
