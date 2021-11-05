
import java.util.InputMismatchException;
import java.util.Scanner;

public class ParoImpar {
    public static void main(String[] args) {
        // Declaramos un Scanner para leer las entradas de texto
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        boolean nValido = false;
        System.out.println("*** Verifica si un numero es par o impar ***");
        System.out.println("Introduzca su numero: ");

        // solicitamos la entrada, si se da un valor no numerico
        // no continua
        try {
            entrada = sc.nextInt();
            nValido = true;
        } catch (InputMismatchException e) {
            System.out.println("Introduzca un numero entero, porfavor");
        }

        // verificamos si se hizo una entrada valida, si si se continua
        if (nValido) {

            // si el residuo de dividir el numero entre 2 es 0, el numero es par
            if (entrada % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        }

        //Cerramos el Scanner
        sc.close();
    }
}
