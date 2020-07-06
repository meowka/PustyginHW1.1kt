fun main() {
    val index = bodyMassIndex(100.5, 1.56)
    val verdict = verdict(index)
    println(verdict)
}

fun bodyMassIndex(
    m: Double,
    h: Double
): Double {
    return m / (h * h)
}

fun verdict(d: Double): String {
    return when (d) {
        in 0..16-> "Выраженный дефицит массы тела"
        in 16.1..18.4-> "Недостаточная (дефицит) масса тела"
        in 18.5..24.9 -> "Норма"
        in 25..30 -> "Избыточная масса тела (предожирение)"
        in 30.1..34.9 -> "Ожирение"
        in 35..40 -> "Ожирение резкое"

        else -> "Очень резкое ожирение"
    }
}

