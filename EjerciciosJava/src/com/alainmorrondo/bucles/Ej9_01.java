package com.alainmorrondo.bucles;

import java.util.Scanner;

public class Ej9_01 {

	/**
	 * @param args
	 */
	
	// Construir un programa que calcule el factorial de un valor num�rico
	// introducido como par�metro o argumento en la l�nea de comandos.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un n�mero entero: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int resultado = numero;

		for (int i = 1; i < numero; i++) {
			resultado = resultado * i;
			System.out.println("Resultado " + resultado + "; i = " + i);
		}

		System.out.println("Factorial de " + numero + " es igual a "
				+ resultado);
	}
}

