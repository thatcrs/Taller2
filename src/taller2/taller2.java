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
//	for (Persona copia:todas_las_personas) {
//			
//		if (copia.getRut_padre() != "NO-IDENTIFICA") {
//			 
//			String rut_padre = copia.getRut_padre();
//				
//			for (Persona copia2:todas_las_personas) {
//				
//				if (copia2.getRut().equals(rut_padre)){
//					
//					int persona1 = todas_las_personas.indexOf(copia);
//					int persona2 = todas_las_personas.indexOf(copia2);
//									
//					todas_las_personas.get(persona1).setRut_padre(rut_padre);
//					todas_las_personas.get(persona1).setPadre(copia2);
//					
//					todas_las_personas.get(persona2).setListaDescendientes(copia);
//				} else {
//					
//					
//					
//				}
//			}
//		}	
//			if (copia.getRut_madre() != "NO-IDENTIFICA") {
//				String rut_madre = copia.getRut_madre();
//				
//				for (Persona copia2:todas_las_personas) {
//					
//					if (copia2.getRut().equals(rut_madre)){
//						
//						int persona1 = todas_las_personas.indexOf(copia);
//						int persona2 = todas_las_personas.indexOf(copia2);
//										
//						todas_las_personas.get(persona1).setRut_madre(rut_madre);
//						todas_las_personas.get(persona1).setMadre(copia2);
//						
//						todas_las_personas.get(persona2).setListaDescendientes(copia);
//					}
//				}
//			}
//			if (copia.getRut_pareja() != "NO-IDENTIFICA") {
//				String rut_pareja = copia.getRut_pareja();
//				
//				for (Persona copia2:todas_las_personas) {
//					
//					if (copia2.getRut().equals(rut_pareja)) {
//						
//						int persona1 = todas_las_personas.indexOf(copia);
//						int persona2 = todas_las_personas.indexOf(copia2);
//						
//						todas_las_personas.get(persona1).setRut_pareja(rut_pareja);
//						todas_las_personas.get(persona1).setPareja(copia2);
//						
//					}
//				}
//			}
//	}
	
	Scanner lector = new Scanner(System.in);
	
	System.out.println("Cual es tu rut (Forma 12.345.678-0");
	
	String rut_nuevo = lector.nextLine();
	i=0;

	//BUSCADOR DE FAMILIARES, ITEM 1, A)
	for (Persona copia4:todas_las_personas) {
		
		if (copia4.getRut().equals(rut_nuevo)) {
			
			if (copia4.getMadre()==null) {
				
				System.out.println("NO TENI MAMÁ WUAJAJA");
			} else {
			System.out.println("Tu madre es " + copia4.getMadre().getNombre());
			}
			if (copia4.getPadre()==null) {
				
				System.out.println("NO TENI PAPÁ WUAJAJA");
			} else {
			System.out.println("Tu padre es " + copia4.getPadre().getNombre());
			}
			if (copia4.getListaHermanos().size() == 0) {
				
				System.out.println("NO TIENES HERMANOS");
			}else {
				
				for (i=0;i<copia4.getListaHermanos().size();i++) {
					System.out.println(copia4.getListaHermanos().get(i).getNombre());
			}
			}
			i=0;
			if (copia4.getListaDescendientes().size() == 0) {
				
				System.out.println("NO TIENES HIJOS");
			}else {
				System.out.println("Tienes "+ copia4.getListaDescendientes().size() + " Hijos, y estos son:");
				for (i=0;i<copia4.getListaDescendientes().size();i++) {
					System.out.println(copia4.getListaDescendientes().get(i).getNombre());
			}
			}
			if (copia4.getPareja() == null) {
					System.out.println("No tienes pareja");
			}else {
				System.out.println("Tu pareja es: " + copia4.getPareja().getNombre());
			}
		}
	}
	
	}

	
		
	

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















//			
//			}
//		System.out.println(progenitoras.size());
//		System.out.println(descendientes.size());
//		
//		
//		for(progenitoras progenitorass : progenitoras) {
//			
//			for (progenitoras progenitorass2 : progenitoras) {
//				
//				
//				if (progenitorass.getRut().equals(progenitorass2.getRut_madre())) {
//								
//					progenitorass.setListaDescendientes(progenitorass2);
//				}
//				j++;
//
//		}
//		}
//		System.out.println(progenitoras.get(1).getListaDescendientes());
//		for(progenitoras progenitorass : progenitoras) {
//		
//			for (descendientes descendientess : descendientes) {
//				
//				
//				if (progenitorass.getRut().equals(descendientess.getRut_madre())) {
//								
//					progenitorass.setListaDescendientes(descendientess);
//				}
//				j++;
//
//		}
//
//		}
//		System.out.println(progenitoras.get(0).toString());
//		archivo1.close();
//		archivo2.close();
//		System.out.println("ola");
//
//			}	for (Persona copia:todas_las_personas) {
//






