fun main() {
    println("Population Growth Calculator")
    println("----------------------------")
    var startingNumber = 0
    var averageDailyIncrease = 0.0
    var numberOfDays = 0

    while (startingNumber < 2) {
        print("Enter the starting number of organisms (must be at least 2): ")
        startingNumber = readLine()?.toIntOrNull() ?: 0
    }

    while (averageDailyIncrease <= 0) {
        print("Enter the average daily population increase as a percentage (must be greater than 0): ")
        averageDailyIncrease = readLine()?.toDoubleOrNull() ?: 0.0
    }

    while (numberOfDays < 1) {
        print("Enter the number of days they will multiply (must be at least 1): ")
        numberOfDays = readLine()?.toIntOrNull() ?: 0
    }

   
    var population = startingNumber.toDouble()
    println("Starting population: $startingNumber")
    for (day in 1..numberOfDays) {
        population += population * (averageDailyIncrease / 100)
        println("Day $day: ${population.toInt()} organisms")
    }
}
