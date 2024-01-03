package Pregunta_4;
//Escribe un fragmento de código Java que demuestre
// el uso de un arreglo para almacenar los días de la semana. Imprime el arreglo de lunes a viernes y en reversa.
public class Respuesta_4 {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo con los días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // Imprimir el arreglo de lunes a viernes
        System.out.println("Días de la semana (de lunes a viernes):");
        for (String dia : diasSemana) {
            System.out.println(dia);
        }

        // Imprimir el arreglo en reversa
        System.out.println("\nDías de la semana (en reversa):");
        for (int i = diasSemana.length - 1; i >= 0; i--) {
            System.out.println(diasSemana[i]);
        }
    }
}
