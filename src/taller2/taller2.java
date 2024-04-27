package taller2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class taller2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File archivo_descendientes = new File("descendientes.txt");
		Scanner archivo1 = new Scanner(archivo_descendientes);
		List<Persona> descendientes = new ArrayList<Persona>();
		int i=0;
		int j=0;
		List<Persona> todas_las_personas= new ArrayList<Persona>();
		
		
		while (archivo1.hasNextLine()) {
			
			
			String linea = archivo1.nextLine();
			String[] partes = linea.split(",");
			String nombre = partes[0];
			int edad = Integer.parseInt(partes[1]);
			String rut = partes[2];
			String rut_madre = partes[3];
			String rut_padre = partes[4];
			
			descendientes.add(new Persona(nombre,rut,edad,rut_madre));
			descendientes.get(i).setRut_padre(rut_padre);
			
			todas_las_personas.add(new Persona(nombre,rut,edad,rut_madre));
			todas_las_personas.get(j).setRut_padre(rut_padre);
			
			i++;
			j++;
			
	}


		
		File archivo_progenitoras = new File("progenitoras.txt");
		Scanner archivo2 = new Scanner(archivo_progenitoras); //archivo progenitoras.
		List<Persona> progenitoras = new ArrayList<Persona>();
		i = 0;
		
		while (archivo2.hasNextLine()) {
			
			
			String linea = archivo2.nextLine();
			String[] partes = linea.split(",");
			String nombre = partes[0];
			int edad = Integer.parseInt(partes[1]);
			String rut = partes[2];
			String rut_pareja = partes[3];
			String rut_madre = partes[4];
			progenitoras.add(new Persona(nombre,rut,edad,rut_madre));
			progenitoras.get(i).setRut_pareja(rut_pareja);
			todas_las_personas.add(new Persona(nombre,rut,edad,rut_madre));
			todas_las_personas.get(j).setRut_pareja(rut_pareja);
			
			j++;
			i++;
		}
	
		
	File archivo_progenitores = new File("progenitores.txt");
	Scanner archivo3 = new Scanner(archivo_progenitores); //archivo progenitores.
	List<Persona> progenitores = new ArrayList<Persona>();
	i=0;
	while (archivo3.hasNextLine()) {
		
	
		String linea = archivo3.nextLine();
		String[] partes = linea.split(",");
		String nombre = partes[0];
		
		int edad = Integer.parseInt(partes[1]);
		String rut = partes[2];
		String rut_pareja = partes[4];
		String rut_madre = partes[3];
		progenitores.add(new Persona(nombre,rut,edad,rut_madre));
		progenitores.get(i).setRut_pareja(rut_pareja);
		todas_las_personas.add(new Persona(nombre,rut,edad,rut_madre));
		todas_las_personas.get(j).setRut_pareja(rut_pareja);	
	
		j++;
		i++;
		
	}
		
	AsignarPersonas(todas_las_personas);
	Scanner lector = new Scanner(System.in);
	System.out.println("Cual es tu rut (Forma 12.345.678-0");
	String rut_nuevo = lector.nextLine();
	i=0;
	BuscadorPersonas(rut_nuevo,todas_las_personas);
	AgregarPersonas(lector,todas_las_personas);
	System.out.println("Cual es tu rut (Forma 12.345.678-0");
	rut_nuevo = lector.nextLine();
	BuscadorPersonas(rut_nuevo,todas_las_personas);
	}


	
		
	//Agregar una persona a la base de datos, creandola desde 0;
	private static List<Persona> AgregarPersonas(Scanner lector,List<Persona> todas_las_personas) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese rut y nombre de la persona que desea agregar");
		String rut = lector.nextLine();
		String nombre = lector.nextLine();
		System.out.println("Esta persona de que sexo es?(1 Femenino/2 Masculino)");
		
		int sexo_elegido = Integer.parseInt(lector.nextLine());
		int edad = Integer.parseInt(lector.nextLine());
		
		System.out.println("Ingrese ruts de familiares, primero Madre, Padre y Pareja, si no es conocido, solo escribír: NO-IDENTIFICA");
		String madre = lector.nextLine();
		String padre = lector.nextLine();
		String pareja = lector.nextLine();
		Persona persona_nueva = new Persona(nombre,rut,edad,madre);
		persona_nueva.setRut_padre(padre);
		persona_nueva.setRut_pareja(pareja);
		
		System.out.println("Cuantos hijos tiene esta persona? ");
		int cantidad_hijos = Integer.parseInt(lector.nextLine());
		List<Persona> hijos = new ArrayList<Persona>();
		if (cantidad_hijos != 0) {
			
			for (int i=0;i<cantidad_hijos;i++) {
				
			System.out.println("Ingrese rut, nombre y edad del hijo numero "+ (i+1));
			String hijo = lector.nextLine();
			String nombre_hijo = lector.nextLine();
			int edad_hijo = Integer.parseInt(lector.nextLine());
			
			if (sexo_elegido == 1) {
				
				Persona hijo_nuevo = new Persona(hijo,nombre_hijo,edad_hijo,rut);
				persona_nueva.setListaDescendientes(hijo_nuevo);
				todas_las_personas.add(hijo_nuevo);
			}else if (sexo_elegido == 2) {
				
				Persona hijo_nuevo = new Persona(nombre_hijo,hijo,edad_hijo,"NO IDENTIFICADO");
				hijo_nuevo.setRut_padre(rut);
				persona_nueva.setListaDescendientes(hijo_nuevo);
				todas_las_personas.add(hijo_nuevo);
			}
			
		}
		}
		for (Persona persona : todas_las_personas) {
			
			if (persona.getRut_madre() != "NO-IDENTIFICA") {
				
				if (persona_nueva.getRut_madre().equals(persona.getRut())) {
					
					persona_nueva.setMadre(persona);
					persona.setListaDescendientes(persona_nueva);
					
				}
			}if (persona.getRut_padre() != "NO-IDENTIFICA") {
				
				if (persona_nueva.getRut_padre().equals(persona.getRut())) {
					
					persona_nueva.setPadre(persona);
					persona.setListaDescendientes(persona_nueva);
				}
		}
		}
		todas_las_personas.add(persona_nueva);
		return todas_las_personas;
	}





	//BUSCADOR DE FAMILIARES, ITEM 1, A)
private static void BuscadorPersonas(String rut_nuevo, List<Persona> todas_las_personas) {
		// TODO Auto-generated method stub
		int i=0;
for (Persona copia:todas_las_personas) {
		
		if (copia.getRut().equals(rut_nuevo)) {
			
			if (copia.getMadre()==null) {
				
				System.out.println("Madre no identificada.");
			} else {
			System.out.println("Tu madre es " + copia.getMadre().getNombre());
			}
			if (copia.getPadre()==null) {
				
				System.out.println("Padre no identificado.");
			} else {
			System.out.println("Tu padre es " + copia.getPadre().getNombre());
			}
			if (copia.getListaHermanos().size() == 0) {
				
				System.out.println("Hermanos no identificados.");
			}else {
				
				for (i=0;i<copia.getListaHermanos().size();i++) {
					System.out.println(copia.getListaHermanos().get(i).getNombre());
			}
			}
			i=0;
			if (copia.getListaDescendientes().size() == 0) {
				
				System.out.println("NO TIENES HIJOS");
			}else {
				System.out.println("Tienes "+ copia.getListaDescendientes().size() + " Hijos, y estos son:");
				for (i=0;i<copia.getListaDescendientes().size();i++) {
					System.out.println(copia.getListaDescendientes().get(i).getNombre());
			}
			}
			if (copia.getPareja() == null) {
					System.out.println("No tienes pareja");
			}else {
				System.out.println("Tu pareja es: " + copia.getPareja().getNombre());
			}
		}
		}
}


//ASIGNADOR DE PERSONAS.
public static List<Persona> AsignarPersonas(List<Persona> todas_las_personas) {
	
	for (Persona copia1:todas_las_personas) {

		if (copia1.getRut_madre() != "NO-IDENTIFICA") {
		String rut_madre = copia1.getRut_madre();
		
			for (Persona copia2 : todas_las_personas) {
				
				if (copia2.getRut().equals(rut_madre)) {
					
					int persona1 = todas_las_personas.indexOf(copia1);
					int persona2 = todas_las_personas.indexOf(copia2);
					
					todas_las_personas.get(persona1).setRut_madre(rut_madre);
					todas_las_personas.get(persona1).setMadre(copia2);
					
					todas_las_personas.get(persona2).setListaDescendientes(copia1);
			}
		}
	
	}
	
		if (copia1.getRut_padre() != "NO-IDENTIFICA") {
			String rut_padre = copia1.getRut_padre();
			
			for (Persona copia2 : todas_las_personas) {
				
				if (copia2.getRut().equals(rut_padre)) {
					int persona1 = todas_las_personas.indexOf(copia1);
					int persona2 = todas_las_personas.indexOf(copia2);
					
					todas_las_personas.get(persona1).setRut_padre(rut_padre);
					todas_las_personas.get(persona1).setPadre(copia2);
					
					todas_las_personas.get(persona2).setListaDescendientes(copia1);
		}
	}
}
				


		if (copia1.getRut_pareja() != "NO-IDENTIFICA") {
			String rut_pareja = copia1.getRut_pareja();
			
			for (Persona copia2 : todas_las_personas) { 
				
				if (copia2.getRut().equals(rut_pareja)) {
				
					int persona1 = todas_las_personas.indexOf(copia1);
					int persona2 = todas_las_personas.indexOf(copia2);
				
				
					todas_las_personas.get(persona1).setRut_pareja(rut_pareja);
					todas_las_personas.get(persona1).setPareja(copia2);
			
		}
		}
		}
	
}
	
	return todas_las_personas;
}
}






