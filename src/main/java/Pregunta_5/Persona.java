package Pregunta_5;

public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos de acceso para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {  // Validación para asegurar una edad no negativa
            this.edad = edad;
        } else {
            System.out.println("Edad no válida. Debe ser un valor positivo.");
        }
    }
}
