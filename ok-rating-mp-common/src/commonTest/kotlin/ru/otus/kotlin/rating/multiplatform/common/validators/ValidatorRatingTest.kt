package ru.otus.kotlin.rating.multiplatform.common.validators

import ru.otus.kotlin.rating.multiplatform.common.validators.fields.ValidatorRating
import ru.otus.kotlin.rating.multiplatform.common.validators.simple.ValidatorStringToInt
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ValidatorRatingTest {

    @Test
    fun empty() {
        val validation = ValidatorRating().validate("  s")
        assertFalse(validation.isOk)
    }

    @Test
    fun intValue() {
        val validation = ValidatorRating().validate("5")
        assertTrue(validation.isOk)
    }

    @Test
    fun doubleValue() {
        val validation = ValidatorRating().validate("5.5")
        assertFalse(validation.isOk)
    }
}
