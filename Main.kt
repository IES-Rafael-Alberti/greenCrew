
fun main() {
    val menu = Menu()
    // añadido en el segundo sprint val carton = CartonBingoAleatorio()
    val carton = CartonBingoAleatorio()

    var opcion: Int

    do {
        menu.mostrarMenu()

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            // añadido en el segundo sprint 1 -> menu.jugar(carton)
            1 -> menu.jugar(carton)
            2 -> menu.mostrarInstrucciones()
            3 -> println("Gracias por jugar!!")
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }

    } while (opcion != 3)
}