// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: input two words")
        exitProcess(1)
    }

    val isAnagram = anagrams(args[0],args[1])
    println(isAnagram)
}

