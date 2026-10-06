// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
   if (args.size != 3) {
        println("Wrong number of arguments")
        exitProcess(1)
    }
var initial_temp_celcius = args[0]
val max_temp_celcius = args[1]
var temp_increment = args[2]


while (initial_temp_celcius.toFloat() <= max_temp_celcius.toFloat()) {
    val temp_farenheit = 
    println("%5.1f %6.1f".format(x, y))
    x += 2.5
}


}
