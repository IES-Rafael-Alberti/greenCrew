class CartonBingoAleatorio {
    private val filas = 3
    private val columnas = 5
    private val carton = Array(filas) { IntArray(columnas) }

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
                val numeroAleatorio = numerosDisponibles.random()
                carton[i][j] = numeroAleatorio
                numerosDisponibles.remove(numeroAleatorio)
            }
        }
    }

    fun mostrarCarton() {
        println("Cartón de Bingo:")
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                print("${carton[i][j]}\t")
            }
            println()
        }
    }
    // esto es lo nuevo añadido en el sprint 2
    fun comprobarNumero(numero: Int): Boolean {
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                if (carton[i][j] == numero) {
                    return true
                }
            }
        }
        return false
    }
    // esto es lo nuevo añadido en el sprint 2
    fun comprobarCartonRellenadoCorrectamente(): Boolean {
        return carton.all { fila -> fila.all { numero -> numero != 0 } }
    }


}

fun main() {
    val carton = CartonBingoAleatorio()
    carton.mostrarCarton()

   /* val resultado = carton.comprobarCartonRellenadoCorrectamente()

    if (resultado) {
        println("El cartón se ha rellenado correctamente.")
    } else {
        println("Hay celdas vacías en el cartón. Por favor, revísalo.")
    }
    */
}
