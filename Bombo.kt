import kotlin.random.Random

//Clase Bombo
class Bombo(private val bombo: MutableList<Int> = (1..90).toMutableList()) {
    val numerosGenerados: MutableList<Int> = mutableListOf()
    private var bingoCantado = false
    private var lineaCantada = false

    //segundo sprint añadido carton: CartonBingoAleatorio
    fun bombo(carton: CartonBingoAleatorio) {

        while (bombo.isNotEmpty() && !bingoCantado) {
            val numero = generarNumeroAleatorio()
            numerosGenerados.add(numero)
            println("Número generado: $numero")
            // segundo sprint añadido verificarYMarcarEnCarton(numero, carton)
            verificarYMarcarEnCarton(numero, carton)


            // Espera 2 segundos antes de generar el próximo número
            Thread.sleep(2000)

            // Verifica si se ha cantado bingo
            if (verificarBingo(numerosGenerados)) {
                bingoCantado = true
                println("¡Bingo!")
            } else {
                println("No hay bingo")
            }
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

    // Verifica si se ha cantado bingo
    private fun verificarBingo(numerosGenerados: List<Int>): Boolean {
        val todosLosNumerosGenerados = numerosGenerados.toSet()
        return todosLosNumerosGenerados.size == 90
    }

    //segundo sprint
    private fun verificarYMarcarEnCarton(numero: Int, carton: CartonBingoAleatorio) {
        if (carton.verificarNumeroEnCarton(numero)) {
            println("¡Número $numero encontrado en el cartón! Marcado con 'X'.")
            carton.mostrarCarton()
        } else {
            println("Número $numero no encontrado en el cartón.")
        }
    }
}
