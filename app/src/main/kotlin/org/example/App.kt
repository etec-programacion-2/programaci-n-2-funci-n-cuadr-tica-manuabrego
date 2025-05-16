package org.example
fun main() {
    val a = 3
    val b = 5
    val c = 9
    
    // Mostrar la función en ax² + bx + c y eso
    if (a == 0) {
        println("a no puede ser 0")
        return
    } else {
        println("Función cuadrática: f(x) = ${a}x² + ${b}x + $c")
    }
    
    // Calcular discriminante
    val discriminante = calcularDiscriminante(a, b, c)
    println("Discriminante: $discriminante")
    
    // Calcular y mostra raíces indicar el tipo
    val tipoRaices = calcularRaices(a, b, discriminante)
    println("Tipo de raíces: $tipoRaices")
    
    //  Mostrar valores función para un rango de valores de x
    println("\nValores de la función para diferentes valores de x:")
    generarTablaValores(a, b, c)
}

// Función calcula el discriminante
fun calcularDiscriminante(a: Int, b: Int, c: Int): Int {
    return b * b - 4 * a * c
}

// Función calcula las raíces según discriminante
fun calcularRaices(a: Int, b: Int, discriminante: Int): String {
    if (discriminante > 0) {
        // Calcula la raíz cuadrada del discriminante
        val raizDiscriminante = kotlin.math.sqrt(discriminante.toDouble())
        
        val x1 = (-b + raizDiscriminante) / (2 * a)
        val x2 = (-b - raizDiscriminante) / (2 * a)
        
        // Redondeamos a 2 decimales
        val x1Redondeado = (kotlin.math.round(x1 * 100) / 100.0)
        val x2Redondeado = (kotlin.math.round(x2 * 100) / 100.0)
        
        println("La función tiene dos raíces reales diferentes:")
        println("x1 = $x1Redondeado")
        println("x2 = $x2Redondeado")
        
        return "Dos raíces reales diferentes"
        
    } else if (discriminante == 0) {
        val x = -b / (2.0 * a)
        
        // Redondeamos a 2 decimales
        val xRedondeado = (kotlin.math.round(x * 100) / 100.0)
        
        println("La función tiene una raíz real doble:")
        println("x = $xRedondeado")
        
        return "Una raíz real doble"
        
    } else {//redondear y elevar me ayudo el claudio pq no tenia idea de esos metodos math sqrt y round
        val parteReal = -b / (2.0 * a)
        val parteImaginaria = kotlin.math.sqrt(-discriminante.toDouble()) / (2 * a)
        
        // redondeamos a 2 decimales
        val parteRealRedondeada = (kotlin.math.round(parteReal * 100) / 100.0)
        val parteImaginariaRedondeada = (kotlin.math.round(parteImaginaria * 100) / 100.0)
        
        println("La función no tiene raíces reales.")
        println("Raíces complejas:")
        println("x1 = $parteRealRedondeada + ${parteImaginariaRedondeada}i")
        println("x2 = $parteRealRedondeada - ${parteImaginariaRedondeada}i")
        
        return "No tiene raíces reales"
    }
}

// Función para mostrar la tabla de valores de la función, claude me lo mejoro para la facha
fun generarTablaValores(a: Int, b: Int, c: Int) {
    println("------------------------")
    println("x \t| f(x)")
    println("------------------------")
    for (x in -5..5) {
        val fx = a * x * x + b * x + c
        println("$x \t| $fx")
    }
    println("------------------------")
}