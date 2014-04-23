package com.alainmorrondo.funciones;

import java.util.Scanner;

public class ComprobarDNI {

	public static boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static String letraDNI(int dni) {
		return String.valueOf("") + NIF_STRING_ASOCIATION.charAt(dni % 23);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un DNI: ");
		Scanner entrada = new Scanner(System.in);
		String dni = "";

		dni = entrada.next();
		// System.out.println("DNI introducido: " + dni);

		// ValidarDNI

		if (dni.length() == 1) {
			System.out.println("DNI DEMASIADO CORTO");
			return;
		}

		if (dni.length() > 9) {
			System.out.println("DNI NO VALIDO, DEMASIADO LARGO");
			return;
		}

		String letra = dni.substring(dni.length() - 1);
		// System.out.println("LETRA DNI: " + letra);

		if (isNumeric(letra) == true) {
			System.out.println("EL ULTIMO CARACTER NO ES UNA LETRA");
			return;
		}

		String numero_dni = dni.substring(0, dni.length() - 1);
		// System.out.println("Nœmero DNI: " + numero_dni);

		int sw = 0;

		for (int i = 0; i < dni.length() - 1; i++) {

			// System.out.println(i + " --> " + dni.substring(i, i+1));

			if (isNumeric(dni.substring(i, i + 1)) == false) {
				System.out.println("EL CARACTER " + dni.substring(i, i + 1)
						+ " NO ES UN NòMERO");
				sw = 1;
			}
		}

		if (sw == 1) {
			// System.out.println("DNI NO VALIDO, NO ES UN NUMERO Y UNA LETRA");
			return;
		}

		// LLEGADOS A ESTE PUNTO, TENEMOS UN NUMERO Y UNA LETRA, MIRAR SI EL
		// NUMERO ES MAYOR QUE 8

		// LLEGADOS A ESTE PUNTO, TENEMOS UN NUMERO DE DNI Y UNA LETRA, MIRAR
		// ALGORITMO
		String letra_nif = letraDNI(Integer.parseInt(numero_dni));

		System.out.println("LA LETRA PARA EL DNI " + numero_dni + " ES LA: "
				+ letra_nif);

		//System.out.println(letra.compareTo(letra_nif));

		if (letra.compareTo(letra_nif) > 0) {
			System.out.println("LETRA: " + letra
					+ " INCORRECTA, LA LETRA CORRECTA ES LA: " + letra_nif);
			return;
		}

		System.out.println("EL DNI ES CORRECTO");
	}
}
