fun anadirJugadores(numeroDeJugadores: Int):List<String> {
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



//comprobar prima
fun comprobarPrima(numerosGenerados:MutableList<Int>,numeroPrima:Int): Boolean {
    /**
     * Esta es una función comprueba el tamaño de los numeros del bombo y compara con el numero de la prima
     *
     * @param numerosGenerados Números generados por el bombo.
     * @param numeroPrima Número de la prima de la ronda.
     * @return La comparativa, si la prima es mayor devuelve false, si es menor devuelve true y se lleva el premio.
     */
    return numerosGenerados.size < numeroPrima
}

