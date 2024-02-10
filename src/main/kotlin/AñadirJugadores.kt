package org.example
//CODIGO INDIVIDUAL PARA AÑADIR UN SEGUNDO JUGADOR O VARIOS JUGADORES A LA PARTIDA
//DESCOMENTAR EN CASO DE USAR


/**fun anadirJugadores(numeroDeJugadores: Int):List<String> {
    // Crear una lista de ejemplo
    val listaJugadores = mutableListOf<String>()
    // Recorrer la lista hasta el número ingresado
    for (i in 0 until numeroDeJugadores) {
        print("nombre del jugador: ")
        val nombreJugador = readlnOrNull()
        listaJugadores.add(nombreJugador.orEmpty())
    }
    return listaJugadores
}
fun main() {
    print("ingrese un numero de jugadores: ")
    // Intentar convertir la entrada a un entero
    var numeroDeJugadores = readln().toIntOrNull() ?: 0

    // Si el numero no es mayor que 1, pedir otro numero
    while (numeroDeJugadores <= 1) {
        print("solo se admiten números mayores que 0, por favor intentalo de nuevo: ")
        numeroDeJugadores = readln().toIntOrNull() ?: 0
    }
    // Llamar a la función anadirJugadores
    val listaJugadores = anadirJugadores(numeroDeJugadores)
    println(listaJugadores)
}**/

