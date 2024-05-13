
import java.util.Scanner;

/*
    Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
    para los 14 partidos y el pleno al quince (15 filas).
 */
public class Ejercicio7_ApuestaQuiniela {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int resultadoPartido;
        int columnas=3;
        
        for (int fila = 1; fila <=15; fila++) {
            System.out.printf("%4d. |", fila);
            
            if(fila==15){
            columnas=1;
            }
            //se realizan las 3 apuestas
            for (int i = 0; i < columnas; i++) {
                resultadoPartido=(int)(Math.random()*3)+1;
             
                switch(resultadoPartido){
                
                    case 1:
                        System.out.print(" 1 |");
                        break;
                    case 2:
                        System.out.print(" 2 |");
                        break;
                    case 3:
                        System.out.print(" X |");
                    default:
                }
             
            }
            System.out.println();
        }
    }
}
