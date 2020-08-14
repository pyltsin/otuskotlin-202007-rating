package ru.otus.kotlin.rating.multiplatform.common.validators

interface Validator<T> {
    fun validate(arg: T): ValidationResult
}