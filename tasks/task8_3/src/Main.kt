// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()) {
       println("Usage: provide a CSV filename")
       exitProcess(1)
    }
    val data = fetchData(args[0])

    val coldest = data.minBy { it.second }
    val warmest = data.maxBy { it.second }
    println("Coldest: ${coldest.first} (${coldest.second})")
    println("Warmest: ${warmest.first} (${warmest.second})")

    // Step 3a
    println("Average: %.2f".format(averageTemp(data)))

    // Step 3b: replace the line above with this
    println("Average: %.2f".format(data.sumOf { it.second } / data.size))

}
