// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 1) {
        println("Error: input radius")
        exitProcess(1)
    }    

    val circle_area = circleArea(args[0].toDouble())
    val circle_perimeter = circlePerimeter(args[0].toDouble())

    println("Area = %.4f".format(circle_area))
    println("Perimeter = %.4f".format(circle_perimeter))
}
