// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: provide the name of a data file")
        exitProcess(1)
    }
    displayStats(readData(args[0]))
}
