package ru.otus.otus.kotlin.rating.backend.common

import java.time.LocalDate

data class RatingModule(
    var id: String = "",
    var rating: Int = 0,
    var created: LocalDate = LocalDate.now()
) {
    val extRating: String
        get() = "rating: $rating"

    companion object {
        val NONE = RatingModule()
    }
}