object Versions {
    const val minSDK = 24
    const val targetSDK = 33

    const val coreKtx = "1.8.0"

    const val composeUI = "1.4.3"
    const val composeFoundation = "1.4.3"
    const val composeMaterial = "1.4.3"

    const val appCompat = "1.5.1"
    const val activityCompose = "1.4.0"

    const val navigationCompose = "2.5.3"
    const val constraintLayoutCompose = "1.0.1"

    const val datastore = "1.0.0"
}

object Libs {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"

    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.composeFoundation}"
    const val composeUI = "androidx.compose.ui:ui:${Versions.composeUI}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeUI}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeUI}"
    const val composeUiUtil = "androidx.compose.ui:ui-util:${Versions.composeUI}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeMaterial}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigationCompose}"
    const val constraintLayoutCompose = "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayoutCompose}"

    const val datastore = "androidx.datastore:datastore-preferences:${Versions.datastore}"
}
