fun main() {
    print("Enter the object's mass (in kilograms): ")
    val mass = readLine()?.toDoubleOrNull()
    if (mass == null) {
        println("Invalid input. Please enter a valid number.")
    } else {
        val weight = mass * 9.8
        println("The object's weight is $weight Newtons.")
        when {
            weight > 1000 -> println("The object is too heavy.")
            weight < 10 -> println("The object is too light.")
        }
    }
}
