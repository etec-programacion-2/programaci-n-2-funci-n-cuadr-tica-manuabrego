package org.example
fun main() {
    val a = 3
    val b = 5
    val c = 9

    if (a == 0) {
        println("a no puede ser 0")
        return
    } else {
        println("Ecuación cuadrática: ${a}x² + ${b}x + $c = 0")}
    
        
        
    }
fun cuadrática(a: Int, b: Int, c: Int){
    println("Tabla de valores x, f(x) :")
    println("------------------------")
    println("x \t| f(x)")
    println("--------------")

    
    for (x in -5..5) {
        val fx = a * x * x + b * x + c  
        println("$x \t| $fx")
    }
} 