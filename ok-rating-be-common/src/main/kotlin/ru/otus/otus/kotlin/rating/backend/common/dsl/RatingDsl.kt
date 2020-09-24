package ru.otus.otus.kotlin.rating.backend.common.dsl

import ru.otus.otus.kotlin.rating.backend.common.models.Rating
import java.time.LocalDateTime
import java.util.*

@RatingDslMarker
class RatingDsl {
    var external = ExternalRatingDsl.EMPTY
    var created = CreatedRatingDsl.EMPTY
    var id: String = ""
    var value: String = ""

    fun external(conf: ExternalRatingDsl.() -> Unit) {
        external = ExternalRatingDsl()
            .apply(conf)
    }

    fun created(conf: CreatedRatingDsl.() -> Unit) {
        created = CreatedRatingDsl()
            .apply(conf)
    }

    fun newId(): String {
        return UUID.randomUUID().toString()
    }

    operator fun String.unaryPlus() {
        value += this
    }
}

@RatingDslMarker
class CreatedRatingDsl {
    var by: String = ""
    var at: LocalDateTime = LocalDateTime.MIN

    companion object {
        val EMPTY = CreatedRatingDsl()
    }
}

@RatingDslMarker
class ExternalRatingDsl {
    var type: String = ""
    var id: String = ""

    companion object {
        val EMPTY = ExternalRatingDsl()
    }
}

fun rating(conf: RatingDsl.() -> Unit) =
    RatingDsl().apply(conf)
        .run {
            Rating(
                id = id,
                externalObjectId = external.id,
                externalTypeId = external.type,
                rating = value,
                createdBy = created.by,
                createdAt = created.at,
            )
        }