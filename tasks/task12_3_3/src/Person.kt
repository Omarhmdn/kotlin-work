// Task 12.3.2: Person class with secondary constructor
// Task 12.3.3: Zero length name
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    init {
       require(name.isNotBlank()) { "Name cannot be blank" }
    }
}


