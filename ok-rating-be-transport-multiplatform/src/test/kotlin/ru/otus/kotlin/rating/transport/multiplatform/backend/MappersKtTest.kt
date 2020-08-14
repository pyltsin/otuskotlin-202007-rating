package ru.otus.kotlin.rating.transport.multiplatform.backend

import ru.otus.kotlin.rating.multiplatform.transport.models.KmpRating
import ru.otus.otus.kotlin.rating.backend.common.Rating
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

internal class MappersKtTest {

    @Test
    fun userToModelTest() {
        val kmpRating = KmpRating(
            id = "id",
            rating = "rating",
            externalTypeId = "externalTypeId",
            createdAt = LocalDateTime.now().toString()
        )

        val rating = kmpRating.toRating()
        assertEquals("id", rating.id)
        assertEquals("rating", rating.rating)
        assertEquals("externalTypeId", rating.externalTypeId)
        assertEquals("", rating.createdBy)
        assertTrue(rating.createdAt.isAfter(LocalDateTime.MIN))
        assertEquals(LocalDateTime.MIN, rating.updatedAt)
        assertEquals("", rating.externalObjectId)
    }

    @Test
    fun ratingToKmpTest() {
        val rating = Rating(
            id = "id",
            rating = "rating",
            externalTypeId = "externalTypeId",
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
            createdBy = "createdBy",
            externalObjectId = "externalObjectId"
        )

        val kmpRating = rating.toKmpRating()
        assertEquals("id", kmpRating.id)
        assertEquals("rating", kmpRating.rating)
        assertEquals("externalTypeId", kmpRating.externalTypeId)
        assertEquals("createdBy", kmpRating.createdBy)
        assertEquals("externalObjectId", kmpRating.externalObjectId)
        assertNotNull(kmpRating.createdAt)
        assertNotNull(kmpRating.updatedAt)
    }
}
