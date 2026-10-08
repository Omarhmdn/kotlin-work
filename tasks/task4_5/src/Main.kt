// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Wrong number of arguments")
        exitProcess(1)
    }
    
    val  user_limit = args[0].toInt()
    var  sum = 0   

    for (i in 1..user_limit step 2 ){
        sum = sum + i
        println(i)
    }

    println("Sum: $sum")

    
   
}
