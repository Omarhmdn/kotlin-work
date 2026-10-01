
// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
   val path = Path("test.txt")
   path.writeText("Writing some random test strings")
   path.appendText("Testing the second section")
   val fileContents = path.readText()
   println(fileContents)

}
