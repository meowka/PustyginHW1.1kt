fun main() {
    val amount = 200
    val total = 51_000
    val result = calculateFee(amount, total)
    println(result)
}

fun calculateFee(
    amount: Int,
    total: Int,
    exclusive: Boolean = false
): Int {
    return if (!exclusive) {
        when (total) {
            in 0..1_000 -> amount * 30 / 100
            in 1_001..10_000 -> amount * 25 / 100
            in 10_001..50_000 -> amount * 20 / 100
            else -> amount * 15 / 100
        }
    } else {
        when (total) {
            in 0..1_000 -> amount * 25 / 100
            in 1_001..10_000 -> amount * 20 / 100
            in 10_001..50_000 -> amount * 15 / 100
            else -> amount * 10 / 100
        }
    }
}