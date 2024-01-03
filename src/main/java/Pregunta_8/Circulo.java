package Pregunta_8;

public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
