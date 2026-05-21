# 🍕 FoodMenu — Android CardView + RecyclerView Demo

A minimal, polished Android app (Kotlin) that demonstrates **CardView inside RecyclerView** with click handling and screen-to-screen data passing.

---

## What the App Does

- **Main screen** — A vertically scrollable list of food cards. Each card shows the food's icon, name, category, and price.
- **Detail screen** — Tap any card to navigate to a detail page showing the full description, price, and ingredients list.
- **Back navigation** — The detail screen has a toolbar back arrow to return to the list.

---

## Project Structure

```
app/src/main/
├── java/com/example/foodmenu/
│   ├── FoodItem.kt          # Data model (Serializable)
│   ├── FoodData.kt           # Static sample data provider
│   ├── FoodAdapter.kt        # RecyclerView.Adapter with click listener
│   ├── MainActivity.kt       # Main screen — sets up RecyclerView
│   └── FoodDetailActivity.kt # Detail screen — shows full food info
│
├── res/layout/
│   ├── activity_main.xml     # RecyclerView container
│   ├── item_food_card.xml    # CardView layout for each list item
│   └── activity_food_detail.xml # Detail screen layout
│
├── res/drawable/
│   ├── ic_food_pizza.xml     # Vector icon drawables for each food
│   ├── ic_food_salad.xml
│   ├── ic_food_fish.xml
│   ├── ic_food_rice.xml
│   ├── ic_food_burger.xml
│   ├── ic_food_cake.xml
│   ├── ic_food_drink.xml
│   ├── ic_food_bread.xml
│   └── bg_category_badge.xml # Rounded pill background shape
│
├── res/values/
│   ├── colors.xml            # App color palette
│   ├── strings.xml           # String resources
│   └── themes.xml            # Material theme definition
│
└── AndroidManifest.xml       # Activity declarations
```

---

## How to Set Up, Build & Run

### Prerequisites
- **Android Studio** Hedgehog (2023.1) or newer
- **JDK 17** (bundled with Android Studio)
- An Android emulator or physical device (API 24+ / Android 7.0+)

### Step-by-Step

1. **Download / unzip** this `FoodMenu` folder to your computer.

2. **Open in Android Studio**:
   - Launch Android Studio
   - Click **File → Open** (or "Open" on the welcome screen)
   - Navigate to the `FoodMenu` folder and click **OK**
   - Wait for Gradle sync to complete (you'll see progress in the bottom bar)

3. **If Gradle sync fails** with a "Gradle version" error:
   - Android Studio may offer to update Gradle — click **OK / Update**
   - Or go to **File → Project Structure → Project** and set Gradle version to your installed one

4. **Select a run target**:
   - **Emulator**: Go to **Tools → Device Manager → Create Device** and pick a Pixel phone with API 34
   - **Physical device**: Enable Developer Options & USB Debugging on your phone, then connect via USB

5. **Run the app**:
   - Click the green **Run ▶** button in the toolbar (or press `Shift + F10`)
   - Select your emulator or connected device
   - The app builds and launches automatically

6. **Use the app**:
   - Scroll through the list of food cards
   - Tap any card to see its details
   - Press the back arrow to return to the list

---

## Key Concepts Demonstrated

| Concept | Where to Look |
|---|---|
| **CardView** with rounded corners & elevation | `item_food_card.xml` — `MaterialCardView` attributes |
| **RecyclerView** setup | `MainActivity.kt` — `LinearLayoutManager` + adapter |
| **ViewHolder pattern** | `FoodAdapter.kt` — inner class `FoodViewHolder` |
| **Click handling** on RecyclerView items | `FoodAdapter.kt` — lambda callback `onItemClick` |
| **Passing data between Activities** | `MainActivity.kt` → `Intent.putExtra()` → `FoodDetailActivity.kt` |
| **Serializable data model** | `FoodItem.kt` — implements `Serializable` |
| **Vector drawable icons** | `res/drawable/ic_food_*.xml` |
| **Material Design theming** | `themes.xml` + `colors.xml` |

---

## How to Modify

- **Add a new food item**: Add a `FoodItem(...)` entry in `FoodData.kt` and create a matching icon drawable.
- **Change colors**: Edit `res/values/colors.xml`.
- **Change card appearance**: Edit `item_food_card.xml` — adjust `cardCornerRadius`, `cardElevation`, padding, etc.
- **Use real images**: Replace the `ImageView` + drawable approach with an image-loading library like **Coil** or **Glide** and use URLs instead of resource IDs.

---

## Minimum API & Dependencies

- **minSdk**: 24 (Android 7.0)
- **targetSdk**: 34 (Android 14)
- **Kotlin**: 1.9.22
- **Material Components**: 1.11.0
- **CardView**: 1.0.0
- **RecyclerView**: 1.3.2

---

Happy coding! 🎉
