package EJERCICIO1;

public class Empleado {
	int _id = 1;
	private String _name;
	private int _age;

	public Empleado() {
		_id = _id++;
		_name = "undefined";
		_age = -1;
	}

	public Empleado(int id,String name, int age) {
		this._id= id;
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
	
	//METHOD PUBLIC
	@Override
	public String toString() {
		return "Empleado " + _id + "\n name: " + _name  + "\n age: " + _age;
	}
	}