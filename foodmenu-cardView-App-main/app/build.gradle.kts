plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.foodmenu"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.foodmenu"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Core Android libraries
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Material Design Components (includes CardView styling)
    implementation("com.google.android.material:material:1.11.0")

    // CardView — the star of this demo
    implementation("androidx.cardview:cardview:1.0.0")

    // RecyclerView for the scrollable list
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // ConstraintLayout for flexible layouts
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
