import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val options = arrayOf("rock", "paper", "scissors")
    var playAgain = "y"
    
    while (playAgain == "y") {
        // Get computer's choice
        val computerChoice = options[Random().nextInt(options.size)]
        
        // Get user's choice
        println("Choose your weapon: Rock, Paper or Scissors")
        val userChoice = scanner.next().toLowerCase()
        
        // Display computer's choice
        println("Computer chooses $computerChoice")
        
        // Determine the winner
        val result = determineWinner(userChoice, computerChoice)
        
        // Display the result
        when {
            result == 0 -> println("It's a tie! Let's play again.")
            result == 1 -> println("You win!")
            result == 2 -> println("Computer wins!")
        }
        
        // Ask if the user wants to play again
        println("Do you want to play again? (y/n)")
        playAgain = scanner.next().toLowerCase()
    }
    
    println("Thanks for playing!")
}

fun determineWinner(userChoice: String, computerChoice: String): Int {
    if (userChoice == computerChoice) {
        return 0 // It's a tie
    } else if (userChoice == "rock" && computerChoice == "scissors"
            || userChoice == "scissors" && computerChoice == "paper"
            || userChoice == "paper" && computerChoice == "rock") {
        return 1 // User wins
    }
    
    return 2 // Computer wins
}
