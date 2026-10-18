// Task 9.6: application to compute dataset variance

import java.io.IOException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.isEmpty()) {
        println("Usage: ./kotlin run <datafile>")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        val v = variance(data)
        println("Dataset size: ${data.size}")
        println("Variance: %.5f".format(v))
    }
    catch (e: NumberFormatException) {
        println("Error: file contains non-numeric data (${e.message})")
        exitProcess(2)
    }
    catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
        exitProcess(3)
    }
    catch (e: IOException) {
        println("Error: cannot read file ${e.message}")
        exitProcess(4)
    }
}
