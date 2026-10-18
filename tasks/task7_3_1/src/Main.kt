// Task 7.3.1: list element access

fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)            // [9, 3, 6, 2, 8, 5]

    println(numbers[0])         // Step 1 → 9

    println(numbers.slice(2..4)) // Step 3 → [6, 2, 8]

    println(numbers.first())    // Step 4 → 9
    println(numbers.last())     // Step 4 → 5

    numbers.add(1)              // Step 6 → compile error
}
