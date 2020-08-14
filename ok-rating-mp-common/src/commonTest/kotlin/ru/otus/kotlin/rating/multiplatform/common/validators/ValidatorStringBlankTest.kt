package ru.otus.kotlin.rating.multiplatform.common.validators

import ru.otus.kotlin.rating.multiplatform.common.validators.simple.ValidatorStringBlank
import kotlin.test.*

internal class ValidatorStringBlankTest {
    @Test
    fun nonEmpty() {
        val validation = ValidatorStringBlank().validate(" th ")
        assertTrue(validation.isOk)
    }

    @Test
    fun nullValue() {
        val validation = ValidatorStringBlank().validate(null)
        assertFalse(validation.isOk)
    }

    @Test
    fun emptyValue() {
        val validation = ValidatorStringBlank().validate("   ")
        assertFalse(validation.isOk)
    }
}
