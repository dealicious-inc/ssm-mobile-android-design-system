@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlinx.serialization)
    id("maven-publish")
    id("kotlin-parcelize")
    id("kotlin-kapt")
}

// Compose를 사용하는 모듈에서 컴포저블과 클래스들의 안정성 상태 보고서 생성 활성화 옵션.
// 필요할 때만 사용하기 위해 기본값은 false로 유지합니다.
val isComposeCompilerReportsEnabled = false

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
        viewBinding = true
        dataBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()

        if (isComposeCompilerReportsEnabled) {
            freeCompilerArgs += listOf(
                // 모듈에 있는 모든 컴포저블의 개수를 정리한 파일 생성.
                "-P",
                "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=${project.buildDir.absolutePath}/report/compose-metrics",

                // 모듈에 있는 컴포저블 함수와 매개변수, 그 외 여러 클래스들의 안정성 상태에 대한 정보 파일 생성.
                "-P",
                "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=${project.buildDir.absolutePath}/report/compose-reports"
            )
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout.compose)

    implementation(libs.compose.ui)
    implementation(libs.compose.foundation)
    implementation(libs.compose.tooling)
    debugImplementation(libs.compose.preview)
    implementation(libs.compose.material)

    implementation(libs.android.material)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.collections.immutable)
    implementation(libs.coil.compose)
    implementation(libs.snapper)
}

afterEvaluate {
    publishing {
        publications {
            register("release", MavenPublication::class) {
                from(components["release"])

                groupId = "com.github.dealicious-inc"
                artifactId = "ssm-mobile-android-design-system"
            }
        }
    }
}
