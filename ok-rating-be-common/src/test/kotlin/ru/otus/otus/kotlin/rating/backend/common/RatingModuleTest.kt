package ru.otus.otus.kotlin.rating.backend.common

import org.junit.Test
import kotlin.test.assertEquals


internal class RatingModuleTest {
    @Test
    fun createUserTest() {
        val ratingModule = RatingModule(
            id = "test"
        )
        assertEquals("test", ratingModule.id)
    }
}