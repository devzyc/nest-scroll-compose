object Dep {

    object Gradle {
        const val android = "com.android.tools.build:gradle:${Ver.androidGradle}"
        const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Ver.kotlin}"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Ver.compose}"
        const val test = "androidx.compose.ui:ui-test-junit4:${Ver.compose}"
        const val material = "androidx.compose.material:material:${Ver.compose}"
    }
}