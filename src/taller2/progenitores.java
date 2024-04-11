package taller2;

import java.util.List;

public class progenitores {
	
	private String nombre;
	private int edad;
	private String rut;
	private String rut_pareja;
	private String rut_madre;
	private List<descendientes> listaDescendientes; 
	public progenitores(String nombre, int edad, String rut,String rut_pareja, String rut_madre) {
		
		
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
		this.rut_pareja = rut_pareja;
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

	public String getRut_pareja() {
		return rut_pareja;
	}

	public void setRut_pareja(String rut_pareja) {
		this.rut_pareja = rut_pareja;
	}

	public String getRut_madre() {
		return rut_madre;
	}

	public void setRut_madre(String rut_madre) {
		this.rut_madre = rut_madre;
	}

	public List<descendientes> getListaDescendientes() {
		return listaDescendientes;
	}

	public void setListaDescendientes(List<descendientes> listaDescendientes) {
		this.listaDescendientes = listaDescendientes;
	}
}
