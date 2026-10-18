// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Hello World 2026, Kotlin Is Fun!"

    println(text.howMany { it.isUpperCase() })
    println(text.howMany { it.isDigit() })
    println(text.howMany { it == ' ' })
    println(text.howMany { it.lowercase() in "aeiou" })

    // optional: built-in count() should match
    println(text.count { it.isUpperCase() })
    println(text.count { it.lowercase() in "aeiou" })
}
