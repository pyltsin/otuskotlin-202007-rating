package ru.otus.kotlin.rating.multiplatform.common.validators.fields

import ru.otus.kotlin.rating.multiplatform.common.validators.ValidationResult
import ru.otus.kotlin.rating.multiplatform.common.validators.Validator
import ru.otus.kotlin.rating.multiplatform.common.validators.simple.ValidatorStringBlank
import ru.otus.kotlin.rating.multiplatform.common.validators.simple.ValidatorStringToInt


class ValidatorRating(
    field: String = "rating"
) : Validator<String?> {
    private val validatorEmpty = ValidatorStringBlank(field = field)
    private val validatorInt = ValidatorStringToInt(field = field)

    override fun validate(arg: String?): ValidationResult = ValidationResult(
        *validatorEmpty.validate(arg).errors.toTypedArray(),
        *validatorInt.validate(arg).errors.toTypedArray()
    )
}
