package ru.otus.kotlin.rating.multiplatform.transport.models

import kotlinx.serialization.Serializable

@Serializable
data class KmpRating(
    var id: String? = null,
    var externalObjectId: String? = null,
    var externalTypeId: String? = null,
    var rating: String? = null,
    var createdBy: String? = null,
    var createdAt: String? = null,
    var updatedAt: String? = null
)