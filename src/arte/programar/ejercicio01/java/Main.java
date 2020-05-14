package arte.programar.ejercicio01.java;

import java.util.Scanner;

public class Main {

    /**
     * Escribir en consola e imprimir el mensaje
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Java: ");
        System.out.println("Escribir en consola e imprimir el mensaje");

        // Scanner:  Permite leer el valores de entrada en Java
        Scanner console = new Scanner(System.in);

        // Leer cadena de texto y almacenarlo en variable
        System.out.print("Escribe un texto: ");
        String texto = console.nextLine();

        // Leer numero(s) y almacenarlo en variable
        System.out.print("Escribe un numeros: ");
        int numero = console.nextInt();

        // Leer decimal y almacenarlo en variable
        System.out.print("Escribe un decimal: ");
        float decimal = console.nextFloat();

        // Imprimir valores
        System.out.println();
        System.out.println("Texto : " + texto);
        System.out.println("Numero : " + numero);
        System.out.println("Decimal : " + decimal);
    }

}
