package arte.programar.ejercicio03.java;

import java.util.Scanner;

public class Main {
    /**
     * Pedir dos números por consola e imprimir el mayor.
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            System.out.print("Ingrese Numero 1: ");
            int n1 = console.nextInt();

            System.out.print("Ingrese Numero 2: ");
            int n2 = console.nextInt();

            if (n1 > n2) {
                System.out.println(String.format("El número %s es el mayor", n1));
            } else {
                System.out.println(String.format("El número %s es el mayor", n2));
            }
        } catch (Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
