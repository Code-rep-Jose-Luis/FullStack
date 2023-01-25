package ejerciciosBasicos1;

import java.util.Scanner;

/**
 * 21. Pregúntale al usuario su nombre y edad. A continuación muestra la salida con este formato usando
 * una única instrucción System.out.println. El espacio de la izquierda del nombre y edad es un
 * tabulado.
 * Estos son tus datos
 * nombre: Pepe
 * edad: 16
 * 
 */

public class Ejercicio21 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce la edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		
		System.out.println("\tEstos son tus datos\n\t\tnombre: "+nombre+"\n\t\tedad: "+edad);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
