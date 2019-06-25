package io.github.danielrgutierrez.projecteuler1

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test fun testSumMultiplesOfThreeOrFiveLessThan() {
        val message = "The sum of the multiples of 3 or 5 less than 10 should equal 23"
        assertEquals(23, sumMultiplesOfThreeOrFiveLessThan(10), message)
    }
}
