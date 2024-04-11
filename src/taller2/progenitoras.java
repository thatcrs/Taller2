package taller2;

import java.util.List;

public class progenitoras {
	
	private String nombre;
	private String rut;
	private int edad;
	private String rut_madre;
	private String rut_pareja;
	private List<descendientes> listaDescendientes; 
	
	public progenitoras(String nombre, String rut, int edad, String rut_madre, String rut_pareja) {
		
		
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.rut_madre = rut_madre;
		this.rut_pareja = rut_pareja;

	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<descendientes> getListaDescendientes() {
		return listaDescendientes;
	}


	public void setListaDescendientes(List<descendientes> listaDescendientes) {
		this.listaDescendientes = listaDescendientes;
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


	public String getRut_pareja() {
		return rut_pareja;
	}


	public void setRut_pareja(String rut_pareja) {
		this.rut_pareja = rut_pareja;
	}


	@Override
	public String toString() {
		return "progenitoras [nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", rut_madre=" + rut_madre
				+ ", rut_pareja=" + rut_pareja + ", listaDescendientes=" + listaDescendientes + "]";
	}
}
