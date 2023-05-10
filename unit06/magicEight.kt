import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val responses = arrayOf(
        "I don’t think so",
        "Yes, of course!",
        "I’m not sure",
        "It's possible",
        "Definitely not",
        "Ask again later",
        "Outlook not so good",
        "My sources say no",
        "Signs point to yes",
        "Very doubtful"
    )

    var playAgain = true
    while (playAgain) {
        println("Ask a yes or no question:")
        scanner.nextLine() // Consume the newline character left by nextInt()

        val randomIndex = Random().nextInt(responses.size)
        val response = responses[randomIndex]
        println(response)

        println("Do you want to ask another question? (y/n)")
        val answer = scanner.nextLine()
        if (answer == "n") {
            playAgain = false
        }
    }
}
