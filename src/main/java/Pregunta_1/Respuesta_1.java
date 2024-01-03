package Pregunta_1;


//Escribe un programa en Java que imprima los números del 1 al 10 en orden ascendente, separados por una coma: 1,2,3,4,5,6,7,8,9,10

public class Respuesta_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            System.out.print(i);


            if (i < 10) {
                System.out.print(",");
            }
        }
    }

}

