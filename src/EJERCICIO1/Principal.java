package EJERCICIO1;

public class Principal{

	public static void main(String[] args) {
	
		Empleado x = new Empleado() ;
	Empleado y = new Empleado("Ignacio Aguirre", 30);
	Empleado Z = new Empleado("Maria Lopez", 45);
	Empleado A = new Empleado("Pedro Bazan", 20);
		
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println(Z.toString());
		System.out.println(A.toString());
		
		System.out.println(Empleado.devuelveProximoID());
	}

}
