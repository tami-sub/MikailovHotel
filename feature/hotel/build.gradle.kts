plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.mikailovhotel.feature.hotel"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    //livedata
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

    //viewmodel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

    //navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")

    //dagger
    implementation ("com.google.dagger:dagger:2.44")
    implementation ("com.google.dagger:dagger-android:2.44")
    implementation ("com.google.dagger:dagger-android-support:2.44")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    kapt ("com.google.dagger:dagger-compiler:2.44")
    kapt ("com.google.dagger:dagger-android-processor:2.44")

    //image slider
    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")

    //modules
    implementation(project(":shared:core"))
    implementation(project(":component:navigation"))

    //swipe to refresh layout
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
}