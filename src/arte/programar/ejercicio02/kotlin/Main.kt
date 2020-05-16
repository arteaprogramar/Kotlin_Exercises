package arte.programar.ejercicio02.kotlin

import java.util.*

object Main {
    /**
     * Pedir dos números por consola e imprimir si son iguales o no.
     * @param args
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val console = Scanner(System.`in`)

        try {
            print("Ingrese Numero 1: ")
            val n1 = console.nextInt()

            print("Ingrese Numero 2: ")
            val n2 = console.nextInt()

            if (n1 == n2) {
                println("Los numeros son iguales.")
            } else {
                println("Los numeros no son iguales")
            }
        } catch (ex: Exception) {
            println("Error : " + ex.message)
        }
    }
}