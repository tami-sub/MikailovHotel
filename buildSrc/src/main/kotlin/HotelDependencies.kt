object HotelDependencies {

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.12.0"
        const val appcompat = "androidx.appcompat:appcompat:1.6.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"

        object Lifecycle {
            private const val version = "2.6.2"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        }

        object Navigation {
            private const val version = "2.5.3"
            const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object JUnit {
            const val junit = "junit:junit:4.13.2"
            const val junitExt = "androidx.test.ext:junit:1.1.5"
            const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
        }
    }

    object Material {
        const val material = "com.google.android.material:material:1.10.0"
    }

    object DI {
        private const val version = "2.44"
        const val dagger = "com.google.dagger:dagger:$version"
        const val daggerAndroid = "com.google.dagger:dagger-android:$version"
        const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$version"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$version"
        const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:$version"
    }

    object SwipeToRefresh {
        const val swipeToRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
    }

    object AdapterDelegates {
        private const val version = "4.3.2"
        const val adapterDelegates = "com.hannesdorfmann:adapterdelegates4-kotlin-dsl:$version"
        const val adapterdelegatesViewBinding =
            "com.hannesdorfmann:adapterdelegates4-kotlin-dsl-viewbinding:$version"
    }

    object ImageSlider {
        const val imageSlider = "com.github.denzcoskun:ImageSlideshow:0.1.2"
    }
}