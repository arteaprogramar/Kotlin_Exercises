package arte.programar.ejercicio01.java;

import java.util.Scanner;

public class Main {

    /**
     * Escribir en consola e imprimir el mensaje
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Escribe un mensaje: ");
        String texto =  console.nextLine();

        System.out.println("Su mensaje es: " + texto);
    }


}
