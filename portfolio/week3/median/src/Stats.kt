// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {
    require(data.isNotEmpty()) { "Cannot compute the median of an empty list" }
    val sorted = data.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 1) {
        sorted[mid]
    } else {
        (sorted[mid - 1] + sorted[mid]) / 2
    }
}

fun displayStats(data: List<Float>) {
    println("Min:    ${data.min()}")
    println("Max:    ${data.max()}")
    println("Mean:   ${data.average()}")
    println("Median: ${median(data)}")
}
