> **Submitted by:** Fiza Mushaim (2023-ag-9944)  
> **Submitted to:** Mam Wajeeha  
> **Course:** SE-512  
> **Program:** BS(SE) M1 6th Semester

# 🍕 FoodMenu — Android RecyclerView & CardView Demo

A clean and modern Android application built with Kotlin that showcases the implementation of **RecyclerView**, **Material CardView**, item click handling, and activity navigation.

This project is ideal for beginners learning Android UI development and RecyclerView fundamentals.

---

## ✨ Features

- Modern food menu interface using Material Design
- RecyclerView with custom CardView items
- Detailed food information screen
- Smooth navigation between activities
- Toolbar back navigation support
- Simple and beginner-friendly Kotlin codebase

---

## 📱 App Overview

### Main Screen
Displays a scrollable list of food items including:
- Food image/icon
- Name
- Category
- Price

### Detail Screen
When a food card is tapped, the app opens a detailed screen showing:
- Full food description
- Ingredients
- Price information

---

## 🛠 Tech Stack

- **Language:** Kotlin
- **UI Components:** RecyclerView, MaterialCardView
- **Architecture:** Activity-based structure
- **Design:** Material Design 3

---

## 🚀 Getting Started

### Prerequisites

Before running the project, make sure you have:

- Android Studio Hedgehog (2023.1+) or newer
- JDK 17
- Android Emulator or Physical Device
- Minimum Android API 24+

---

## ▶️ Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/foodmenu-cardView-App.git
cd foodmenu-cardView-App
```

### 2. Open in Android Studio

1. Launch **Android Studio**
2. Select **File** → **Open**
3. Navigate to the cloned project folder and open it
4. Android Studio will automatically load the Gradle dependencies

### 3. Build the Project

```bash
# Using Gradle wrapper (recommended)
./gradlew build
```

Or in Android Studio:
- Select **Build** → **Make Project** (or press Ctrl+F9)

### 4. Run the App

#### Option A: Using Android Studio
1. Select an emulator or connect a physical device
2. Click **Run** → **Run 'app'** (or press Shift+F10)

#### Option B: Using Command Line
```bash
./gradlew installDebug
adb shell am start -n com.example.foodmenu/.MainActivity
```

---

## 📁 Project Structure

```
foodmenu-cardView-App/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/foodmenu/
│   │   │   │   ├── MainActivity.kt          # Main screen with RecyclerView
│   │   │   │   ├── DetailActivity.kt        # Detail screen
│   │   │   │   ├── FoodAdapter.kt           # RecyclerView adapter
│   │   │   │   └── FoodItem.kt              # Data model
│   │   │   ├── res/
│   │   │   │   ├── layout/                  # XML layouts
│   │   │   │   ├── drawable/                # Icons and images
│   │   │   │   └── values/                  # Colors, strings, styles
│   │   │   └── AndroidManifest.xml
│   │   └── test/                             # Unit tests
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/                                   # Gradle wrapper
├── build.gradle.kts
└── README.md
```

---

## 💻 How to Use

### Viewing Food Items
1. Launch the app
2. Browse through the food menu displayed in a scrollable list
3. Each card shows:
   - Food image
   - Name
   - Category (e.g., Appetizer, Main Course, Dessert)
   - Price

### Viewing Food Details
1. Tap on any food card
2. The detail screen will display:
   - Complete food description
   - Ingredients list
   - Price information
3. Use the back button to return to the main menu

---

## 🎯 Key Components

### RecyclerView
- Efficiently displays a scrollable list of food items
- Uses ViewHolder pattern for optimal performance
- Smooth scrolling with hundreds of items

### CardView
- Modern Material Design cards
- Elevated appearance with shadows
- Responsive to touch interactions
- Clean UI with rounded corners

### Adapter
- Custom `FoodAdapter` class handles:
  - Data binding to RecyclerView
  - Click listeners for item selection
  - ViewHolder management

---

## 🔧 Technologies & Dependencies

- **Kotlin:** 1.9.0+
- **Gradle:** 8.0+
- **AndroidX:** Latest stable versions
- **Material Components:** 1.9.0+
- **Minimum SDK:** 24
- **Target SDK:** 34

---

## 📸 Screenshots

*Add screenshots of your app here:*
- Main screen with food menu
- Detail screen showing food information

---

## 🐛 Troubleshooting

### Build Issues
**Problem:** Gradle sync fails
- **Solution:** 
  - Update Android Studio to the latest version
  - Check your internet connection
  - Try: **File** → **Invalidate Caches** → **Restart**

**Problem:** Emulator won't start
- **Solution:**
  - Ensure hardware virtualization is enabled in BIOS
  - Try creating a new AVD with recommended settings
  - Check available disk space

### Runtime Issues
**Problem:** App crashes on startup
- **Solution:**
  - Check logcat for errors: **View** → **Tool Windows** → **Logcat**
  - Verify minimum SDK version matches device
  - Check AndroidManifest.xml permissions

---

## 📝 Learning Resources

- [Android RecyclerView Documentation](https://developer.android.com/guide/topics/ui/layout/recyclerview)
- [Material Design CardView](https://developer.android.com/guide/topics/ui/layout/cardview)
- [Kotlin for Android](https://developer.android.com/kotlin)
- [Android Architecture Best Practices](https://developer.android.com/topic/architecture)

---

## 📄 License

This project is provided for educational purposes as part of the SE-512 course.

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit issues and enhancement requests.

### Steps to Contribute
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## ❓ FAQ

**Q: Can I use this project for my own learning?**  
A: Yes! This project is designed as an educational resource.

**Q: How do I modify the food menu items?**  
A: Edit the `FoodItem` data or load from a data source/API in the MainActivity.

**Q: Is this compatible with older Android versions?**  
A: The minimum SDK is 24. For earlier versions, some Material Design features may not work.

---

## 📧 Contact & Support

For questions or support regarding this project:
- **Created by:** Fiza Mushaim
- **Email:** [Your Email]
- **GitHub:** [Your GitHub Profile]

---

**Happy Coding! 🚀**