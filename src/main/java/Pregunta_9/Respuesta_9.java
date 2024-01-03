package Pregunta_9;

import java.util.Scanner;

public class Respuesta_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Ingrese un número entero (o escriba 'fin' para salir): ");

            String input = scanner.next();
            if (input.equalsIgnoreCase("fin")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            try {
                int numero = Integer.parseInt(input);

                if (esPar(numero)) {
                    System.out.println(numero + " es un número par.");
                } else {
                    System.out.println(numero + " es un número impar.");
                }
            } catch (NumberFormatException e) {

                System.out.println("Error: Por favor, ingrese un número entero válido.");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }


    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
