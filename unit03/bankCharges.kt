fun main() {
    val baseFee = 10.0
    val lessThan20CheckFee = 0.10
    val between20And39CheckFee = 0.08
    val between40And59CheckFee = 0.06
    val over60CheckFee = 0.04
    
    print("Enter the number of checks written this month: ")
    val numberOfChecks = readLine()?.toInt() ?: 0
    
    var checkFee = 0.0
    when {
        numberOfChecks < 20 -> checkFee = numberOfChecks * lessThan20CheckFee
        numberOfChecks in 20..39 -> checkFee = numberOfChecks * between20And39CheckFee
        numberOfChecks in 40..59 -> checkFee = numberOfChecks * between40And59CheckFee
        numberOfChecks >= 60 -> checkFee = numberOfChecks * over60CheckFee
    }
    
    val totalFee = baseFee + checkFee
    println("Your bank’s service fees for the month is $$totalFee")
}
