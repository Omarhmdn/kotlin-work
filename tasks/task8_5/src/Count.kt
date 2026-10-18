// Task 8.5: example of a higher-order function

fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (ch in this) {
        if (include(ch)) count++
    }
    return count
}
