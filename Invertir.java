
import java.util.Scanner;

public class Invertir {

    public static void main(String[] args) {
        // Declaramos un Scanner para leer las entradas de texto
        Scanner sc = new Scanner(System.in);
        String entrada = "";

        // damos una bienvenida y pedimos la cadena
        System.out.println("*** Inversor de cadenas ***");
        System.out.print("Introduzca una cadena para invertir: ");
        entrada = sc.nextLine();

        // declaramos la variable donde se guardara la cadena invertida
        String salida = "";

        // recorremos la cadena de final a principio y concatemaos
        // cada caracter en la variable de la salida
        for (int i = entrada.length() - 1; i >= 0; i--) {
            salida = salida + entrada.charAt(i);
        }

        // imprimimos el resultado
        System.out.println("cadena invertida: " + salida);

        // cerramos el scanner
        sc.close();
    }

}
