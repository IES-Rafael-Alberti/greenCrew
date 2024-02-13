import kotlin.random.Random

class Prima {
    var numeroPrima: Int = 0

    fun generarNumeroPrima() {
        numeroPrima = Random.nextInt(15, 51) // Se genera un número al azar para la prima del 15 al 50.
    }

    fun anunciarNumeroPrima() {
        println("El número de prima para esta partida es el $numeroPrima. ¡Buena suerte!")
    }
}
