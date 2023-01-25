package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Ejemplos {

	public static void ejemplo1() {
		int[] numeros; // Declarar la variable
		numeros = new int[5]; // Asignar memoria para poder trabajar con ella
		int[] nums = new int[5]; // Declaracion y asignacion de en la misma linea. Lo mas habitual
		// Si a nums no le doy valores a los numeros, todos tienen 0.
		numeros[0] = 12;
		numeros[1] = 23;
		numeros[2] = 5;
		numeros[3] = 18;
		numeros[4] = 10;
		int[] numeros2 = { 12, 13, 53, 5, 92 }; // Seclara la variable y asignarle directamente valores
	}

	public static void ejemploRecorerArray() {
		int[] numeros = { 12, 13, 53, 5, 92 };
		// Con un bucle for
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El array numeros en su posicion " + i + " tiene el valor " + numeros[i]);
		}
		// con un bucle for-each
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// bucle for-each con posicion
		int i = 0;
		for (int numero : numeros) {
			System.out.println("El array numeros en su posicion " + (i++) + " tiene el valor " + numero);

		}

	}

	public static void ejemploBusquedas1() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		boolean encontrado = false;
		String buscar = "Pedro";
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equals(buscar)) {
				encontrado = true;
			}
		}
		if(encontrado) {
			System.out.println("Nombre encontrado");
		}else {
			System.out.println("Nombre no encontrado");
		}
	}
	
	public static void ejemploBusquedasFuncional() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String buscar = "Pedro";
		
		if(Arrays.stream(nombres).anyMatch(n->n.equals(buscar))) {
			System.out.println(buscar+": Nombre encontrado");
		}else {
			System.out.println(buscar+":Nombre no encontrado");
		}
	}

	public static void ejemploRedimension() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
//		nombres = Arrays.copyOf(nombres, 10);
		Arrays.stream(nombres).forEach(e->System.out.println(e));
		System.out.println(String.join(", ", nombres));
		int[] numeros= {1,2,3,4,5};
		String numerosString = Arrays.toString(numeros);
		Arrays.sort(nombres);
		
		for (String nombre : nombres) {
			System.out.println(nombre);
			
		}
		Collections.reverse(Arrays.asList(nombres));
		for (String nombre : nombres) {
			System.out.println(nombre);
			
		}
		
	}
	

	public static void main(String[] args) {
//		ejemplo1();
//		ejemploRecorerArray();
//		ejemploBusquedas1();
//		ejemploBusquedasFuncional();
		ejemploRedimension();

	}

}
