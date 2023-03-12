fun main() {
    print("Enter a string: ")
    val inputString = readLine()

    print("Enter a character: ")
    val inputChar = readLine()?.get(0) ?: return

    val charCount = inputString?.count { it == inputChar } ?: return

    println("The character '$inputChar' appears $charCount times in the string '$inputString'.")
}
