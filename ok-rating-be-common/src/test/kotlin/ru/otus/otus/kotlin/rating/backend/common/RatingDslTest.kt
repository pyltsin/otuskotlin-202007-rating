package ru.otus.otus.kotlin.rating.backend.common

import org.junit.Test
import ru.otus.otus.kotlin.rating.backend.common.dsl.rating
import ru.otus.otus.kotlin.rating.backend.common.models.Rating
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class RatingDslTest{

    @Test
    fun ratingDslTest() {
        val rating: Rating = rating{
            external{
                type = "message"
                id = "1"
            }
            id = newId()
            value = "2"
            created{
                by = "vasya"
                at = LocalDateTime.now()
            }
            + "test"
        }

        assertEquals("2test", rating.rating)
        assertEquals("1", rating.externalObjectId)
        assertEquals("message", rating.externalTypeId)
        assertNotNull(rating.id)
        assertEquals("vasya", rating.createdBy)
    }
}