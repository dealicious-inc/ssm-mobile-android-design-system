@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "net.deali.designsystem"
    compileSdk = libs.versions.targetSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        vectorDrawables.useSupportLibrary = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.toString()
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout.compose)

    implementation(libs.compose.ui)
    implementation(libs.compose.foundation)
    implementation(libs.compose.tooling)
    implementation(libs.compose.material)

    debugImplementation(libs.compoes.preview)
}

val groupId = "com.github.dealicious-inc"
val artifactId = "ssm-mobile-android-design-system"
val version = "0.0.1"

// TODO fix error
//afterEvaluate {
//    publishing {
//        publications {
//            register("release", MavenPublication::class) {
//                from(components["release"])
//
//                groupId = "com.github.dealicious-inc"
//                artifactId = "ssm-mobile-android-design-system"
//                version = "0.0.1"
//            }
//        }
//    }
//}
