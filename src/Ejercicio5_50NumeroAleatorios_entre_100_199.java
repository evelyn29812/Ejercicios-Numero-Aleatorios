
import java.util.Scanner;

/*
    Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
    separados por espacios. Muestra también el máximo, el mínimo y la media
    de esos números.
 */
public class Ejercicio5_50NumeroAleatorios_entre_100_199 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int numero = 0;

        for (int i = 0; i < 50; i++) {
            numero = (int) ((Math.random() * 100) + 100);
            System.out.print(numero + " ");

            suma += numero;

            if (numero < minimo) {
                minimo = numero;
            } 
                if (numero > maximo) {
                    maximo = numero;
                }
            }
            System.out.println("\n Minimo: " + minimo + "\n Maximo: " + maximo + "\n Media:" + suma/50);
        }
    }

