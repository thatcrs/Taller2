package taller2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class taller2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File archivo_descendientes = new File("descendientes.txt");
		Scanner archivo1 = new Scanner(archivo_descendientes);
		List<descendientes> descendientes = new ArrayList<descendientes>();
		while (archivo1.hasNextLine()) {
			
			
			String linea = archivo1.nextLine();
			String[] partes = linea.split(",");
			String nombre = partes[0];
			int edad = Integer.parseInt(partes[1]);
			String rut = partes[2];
			String rut_madre = partes[3];
			String rut_padre = partes[4];
			
			descendientes.add(new descendientes(nombre,edad,rut,rut_madre,rut_padre));

	}
		System.out.println(descendientes.get(0).getRut_madre());
		File archivo_progenitoras = new File("progenitoras.txt");
		Scanner archivo2 = new Scanner(archivo_progenitoras); //archivo progenitoras.
		List<progenitoras> progenitoras = new ArrayList<progenitoras>();
		int i = 0;
		int j = 0;
		while (archivo2.hasNextLine()) {
			
			
			String linea = archivo2.nextLine();
			String[] partes = linea.split(",");
			String nombre = partes[0];
			int edad = Integer.parseInt(partes[1]);
			String rut = partes[2];
			String rut_pareja = partes[3];
			String rut_madre = partes[4];
			progenitoras.add(new progenitoras(nombre,rut,edad,rut_madre,rut_pareja));
			i++;
			

			}
		System.out.println(progenitoras.size());
		System.out.println(descendientes.size());
		for(progenitoras progenitorass : progenitoras) {
		
			for (descendientes descendientess : descendientes) {
				
				
				if (progenitorass.getRut().equals(descendientess.getRut_madre())) {
								
					progenitorass.setListaDescendientes(descendientess);
				}
				j++;

		}
			System.out.println(progenitoras.get(0).toString());
		}
		archivo1.close();
		archivo2.close();
		System.out.println("ola");

			}
}

