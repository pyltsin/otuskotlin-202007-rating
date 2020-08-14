package ru.otus.kotlin.rating.multiplatform.common.validators.simple

import ru.otus.kotlin.rating.multiplatform.common.validators.HandleError
import ru.otus.kotlin.rating.multiplatform.common.validators.ValidationResult
import ru.otus.kotlin.rating.multiplatform.common.validators.Validator

class ValidatorStringBlank(
    val field: String = ""
) : Validator<String?> {
    override fun validate(arg: String?): ValidationResult = ValidationResult(
        if (arg == null || arg.isBlank())
            HandleError(
                message = "Поле  ${field.takeIf { it.isNotBlank() } ?: ""} не может быть пустым",
                field = this.field
            )
        else null
    )
}
