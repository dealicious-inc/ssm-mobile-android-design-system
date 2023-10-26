package net.deali.designsystem.internal.slider

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

//@Stable
//internal class SliderPositions(
//    initialActiveRange: ClosedFloatingPointRange<Float> = 0f..1f,
//    initialTickFractions: FloatArray = floatArrayOf()
//) {
//    var activeRange: ClosedFloatingPointRange<Float> by mutableStateOf(initialActiveRange)
//        internal set
//
//    var tickFractions: FloatArray by mutableStateOf(initialTickFractions)
//        internal set
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other !is SliderPositions) return false
//
//        if (activeRange != other.activeRange) return false
//        if (!tickFractions.contentEquals(other.tickFractions)) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = activeRange.hashCode()
//        result = 31 * result + tickFractions.contentHashCode()
//        return result
//    }
//}