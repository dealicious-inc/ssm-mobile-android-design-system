package net.deali.designsystem.util.visualtransformation

import androidx.compose.ui.text.AnnotatedString
import org.junit.Assert
import org.junit.Test

class PhoneNumberVisualTransformationTest {

    @Test(expected = IllegalArgumentException::class)
    fun onlyNumbers() {
        val visualTransformation = PhoneNumberVisualTransformation()
        visualTransformation.filter(AnnotatedString("100+-"))
    }

    @Test
    fun emptyString() {
        val visualTransformation = PhoneNumberVisualTransformation()

        Assert.assertEquals(
            "",
            visualTransformation.filter(AnnotatedString("")).text.text
        )
    }

    @Test
    fun oneByOneTest() {
        val visualTransformation = PhoneNumberVisualTransformation()

        Assert.assertEquals(
            "0",
            visualTransformation.filter(AnnotatedString("0")).text.text
        )
        Assert.assertEquals(
            "01",
            visualTransformation.filter(AnnotatedString("01")).text.text
        )
        Assert.assertEquals(
            "010",
            visualTransformation.filter(AnnotatedString("010")).text.text
        )
        Assert.assertEquals(
            "010-1",
            visualTransformation.filter(AnnotatedString("0101")).text.text
        )
        Assert.assertEquals(
            "010-12",
            visualTransformation.filter(AnnotatedString("01012")).text.text
        )
        Assert.assertEquals(
            "010-123",
            visualTransformation.filter(AnnotatedString("010123")).text.text
        )
        Assert.assertEquals(
            "010-123-4",
            visualTransformation.filter(AnnotatedString("0101234")).text.text
        )
        Assert.assertEquals(
            "010-123-45",
            visualTransformation.filter(AnnotatedString("01012345")).text.text
        )
        Assert.assertEquals(
            "010-123-456",
            visualTransformation.filter(AnnotatedString("010123456")).text.text
        )
        Assert.assertEquals(
            "010-123-4567",
            visualTransformation.filter(AnnotatedString("0101234567")).text.text
        )
        Assert.assertEquals(
            "010-1234-5678",
            visualTransformation.filter(AnnotatedString("01012345678")).text.text
        )
    }

    @Test
    fun oneByOneTest_seoulLocalNumber() {
        val visualTransformation = PhoneNumberVisualTransformation()

        Assert.assertEquals(
            "0",
            visualTransformation.filter(AnnotatedString("0")).text.text
        )
        Assert.assertEquals(
            "02",
            visualTransformation.filter(AnnotatedString("02")).text.text
        )
        Assert.assertEquals(
            "02-1",
            visualTransformation.filter(AnnotatedString("021")).text.text
        )
        Assert.assertEquals(
            "02-12",
            visualTransformation.filter(AnnotatedString("0212")).text.text
        )
        Assert.assertEquals(
            "02-123",
            visualTransformation.filter(AnnotatedString("02123")).text.text
        )
        Assert.assertEquals(
            "02-123-4",
            visualTransformation.filter(AnnotatedString("021234")).text.text
        )
        Assert.assertEquals(
            "02-123-45",
            visualTransformation.filter(AnnotatedString("0212345")).text.text
        )
        Assert.assertEquals(
            "02-123-456",
            visualTransformation.filter(AnnotatedString("02123456")).text.text
        )
        Assert.assertEquals(
            "02-123-4567",
            visualTransformation.filter(AnnotatedString("021234567")).text.text
        )
        Assert.assertEquals(
            "02-1234-5678",
            visualTransformation.filter(AnnotatedString("0212345678")).text.text
        )
    }

    @Test
    fun oneByOneTest_otherLocalNumber() {
        val visualTransformation = PhoneNumberVisualTransformation()

        Assert.assertEquals(
            "0",
            visualTransformation.filter(AnnotatedString("0")).text.text
        )
        Assert.assertEquals(
            "03",
            visualTransformation.filter(AnnotatedString("03")).text.text
        )
        Assert.assertEquals(
            "031",
            visualTransformation.filter(AnnotatedString("031")).text.text
        )
        Assert.assertEquals(
            "031-1",
            visualTransformation.filter(AnnotatedString("0311")).text.text
        )
        Assert.assertEquals(
            "031-12",
            visualTransformation.filter(AnnotatedString("03112")).text.text
        )
        Assert.assertEquals(
            "031-123",
            visualTransformation.filter(AnnotatedString("031123")).text.text
        )
        Assert.assertEquals(
            "031-123-4",
            visualTransformation.filter(AnnotatedString("0311234")).text.text
        )
        Assert.assertEquals(
            "031-123-45",
            visualTransformation.filter(AnnotatedString("03112345")).text.text
        )
        Assert.assertEquals(
            "031-123-456",
            visualTransformation.filter(AnnotatedString("031123456")).text.text
        )
        Assert.assertEquals(
            "031-123-4567",
            visualTransformation.filter(AnnotatedString("0311234567")).text.text
        )
        Assert.assertEquals(
            "031-1234-5678",
            visualTransformation.filter(AnnotatedString("03112345678")).text.text
        )
    }
}
