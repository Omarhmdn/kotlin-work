// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>){
    if (args.size != 1) {
        println("Wrong number of arguments")
        exitProcess(1)
    }
    val filePath = Path(args[0])
    var line_num = 0
    var current_max = 0
    var max_line_num = 0

    filePath.forEachLine {
        line_num += 1
	var num_of_char = it.count()
        println("$line_num, $num_of_char")
    if (num_of_char > current_max){
       max_line_num = line_num
       current_max = num_of_char
       }    
       }

println("line number = $max_line_num, number of characters = $current_max")    

}
