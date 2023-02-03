package org.example;

public class Empleado {
	String nombre;

	// CONSTRUCTORES

	public Empleado() {
	}

	// METODO ESPECIAL
	// la licuadora
	// es el tipo de retorno de la funcionn
	public String saludar(String nombresito) {
		String saludo = "Hola " + nombresito;
		return saludo;

	}

	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}
}