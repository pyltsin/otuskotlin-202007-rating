rootProject.name = "otuskotlin-202007"
include("ok-rating-be-common")
include("ok-rating-mp-transport-models")
include("ok-rating-mp-common")
include("ok-rating-be-transport-multiplatform")
include("ok-rating-app-spring")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion apply false
    }
}
