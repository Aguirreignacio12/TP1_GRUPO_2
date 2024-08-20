package EJERCICIO1;

public class Empleado {
	private final int _id;
	private String _name;
	private int _age;
	private static int cont = 1440;

	protected Empleado() {
		_id = cont;
		cont++;
		_name = "sin nombre";
		_age = 99;
	}

	protected Empleado(String name, int age) {
		_id = cont;
		cont++;
		this._name = name;
		this._age = age;
	}

	protected String get_name() {
		return _name;
	}

	protected void set_name(String _name) {
		this._name = _name;
	}

	protected int get_age() {
		return _age;
	}

	protected void set_age(int _age) {
		this._age = _age;
	}

	protected int get_id() {
		return _id;
	}
	
	protected static int devuelveProximoID() {
		return cont++;
	}
	//METHOD PUBLIC
	@Override
	public String toString() {
		return "Empleado: " + _name + "\n Edad: " + _age + "\n Legajo: "  + _id + "\n";
	}
	}