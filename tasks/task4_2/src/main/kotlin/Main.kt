// Task 4.2: use of if and ranges

fun main() {
    // Add your code here


//user input
print("Choose your pizza (a-d): ")
val pizza_choice = readln()

//checking input length
if (pizza_choice in "a".."d"){
println("Order accepted")

}
//error print
else{
println("Please input a valid choice")

}

}
