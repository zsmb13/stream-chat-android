@file:Suppress("RedundantVisibilityModifier")

package io.getstream.chat.android

object Versions {
    internal const val ANDROID_GRADLE_PLUGIN = "7.0.0"
    internal const val ANDROID_JUNIT5_GRADLE_PLUGIN = "1.7.1.1"
    internal const val ANDROID_LEGACY_SUPPORT = "1.0.0"
    internal const val ANDROIDX_ACTIVITY_KTX = "1.3.1"
    internal const val ANDROIDX_ANNOTATIONS = "1.2.0"
    internal const val ANDROIDX_APPCOMPAT = "1.3.1"
    internal const val ANDROIDX_CORE_TEST = "2.1.0"
    internal const val ANDROIDX_FRAGMENT_KTX = "1.3.6"
    internal const val ANDROIDX_KTX = "1.7.0"
    internal const val ANDROIDX_LIFECYCLE_EXTENSIONS = "2.2.0"
    internal const val ANDROIDX_LIFECYCLE_LIVEDATA_KTX = "2.3.1"
    internal const val ANDROIDX_LIFECYCLE_VIEWMODEL_KTX = "2.3.1"
    internal const val ANDROIDX_PREFERENCES = "1.1.1"
    internal const val ANDROIDX_RECYCLERVIEW = "1.2.1"
    internal const val ANDROIDX_STARTUP = "1.1.0"
    internal const val ANDROIDX_TEST_JUNIT = "1.1.3"
    internal const val ANDROIDX_TEST = "1.4.0"
    internal const val ANDROIDX_VIEW_PAGER_2 = "1.0.0"
    internal const val COIL = "1.4.0"
    internal const val COMPOSE_ACCOMPANIST = "0.19.0"
    internal const val COMPOSE_ACTIVITY = "1.3.1"
    internal const val COMPOSE_VIEW_MODEL = "1.0.0-alpha07"
    public const val COMPOSE = "1.0.3"
    internal const val CONSTRAINT_LAYOUT = "2.1.0"
    internal const val COROUTINES = "1.5.1"
    internal const val DEXTER = "6.2.3"
    internal const val DRAWABLETOOLBOX = "1.0.7"
    internal const val DOKKA = "1.5.0"
    internal const val DOKKASAURUS = "0.1.10"
    internal const val DOTENV = "5.2.2"
    internal const val ESPRESSO = "3.3.0"
    internal const val EXOMEDIA = "743fa9757c" // TODO fix when proper release is available
    internal const val FRAGMENT_TESTING = "1.4.0-beta01"
    internal const val FIREBASE_ANALYTICS = "19.0.0"
    internal const val FIREBASE_CRASHLYTICS = "18.2.1"
    internal const val FIREBASE_CRASHLYTICS_PLUGIN = "2.7.1"
    internal const val FIREBASE_MESSAGING = "22.0.0"
    internal const val FLIPPER = "0.117.0"
    internal const val FLIPPER_SO_LOADER = "0.10.1"
    internal const val GITVERSIONER = "0.5.0"
    internal const val GOOGLE_PLAY_SERVICES_BASE = "17.6.0"
    internal const val GOOGLE_SERVICES = "4.3.10"
    internal const val GRADLE_NEXUS_PUBLISH_PLUGIN = "1.1.0"
    internal const val GRADLE_VERSIONS_PLUGIN = "0.39.0"
    internal const val HUAWEI_AGCP = "1.6.1.200"
    internal const val HUAWEI_PUSH = "6.1.0.300"
    internal const val JSON = "20210307"
    internal const val JUNIT4 = "4.13.2"
    internal const val JUNIT5 = "5.7.2"
    internal const val KEYBOARD_VISIBILITY_EVENT = "2.3.0"
    internal const val KFIXTURE = "0.2.0"
    internal const val KLUENT = "1.68"
    public const val KOTLIN = "1.5.30"
    internal const val KOTLIN_BINARY_VALIDATOR = "0.6.0"
    internal const val KSP = "1.5.30-1.0.0"
    internal const val KTLINT_PLUGIN = "10.1.0"
    internal const val LEAK_CANARY = "2.4"
    internal const val LOTTIE = "4.0.0"
    internal const val MATERIAL_COMPONENTS = "1.4.0"
    internal const val MARKWON = "4.6.2"
    internal const val MOCKITO_KOTLIN = "2.2.0"
    internal const val MOCKITO = "3.11.2"
    internal const val MOSHI = "1.12.0"
    internal const val MOSHIX = "0.14.0"
    internal const val NAVIGATION = "2.3.5"
    internal const val OK2CURL = "0.7.0"
    internal const val OKHTTP = "4.9.1"
    internal const val PHOTOVIEW = "2.3.0"
    internal const val RETROFIT = "2.9.0"
    internal const val ROBOLECTRIC = "4.6.1"
    internal const val ROOM = "2.4.0-beta01"
    internal const val SHIMMER = "0.5.0"
    internal const val SHOT = "5.11.2"
    internal const val STFALCON_IMAGE_VIEWER = "d11578fe3f"
    internal const val TEST_PARAMETER_INJECTOR = "1.4"
    internal const val THREETENBP = "1.5.1"
    internal const val THREETENABP = "1.3.1"
    internal const val TIMBER = "5.0.0"
    internal const val WORK = "2.7.0"
}

object Dependencies {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}"
    const val androidJunit5GradlePlugin =
        "de.mannodermaus.gradle.plugins:android-junit5:${Versions.ANDROID_JUNIT5_GRADLE_PLUGIN}"
    const val androidLegacySupport = "androidx.legacy:legacy-support-v4:${Versions.ANDROID_LEGACY_SUPPORT}"
    const val androidxActivityKtx = "androidx.activity:activity-ktx:${Versions.ANDROIDX_ACTIVITY_KTX}"
    const val androidxAnnotations = "androidx.annotation:annotation:${Versions.ANDROIDX_ANNOTATIONS}"
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.ANDROIDX_APPCOMPAT}"
    const val androidxArchCoreTest = "androidx.arch.core:core-testing:${Versions.ANDROIDX_CORE_TEST}"
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.ANDROIDX_KTX}"
    const val androidxFragmentKtx = "androidx.fragment:fragment-ktx:${Versions.ANDROIDX_FRAGMENT_KTX}"
    const val androidxLifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.ANDROIDX_LIFECYCLE_EXTENSIONS}"
    const val androidxLifecycleLiveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.ANDROIDX_LIFECYCLE_LIVEDATA_KTX}"
    const val androidxLifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ANDROIDX_LIFECYCLE_VIEWMODEL_KTX}"
    const val androidxPreferences = "androidx.preference:preference:${Versions.ANDROIDX_PREFERENCES}"
    const val androidxRecyclerview = "androidx.recyclerview:recyclerview:${Versions.ANDROIDX_RECYCLERVIEW}"
    const val androidxStartup = "androidx.startup:startup-runtime:${Versions.ANDROIDX_STARTUP}"
    const val androidxTest = "androidx.test:core:${Versions.ANDROIDX_TEST}"
    const val androidxTestKtx = "androidx.test:core-ktx:${Versions.ANDROIDX_TEST}"
    const val androidxTestJunit = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_JUNIT}"
    const val androidxTestJunitKtx = "androidx.test.ext:junit-ktx:${Versions.ANDROIDX_TEST_JUNIT}"
    const val androidxViewPager2 = "androidx.viewpager2:viewpager2:${Versions.ANDROIDX_VIEW_PAGER_2}"
    const val coil = "io.coil-kt:coil:${Versions.COIL}"
    const val coilGif = "io.coil-kt:coil-gif:${Versions.COIL}"
    const val coilVideo = "io.coil-kt:coil-video:${Versions.COIL}"
    const val composeCoil = "io.coil-kt:coil-compose:${Versions.COIL}"
    const val composeCompiler = "androidx.compose.compiler:compiler:${Versions.COMPOSE}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val composeMaterialIconsCore = "androidx.compose.material:material-icons-core:${Versions.COMPOSE}"
    const val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
    const val composeAccompanistPermissions =
        "com.google.accompanist:accompanist-permissions:${Versions.COMPOSE_ACCOMPANIST}"
    const val composeAccompanistPager = "com.google.accompanist:accompanist-pager:${Versions.COMPOSE_ACCOMPANIST}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    const val composeViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.COMPOSE_VIEW_MODEL}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val dexter = "com.karumi:dexter:${Versions.DEXTER}"
    const val drawabletoolbox = "com.github.duanhong169:drawabletoolbox:${Versions.DRAWABLETOOLBOX}"
    const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.DOKKA}"
    const val dokkasaurus = "io.getstream:dokkasaurus:${Versions.DOKKASAURUS}"
    const val dotenv = "io.github.cdimascio:java-dotenv:${Versions.DOTENV}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    const val exoMedia = "com.github.brianwernick:ExoMedia:${Versions.EXOMEDIA}"
    const val fragmentTest = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_TESTING}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx:${Versions.FIREBASE_ANALYTICS}"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:${Versions.FIREBASE_CRASHLYTICS}"
    const val firebaseCrashlyticsPlugin =
        "com.google.firebase:firebase-crashlytics-gradle:${Versions.FIREBASE_CRASHLYTICS_PLUGIN}"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.FIREBASE_MESSAGING}"
    const val flipper = "com.facebook.flipper:flipper:${Versions.FLIPPER}"
    const val flipperNetwork = "com.facebook.flipper:flipper-network-plugin:${Versions.FLIPPER}"
    const val flipperLoader = "com.facebook.soloader:soloader:${Versions.FLIPPER_SO_LOADER}"
    const val gitversionerPlugin = "com.pascalwelsch.gitversioner:gitversioner:${Versions.GITVERSIONER}"
    const val googlePlayServicesBase = "com.google.android.gms:play-services-base:${Versions.GOOGLE_PLAY_SERVICES_BASE}"
    const val googleServicesPlugin = "com.google.gms:google-services:${Versions.GOOGLE_SERVICES}"
    const val gradleNexusPublishPlugin = "io.github.gradle-nexus:publish-plugin:${Versions.GRADLE_NEXUS_PUBLISH_PLUGIN}"
    const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.GRADLE_VERSIONS_PLUGIN}"
    const val huaweiPlugin = "com.huawei.agconnect:agcp:${Versions.HUAWEI_AGCP}"
    const val huaweiPush = "com.huawei.hms:push:${Versions.HUAWEI_PUSH}"
    const val json = "org.json:json:${Versions.JSON}"
    const val junit4 = "junit:junit:${Versions.JUNIT4}"
    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.JUNIT5}"
    const val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.JUNIT5}"
    const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.JUNIT5}"
    const val junitVintageEngine = "org.junit.vintage:junit-vintage-engine:${Versions.JUNIT5}"
    const val keyboardVisibilityEvent =
        "net.yslibrary.keyboardvisibilityevent:keyboardvisibilityevent:${Versions.KEYBOARD_VISIBILITY_EVENT}"
    const val kfixture = "com.flextrade.jfixture:kfixture:${Versions.KFIXTURE}"
    const val kluent = "org.amshove.kluent:kluent:${Versions.KLUENT}"
    const val kotlinBinaryValidator =
        "org.jetbrains.kotlinx:binary-compatibility-validator:${Versions.KOTLIN_BINARY_VALIDATOR}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN}"
    const val ktlintPlugin = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.KTLINT_PLUGIN}"
    const val ksp = "com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:${Versions.KSP}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.LEAK_CANARY}"
    const val lottie = "com.airbnb.android:lottie:${Versions.LOTTIE}"
    const val materialComponents = "com.google.android.material:material:${Versions.MATERIAL_COMPONENTS}"
    const val markwonCore = "io.noties.markwon:core:${Versions.MARKWON}"
    const val markwonLinkify = "io.noties.markwon:linkify:${Versions.MARKWON}"
    const val markwonextStrikethrough = "io.noties.markwon:ext-strikethrough:${Versions.MARKWON}"
    const val markwonImage = "io.noties.markwon:image:${Versions.MARKWON}"
    const val mockito = "org.mockito:mockito-core:${Versions.MOCKITO}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.MOCKITO_KOTLIN}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.MOSHI}"
    const val moshiKsp = "dev.zacsweers.moshix:moshi-ksp:${Versions.MOSHIX}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
    const val navigationFragmentKTX = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val navigationSafeArgsGradlePlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}"
    const val navigationRuntimeKTX = "androidx.navigation:navigation-runtime-ktx:${Versions.NAVIGATION}"
    const val navigationTest = "androidx.navigation:navigation-testing:${Versions.NAVIGATION}"
    const val navigationUIKTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
    const val ok2curl = "com.github.mrmike:ok2curl:${Versions.OK2CURL}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
    const val okhttpMockWebserver = "com.squareup.okhttp3:mockwebserver:${Versions.OKHTTP}"
    const val photoview = "com.github.chrisbanes:PhotoView:${Versions.PHOTOVIEW}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"
    const val robolectric = "org.robolectric:robolectric:${Versions.ROBOLECTRIC}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.ROOM}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.ROOM}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.ROOM}"
    const val roomTesting = "androidx.room:room-testing:${Versions.ROOM}"
    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.SHIMMER}"
    const val shot = "com.karumi:shot:${Versions.SHOT}"
    const val stfalconImageViewer = "com.github.stfalcon-studio:StfalconImageViewer:${Versions.STFALCON_IMAGE_VIEWER}"
    const val testParameterInjector =
        "com.google.testparameterinjector:test-parameter-injector:${Versions.TEST_PARAMETER_INJECTOR}"
    const val threeTenBp = "org.threeten:threetenbp:${Versions.THREETENBP}"
    const val threeTenAbp = "com.jakewharton.threetenabp:threetenabp:${Versions.THREETENABP}"
    const val timber = "com.jakewharton.timber:timber:${Versions.TIMBER}"
    const val workRuntimeKtx = "androidx.work:work-runtime-ktx:${Versions.WORK}"
    const val workTesting = "androidx.work:work-testing:${Versions.WORK}"

    @JvmStatic
    fun isNonStable(version: String): Boolean = isStable(version).not()

    @JvmStatic
    fun isStable(version: String): Boolean = ("^[0-9.]+$").toRegex().matches(version)
}
