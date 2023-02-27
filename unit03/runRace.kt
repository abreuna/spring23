fun main() {
    // Ask for the names and race times of the three runners
    print("Enter the name of runner 1: ")
    val runner1Name = readLine()!!
    print("Enter the time it took for runner 1 to finish the race (in minutes): ")
    val runner1Time = readLine()!!.toInt()

    print("Enter the name of runner 2: ")
    val runner2Name = readLine()!!
    print("Enter the time it took for runner 2 to finish the race (in minutes): ")
    val runner2Time = readLine()!!.toInt()

    print("Enter the name of runner 3: ")
    val runner3Name = readLine()!!
    print("Enter the time it took for runner 3 to finish the race (in minutes): ")
    val runner3Time = readLine()!!.toInt()

    // Determine the order of finish and display the names of the runners in that order
    if (runner1Time < runner2Time && runner1Time < runner3Time) {
        println("$runner1Name finished first")
        if (runner2Time < runner3Time) {
            println("$runner2Name finished second")
            println("$runner3Name finished third")
        } else {
            println("$runner3Name finished second")
            println("$runner2Name finished third")
        }
    } else if (runner2Time < runner1Time && runner2Time < runner3Time) {
        println("$runner2Name finished first")
        if (runner1Time < runner3Time) {
            println("$runner1Name finished second")
            println("$runner3Name finished third")
        } else {
            println("$runner3Name finished second")
            println("$runner1Name finished third")
        }
    } else {
        println("$runner3Name finished first")
        if (runner1Time < runner2Time) {
            println("$runner1Name finished second")
            println("$runner2Name finished third")
        } else {
            println("$runner2Name finished second")
            println("$runner1Name finished third")
        }
    }
}
