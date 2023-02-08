package ficheros;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

	public static void ejercicio5(List<String> lineas) {
		String palabra = lineas.get(new Random().nextInt(lineas.size()));
		boolean encontrado=false;
		int intentos=3;
		Scanner  sc = new Scanner(System.in);
		do {
			System.out.println("Trata de adivinar el nombre:");
			if(palabra.equals(sc.nextLine())) {
				encontrado=true;
			}else {
				intentos--;
				System.out.println(intentos+" restantes");
			}
		} while (!encontrado && intentos>0);
		if (encontrado) {
			System.out.println("Felicidades el nombre era: "+palabra);
		}else {
			System.out.println("No pudiste adivinar el nombre");
		}
		sc.close();
	}
	
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero: ");
//		String nombreRuta = sc.nextLine();
//		List<String> lineas = Ejemplos.devolverLineasJava8(Paths.get("datos",nombreRuta));
		List<String> lineas = Ejemplos.devolverLineasJava8(Paths.get("datos","nombres.txt"));
		if(lineas!=null) {
			System.out.println("Datos encontrados");
			lineas.stream().forEach(e->System.out.println(e));
			ejercicio5(lineas);
		}else {
			System.out.println("Datos no encontrados");
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		ejercicio7();
	}
}
