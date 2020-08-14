package ru.otus.kotlin.rating.multiplatform.common.validators

import ru.otus.kotlin.rating.multiplatform.common.validators.simple.ValidatorStringToInt
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ValidatorStringToIntTest {
    @Test
    fun empty() {
        val validation = ValidatorStringToInt().validate("  ")
        assertFalse(validation.isOk)
    }

    @Test
    fun intValue() {
        val validation = ValidatorStringToInt().validate("5")
        assertTrue(validation.isOk)
    }

    @Test
    fun doubleValue() {
        val validation = ValidatorStringToInt().validate("5.5")
        assertFalse(validation.isOk)
    }
}
