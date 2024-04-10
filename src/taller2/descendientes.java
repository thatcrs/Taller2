package taller2;

public class descendientes {
	
	private String nombre;
	private int edad;
	private String rut;
	private progenitoras rut_madre;
	private progenitores rut_padre;
	
	
	public descendientes(String nombre, int edad, String rut, String rut_madre, String rut_padre) {
		
		
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
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


	public progenitoras getRut_madre() {
		return rut_madre;
	}


	public void setRut_madre(progenitoras rut_madre) {
		this.rut_madre = rut_madre;
	}


	public progenitores getRut_padre() {
		return rut_padre;
	}


	public void setRut_padre(progenitores rut_padre) {
		this.rut_padre = rut_padre;
	}
}
