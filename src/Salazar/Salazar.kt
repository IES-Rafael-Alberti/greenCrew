
import kotlin.random.Random

class CartonBingoAleatorio {
    private val filas = 3
    private val columnas = 5
    private val carton = Array(filas) { IntArray(columnas) }

    init {
        generarCartonBingoAleatorio()
    }

    private fun generarCartonBingoAleatorio() {
        for (col in 0 until columnas) {
            val numerosColumna = mutableListOf<Int>()

            val rangoInicial = col * 10 + 1
            val rangoFinal = (col + 1) * 10

            while (numerosColumna.size < filas) {
                val numeroAleatorio = (rangoInicial..rangoFinal).random()
                if (!numerosColumna.contains(numeroAleatorio)) {
                    numerosColumna.add(numeroAleatorio)
                }
            }

            numerosColumna.sort()
            for (fila in 0 until filas) {
                carton[fila][col] = numerosColumna[fila]
            }
        }
    }

    fun imprimirCarton() {
        for (fila in 0 until filas) {
            for (col in 0 until columnas) {
                print("${carton[fila][col]}\t")
            }
            println()
        }
    }
}

fun main() {
    val cartonBingo = CartonBingoAleatorio()
    cartonBingo.imprimirCarton()
}