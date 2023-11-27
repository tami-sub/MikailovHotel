plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.mikailovhotel"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mikailovhotel"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
            buildConfigField("String", "BASE_URL", "\"https://c8a9-91-108-29-103.ngrok-free.app/api/\"")
        }
        debug {
            buildConfigField("String", "BASE_URL", "\"https://c8a9-91-108-29-103.ngrok-free.app/api/\"")
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
        buildConfig = true
    }
}

dependencies {
    implementation(HotelDependencies.AndroidX.coreKtx)
    implementation(HotelDependencies.AndroidX.appcompat)
    implementation(HotelDependencies.Material.material)
    implementation(HotelDependencies.AndroidX.constraintLayout)
    testImplementation(HotelDependencies.AndroidX.JUnit.junit)
    androidTestImplementation(HotelDependencies.AndroidX.JUnit.junitExt)
    androidTestImplementation(HotelDependencies.AndroidX.JUnit.espresso)

    implementation(HotelDependencies.AndroidX.Lifecycle.livedata)
    implementation(HotelDependencies.AndroidX.Lifecycle.viewmodel)

    //dagger
    implementation(HotelDependencies.DI.dagger)
    implementation(HotelDependencies.DI.daggerAndroid)
    implementation(HotelDependencies.DI.daggerAndroidSupport)
    kapt(HotelDependencies.DI.daggerCompiler)
    kapt(HotelDependencies.DI.daggerAndroidProcessor)

    //navigation
    implementation(HotelDependencies.AndroidX.Navigation.navigationFragmentKtx)
    implementation(HotelDependencies.AndroidX.Navigation.navigationUiKtx)

    //retrofit
    implementation(HotelDependencies.Retrofit.retrofit)
    implementation(HotelDependencies.Retrofit.retrofitGsonConverter)

    //modules
    implementation(project(":component:navigation"))
    implementation(project(":shared:core"))
    implementation(project(":feature:hotel"))
    implementation(project(":feature:room"))
    implementation(project(":feature:booking"))
    implementation(project(":feature:paid"))
}