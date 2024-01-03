package Pregunta_5;

import java.util.Scanner;

//Explique el concepto de encapsulamiento en Java.
// Proporciona un ejemplo de cómo usar los modificadores de acceso para lograr encapsulamiento en una clase.
public class Respuesta_5 {
    public static void main(String[] args) {

        //Se refiere a la ocultacio de los detalles internios de una clase y la restriccion del acceso directo
        //a sus miembros
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String nombre = null;
            int edad = 0;
            int intentosMaximos = 3;
            boolean intentoExitoso = false;


            for (int intento = 1; intento <= intentosMaximos; intento++) {
                System.out.print("Intento:"  + intento + " \nIngrese el nombre: ");
                nombre = scanner.nextLine();

                if (!nombre.matches("[a-zA-Z]+")) {
                    System.out.println("Advertencia: El nombre debe contener solo letras.");
                    continue;
                }

                System.out.print("Intento: " + intento + "\nIngrese la edad: ");

                if (scanner.hasNextInt()) {
                    edad = scanner.nextInt();

                    if (edad >= 0) {
                        intentoExitoso = true;
                        break;
                    } else {
                        System.out.println("Advertencia: La edad no puede ser negativa.");
                    }
                } else {
                    System.out.println("Advertencia: La edad debe ser un número entero.");
                    scanner.nextLine();
                }
            }


            if (!intentoExitoso) {
                System.out.println("\nNúmero de intentos alcanzados. Reiniciando proceso.\n");
                continue;  // Reiniciar
            }


            Persona persona1 = new Persona(nombre, edad);

            // Imprimir los datos de la persona
            System.out.println("\nDatos de la persona:");
            System.out.println("Nombre: " + persona1.getNombre());
            System.out.println("Edad: " + persona1.getEdad());

            break;
        }

        scanner.close();
    }
}

