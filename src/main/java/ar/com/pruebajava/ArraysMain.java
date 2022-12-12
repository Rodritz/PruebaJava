package ar.com.pruebajava;

public class ArraysMain {

	public static void main(String[] args) {
		
		//los arrays son estructuras de un mismo tpo de dato
		String nombre1 = "nombre 1";
		String nombre2 = "nombre 2";
		String nombre3 = "nombre 3";
		String nombre4 = "nombre 4";
		
		//los Array pueden ser de tipo String, int y hasta de una clase
		String[] nombres = new String[4]; //se define que tipo de datos tendra el array, 
		int[] numeros = new int[5]; 		//y entre corchetes la cant de elementos que contiene el array
		//Coche[] coches = new Coche[2]; 
		
		//nombre en la posicion 0 = nombre del elemento
		nombres[0] = nombre1;
		nombres[1] = nombre2;
		nombres[2] = nombre3;
		nombres[3] = nombre4;
		
		
		//si quisieramos saber que elemento esta en una posicion determianda
		System.out.println(nombres[0]);
		
		//si quisieramos listarlos todos  tenemos que recorrer el array
		for(int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);//,mostrar todos los elementos 
		}
		
		//puedo declarar una variable de tipo array de String y pasar los elementos al mismo tiempo entre llaves
		//los corchetes van vacios y automaticamente se le asigna la cant de espacios segun los elementos
		String[] nombres2 = new String[] { nombre1, nombre2, nombre3, nombre4};
		for(int i = 0; i < nombres2.length; i++) {
			System.out.println(nombres2[i]);//,mostrar todos los elementos 
		}
	}

}
