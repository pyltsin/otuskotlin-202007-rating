rootProject.name = "otuskotlin-202007"
include("ok-rating-be-common")
include("ok-rating-mp-transport-models")

pluginManagement{
    plugins{
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion apply false
    }
}
include("ok-rating-mp-common")
