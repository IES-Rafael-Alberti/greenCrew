package org.example
import kotlin.random.Random

// Clase CartonBingoAleatorio
class CartonBingoAleatorio {
    private var filas = 3
    private var columnas = 5
    private var carton = Array(filas) { IntArray(columnas) }
    private val numerosTachados = mutableSetOf<Int>()

    init {
        generarCartonBingoAleatorio()
    }

    private fun generarCartonBingoAleatorio() {
        val numerosDisponibles = mutableListOf<Int>()

        for (i in 1..90) {
            numerosDisponibles.add(i)
        }

        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                var numeroAleatorio = numerosDisponibles.random()
                carton[i][j] = numeroAleatorio
                numerosDisponibles.remove(numeroAleatorio)
            }
        }
    }


    fun mostrarCarton() {
        println("Cartón de Bingo:")
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                val numero = carton[i][j]
                val contenidoCelda = if (numerosTachados.contains(numero)) "$numero X" else "$numero"
                print("$contenidoCelda\t")
            }
            println()
        }
    }
    // segundo sprint
    fun marcarNumeroTachado(numero: Int) {
        numerosTachados.add(numero)
    }

    //segundo sprint
    fun verificarNumeroEnCarton(numero: Int): Boolean {
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                if (carton[i][j] == numero) {
                    marcarNumeroTachado(numero)
                    return true
                }
            }
        }
        return false
    }

}
