package com.example.foodmenu

import java.io.Serializable

/**
 * FoodItem — Data model representing a single food item.
 *
 * Implements Serializable so we can pass the whole object between
 * activities using Intent extras (simple approach for small data).
 *
 * @param id          Unique identifier for the food item
 * @param name        Display name shown on the card
 * @param description Short description of the dish
 * @param price       Price as a formatted string (e.g., "$12.99")
 * @param ingredients List of ingredients used in the dish
 * @param iconResId   Drawable resource ID for the food icon/thumbnail
 * @param category    Category label (e.g., "Main Course", "Dessert")
 */
data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val ingredients: List<String>,
    val iconResId: Int,
    val category: String
) : Serializable
