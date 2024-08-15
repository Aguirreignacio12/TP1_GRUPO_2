package EJERCICIO1;

public class Main {

	public static void main(String[] args) {
	Empleado x = new Empleado("Ignacio Aguirre", 30) ;
	Empleado y = new Empleado();
		
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println(Empleado.devuelveProximoID());
	}

}
