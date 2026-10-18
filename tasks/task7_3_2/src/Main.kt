fun main() {
    // 7.3.1 part, now with a mutable list so it compiles
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println("${numbers.first()} ${numbers.last()}")

    numbers[0] = 1                  // failed to compile with listOf()
    println(numbers)

    // 7.3.2: each modification method, printing after every call
    numbers.add(7)                  // add to the end
    println("add(7):          $numbers")

    numbers.add(0, 4)               // insert at index 0
    println("add(0, 4):       $numbers")

    numbers.addAll(listOf(10, 11))
    println("addAll:          $numbers")

    numbers.remove(6)               // removes the VALUE 6, not index 6
    println("remove(6):       $numbers")

    numbers.removeAt(0)             // removes whatever is at index 0
    println("removeAt(0):     $numbers")

    numbers.removeAll(listOf(10, 11))
    println("removeAll(list): $numbers")

    numbers.removeAll { it % 2 == 0 }   // predicate version
    println("removeAll(even): $numbers")

    numbers.clear()
    println("clear():         $numbers")
}
