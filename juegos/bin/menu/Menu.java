/**
 * @author Manuel Funes Domingo
 *
 * Menu de juegos
 * Podemos elegir jugar a: Monedas, Dados o Iching
 */

package menu;

import java.util.Scanner;

import test.Jose2;
import dados.Dados;
import monedas.Moneda;
import iching.Iching;

public class Menu { 
     public static void main (String [] args) { 
    	 
    	 //Jose2 jose = new Jose2();
    	 
    	 
          int opc; 
          Scanner entrada = new Scanner(System.in); 
          System.out.println ("MENU: Elige Juego"); 
          System.out.println ("1) Dados"); 
          System.out.println ("2) Monedas");
          System.out.println ("3) Iching");
          System.out.println ("Introduce numero:");
          opc = entrada.nextInt(); 
           
          switch (opc) { 
          case 1:  
        	  Dados.main(args);

               break;
           
          case 2:  
              Moneda m = new monedas.Moneda(); m.main(args); break; 
          
          case 3:
        	  Iching i = new iching.Iching(); i.main(args); break;
          } 
    
          
     
     } 
} 
