/**
 * @author Manuel Funes Domingo
 *
 * Juego de los dados
 * Se gana consiguiendo 20 puntos o más en 5 tiradas
 */

package dados;
import java.util.*;

public class Dados {
	
	public static void main(String[] args) {
		
		// Ejecutamos el programa 10 veces
		int ganas = 0;
		for (int a = 1; a <= 10; a++) {
		
		int sale = 0;
		// Lanzamos los dados 5 veces
		for (int i = 1; i <= 5; i++) {
		    Random rand = new Random();
			int m = rand.nextInt(6)+1;
			
			switch (m) {
			case 1:
				System.out.print("1");
				break;
			case 2:
				System.out.print("2");
				break;
			case 3:
				System.out.print("3");
				break;
			case 4:
				System.out.print("4");
				break;
			case 5:
				System.out.print("5");
				break;
			case 6:
				System.out.print("6");
				break;
		} //switch
		System.out.println(" ");
	    sale = sale + m;
		} //for
		if (sale >= 20) {
	    	System.out.println("Bieeen!! Has ganado. Has sacado " + sale + " puntos");
	        ganas++;
	    }
	    else {
	    	System.out.println("Lo siento... Intentalo de nuevo! Has sacado " + sale + " puntos");
	    }
		if (a == 10) {
		System.out.println(" ");
		System.out.println("-------------------------------------- ");
		System.out.println("Has ganado " + ganas + " partidas de 10");
		System.out.println("-------------------------------------- ");
		}
		} //for
	} // public
} //class
