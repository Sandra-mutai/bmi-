fun main() {
    val bodyStats = BodyStats(
        height = 6.0,
        weight = 140.0
    )
    val bmi = bmiCalculator(bodyStats)
    println(bmi)
}
data class BodyStats(
    var height: Double,
    var weight: Double,
    var bmi: Double = 0.0,
    var weightStatus: String? = null
)
fun bmiCalculator(bodyStats: BodyStats): BodyStats {
    bodyStats.bmi = bodyStats.weight / bodyStats.height
    when (bodyStats.bmi) {
        in 0.0..19.0 -> {
            bodyStats.weightStatus = "underweight"
        }
        in 18.5..24.9 -> {
            bodyStats.weightStatus = "normal"
        }
        in 26.0..29.9 -> {
            bodyStats.weightStatus = "overweight"
        }
        else-> bodyStats.weightStatus = "obese"
    }
    return bodyStats
}

