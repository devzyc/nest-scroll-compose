plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

group = "nest-scroll"
version = "1.0.2"

android {
    compileSdk = Ver.compileSdk

    defaultConfig {
        minSdk = Ver.minSdk
        targetSdk = Ver.targetSdk
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Ver.compose
    }
}

dependencies {

    with(Dep.Compose) {
        implementation(ui)
        implementation(material)
    }
}