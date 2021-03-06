package com.alainmorrondo.bucles;

import java.util.Scanner;

public class Ej15_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int) (100 * Math.random() + 1);

		System.out.println("N�mero a adivinar: " + x);

		System.out.println("Adivine un n�mero entero entre 1 y 100: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();

		int contador = 0;
		
		if (numero == x) {
			System.out.println("Has acertado a la primera!!!");
		} else {
			++ contador; //Intentos = 1
			do {
				++ contador;
				System.out.println("Vuelve a intentarlo: ");
				Scanner entrada2 = new Scanner(System.in);
				numero = entrada2.nextInt();
			} while (numero != x && contador < 5);

			if (contador == 5) {
				System.out.println("Lo sentimos, no has acertado en los 5 intentos que ten�as");				
			} else {
				System.out.println("Has acertado pero no a la primera, has acertado en el intento n�mero " + contador);				
			}
		}
	}

}

// Construir un programa que simule el juego de la adivinanza de un n�mero. El
// ordenador debe generar un n�mero aleatorio entre 1 y 100 y el usuario tiene
// cinco oportunidades para acertarlo. Despu�s de cada intento el programa debe
// indicarle al usuario si el n�mero introducido por �l es mayor, menor o igual
// al n�mero a adivinar, y el n�mero de intentos restantes.
//
// Nota: para generar el valor aleatorio puede emplearse la sentencia:
//
// int x = (int) (100*Math.random()+1);