
import java.util.Scanner;

/*
    Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
    adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
    el programa dirá cuántas oportunidades quedan y si el número introducido es
    menor o mayor que el número secreto.
 */
public class Ejercicio6_NumeroalAzar_entre_0_100 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int oportunidades = 5;
        int numero;
        boolean acertado = false;
        int numeroMisterioso = (int) (Math.random() * 101);

        System.out.println("Estoy pensando un numero 0 al 100 tiene 5 opotunidades");
        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            oportunidades--;

            if ((numero > numeroMisterioso) && (oportunidades > 0)) {
                System.out.println("El numero que estoy pensando es menor que " + numero);
                System.out.println("Te quedan " + oportunidades + "oportunidades");
            }
            if ((numero < numeroMisterioso) && (oportunidades > 0)) {
                System.out.println("El numero que estoy pensando es mayor que " +numero);
                System.out.println("Te quedan " +oportunidades + " oportunidades");
            }
            if(numero==numeroMisterioso){
                acertado=true;
                System.out.println("Has acertado, Te felicito!!");
                
            }

        } while (!acertado && (oportunidades > 0));
        
        if(!acertado){
            System.out.println("Lo siento no haz acertado el numero que estaba pensando es: " + numeroMisterioso);
        }
    }
}
