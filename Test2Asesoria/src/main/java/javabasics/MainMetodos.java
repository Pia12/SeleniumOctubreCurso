package javabasics;
import java.util.Collections;
import java.util.Iterator;
/*libreria para la lista*/
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends Metodos2 {

	public static void main(String[] args) {
		// si el metodo es estatico hacemos referencia a la clase
		// si no es estatico hacemos un objeto
		// constructor es un metodo igual que la clase
		// creamos instancias de esa clase
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos(9,3);
		// crear instancia
		Metodos2 objeto = new Metodos2();
		

		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		System.out.println(heredar);
		
		nombreObjeto.mostrarMensaje();
		String elementoGuardado = nombreObjeto.mostrarNombre("Pia");
		System.out.println(elementoGuardado);
		Metodos.prueba();
		
		//variable donde guardamos esos valores de sita
		List<String> listaNombres= listaDeNombres();
		List<Integer> listaNumeros= listaNumeros();
		Collections.sort(listaNombres,Collections.reverseOrder());
		
		//recorrer la lista y mostrar todos los elementos de la lista 
		// usuar ciclo for en for sabenmos  las veces que se va a repetir 
		// pero en un while no se sabe.
		// en java 8 ya no se tiene que hace el i
		// 1. muestra los elementos de la lista 
		for (String nombre : listaNombres) { // por cada nombre que se ha va a mostrar
			System.out.println(nombre);
			
		}
		
		//forma antigua meustra los elementos de la lista
		System.out.println("For con dos puntos");
		for(int indice=0;indice<listaNombres.size();indice++) {
			System.out.println(listaNombres.get(indice));
		}
		System.out.println("For con index");
		
		for (int numero:listaNumeros) {
			System.out.println(numero);
		}
		//Sin elementos duplicados
		// 	// quitar elementos repetidos y luego ordenarlas
		List<String>nombresSinElementosDuplicados = listaNombres
				.stream() // regresar secuencia de lista
				.distinct() // quita los elementos repetidos
				.collect(Collectors.toList()); //muestra como una lista
		Collections.sort(nombresSinElementosDuplicados);
		System.out.println(nombresSinElementosDuplicados);
		Collections.sort(nombresSinElementosDuplicados,Collections.reverseOrder());
		System.out.println(nombresSinElementosDuplicados);
		System.out.println(Collections.max(listaNumeros));
		System.out.println(Collections.min(listaNumeros));
		Collections.sort(listaNumeros);//ordenar de menor a mayor
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros,Collections.reverseOrder()); //revertir de mayor a  menor
		System.out.println(listaNumeros);
	
		
		
		//cada iteracin guardamos en una variable temporalñ si coincide lo removemos
		//quitar elementos repetidos de numeros enteros
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();
		
		while (i.hasNext()) {
			Object temp = i.next();
			if(temp.equals(last)) { //removiendo si son iguales
				i.remove();
				numCount++; //numCount= numCount + 1
			}else
			{
				last=temp;
			}
		
		}
		System.out.println(numCount);
		System.out.println(listaNumeros);
		// Declarar las listas de nombres
		List<String> nombres1= listaDeNombres();
		List<String> nombres2= listaDeNombres2();
		//ordenar las listas
		Collections.sort(nombres1);
		Collections.sort(nombres2);
		//comparar las listas de nombres
		boolean isIgual = nombres1.equals(nombres2);
		System.out.println(isIgual);
		
		if (isIgual==true) {
			System.out.println("Las listas son iguales:\n");
			System.out.println("Lista1: "+ nombres1+" ]"+
			"Lista2: "+nombres2 + "");
		}else {
			System.out.println("Las listas no son iguales:\n");
			System.out.println("Lista1 "+ nombres1+" "+
					"Lista2: "+nombres2+"");
		}

	}
	
	
	

}
