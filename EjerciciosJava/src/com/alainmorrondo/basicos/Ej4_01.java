package com.alainmorrondo.basicos;

import java.util.Scanner;

public class Ej4_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el radio de la esfera: ");
		Scanner entrada = new Scanner(System.in);
		double Radio = entrada.nextDouble();
		
		//System.out.println("Entrada " + Radio);
		
		double R = Radio;
		double V = (4/3) * Math.PI * Math.pow(R, 3);
		double S = 4 * Math.PI * Math.pow(R, 2);
		System.out.println("El volumen de la esfera de radio " + R + " es " + V);
		System.out.println("La superficie de la esfera de radio " + R + " es " + S);
	}

}
