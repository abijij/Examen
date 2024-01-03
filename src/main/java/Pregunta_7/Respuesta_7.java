package Pregunta_7;
//Implementa un método en Java llamado invertirCadena que tome una cadena
// como parámetro y devuelva la cadena invertida. Cadena ejemplo: Lorem ipsum dolor sit amet, consectetur adipiscing elit
public class Respuesta_7 {
    public static void main(String[] args) {
        String muestra = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String reversa = invertirCadena(muestra);

        System.out.println("Cadena original: " + muestra);
        System.out.println("Cadena invertida: " + reversa);
    }

    // Metodo para  invertir
    public static String invertirCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();


        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }

        return resultado.toString();

    }
}
