package net.deali.designsystem.util.visualtransformation

import androidx.compose.ui.text.AnnotatedString
import org.junit.Assert
import org.junit.Test

class DecimalSeparatorVisualTransformationTest {

    @Test(expected = IllegalArgumentException::class)
    fun onlyNumbers() {
        val visualTransformation = DecimalSeparatorVisualTransformation()
        visualTransformation.filter(AnnotatedString("$"))
    }

    @Test
    fun emptyString_withoutPrefix() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "",
            alwaysShowPrefix = false,
        )

        Assert.assertEquals(
            "",
            visualTransformation.filter(AnnotatedString("")).text.text
        )
    }

    @Test
    fun emptyString_withPrefix_alwaysShowPrefixDisabled() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "₩",
            alwaysShowPrefix = false,
        )

        Assert.assertEquals(
            "",
            visualTransformation.filter(AnnotatedString("")).text.text
        )
    }

    @Test
    fun emptyString_withPrefix_alwaysShowPrefixEnabled() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "₩",
            alwaysShowPrefix = true,
        )

        Assert.assertEquals(
            "₩",
            visualTransformation.filter(AnnotatedString("")).text.text
        )
    }

    @Test
    fun simpleNumbers_withoutPrefix() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "",
            alwaysShowPrefix = false,
        )

        Assert.assertEquals(
            "9",
            visualTransformation.filter(AnnotatedString("9")).text.text
        )
        Assert.assertEquals(
            "99",
            visualTransformation.filter(AnnotatedString("99")).text.text
        )
        Assert.assertEquals(
            "999",
            visualTransformation.filter(AnnotatedString("999")).text.text
        )
        Assert.assertEquals(
            "9,999",
            visualTransformation.filter(AnnotatedString("9999")).text.text
        )
        Assert.assertEquals(
            "99,999",
            visualTransformation.filter(AnnotatedString("99999")).text.text
        )
        Assert.assertEquals(
            "999,999",
            visualTransformation.filter(AnnotatedString("999999")).text.text
        )
        Assert.assertEquals(
            "9,999,999",
            visualTransformation.filter(AnnotatedString("9999999")).text.text
        )
        Assert.assertEquals(
            "99,999,999",
            visualTransformation.filter(AnnotatedString("99999999")).text.text
        )
        Assert.assertEquals(
            "999,999,999",
            visualTransformation.filter(AnnotatedString("999999999")).text.text
        )
    }

    @Test
    fun simpleNumbers_withPrefix() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "₩ ",
            alwaysShowPrefix = false,
        )

        Assert.assertEquals(
            "₩ 9",
            visualTransformation.filter(AnnotatedString("9")).text.text
        )
        Assert.assertEquals(
            "₩ 99",
            visualTransformation.filter(AnnotatedString("99")).text.text
        )
        Assert.assertEquals(
            "₩ 999",
            visualTransformation.filter(AnnotatedString("999")).text.text
        )
        Assert.assertEquals(
            "₩ 9,999",
            visualTransformation.filter(AnnotatedString("9999")).text.text
        )
        Assert.assertEquals(
            "₩ 99,999",
            visualTransformation.filter(AnnotatedString("99999")).text.text
        )
        Assert.assertEquals(
            "₩ 999,999",
            visualTransformation.filter(AnnotatedString("999999")).text.text
        )
        Assert.assertEquals(
            "₩ 9,999,999",
            visualTransformation.filter(AnnotatedString("9999999")).text.text
        )
        Assert.assertEquals(
            "₩ 99,999,999",
            visualTransformation.filter(AnnotatedString("99999999")).text.text
        )
        Assert.assertEquals(
            "₩ 999,999,999",
            visualTransformation.filter(AnnotatedString("999999999")).text.text
        )
    }

    @Test
    fun startsWithZero() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "$ ",
            alwaysShowPrefix = false,
        )

        Assert.assertEquals(
            "$ 0",
            visualTransformation.filter(AnnotatedString("0")).text.text
        )
        Assert.assertEquals(
            "$ 0",
            visualTransformation.filter(AnnotatedString("00")).text.text
        )
        Assert.assertEquals(
            "$ 1",
            visualTransformation.filter(AnnotatedString("001")).text.text
        )
        Assert.assertEquals(
            "$ 100",
            visualTransformation.filter(AnnotatedString("00100")).text.text
        )
        Assert.assertEquals(
            "$ 100,000",
            visualTransformation.filter(AnnotatedString("00000100000")).text.text
        )
    }

    @Test
    fun round() {
        val visualTransformation = DecimalSeparatorVisualTransformation(
            prefix = "$ ",
            alwaysShowPrefix = false,
        )

        Assert.assertEquals(
            "$ 1",
            visualTransformation.filter(AnnotatedString("1.4")).text.text
        )
        Assert.assertEquals(
            "$ 2",
            visualTransformation.filter(AnnotatedString("1.6")).text.text
        )
        Assert.assertEquals(
            "$ 10,000,000",
            visualTransformation.filter(AnnotatedString("9999999.94")).text.text
        )
        Assert.assertEquals(
            "$ 9,999,999",
            visualTransformation.filter(AnnotatedString("9999999.17")).text.text
        )
    }
}
