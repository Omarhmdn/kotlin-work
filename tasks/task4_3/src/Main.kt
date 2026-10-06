// Task 4.3: grade calculation using a when expression

import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Wrong number of arguments")
        exitProcess(1)
    }


var module_mark = ((args[0].toFloat() + args[1].toFloat() + args[2].toFloat()) / 3).roundToInt()

val grade = when (module_mark){
    in 0..39 -> "Fail"
    in 40..69 -> "Pass"
    in 70..100 -> "Distinction"
    else -> println("enter a valid option")
}

println(grade)
println(module_mark)


}

