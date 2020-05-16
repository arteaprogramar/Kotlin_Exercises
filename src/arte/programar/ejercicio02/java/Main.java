package arte.programar.ejercicio02.java;

import java.util.Scanner;

public class Main {
    /**
     * Pedir dos números por consola e imprimir si son iguales o no.
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            System.out.print("Ingrese Numero 1: ");
            int n1 = console.nextInt();

            System.out.print("Ingrese Numero 2: ");
            int n2 = console.nextInt();

            if (n1 == n2) {
                System.out.println("Los numeros son iguales.");
            } else {
                System.out.println("Los numeros no son iguales");
            }
        } catch (Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
