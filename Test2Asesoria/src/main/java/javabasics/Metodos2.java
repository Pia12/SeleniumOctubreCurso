package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {

	static String heredar= "Mensaje de texto";
	protected static List<String> listaDeNombres(){
		
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Velez");
		listaNombres.add("Sergio");
		listaNombres.add("Ramones");
		listaNombres.add("Sergio");		
	return listaNombres;
	}
	
	protected static List<String> listaDeNombres2(){
		
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Velez");
		listaNombres.add("Sergio");
		listaNombres.add("Ramones");
		listaNombres.add("Sergio");		
	return listaNombres;
	}
	
	protected static List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(78);
		listaNumeros.add(12);
	return listaNumeros;
	}
	
}
