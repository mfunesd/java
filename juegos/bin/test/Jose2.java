package test;

public class Jose2 {
	
	static{
		Jose prueba = new Jose(4);
		
		prueba.getCuentas();
		prueba.printCuentas(prueba.getCuentas());
		
		
		Jose prueba2 = new Jose();
		Jose.printCuentas(prueba2.getCuentas());
		
		Jose3 prueba3 = new Jose3(5, 10);
		prueba3.setCuentas(20);
		Jose.printCuentas(prueba3.getCuentas());
		
	}
	
	public Jose2() {
		
	}

}
