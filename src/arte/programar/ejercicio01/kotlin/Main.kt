package arte.programar.ejercicio01.kotlin

import java.util.*

object Main {

    /**
     * Escribir en consola e imprimir el mensaje
     * @param args
     */
    @JvmStatic
    fun main(args: Array<String>) {
        println("Escribir en consola e imprimir mensaje")

        // Scanner: Permite leer valores de entrada de Console
        val console = Scanner(System.`in`)

        // Leer variables y almacenarlas
        print("Escribe un texto: ")
        val t = console.nextLine()

        print("Escribe un numeros: ")
        val n = console.nextInt()

        print("Escribe un decimal: ")
        val d = console.nextFloat()

        // Imprimir valores
        println("Texto: $t \nNumero: $n \nDecimal: $d")
    }
}