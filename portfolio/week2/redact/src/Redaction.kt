// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string


fun redact(document: String, text: String, char: Char = 'X'): String {
    val replacement = char.toString().repeat(text.length)
    return document.replace(text, replacement)
}
