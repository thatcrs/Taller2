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
		
	for (Persona copia:todas_las_personas) {
			
		if (copia.getRut_padre() != "NO-IDENTIFICA") {
			 
			String rut_padre = copia.getRut_padre();
				
			for (Persona copia2:todas_las_personas) {
				
				if (copia2.getRut().equals(rut_padre)){
					
					int persona1 = todas_las_personas.indexOf(copia);
					int persona2 = todas_las_personas.indexOf(copia2);
									
					todas_las_personas.get(persona1).setRut_padre(rut_padre);
					todas_las_personas.get(persona1).setPadre(copia2);
					
					todas_las_personas.get(persona2).setListaDescendientes(copia);
				} else {
					
					
					
				}
			}
		}	
			if (copia.getRut_madre() != "NO-IDENTIFICA") {
				String rut_madre = copia.getRut_madre();
				
				for (Persona copia2:todas_las_personas) {
					
					if (copia2.getRut().equals(rut_madre)){
						
						int persona1 = todas_las_personas.indexOf(copia);
						int persona2 = todas_las_personas.indexOf(copia2);
										
						todas_las_personas.get(persona1).setRut_madre(rut_madre);
						todas_las_personas.get(persona1).setMadre(copia2);
						
						todas_las_personas.get(persona2).setListaDescendientes(copia);
					}
				}
			}		
	}
	for (Persona copia3:todas_las_personas) {
		
		System.out.println(copia3);
		
	}
			
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
//			}
//}
//
