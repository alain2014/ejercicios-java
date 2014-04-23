package com.alainmorrondo.funciones;

public class PruebaComplejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo complex = new Complejo();
		
		complex.imprimir();
		
		complex.asignar(4, 7);
		
		complex.imprimir();
		
		complex.sumar(complex);
		
		complex.imprimir();
		
		System.out.println("TRUE/FALSE: " + complex.equals(7.0));
		
		System.out.println("TRUE/FALSE: " + complex.equals(8.0));
		
		complex.imprimirInstancias();
	}

}
