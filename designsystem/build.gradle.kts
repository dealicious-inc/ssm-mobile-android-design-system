import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose)
    id("maven-publish")
}

// Compose를 사용하는 모듈에서 컴포저블과 클래스들의 안정성 상태 보고서 생성 활성화 옵션.
// 필요할 때만 사용하기 위해 기본값은 false로 유지합니다.
val isComposeCompilerReportsEnabled = false

android {
    namespace = "net.deali.designsystem"
    compileSdk = libs.versions.targetSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        vectorDrawables.useSupportLibrary = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)

            if (isComposeCompilerReportsEnabled) {
                freeCompilerArgs.addAll(
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
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout.compose)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material)

    implementation(libs.android.material)
    implementation(libs.kotlinx.collections.immutable)
    implementation(libs.coil.compose)
    implementation(libs.snapper)

    testImplementation(libs.junit4)
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
