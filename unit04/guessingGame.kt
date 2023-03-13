import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101) // Generate a random number between 1 and 100
    var guess: Int? = null // Initialize the guess variable as null
    
    while (guess != randomNumber) {
        print("Guess the number (between 1 and 100): ")
        guess = readLine()?.toIntOrNull() // Read the user's input as an integer
        
        if (guess == null) {
            println("Invalid input, please enter a number.")
        } else if (guess < randomNumber) {
            println("Too low, try again.")
        } else if (guess > randomNumber) {
            println("Too high, try again.")
        } else {
            println("Congratulations, you guessed the number!")
        }
    }
}
