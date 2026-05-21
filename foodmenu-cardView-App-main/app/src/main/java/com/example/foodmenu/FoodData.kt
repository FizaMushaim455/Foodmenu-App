package com.example.foodmenu

/**
 * FoodData — Provides a static list of sample food items.
 *
 * In a real app you'd fetch this from an API or database.
 * Here we hard-code it so the demo works immediately.
 */
object FoodData {

    fun getSampleFoods(): List<FoodItem> = listOf(
        FoodItem(
            id = 1,
            name = "Margherita Pizza",
            description = "Classic Italian pizza with a thin, crispy crust topped with San Marzano tomato sauce, fresh mozzarella, and fragrant basil leaves. Simple yet unforgettable.",
            price = "$12.99",
            ingredients = listOf("Pizza dough", "Tomato sauce", "Fresh mozzarella", "Basil", "Olive oil", "Salt"),
            iconResId = R.drawable.ic_food_pizza,
            category = "Main Course"
        ),
        FoodItem(
            id = 2,
            name = "Caesar Salad",
            description = "Crisp romaine lettuce tossed with our house-made Caesar dressing, topped with crunchy garlic croutons and a generous shaving of Parmesan cheese.",
            price = "$9.49",
            ingredients = listOf("Romaine lettuce", "Caesar dressing", "Croutons", "Parmesan cheese", "Lemon juice", "Garlic"),
            iconResId = R.drawable.ic_food_salad,
            category = "Starter"
        ),
        FoodItem(
            id = 3,
            name = "Grilled Salmon",
            description = "Fresh Atlantic salmon fillet, perfectly grilled and served with steamed asparagus and a zesty lemon-butter sauce. A healthy and delicious choice.",
            price = "$18.99",
            ingredients = listOf("Salmon fillet", "Asparagus", "Lemon", "Butter", "Garlic", "Dill", "Salt", "Pepper"),
            iconResId = R.drawable.ic_food_fish,
            category = "Main Course"
        ),
        FoodItem(
            id = 4,
            name = "Chicken Biryani",
            description = "Aromatic basmati rice layered with tender spiced chicken, caramelized onions, and a blend of traditional spices. Served with cooling raita on the side.",
            price = "$14.99",
            ingredients = listOf("Basmati rice", "Chicken", "Onions", "Yogurt", "Saffron", "Cumin", "Cardamom", "Cinnamon", "Bay leaves"),
            iconResId = R.drawable.ic_food_rice,
            category = "Main Course"
        ),
        FoodItem(
            id = 5,
            name = "Beef Burger",
            description = "Juicy hand-pressed beef patty on a toasted brioche bun with melted cheddar cheese, fresh lettuce, tomato, pickles, and our signature house sauce.",
            price = "$11.49",
            ingredients = listOf("Beef patty", "Brioche bun", "Cheddar cheese", "Lettuce", "Tomato", "Pickles", "Onion", "House sauce"),
            iconResId = R.drawable.ic_food_burger,
            category = "Main Course"
        ),
        FoodItem(
            id = 6,
            name = "Chocolate Lava Cake",
            description = "Warm, rich chocolate cake with a molten center that flows out when you break through the crust. Served with a scoop of vanilla bean ice cream.",
            price = "$8.99",
            ingredients = listOf("Dark chocolate", "Butter", "Eggs", "Sugar", "Flour", "Vanilla extract"),
            iconResId = R.drawable.ic_food_cake,
            category = "Dessert"
        ),
        FoodItem(
            id = 7,
            name = "Mango Smoothie",
            description = "A refreshing tropical blend of ripe Alphonso mangoes, creamy yogurt, and a touch of honey. Perfect as a cool treat on a warm day.",
            price = "$5.99",
            ingredients = listOf("Mango", "Yogurt", "Honey", "Ice", "Milk"),
            iconResId = R.drawable.ic_food_drink,
            category = "Beverage"
        ),
        FoodItem(
            id = 8,
            name = "Garlic Bread",
            description = "Crusty French bread slathered with garlic-herb butter and toasted until golden. Crispy on the outside, soft on the inside — the perfect side dish.",
            price = "$4.99",
            ingredients = listOf("French bread", "Butter", "Garlic", "Parsley", "Salt"),
            iconResId = R.drawable.ic_food_bread,
            category = "Starter"
        )
    )
}
