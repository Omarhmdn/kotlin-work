// Task 5.4.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error")
        exitProcess(1)
    }

   if (args[0].isTooLong) {
    println("Too Long")
}
}
