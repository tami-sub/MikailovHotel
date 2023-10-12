plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.mikailovhotel.feature.paid"
    compileSdk = 34

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
    implementation(HotelDependencies.AndroidX.coreKtx)
    implementation(HotelDependencies.AndroidX.appcompat)
    implementation(HotelDependencies.Material.material)
    implementation(HotelDependencies.AndroidX.constraintLayout)

    //livedata
    implementation(HotelDependencies.AndroidX.Lifecycle.livedata)

    //viewmodel
    implementation(HotelDependencies.AndroidX.Lifecycle.viewmodel)

    //navigation
    implementation(HotelDependencies.AndroidX.Navigation.navigationFragmentKtx)
    implementation(HotelDependencies.AndroidX.Navigation.navigationUiKtx)

    //dagger
    implementation(HotelDependencies.DI.dagger)
    implementation(HotelDependencies.DI.daggerAndroid)
    implementation(HotelDependencies.DI.daggerAndroidSupport)
    kapt(HotelDependencies.DI.daggerCompiler)
    kapt(HotelDependencies.DI.daggerAndroidProcessor)

    //modules
    implementation(project(":shared:core"))
    implementation(project(":component:navigation"))
}