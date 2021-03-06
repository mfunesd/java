/**
 * @author Manuel Funes Domingo
 *
 * Iching 1=cara 2=cruz
 */

package iching;
import java.util.*;

public class Iching {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		// Inicializaci��n de variables
		int suma = 0;
	    int cadena[] = new int[6];
	    String cadeneta="";
	    String cadenaInvertida="";
	    String word2 = "";	
		
		// Hacemos la consulta inicial
		String consulta;
		in = new Scanner(System.in);
		System.out.println("Realiza tu consulta");
	    consulta = in.nextLine();
	      
	        
		// Lanzamos las monedas 6 veces
		for (int i = 0; i <= 5; i++) {
		    Random rand = new Random();
			int m1 = rand.nextInt(2)+1;
			int m2 = rand.nextInt(2)+1;
			int m3 = rand.nextInt(2)+1;
			int sale1 = 0;
			int sale2 = 0;
			int sale3 = 0;
			
			if (i==0) {
			//	System.out.println("    Linea Base");
			}
			if (m1 == 1) {
			//	System.out.print("O");
				sale1++;
			}
			else {
			//	System.out.print("X");
			}
			if (m2 == 1) {
			//	System.out.print("O");
				sale2++;
			}
			else {
			//	System.out.print("X");
			}
			if (m3 == 1) {
			//	System.out.print("O");
				sale3++;
			}
			else {
			//	System.out.print("X");
			}
			suma = sale1 + sale2 + sale3;
	    
		/*
			if (suma == 3) {
				System.out.println("  Viejo Yang (Mutante)	----O----	9");
			}
			else if (suma == 2) {
				System.out.println("  Joven Yin (Estable)	---   ---	8");
			}
			else if (suma == 1) {
				System.out.println("  Joven Yang (Estable)	---------	7");
			}
			else if (suma == 0) {
				System.out.println("  Viejo Yin (Mutante)	--- X ---	6");
			}
		*/
			cadena[i] = suma;
			
				
				
		} //for
		
	//	System.out.println("    Cima ");
	//    System.out.println(" ");
	    for(int cad : cadena) {
	    	
	      cadeneta = Integer.toString(cad);
	      
	      for (int i = cadeneta.length()-1; i == 0 ; i--) {
	       		cadenaInvertida += cadeneta.charAt(i); 
	   	  }
	      
	      	
	      } //foreach
	    
	       int largo=cadenaInvertida.length();
	       StringBuffer word = new StringBuffer(largo);
           for(int i=largo - 1; i > -1; i--) {
	           word.append(cadenaInvertida.charAt(i));
           } 
           
           System.out.println(" ");
      //     System.out.println("------------------------------------ ");
      //     System.out.println("Tu consulta ha sido: ");
      //     System.out.println(consulta);
           System.out.println("El resultado de " + consulta + " es: \n");
           
           
	       word2 = word.toString();
	       for (int x = 0; x <= 5; x++){
	       char sub = word2.charAt(x);
	     
	       		if ( sub == '0' ) {
	       			System.out.println("\t\t--- X ---");
	       		}
	    		else if ( sub == '1' ) {
	    		System.out.println("\t\t---------");
	    		}
	    		else if ( sub == '2' ) {
	    			System.out.println("\t\t---   ---");
	    		}
	    		else if ( sub == '3' ) {
	    		System.out.println("\t\t----O----");
	    		}	
	       } //for
	} // public	
} //class

