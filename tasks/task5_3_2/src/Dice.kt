// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, rolls: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides $rolls time(s)...")
    
    var result = 0

    repeat(rolls){
        val roll = Random.nextInt(1, sides + 1)
         result += roll
        } 
        println("You rolled a total of $result") 
    }
    else {
	println("Error: cannot have a $sides-sided die")
    }
}
