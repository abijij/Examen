package Pregunta_3;

import java.util.Scanner;

//Define una clase llamada Rectangulo con atributos base y altura.
// Agrega un método llamado calcularArea que devuelva el área del rectángulo.
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){

        this.base= base;
        this.altura = altura;

    }

    public double calcularArea(){
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectangulo");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectangulo");
        double altura = scanner.nextDouble();

        Rectangulo miRectangulo = new Rectangulo(base, altura);
        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());

        scanner.close();
    }


}
