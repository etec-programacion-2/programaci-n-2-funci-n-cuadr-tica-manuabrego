package org.example
fun main() {
    val a = 3
    val b = 5
    val c = 9
    if (a == 0) {
        println("a no puede ser 0")
        return
    } else {
        println("Ecuación cuadrática: ${a}x² + ${b}x + $c = 0")
    }
    
    
    val discriminante = calcularDiscriminante(a, b, c)
    println("Discriminante: $discriminante")
    
    
    calcularRaices(a, b, discriminante)
    
    
    cuadratica(a, b, c)
}


fun calcularDiscriminante(a: Int, b: Int, c: Int): Int {
    return b * b - 4 * a * c
}


fun calcularRaices(a: Int, b: Int, discriminante: Int) {
    if (discriminante > 0) {
        // claude, para calcular la raiz cuadrada del discriminante
        val raizDiscriminante = kotlin.math.sqrt(discriminante.toDouble())
        
        val x1 = (-b + raizDiscriminante) / (2 * a)
        val x2 = (-b - raizDiscriminante) / (2 * a)
        
        // redondear fachero, claude
        val x1Redondeado = (kotlin.math.round(x1 * 100) / 100.0)
        val x2Redondeado = (kotlin.math.round(x2 * 100) / 100.0)
        
        println("Dos raíces reales:")
        println("x1 = $x1Redondeado")
        println("x2 = $x2Redondeado")
    } else if (discriminante == 0) {
        val x = -b / (2.0 * a)
        
        
        val xRedondeado = (kotlin.math.round(x * 100) / 100.0)
        
        println("Una raíz real (doble):")
        println("x = $xRedondeado")
    } else {
        val parteReal = -b / (2.0 * a)
        val parteImaginaria = kotlin.math.sqrt(-discriminante.toDouble()) / (2 * a)
        
        
        val parteRealRedondeada = (kotlin.math.round(parteReal * 100) / 100.0)
        val parteImaginariaRedondeada = (kotlin.math.round(parteImaginaria * 100) / 100.0)
        
        println("Raíces complejas:")
        println("x1 = $parteRealRedondeada + ${parteImaginariaRedondeada}i")
        println("x2 = $parteRealRedondeada - ${parteImaginariaRedondeada}i")
    }
}

// muestra tablita muy fachera, me ayudo el claudio con \t y \n para la facha
fun cuadratica(a: Int, b: Int, c: Int) {
    println("\nTabla de valores x, f(x):")
    println("------------------------")
    println("x \t| f(x)")
    println("--------------")
    for (x in -5..5) {
        val fx = a * x * x + b * x + c
        println("$x \t| $fx")
    }
}