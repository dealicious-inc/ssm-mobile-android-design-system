buildscript {
    extra.apply {
        set("minSdkVersion", libs.versions.minSdk.get().toInt())
        set("targetSdk", libs.versions.targetSdk.get().toInt())
        set("composeCompilerVersion", libs.versions.composeCompiler.toString())
    }

    dependencies {
        classpath(libs.maven.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
}