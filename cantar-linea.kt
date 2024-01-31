class Jugador(val nombre: String) {
    fun cantarLinea() {
        println("El jugador $nombre ha cantado línea. ¡ENHORABUENA!")
    }
}

fun main() {
    // Crear un jugador
    val jugador1 = Jugador("UNO")

    // El jugador canta línea
    jugador1.cantarLinea()
}
