// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()
    db.load(CSV_FILENAME)

    while (true) {
        print("Name (blank to quit): ")
        val name = readln().trim()
        if (name.isEmpty()) break

        val number = db[name]
        if (number != null) {
            println("$name: $number")
        } else {
            addContact(db, name)
        }
    }
}

fun addContact(db: Database, name: String) {
    print("Not found. Phone number for $name: ")
    val number = readln().trim()
    if (number.isEmpty() || !number.all { it.isDigit() }) {
        println("Invalid number (digits only), not saved.")
        return
    }
    db[name] = number
    db.save(CSV_FILENAME)
    println("Saved.")

}
