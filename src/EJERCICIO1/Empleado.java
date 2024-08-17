package EJERCICIO1;

public class Empleado {
	private final int _id;
	private String _name;
	private int _age;
	private static int cont = 1000;

	public Empleado() {
		_id = cont;
		cont++;
		_name = "sin nombre";
		_age = 99;
	}

	public Empleado(String name, int age) {
		_id = cont;
		cont++;
		this._name = name;
		this._age = age;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public int get_id() {
		return _id;
	}
	
	public static int devuelveProximoID() {
		return cont++;
	}
	//METHOD PUBLIC
	@Override
	public String toString() {
		return "Empleado: " + _name + "\n Edad: " + _age + "\n Legajo: "  + _id + "\n";
	}
	}