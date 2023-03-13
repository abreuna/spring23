fun main() {
    val stores = arrayOf("Store 1", "Store 2", "Store 3", "Store 4", "Store 5")
    val sales = IntArray(stores.size)

    for (i in stores.indices) {
        print("Enter today's sales for ${stores[i]}: $")
        sales[i] = readLine()?.toInt() ?: 0
    }

    for (i in stores.indices) {
        // Display the store name
        print("${stores[i]}: ")

        val asterisks = sales[i] / 100
        for (j in 1..asterisks) {
            print("*")
        }
        println()
    }
}
