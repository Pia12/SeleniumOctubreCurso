package javabasics;

public class Metodos {
	// inicializar la clase con ciertos valores podemos
	// tener muchos
	// constructor sin parametro
	
	int numero1, numero2;
	
	public Metodos(int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;

	}
  // constructor con parametro
	public Metodos() {
	
	}

	

//método void
	public void mostrarMensaje() {
		System.out.println("Hola Mundo");
	}

	public int sumatoria() {
		return numero1 + numero2;
	}

	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}
	public static void prueba() {
		System.out.println("Metodo estatico");
	}
}