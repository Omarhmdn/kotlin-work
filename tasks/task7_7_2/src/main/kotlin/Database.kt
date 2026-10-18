// Task 7.7.2: database-handling functions

import kotlin.io.path.exists
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    // and insert them as keys and values into the map
    val path = Path(filename)
    if (!path.exists()) return
    path.forEachLine { line ->
        if (line.isNotBlank()) {
            val (name, number) = line.split(",", limit = 2)
            this[name.trim()] = number.trim()
        }
    }
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
    Path(filename).writer().use { out ->
        for ((name, number) in this) {
            out.write("$name,$number\n")
        }
    }
}

