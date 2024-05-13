
import java.util.Scanner;

/*
    Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
    por espacios.
 */
public class Ejercicio4_20NumeroAleatorios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = 0;

        for (int i = 0; i < 20; i++) {

            numero = (int) (Math.random() * 11);//limite de los hasta el 10

            System.out.print(numero + " ");
        }

    }
}
