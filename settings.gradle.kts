pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

rootProject.name = "MikailovHotel"
include(":app")
include(":component:navigation")
include(":shared:core")
include(":feature:hotel")
include(":feature:room")
include(":feature:booking")
include(":feature:paid")
 