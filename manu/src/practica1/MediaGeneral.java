/**
 * @author Manuel Funes Domingo
 *
 * Esta aplicación calcula la media de varios números
 */

package practica1;

public class MediaGeneral {

	/**
	 * Punto de entrada a la aplicación.
	 *
	 * Este método imprime la media de varios números que son pasados como parámetro
	 *
	 * @param args Los argumentos de la línea de comando. Se esperan dos números.
	 */
		public static void main(String[] args) {

		if (args.length<2) {
			System.out.println("ERROR: Se esperan mas de dos números como parámetros.");
			return;
		} //if

        else {

        	int z = 0;
            int i = 0;
            int aux = 0;
            
    		aux = args.length % 2;
    		
    		while (i < args.length) {
        	    			
    			String arg = args[i]; // una variable String que obtiene los parámetros
			
    			int x = Integer.parseInt(arg); // una variable int, que convierte arg a numerico
				
    				z = z + x;
				
    				i++;
					
    			
    		} //while
				
    		z = z/args.length; // Calcula la media
    				
    		if (aux == 0) {
    			System.out.println("El número de parametros es: " + args.length + ", que es un número par");
			}
    		
    		else {
    			System.out.println("El número de parametros es: " + args.length + ", que es un número impar");
			}
    		
    		System.out.println("La media de todos los parametros es " + z);
    		
    	} //else
	} //class
} //class
