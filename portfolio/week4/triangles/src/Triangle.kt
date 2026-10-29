// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt


class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){

    fun isValidTriangle(): Boolean {
        return sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB
    }
	
    init {
       require(isValidTriangle()) {"Input a valid triangle"}

    }

    val semiPerimeter get() = 0.5 * (sideA + sideB + sideC) 

    val perimeter get() = sideA + sideB + sideC
       
    val area get() = kotlin.math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"

}

