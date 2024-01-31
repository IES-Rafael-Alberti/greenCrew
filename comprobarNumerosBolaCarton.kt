
// Clase bombo de prueba
/*class Bombo {
    private val bolasDisponibles = (1..90).toMutableList()

    fun sacarBola(): Int? {
        return if (bolasDisponibles.isNotEmpty()) {
            bolasDisponibles.shuffle()
            bolasDisponibles.removeAt(0)
        } else {
            null
        }
    }
}*/
// esto es lo que hay que meter en el sprint 2
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
        for (fila in carton) {
            for (elemento in fila) {
                if (elemento == numero) {
                    return true
                }
            }
        }
        return false
    }

    fun comprobarCartonRellenadoCorrectamente(): Boolean {
        for (fila in carton) {
            for (elemento in fila) {
                if (elemento == 0) {
                    return false
                }
            }
        }
        return true
    }

    // esto es lo nuevo añadido en el sprint 2
    fun comprobarBolaEnCarton(bombo: Bombo): Boolean {
        val bola = bombo.sacarBola()
        return if (bola != null) {
            comprobarNumero(bola)
        } else {
            false  // El bombo está vacío
        }
    }
}

/*fun main() {
    val carton = CartonBingoAleatorio()
    val bombo = Bombo()

    carton.mostrarCarton()

    // Ejemplo de cómo comprobar si una bola del bombo está en el cartón
    val bolaEnCarton = carton.comprobarBolaEnCarton(bombo)
    println("¿La bola está en el cartón? $bolaEnCarton")
}
*/