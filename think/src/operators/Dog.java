/**
 * @author Manuel Funes Domingo
 *
 * Esta aplicación muestra el operador equal()
 */

package operators;

public class Dog {
		
	String name;
	String says;
		
	public void main(String[] args) {
		
		Dog spot= new Dog();
		Dog scruffy = new Dog();
		spot.name = "Spot";
		spot.says = "Ruff!";
		scruffy.name = "Scruffy";
		scruffy.says = "Wurf!";
	
		System.out.println("El perro se llama: " + spot.name + " y ladra: " + spot.says);
		System.out.println("El perro se llama: " + scruffy.name + " y ladra: " + scruffy.says);		
	
	} //public
} //class

