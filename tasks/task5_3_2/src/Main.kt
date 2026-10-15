// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size > 2) {
        println("Error: input number of sides of the die")
        println("Sides must be one of the following: 4, 6, 8, 10, 12, 20")
        exitProcess(1)
    }

    if (args.isEmpty()) {
       rollDice()

    }else if(args[0].isEmpty()) {
       rollDice(NULL, args[1].toInt())     

    }else if(args[1].isEmpty()) {
       rollDice(args[0].toInt(),NULL)
     
    } else{
     rollDice(args[0].toInt(), args[1].toInt())

   }

}

