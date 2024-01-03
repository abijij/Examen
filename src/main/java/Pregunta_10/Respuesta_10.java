package Pregunta_10;

import java.util.Scanner;
public class Respuesta_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();


        imprimirPiramide(altura);

        scanner.close();
    }
    private static void imprimirPiramide(int altura) {
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }


            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
    }


