package com.alainmorrondo.bucles;

import java.util.Scanner;

public class Ej15_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int) (100 * Math.random() + 1);

		System.out.println("Número a adivinar: " + x);

		System.out.println("Adivine un número entero entre 1 y 100: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();

		if (numero == x) {
			System.out.println("Has acertado a la primera!!!");
		} else {

			do {
				System.out.println("Vuelve a intentarlo: ");
				Scanner entrada2 = new Scanner(System.in);
				numero = entrada2.nextInt();
			} while (numero != x);

			System.out.println("Has acertado pero no a la primera");
		}
	}

}

// Construir un programa que simule el juego de la adivinanza de un número. El
// ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene
// cinco oportunidades para acertarlo. Después de cada intento el programa debe
// indicarle al usuario si el número introducido por él es mayor, menor o igual
// al número a adivinar, y el número de intentos restantes.
//
// Nota: para generar el valor aleatorio puede emplearse la sentencia:
//
// int x = (int) (100*Math.random()+1);