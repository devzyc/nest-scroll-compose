buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        with(Dep.Gradle) {
            classpath(android)
            classpath(kotlinPlugin)
        }
    }
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}