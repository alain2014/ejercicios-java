package com.alainmorrondo.funciones;

import java.util.Vector;

public abstract class ClaseCalcularNumeroPrimo {

	public static Vector<Integer> calcularNumeroPrimo(int numero) {
		Vector<Integer> v = new Vector<Integer>();

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				System.out.println("Entra: " + i);
				v.add(new Integer(i));
			}
		}

		//System.out.println(v);
		
		return v;
	}

}
