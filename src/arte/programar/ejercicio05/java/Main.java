package arte.programar.ejercicio05.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * Pedir tres números por consola e imprimirlos del menor al mayor
     * @param args
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            int[] numbers = new int[3];

            System.out.print("Ingrese Numero 1: ");
            numbers[0] = console.nextInt();

            System.out.print("Ingrese Numero 2: ");
            numbers[1] = console.nextInt();

            System.out.print("Ingrese Numero 3: ");
            numbers[2] = console.nextInt();

            Arrays.sort(numbers);
            System.out.println(String.format("Numeros: %s", Arrays.toString(numbers)));
        } catch (Exception ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
