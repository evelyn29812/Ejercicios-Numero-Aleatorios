
import java.util.Scanner;

/*
    Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
    de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */
public class Ejercicio3_BarajaCartasEspanola {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String palo="";
        String carta="";
        
        
        switch((int)Math.random()*4){
            case 0:
            palo="oros";
                break;
            case 1:
            palo="copas";
                break;
            case 2:
            palo="bastos";
            break;
            case 3:
            palo="espadas";
            break;
            default:
        }
        int numeroCartas=(int) (Math.random()*40+1);
        
        switch(numeroCartas){
        
            case 1:
                carta="As";
                break;
            case 8:
                carta="soto";
                break;
            case 9:
                carta="caballo";
                break;
            case 10:
                carta="rey";
                break;
            default:
                carta=String.valueOf(numeroCartas);
        }
        System.out.println(carta + " de " + palo );
    }
}
