fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}

fun isPrime (number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2 until number) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }
    return true
}
fun main()
{
    
}
