package ejerciciosEstructuras;

import java.util.Scanner;

/**
 * 19. Pregunta al usuario un número y muestra del 1 hasta ese número, en una
 * misma línea, separados por comas (debes comprobar cuando es el último y no
 * poner una coma en ese caso). Dime un número: 7 1,2,3,4,5,6,7
 */

public class Ejercicio19 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 1 numero");
		int numero = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= numero; i++) {
			System.out.print((i != numero) ? i + "," : i);
		}
		sc.close();
	}

	public static void main(String[] args) {
		operacion();

	}

}
