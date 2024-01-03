package Pregunta_5;

public class Alumno extends Persona{
    // Atributo adicional para la carrera del alumno
    private String carrera;

    // Constructor para Alumno
    public Alumno(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    // Método de acceso para la carrera
    public String getCarrera() {
        return carrera;
    }
    }

