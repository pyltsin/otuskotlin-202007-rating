package ru.otus.kotlin.rating.multiplatform.common.validators

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ValidatorTest {

    @Test
    fun validatorTest() {
        val result = SomeValidator(field = "rating").validate("5")
        assertTrue(result.isOk)
        assertEquals(0, result.errors.count())
    }
}

class SomeValidator(val field: String) : Validator<String> {
    override fun validate(arg: String): ValidationResult {
        return ValidationResult(
            if (arg.toIntOrNull() != null) {
                null
            } else {
                HandleError(
                    field = this.field,
                    message = "не число"
                )
            }
        )
    }
}
