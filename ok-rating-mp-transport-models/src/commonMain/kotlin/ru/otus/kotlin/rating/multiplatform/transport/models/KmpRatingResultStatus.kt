package ru.otus.kotlin.rating.multiplatform.transport.models

import kotlinx.serialization.Serializable

@Serializable
enum class KmpRatingResultStatus {
    SUCCESS,
    ERROR,
    WARNING
}
