package taller2;

import java.util.List;

public class Persona {
	
	private String nombre;
	private String rut;
	private int edad;
	private String rut_madre;
	private String rut_padre;
	private String rut_pareja;
	private List<Persona> listaDescendientes; 
	
	public Persona(String nombre, String rut, int edad, String rut_madre) {
		
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.rut_madre = rut_madre;
		this.rut_padre = rut_padre;
		this.rut_pareja = rut_pareja;
		this.listaDescendientes = listaDescendientes;
		
		if (rut_pareja == null) {
			
			rut_pareja = "NO-IDENTIFICA";
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut_madre() {
		return rut_madre;
	}

	public void setRut_madre(String rut_madre) {
		this.rut_madre = rut_madre;
	}

	public String getRut_padre() {
		return rut_padre;
	}

	public void setRut_padre(String rut_padre) {
		this.rut_padre = rut_padre;
	}

	public String getRut_pareja() {
		return rut_pareja;
	}

	public void setRut_pareja(String rut_pareja) {
		this.rut_pareja = rut_pareja;
	}

	public List<Persona> getListaDescendientes() {
		return listaDescendientes;
	}

	public void setListaDescendientes(List<Persona> listaDescendientes) {
		this.listaDescendientes = listaDescendientes;
	}
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", rut_madre=" + rut_madre
				+ ", rut_padre=" + rut_padre + ", rut_pareja=" + rut_pareja + ", listaDescendientes="
				+ listaDescendientes + "]";
	}
}
