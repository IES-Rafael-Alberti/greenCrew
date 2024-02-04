package org.example
import kotlin.random.Random

class VerificarLinea {
    private val filas = 3
    private val columnas = 9

    fun hayLinea(numerosGenerados: List<Int>): Pair<Boolean, Int> {
        for (fila in 0 until filas) {
            var contador = 0
            for (columna in 0 until columnas) {
                val numero = fila * columnas + columna + 1
                if (numerosGenerados.contains(numero)) {
                    contador++
                }
            }
            if (contador == columnas) {
                return Pair(true, fila + 1)  // Se suma 1 para que la fila sea 1-indexed
            }
        }

        return Pair(false, -1)
    }
}

class Bombo(private val bombo: MutableList<Int> = (1..90).toMutableList()) {
    private val numerosGenerados: MutableList<Int> = mutableListOf()
    private var lineaCantada = false
    private var bingoCantado = false

    fun jugar() {
        val verificador = VerificarLinea()
        // variables para rastrear si ya se ha cantado línea


        while (bombo.isNotEmpty() && !bingoCantado) {
            val numero = generarNumeroAleatorio()
            numerosGenerados.add(numero)
            println("Número generado: $numero")

            // Verifica si se ha cantado linea
            val (hayLinea, fila) = verificador.hayLinea(numerosGenerados)  // Ajusta según tus necesidades

            if (hayLinea && !lineaCantada) {
                println("¡Línea en la fila $fila!")
                lineaCantada = true  // Actualiza el estado de líneaCantada
            }

            // Espera 2 segundos antes de generar el próximo número
            Thread.sleep(200)
        }

        // Verifica si se ha cantado bingo
        if (verificarBingo(numerosGenerados)) {
            bingoCantado = true
            println("¡Bingo!")
        } else {
            println("No hay bingo")
        }

        // Imprime la lista de números generados
        println("Números generados: $numerosGenerados")
    }

    private fun generarNumeroAleatorio(): Int {
        if (bombo.isEmpty()) {
            throw IllegalStateException("Bombo vacío, todos los números han sido generados.")
        }

        val indiceAleatorio = Random.nextInt(bombo.size)
        val numero = bombo.removeAt(indiceAleatorio)

        return numero
    }

    // Verifica si se ha cantado bingo
    private fun verificarBingo(numerosGenerados: List<Int>): Boolean {
        val todosLosNumerosGenerados = numerosGenerados.toSet()
        return todosLosNumerosGenerados.size == 90
    }
}

fun main() {
    val simulador = Bombo()
    simulador.jugar()
}

