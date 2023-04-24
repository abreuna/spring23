fun main() {
    println(fibonacci(1))  // = 1
    println(fibonacci(2))  // = 1
    println(fibonacci(3))  // = 2
    println(fibonacci(4))  // = 3
    println(fibonacci(5))  // = 5
    println(fibonacci(6))  // = 8
    println(fibonacci(7))  // = 13
    println(fibonacci(10)) // = 55
}
fun fibonacci(number: Int): Int {
    if (number == 1 || number == 2) {
        return 1
    } else {
        var prev1 = 1
        var prev2 = 1
        var current = 0
        for (i in 3..number) {
            current = prev1 + prev2
            prev2 = prev1
            prev1 = current
        }
        return current
    }
}
