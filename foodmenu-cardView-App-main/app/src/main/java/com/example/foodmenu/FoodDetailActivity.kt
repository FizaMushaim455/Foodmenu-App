package com.example.foodmenu

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * FoodDetailActivity — Detail screen for a single food item.
 *
 * Receives a FoodItem via Intent extras and displays its full
 * information: icon, name, category, price, description, and
 * ingredients list.
 *
 * The toolbar back arrow is enabled so the user can navigate
 * back to the main list easily.
 */
class FoodDetailActivity : AppCompatActivity() {

    companion object {
        /** Key used to pass/retrieve the FoodItem from Intent extras. */
        const val EXTRA_FOOD_ITEM = "extra_food_item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        // ── 1. Enable the back button in the action bar ──
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // ── 2. Retrieve the FoodItem passed from MainActivity ──
        @Suppress("DEPRECATION")
        val foodItem = intent.getSerializableExtra(EXTRA_FOOD_ITEM) as? FoodItem

        // If for some reason the data is missing, just close.
        if (foodItem == null) {
            finish()
            return
        }

        // ── 3. Set the action bar title to the food name ──
        supportActionBar?.title = foodItem.name

        // ── 4. Find views and populate them with data ──
        val detailIcon: ImageView = findViewById(R.id.detailFoodIcon)
        val detailName: TextView = findViewById(R.id.detailFoodName)
        val detailCategory: TextView = findViewById(R.id.detailFoodCategory)
        val detailPrice: TextView = findViewById(R.id.detailFoodPrice)
        val detailDescription: TextView = findViewById(R.id.detailFoodDescription)
        val detailIngredients: TextView = findViewById(R.id.detailFoodIngredients)

        detailIcon.setImageResource(foodItem.iconResId)
        detailName.text = foodItem.name
        detailCategory.text = foodItem.category
        detailPrice.text = foodItem.price
        detailDescription.text = foodItem.description

        // Join the ingredients list with bullet points for readability
        detailIngredients.text = foodItem.ingredients.joinToString(separator = "\n") { "• $it" }
    }

    /** Handle the toolbar back button press. */
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
