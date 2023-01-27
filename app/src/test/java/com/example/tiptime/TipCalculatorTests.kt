package com.example.tiptime

import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        var amount = 10.00
        var tipPercent = 20.00
        val expectedTip = "£2.00"
        val actualTip = calculateTip(
            amount = amount,
            tipPercent = tipPercent,
            roundUp = false
        )
        assertEquals(expectedTip, actualTip)
    }
}