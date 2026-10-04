// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    var side_1 = args[0].toFloat()
    var side_2 = args[1].toFloat()
    var side_3 = args[2].toFloat()
    var semiperimeter = 0.5 * (side_1 + side_2 + side_3)

    val Area = sqrt((semiperimeter * (semiperimeter - side_1) * (semiperimeter - side_2) * (semiperimeter - side_3)))
    println("Area = ${"%.5f".format(Area)}")
}
