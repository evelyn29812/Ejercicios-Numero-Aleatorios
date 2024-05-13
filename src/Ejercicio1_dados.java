
import java.util.Scanner;

/*
    Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
    también la suma total (los puntos que suman entre los tres dados).
 */
public class Ejercicio1_dados {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        //declaracion de variables
        int tirarDados;
        int sumaDados=0;
        
        System.out.print("Tirada de tres dados: ");
        
        for (int i = 0; i < 3; i++) {
           tirarDados=(int) (Math.random()*6+1);
            System.out.print(tirarDados + " ");
            sumaDados +=tirarDados;
        }
        System.out.println("\n suma: " + sumaDados);
    }
    
}
