package arte.programar.ejercicio05.kotlin

import java.util.*

object Main {
    /**
     * Pedir tres números por consola e imprimirlos del menor al mayor
     * @param args
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val console = Scanner(System.`in`)

        try {
            val numbers = IntArray(3)

            print("Ingrese Numero 1: ")
            numbers[0] = console.nextInt()

            print("Ingrese Numero 2: ")
            numbers[1] = console.nextInt()

            print("Ingrese Numero 3: ")
            numbers[2] = console.nextInt()

            Arrays.sort(numbers)
            println(String.format("Numeros: %s", Arrays.toString(numbers)))
        } catch (ex: Exception) {
            println("Error : " + ex.message)
        }
    }
}