package arte.programar.ejercicio01.kotlin

import java.util.*

object Main {

    /**
     * Escribir en consola e imprimir el mensaje
     * @param args
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val console = Scanner(System.`in`)

        print("Escribe un mensaje: ")
        val texto = console.nextLine()

        println("Su mensaje es: $texto")
    }
}