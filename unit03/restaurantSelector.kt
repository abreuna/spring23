fun main() {
    val joesGourmetBurgers = Restaurant("Joe's Gourmet Burgers", false, false, false)
    val mainStreetPizzaCompany = Restaurant("Main Street Pizza Company", true, false, true)
    val cornerCafe = Restaurant("Corner Cafe", true, true, true)
    val mamasFineItalian = Restaurant("Mama's Fine Italian", true, false, false)
    val theChefsKitchen = Restaurant("The Chef's Kitchen", true, true, true)

    val restaurants = listOf(joesGourmetBurgers, mainStreetPizzaCompany, cornerCafe, mamasFineItalian, theChefsKitchen)

    println("Is anyone in your party a vegetarian? ")
    val isVegetarian = readYesNo()
    println("Is anyone in your party a vegan? ")
    val isVegan = readYesNo()
    println("Is anyone in your party gluten-free? ")
    val isGlutenFree = readYesNo()

    val suitableRestaurants = restaurants.filter { restaurant ->
        (!isVegetarian || restaurant.isVegetarian) &&
        (!isVegan || restaurant.isVegan) &&
        (!isGlutenFree || restaurant.isGlutenFree)
    }

    if (suitableRestaurants.isEmpty()) {
        println("There are no restaurants that meet the dietary requirements.")
    } else {
        println("Here are your restaurant choices:")
        suitableRestaurants.forEach { restaurant ->
            println(restaurant.name)
        }
    }
}

data class Restaurant(
    val name: String,
    val isVegetarian: Boolean,
    val isVegan: Boolean,
    val isGlutenFree: Boolean
)

fun readYesNo(): Boolean {
    val input = readLine()?.toLowerCase() ?: ""
    return input == "yes" || input == "y"
}
