import org.gradle.kotlin.dsl.implementation

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "hu.bd.notesapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "hu.bd.notesapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Room
    implementation("androidx.room:room-runtime:2.8.1")
    annotationProcessor("androidx.room:room-compiler:2.8.1")

    //RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    //Scalable Size Unit
    implementation("com.intuit.sdp:sdp-android:1.2.0")
    implementation("com.intuit.ssp:ssp-android:1.2.0")

    //Material design
    implementation("com.google.android.material:material:1.13.0")

    //Rounded ImageView
    implementation("com.makeramen:roundedimageview:2.3.0")
}