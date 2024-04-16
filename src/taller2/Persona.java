package taller2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	
	private String nombre;
	private String rut;
	private int edad;
	private String rut_madre;
	private String rut_padre;
	private String rut_pareja;
	private List<Persona> listaDescendientes;
	private Persona madre;
	private Persona padre;
	private List<Persona> listaHermanos;
	
	
	public Persona(String nombre, String rut, int edad, String rut_madre) {
		
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.rut_madre = rut_madre;
		this.rut_padre = rut_padre;
		this.rut_pareja = rut_pareja;
		this.listaDescendientes=new ArrayList<Persona>();
		this.listaHermanos=new ArrayList<Persona>();
		
		
		
		this.padre = padre;
		
		
		
		if (rut_pareja == null) {
			
			rut_pareja = "NO-IDENTIFICA";
		}
		if (rut_padre == null) {
			
			rut_padre = "NO-IDENTIFICA";
			
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
	
	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona copia2) {
		this.padre = copia2;
	}

	public List<Persona> getListaDescendientes() {
		return listaDescendientes;
	}

	public void setListaDescendientes(Persona decendiente) {
		this.listaDescendientes.add(decendiente);
	}
	
	public List<Persona> getListaHermanos() {
		return listaHermanos;
	}
	
	public void setListaHermanos(Persona hermano) {
		this.listaHermanos.add(hermano);
	}	
	
	
	
	
	
	public String toString() {
		
		if (listaDescendientes.size() == 0) {
		
			return "Nombre: " + nombre + "\nRut: " + rut + "\nEdad: " + edad + "\nRut de la madre: " + rut_madre
				+ "\nRut del padre: " + rut_padre + "\nRut de la pareja: " + rut_pareja + "\nDescendientes: "
				+"\nNo tiene Descendientes\n";
	
		} else {
			
			return "Nombre: " + nombre + "\nRut: " + rut + "\nEdad: " + edad + "\nRut de la madre: " + rut_madre
					+ "\nRut del padre: " + rut_padre + "\nRut de la pareja: " + rut_pareja + "\nDescendientes: "
					+ listaDescendientes + "\n";
			
		}
	}
}
