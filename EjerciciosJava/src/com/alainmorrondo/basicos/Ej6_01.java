package com.alainmorrondo.basicos;

import java.util.Scanner;

public class Ej6_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca su peso en Kg: ");
		Scanner entrada = new Scanner(System.in);
		double Peso = entrada.nextDouble();

		System.out.println("Introduzca su altura en m: ");
		Scanner entrada2 = new Scanner(System.in);
		double Altura = entrada2.nextDouble();

		double IMC = Peso / Math.pow(Altura, 2);

		System.out.println("Tu IMC es: " + IMC);

		if (IMC < 16) {
			System.out.println("Criterio de ingreso en hospital");
		} else if (IMC >= 16 && IMC < 17) {
			System.out.println("Infrapeso");
		} else if (IMC >= 17 && IMC < 18) {
			System.out.println("Bajo peso");
		} else if (IMC >= 18 && IMC < 25) {
			System.out.println("Peso normal (saludable)");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("Sobrepeso");
		} else if (IMC >= 30 && IMC < 35) {
			System.out.println("Sobrepeso cr—nico");
		} else if (IMC >= 35 && IMC < 40) {
			System.out.println("Obesidad prem—rbida");
		} else if (IMC >= 40) {
			System.out.println("Obesidad m—rbida");
		} else {
			System.out.println("Tœ si que tienes que ir al Hospital");
		}
	}
}
