/**
 * @author Manuel Funes Domingo
 *
 * Esta aplicación muestra el operador equal()
 */

package operators;

public class Dog {
		
	String name;
	String says;
		
	public static void main(String[] args) {
		
		Dog spot= new Dog();
		Dog scruffy = new Dog();
		Dog nuevo = new Dog();
		spot.name = "Spot";
		spot.says = "Ruff!";
		scruffy.name = "Scruffy";
		scruffy.says = "Wurf!";
		nuevo.name = "Perraco";
	    nuevo.says = "Guau!";
	    
	    System.out.println("Antes de cambiar las referencias");
		System.out.println("--------------------------------\n");
		System.out.println("El perro se llama: " + spot.name + " y ladra: " + spot.says);
		System.out.println("El perro se llama: " + scruffy.name + " y ladra: " + scruffy.says);		
		System.out.println("El perro se llama: " + nuevo.name + " y ladra: " + nuevo.says);		
	    System.out.println(" ");
		System.out.print("nuevo.name == spot.name ");
	    System.out.println(nuevo.name == spot.name);
	    System.out.print("nuevo.name == scruffy.name ");
		System.out.println(nuevo.name == scruffy.name);
		System.out.print("nuevo.name == nuevo.name ");
		System.out.println(nuevo.name == nuevo.name);
		System.out.println("nuevo.name.equals(spot.name) " + nuevo.name.equals(spot.name));
		System.out.println("nuevo.name.equals(scruffy.name) " + nuevo.name.equals(scruffy.name));
		System.out.println("nuevo.name.equals(nuevo.name) " + nuevo.name.equals(nuevo.name));
		System.out.println(" ");
		
		// Cambiamos las referencias
		spot.name = nuevo.name;
	    spot.says = nuevo.says;
	    
		// Comparamos las referencias
	    System.out.println("Despues de cambiar las referencias");
	    System.out.println("--------------------------------\n");
	    System.out.println("El perro se llama: " + spot.name + " y ladra: " + spot.says);
		System.out.println("El perro se llama: " + scruffy.name + " y ladra: " + scruffy.says);		
		System.out.println("El perro se llama: " + nuevo.name + " y ladra: " + nuevo.says);
		System.out.println(" ");
		System.out.print("nuevo.name == spot.name ");
	    System.out.println(nuevo.name == spot.name);
	    System.out.print("nuevo.name == scruffy.name ");
		System.out.println(nuevo.name == scruffy.name);
		System.out.print("nuevo.name == nuevo.name ");
		System.out.println(nuevo.name == nuevo.name);
		System.out.println("nuevo.name.equals(spot.name) " + nuevo.name.equals(spot.name));
		System.out.println("nuevo.name.equals(scruffy.name) " + nuevo.name.equals(scruffy.name));
		System.out.println("nuevo.name.equals(nuevo.name) " + nuevo.name.equals(nuevo.name));
	} //public
} //class
