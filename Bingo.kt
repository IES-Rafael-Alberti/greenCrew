import kotlin.random.Random


//Clase Bombo
class Bombo(private val bombo: MutableList<Int> = (1..90).toMutableList()) {
    private val numerosGenerados: MutableList<Int> = mutableListOf()
    private var bingoCantado = false

    fun bombo() {
        while (bombo.isNotEmpty() && !bingoCantado) {
            val numero = generarNumeroAleatorio()
            numerosGenerados.add(numero)
            println("Número generado: $numero")

            // Verifica si se ha cantado bingo (condición ficticia)
            if (verificarBingo(numerosGenerados)) {
                bingoCantado = true
                println("¡Bingo!")
            }

            // Espera 2 segundos antes de generar el próximo número
            Thread.sleep(2000)
        }

        // Imprime la lista de números generados
        println("Números generados: $numerosGenerados")
    }
    // Si se acaban los números del bombo arroja un mensaje
    private fun generarNumeroAleatorio(): Int {
        if (bombo.isEmpty()) {
            throw IllegalStateException("Bombo vacío, todos los números han sido generados.")
        }

        val indiceAleatorio = Random.nextInt(bombo.size)
        val numero = bombo.removeAt(indiceAleatorio)

        return numero
    }

    private fun verificarBingo(numerosGenerados: List<Int>): Boolean {
        // Lógica para verificar si se ha cantado bingo
        return false
    }
}


//Clase Carton
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
}

//Clase Menu
class Menu {
    fun mostrarMenu() {
        println("1. Jugar")
        println("2. Instrucciones")
        println("3. Salir")
        println("Selecciona una opción:")
    }

    fun jugar() {
        println("¡Bienvenido a la función Jugar!")
        val carton = CartonBingoAleatorio()
        carton.mostrarCarton()
        val simulador = Bombo()
        simulador.bombo()
    }

    fun mostrarInstrucciones() {
        println("Instrucciones:")
        // Faltan Instrucciones
    }
}



fun main() {
    val menu = Menu()

    var opcion: Int

    do {
        menu.mostrarMenu()

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> menu.jugar()
            2 -> menu.mostrarInstrucciones()
            3 -> println("Gracias por jugar!!")
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }

    } while (opcion != 3)
}
