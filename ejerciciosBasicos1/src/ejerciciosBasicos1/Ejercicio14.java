package ejerciciosBasicos1;

import java.util.Scanner;

/**
 * 14. Pregunta al usuario su edad e infórmale de cuantos años tendrá dentro de
 * 15.
 */
public class Ejercicio14 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.println("Tu edad dentro de 15 años sera: " + (edad + 15));
		sc.close();
	}

	public static void main(String[] args) {
		operacion();

	}

}
