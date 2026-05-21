package com.example.foodmenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * FoodAdapter — Bridges the food data to the RecyclerView.
 *
 * KEY CONCEPTS demonstrated here:
 *   1. ViewHolder pattern — caches view references for performance
 *   2. onBindViewHolder — populates each card with data
 *   3. Click listener via a lambda — clean way to handle card taps
 *
 * @param foodList    The list of FoodItem objects to display
 * @param onItemClick Callback invoked when the user taps a card;
 *                    receives the clicked FoodItem
 */
class FoodAdapter(
    private val foodList: List<FoodItem>,
    private val onItemClick: (FoodItem) -> Unit
) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    /**
     * ViewHolder — Holds references to views inside one card.
     * RecyclerView recycles these so we don't inflate layouts repeatedly.
     */
    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodIcon: ImageView = itemView.findViewById(R.id.foodIcon)
        val foodName: TextView = itemView.findViewById(R.id.foodName)
        val foodCategory: TextView = itemView.findViewById(R.id.foodCategory)
        val foodPrice: TextView = itemView.findViewById(R.id.foodPrice)

        init {
            // Set the click listener on the entire card.
            // adapterPosition gives the current position even after items move.
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(foodList[position])
                }
            }
        }
    }

    /**
     * Called when RecyclerView needs a new ViewHolder.
     * We inflate our card layout (item_food_card.xml) here.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food_card, parent, false)
        return FoodViewHolder(view)
    }

    /**
     * Called to display data at a given position.
     * This is where we bind the FoodItem data to the card's views.
     */
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.foodIcon.setImageResource(food.iconResId)
        holder.foodName.text = food.name
        holder.foodCategory.text = food.category
        holder.foodPrice.text = food.price
    }

    /** Returns how many items the adapter holds. */
    override fun getItemCount(): Int = foodList.size
}
