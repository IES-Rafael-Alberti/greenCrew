//SE AÑADE UN CONTADOR QUE POR CADA JUGADA AÑADA 1 NUMERO MAS(para comparar con la prima)

class Contador(private var contador: Int = 0) {
    /**
     * Esta clase representa un ejemplo de un Contador esencial para jugar con prima.
     * Contiene métodos para obtener e incrementar el contador.
     *
     * @param contador Contador que empieza en 0 y va incrementando cada vez que el bombo genere una bola.
     */

    fun incrementar() {
        /**
         * Incrementa el contador cada vez que el bombo genere un número.
         */
        contador++
    }
    fun obtenerContador(): Int {
        /**
         * Devuelve el contador.
         */
        return contador
    }
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


//cantar prima(en el main)
    val ganoPrima = comprobarPrima(numerosGenerados, numeroPrima)

    if (ganoPrima) {
        println("¡Felicidades! Has ganado la prima.")
    } else {
        println("Lo siento, no has ganado la prima.")
    }
}