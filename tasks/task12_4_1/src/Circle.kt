// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double){

      init {
      require(radius > 0) { "The radius must be greater than zero" }
      }

      area {
      val circleArea = PI * (radius * radius) 
      println(circleArea)
      }

      perimeter {
      val circlePerimeter = 2 * PI * radius
      println(circlePerimeter)
      }

      //contain(x: Point) {
      //}
      


}
