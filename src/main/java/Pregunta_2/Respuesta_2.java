package Pregunta_2;
//¿Cuál es la diferencia entre un for y un while en Java? Proporciona un ejemplo de cada uno.

//Ambos son estructura  de control en Java se utulizan para ejecutar bloques de codigo repetidamente y
//la diferencia en tre ellos radica en su sintaxis y el momento que evaluan la condicion
public class Respuesta_2 {

    public static void main(String[] args) {

        for (int i = 1 ; i <= 5 ; i++ ) {

            //el for consta de tres partes la inicializacion , la condicion y la actualizacion y se
            // ejecutara mientras la condicion sea verdadera

            System.out.println("Bucle for = " + i);
        }

        int i = 1;
        while (i <= 5) {
            //El ciclo while solo tiene una sola condicion  el bloque de codigo se ejecutara mientras la condicion sea
            //verdadera
            System.out.println("Bucle while = " + i);

            i++;
            //esto sirve oara evitar un bucle infinito incrementar la variable
        }

    }

}
