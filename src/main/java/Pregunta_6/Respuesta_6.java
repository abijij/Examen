package Pregunta_6;
//¿Cuál es la diferencia entre == y .equals() al comparar cadenas en Java?
public class Respuesta_6 {
    public static void main(String[] args) {

        //El operaodor == compara las referencias de objetos, verifica las direcciones en memoria de las cadenas y no los contenidos

        String str1 = "Hola";
        String str2 = "Hola";

        System.out.println(str1 == str2);


        //Mientras qie .equals() es para comparar el contenido de las cadenas  o mejor dicho compara los caracteres
        // dentro de las cadenas

        String str3 = "Hola";
        String str4 = new String("Hola");

        System.out.println(str3.equals(str4));
    }
}
