package taller2;

import java.util.List;

public class descendientes implements List<descendientes> {
	
	private String nombre;
	private int edad;
	private String rut;
	private String rut_madre;
	private progenitores rut_padre;
	
	
	public descendientes(String nombre, int edad, String rut, String rut_madre, String rut_padre) {
		
		
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.rut_madre = rut_madre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getRut_madre() {
		return rut_madre;
	}


	public void setRut_madre(String rut_madre) {
		this.rut_madre = rut_madre;
	}


	public progenitores getRut_padre() {
		return rut_padre;
	}


	public void setRut_padre(progenitores rut_padre) {
		this.rut_padre = rut_padre;
	}


	@Override
	public String toString() {
		return "descendientes [nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + ", rut_madre=" + rut_madre
				+ ", rut_padre=" + rut_padre + "]";
	}
}
