package ejerciciosBasicos1;

/*
 * 9. Pregúntale al usuario su nombre y muestra un mensaje saludándole con su nombre.
 */

import java.util.Scanner;

public class Ejercicio9 {

	public static void ejecucion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Bienvenido "+nombre);
		
		
		

	}
	
	public static void main(String[] args) {
		ejecucion();

	}

}
