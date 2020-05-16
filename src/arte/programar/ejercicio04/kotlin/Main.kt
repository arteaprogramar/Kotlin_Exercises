package arte.programar.ejercicio04.kotlin

import java.util.*

object Main {
    /**
     * Pedir dos números por consola e imprimir el mayor o si son iguales
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
                println("Los números son iguales.")
            } else if (n1 > n2) {
                println(String.format("El número %s es el mayor", n1))
            } else {
                println(String.format("El número %s es el mayor", n2))
            }
        } catch (ex: Exception) {
            println("Error : " + ex.message)
        }
    }
}