package com.alainmorrondo.funciones;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Ej22_01 {

	/**
	 * @param args
	 */
	public Vector<Integer> calcularNumeroPrimo(int numero) {
		Vector<Integer> v = new Vector<Integer>();

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				System.out.println("Entra: " + i);
				v.add(new Integer(i));
			}
		}

		return v;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un nœmero: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		System.out.println("Nœmero introducido: " + numero);

		//vv = new ClaseCalcularNumeroPrimo();
		
		Vector<Integer> v = new Vector<Integer>();

		//ClaseCalcularNumeroPrimo calc = new ClaseCalcularNumeroPrimo();
		//v = calc.calcularNumeroPrimo(numero);
		
		v = ClaseCalcularNumeroPrimo.calcularNumeroPrimo(numero);

		//calc.toArray();
		
		//System.out.println("Array ordenado: " + Arrays.toString(calc));
		System.out.println("Array: " + v);
	}

}
