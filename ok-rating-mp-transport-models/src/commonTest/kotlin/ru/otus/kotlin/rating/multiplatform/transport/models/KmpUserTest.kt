package ru.otus.kotlin.rating.multiplatform.transport.models

import kotlin.test.Test
import kotlin.test.assertEquals

internal class KmpUserTest {
    @Test
    fun createKmpRating() {
        val rating = KmpRating(
            id = "x1",
            externalObjectId = "test-film"
        )

        assertEquals("x1", rating.id)
    }
}
