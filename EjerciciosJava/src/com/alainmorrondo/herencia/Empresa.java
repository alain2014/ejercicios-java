package com.alainmorrondo.herencia;

import com.alainmorrondo.herencia.IEmpleado;

public class Empresa {

	private String nombre;
	private int tamanio;
	private IEmpleado[] empleados;

	public Empresa(String nombre, int tamanio) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		empleados = new IEmpleado[tamanio];
	}

	public String getNombre() {
		return nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public IEmpleado getEmpleado(int num) throws IndexOutOfBoundsException {
		return empleados[num];
	}

	public void despideEmpleado(int num) throws IndexOutOfBoundsException {
		empleados[num] = null;
	}
	public void nuevoEmpleado(String nombre, int sueldo) throws IndexOutOfBoundsException {
		IEmpleado empleado = new Empleado(this, nombre, sueldo);
		empleados[empleado.getNumEmpleado()] = empleado;
	}

}
