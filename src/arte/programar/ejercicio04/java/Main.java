package arte.programar.ejercicio04.java;

import java.util.Scanner;

public class Main {
    /**
     * Pedir dos números por consola e imprimir el mayor o si son iguales
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            System.out.print("Ingrese Numero 1: ");
            int n1 = console.nextInt();

            System.out.print("Ingrese Numero 2: ");
            int n2 = console.nextInt();

            if (n1 == n2){
                System.out.println("Los números son iguales.");
            } else if (n1 > n2) {
                System.out.println(String.format("El número %s es el mayor", n1));
            } else {
                System.out.println(String.format("El número %s es el mayor", n2));
            }
        } catch (Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
