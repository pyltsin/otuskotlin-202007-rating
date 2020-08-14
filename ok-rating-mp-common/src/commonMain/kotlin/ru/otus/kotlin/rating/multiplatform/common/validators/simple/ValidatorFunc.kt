package ru.otus.kotlin.rating.multiplatform.common.validators.simple

import ru.otus.kotlin.rating.multiplatform.common.validators.ValidationResult
import ru.otus.kotlin.rating.multiplatform.common.validators.Validator


class ValidatorFunc<T>(
    private val validator: (T) -> ValidationResult
) : Validator<T> {
    override fun validate(arg: T): ValidationResult = validator(arg)
}

fun <T> validator(validator: (T) -> ValidationResult) = ValidatorFunc(validator)
