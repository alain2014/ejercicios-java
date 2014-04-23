package com.alainmorrondo.funciones;

import java.util.Vector;

public class Complejo {

	private double pReal;
	private double pImaginaria;
	private static int instances = 0;

	public Complejo() {
		this.pReal = 1.0;
		this.pImaginaria = 1.0;
		++ instances;
	}

	public Complejo(double pReal, double pImaginaria) {
		this.pReal = pReal;
		this.pImaginaria = pImaginaria;
		++ instances;
	}

//********* GETTERS Y SETTERS ****************
	
	public double getpReal() {
		return pReal;
	}

	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	public double getpImaginaria() {
		return pImaginaria;
	}

	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

//********* GETTERS Y SETTERS ****************

	public Complejo asignar(double x, double y) {
		++ instances;
		this.pReal = x;
		this.pImaginaria = y;
		
		return this;
	}

	public Complejo sumar(Complejo b) {
		++ instances;
		this.pReal += b.pReal;
		this.pImaginaria += b.pImaginaria;
		
		return this;
	}

	public boolean equals (double pReal) {
		//++ instances;
		System.out.println("pReal: " + pReal);
		System.out.println("this.pReal: " + this.pReal);
		
		if (this.pReal == pReal) {
			return true;
		} else {
			return false;
		}
	}
	
	public Complejo imprimir() {
		++ instances;
		System.out.println("Real: " + this.pReal);
		System.out.println("Imaginaria: " + this.pImaginaria);
		
		return this;
	}

	public void imprimirInstancias() {

		System.out.println("Instancias: " + instances);

	}
}
