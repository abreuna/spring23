import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101) // Generates a random number between 1 and 100
    var guess = 0 // Initialize guess variable to 0
    var numberOfGuesses = 0 // Initialize number of guesses to 0

    while (guess != randomNumber) {
        print("Guess a number between 1 and 100: ")
        guess = readLine()?.toIntOrNull() ?: continue // Read user input as integer or prompt again
        numberOfGuesses++

        when {
            guess < randomNumber -> println("Too low, try again.")
            guess > randomNumber -> println("Too high, try again.")
            else -> println("You guessed it! The number was $randomNumber. You made $numberOfGuesses guesses.")
        }
    }
}
