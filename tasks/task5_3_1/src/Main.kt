// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size > 1) {
        println("Error: input number of sides of the die")
        println("Sides must be one of the following: 4, 6, 8, 10, 12, 20")
        exitProcess(1)
    }
     
    if (args.isEmpty()) {
       rollDie()

   } else{
     rollDie(args[0].toInt())
   
   }

}
