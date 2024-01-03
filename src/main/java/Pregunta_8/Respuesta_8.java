package Pregunta_8;

import java.util.Scanner;
//Define una interfaz llamada Figura con un método abstracto calcularPerimetro.
// Luego, implementa esta interfaz en las clases Circulo y Cuadrado, proporcionando
// la lógica adecuada para calcular el perímetro de cada figura.
public class Respuesta_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        double radioCirculo = scanner.nextDouble();

        System.out.println("Ingresa el radio del cuadrado");
        double radioCuadrado =  scanner.nextDouble();

        Circulo circulo = new Circulo(radioCirculo);

        Cuadrado cuadrado = new Cuadrado(radioCuadrado);

        // Calcular y mostrar los perímetros
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());


        scanner.close();
    }
}

