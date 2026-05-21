package com.example.foodmenu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * MainActivity — The main screen of the app.
 *
 * Displays a vertically scrolling list of food cards using RecyclerView.
 * When the user taps a card, we launch FoodDetailActivity and pass
 * the selected FoodItem as a Serializable extra.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ── 1. Get the RecyclerView from the layout ──
        val recyclerView: RecyclerView = findViewById(R.id.foodRecyclerView)

        // ── 2. Load sample data ──
        val foodList = FoodData.getSampleFoods()

        // ── 3. Create the adapter with a click callback ──
        val adapter = FoodAdapter(foodList) { selectedFood ->
            // When a card is tapped, open the detail screen.
            // We pass the FoodItem object via Intent extras.
            val intent = Intent(this, FoodDetailActivity::class.java)
            intent.putExtra(FoodDetailActivity.EXTRA_FOOD_ITEM, selectedFood)
            startActivity(intent)
        }

        // ── 4. Configure the RecyclerView ──
        // LinearLayoutManager arranges cards in a vertical list (the default).
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Optional: improve performance when item sizes are fixed
        recyclerView.setHasFixedSize(true)
    }
}
