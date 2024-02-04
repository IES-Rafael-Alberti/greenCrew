package org.example

//Clase Menu
class Menu {
    fun mostrarMenu() {
        println("1. Jugar")
        println("2. Instrucciones")
        println("3. Salir")
        println("Selecciona una opción:")
    }
    // añadido en el segundo sprint carton: CartonBingoAleatorio, simulador.bombo(carton)
    fun jugar(carton: CartonBingoAleatorio) {
        println("¡Bienvenido a la función Jugar!")
        val carton = CartonBingoAleatorio()
        carton.mostrarCarton()
        val simulador = Bombo()
        simulador.bombo(carton)
    }
    fun mostrarInstrucciones() {
        println("Instrucciones:")
        println("Aquí está el texto corregido:\n" +
                "\n" +
                "# Instrucciones del BINGO\n" +
                "1. Se selecciona un número de jugadores.\n" +
                "2. Dependiendo del número de jugadores, se repartirán una serie de cartones.\n" +
                "3. Cada cartón tendrá dibujada una tabla de 27 celdas en 3 filas y 9 columnas.\n" +
                "4. Cada cartón tendrá una serie y una cantidad de números aleatorios, así como espacios en blanco.\n" +
                "5. El bombo girará hasta sacar un número aleatorio y posteriormente se mostrará dicho número.\n" +
                "6. Una vez se haya mostrado el número, los jugadores tendrán 5 segundos para dar una respuesta pulsando una tecla.\n" +
                "7. Si un jugador no ha dado su respuesta tras pasar los 5 segundos, la jugada no se contará, ya esté el número en el tablero o no.\n" +
                "8. Si un jugador consigue una línea horizontal o vertical, se mostrará un mensaje de declaración de línea.\n" +
                "9. En el momento en el que un jugador consiga realizar una línea horizontal y una vertical, se mostrará un mensaje de declaración de bingo y la partida terminará.\n" +
                "10. Después de terminar la partida, se mostrará una opción para decidir si quieres volver a jugar o no.")
    }
}



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