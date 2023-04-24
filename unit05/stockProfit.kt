fun main() {
    // Get input from user
    print("Enter the number of shares: ")
    val numShares = readLine()!!.toInt()

    print("Enter the purchase price per share: ")
    val purchasePrice = readLine()!!.toDouble()

    print("Enter the purchase commission paid: ")
    val purchaseCommission = readLine()!!.toDouble()

    print("Enter the sale price per share: ")
    val salePrice = readLine()!!.toDouble()

    print("Enter the sale commission paid: ")
    val saleCommission = readLine()!!.toDouble()

    // Calculate and display profit or loss
    val profitOrLoss = calculateProfitOrLoss(numShares, purchasePrice, purchaseCommission, salePrice, saleCommission)
    if (profitOrLoss >= 0) {
        println("You made a profit of $$profitOrLoss")
    } else {
        println("You incurred a loss of $${-profitOrLoss}")
    }
}
fun calculateProfitOrLoss(
    numShares: Int,
    purchasePrice: Double,
    purchaseCommission: Double,
    salePrice: Double,
    saleCommission: Double
): Double {
    val totalCost = numShares * purchasePrice + purchaseCommission
    val totalRevenue = numShares * salePrice - saleCommission
    return totalRevenue - totalCost
}
