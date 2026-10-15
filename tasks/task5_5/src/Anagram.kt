// Task 5.5: anagramOf() function extension
infix fun String.anagramOf(str: String) = this.lowercase().toList().sorted() == str.lowercase().toList().sorted()
