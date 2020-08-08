rootProject.name = "otuskotlin-202007"
include("ok-rating-be-common")

pluginManagement{
    plugins{
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
}