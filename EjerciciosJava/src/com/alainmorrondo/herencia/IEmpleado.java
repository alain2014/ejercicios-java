package com.alainmorrondo.herencia;

public interface IEmpleado {

	public int getNumEmpleado();
	public String getNombre();
	public double getSueldo();
	public void setNombre(String nombre);
	public void setSueldo(double sueldo);
	public void despedir();
}
