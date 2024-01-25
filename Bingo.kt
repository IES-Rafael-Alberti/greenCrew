import kotlin.random.Random

class Bombo(private val bombo: MutableList<Int> = (1..90).toMutableList()) {
    private val numerosGenerados: MutableList<Int> = mutableListOf()
    private var bingoCantado = false

    fun jugar() {
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

fun main() {
    val simulador = Bombo()
    simulador.jugar()
}
