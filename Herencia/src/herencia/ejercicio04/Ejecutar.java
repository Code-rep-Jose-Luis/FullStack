package herencia.ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Ejecutar {

	public static void ejercicio() {
		Persona persona1=new Persona("4564564Z","Fran",30);
		Persona persona2=new Persona("4564151B","Juan",25);
		Persona persona3=new Persona("1231546C","Pepe",20);
		Persona persona4=new Persona("1564541A","Alejandro",35);
		List<Persona> personas=new ArrayList<Persona>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		Persona copia=new Persona(personas.get(1));
		copia.setNombre("Pedro");
		
		/*int posicion=0;
		if((posicion=personas.indexOf(copia))!=-1) {
			System.out.println("Persona enconrtada en la posicion "+posicion);
		}*/
		
		for (int i = 0; i < personas.size(); i++) {
			if(personas.get(i).equals(copia)) {
				System.out.println("Persona enconrtada en la posicion "+i);
				System.out.println("Persona enconrtada "+personas.get(i));
				System.out.println("Copia: "+copia);
				
			}
		}		
		personas.forEach(e->System.out.println(e));
		System.out.println(copia);
		

	}
	
	public static void main(String[] args) {
		ejercicio();
	}
}
