// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun triangleArea(t: Triangle): Double {
    val (a, b, c) = t
    val semiperimeter = 0.5 * (a + b + c)
    return kotlin.math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c))
}

fun isValidTriangle(t: Triangle): Boolean {
    val (a, b, c) = t
    return a < b + c && b < a + c && c < a + b
}

