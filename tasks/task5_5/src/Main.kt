// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: input two words")
        exitProcess(1)
    }

    if (args[0] anagramOf args[1]) {
        println("${args[0]} and ${args[1]} are anagrams!")
        }

}

