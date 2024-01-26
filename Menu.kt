class Menu {
    fun mostrarMenu() {
        println("1. Jugar")
        println("2. Instrucciones")
        println("3. Salir")
        println("Selecciona una opción:")
    }

    fun jugar() {
        println("¡Bienvenido a la función Jugar!")
        // Falta funcionalidades jugar
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