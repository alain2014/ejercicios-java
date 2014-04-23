package com.alainmorrondo.funciones;

import java.util.Scanner;

public class ComprobarDNI {

	public static boolean isNumeric(String str)  
	  {  
	    try  
	    {  
	      double d = Double.parseDouble(str);  
	    }  
	    catch(NumberFormatException nfe)  
	    {  
	      return false;  
	    }  
	    return true;  
	  }  
	
	public static int calculaLetraDni(int digitosDelDNI) {
	    String tablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
	    
	    return tablaLetras.charAt(digitosDelDNI % 23);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un nœmero: ");
		Scanner entrada = new Scanner(System.in);
		String dni = "";

		dni = entrada.next();
		System.out.println("DNI introducido: " + dni);
		
		//ValidarDNI
		
		if (dni.length() == 1) {
			System.out.println("DNI DEMASIADO CORTO");
			return;
		}
		
		String letra = dni.substring(dni.length() - 1);
		System.out.println("LETRA DNI: " + letra);
		
		if (isNumeric(letra) == true) {
			System.out.println("EL ULTIMO CARACTER NO ES UNA LETRA");
			return;
		}
		
		String numero_dni = dni.substring(0, dni.length() - 1);
		System.out.println("Nœmero DNI: " + numero_dni);
		
		int sw = 0;
		
		for (int i = 0; i < dni.length() - 1; i++) {

			System.out.println(i + " --> " + dni.substring(i, i+1));

			if (isNumeric(dni.substring(i, i+1)) == false) {
				System.out.println("EL CARACTER " + dni.substring(i, i+1)  + " NO ES UN NòMERO");
				sw = 1;
			}
		}
		
		if (sw == 1) {
			System.out.println("DNI NO VALIDO, NO ES UN NUMERO Y UNA LETRA");
			return;
		}
			
		//LLEGADOS A ESTE PUNTO, TENEMOS UN NUMERO Y UNA LETRA, MIRAR SI EL NUMERO ES MAYOR QUE 8
		
		if ( numero_dni.length() > 8 ) {
			System.out.println("DNI NO VALIDO, DEMASIADO LARGO");
			return;
		}
		
		//LLEGADOS A ESTE PUNTO, TENEMOS UN NUMERO DE DNI Y UNA LETRA, MIRAR ALGORITMO
		
		int a = calculaLetraDni(Integer.parseInt(numero_dni));
		
		System.out.println("VALIDACION" + a);
		
		
		
		
		
		

		
		
//		if (dni.length()  ) {
//			System.out.println("Debes introducir un DNI");
//		}
		
	}

}
