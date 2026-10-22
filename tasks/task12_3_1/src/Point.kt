// Task 12.3.1: class with secondary constructors

class Point(var x: Double = 0.0 , var y: Double = 0.0){
      constructor(x: Int, y: Int): this(x.toDouble(), y.toDouble()) 

}

