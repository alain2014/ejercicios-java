package com.alainmorrondo.arrays;

import java.util.Arrays;

public class Ej16_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_array = new int[10]; 
		
		//System.out.println("Longitud Array: " + mi_array.length);
		
		for (int i = 0; i < mi_array.length; i++) {
			mi_array[i] = (int) (100 * Math.random() + 1);
		}

		System.out.println("Array: " + Arrays.toString(mi_array));
		Arrays.sort(mi_array, 0, 10);
		System.out.println("Array ordenado: " + Arrays.toString(mi_array));
		
		int minimo = mi_array[0];
		int maximo = mi_array[9];
		
		System.out.println("M’nimo: " + minimo + " , M‡ximo: " + maximo);
		
	}

}

//Construir un programa que pida al usuario una serie de nœmeros enteros, los almacene en un array, y obtenga el m‡ximo y el m’nimo de los valores almacenados.