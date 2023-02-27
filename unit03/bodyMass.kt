fun main() {
    print("Enter your weight in pounds: ")
    val weight = readLine()?.toDoubleOrNull()
    if (weight == null || weight <= 0) {
        println("Invalid weight input.")
        return
    }

    print("Enter your height in inches: ")
    val height = readLine()?.toDoubleOrNull()
    if (height == null || height <= 0) {
        println("Invalid height input.")
        return
    }

    val bmi = weight * 703 / (height * height)
    println("Your BMI is $bmi")

    when {
        bmi < 18.5 -> println("You are underweight.")
        bmi <= 25.0 -> println("You have an optimal weight.")
        else -> println("You are overweight.")
    }
}





