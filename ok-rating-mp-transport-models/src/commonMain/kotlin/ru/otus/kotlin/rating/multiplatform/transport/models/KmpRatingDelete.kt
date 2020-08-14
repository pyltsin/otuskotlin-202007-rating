package ru.otus.kotlin.rating.multiplatform.transport.models

import kotlinx.serialization.Serializable

@Serializable
data class KmpRatingDelete(
    var id: String? = null
)

