fun main() {
    // Prompt user to enter a number
    print("Enter a number within the range of 1 through 10: ")
    val number = readLine()?.toIntOrNull()

    // Check if number is within range
    if (number == null || number !in 1..10) {
        println("Error: Please enter a number within the range of 1 through 10.")
    } else {
        // Convert number to Roman numeral
        val romanNumeral = when (number) {
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            10 -> "X"
            else -> ""
        }

        // Display Roman numeral
        println("The Roman numeral version of $number is $romanNumeral.")
    }
}
