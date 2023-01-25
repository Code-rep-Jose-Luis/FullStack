package ejerciciosBasicos1;

import java.util.Scanner;

/**
 * 20. Dile al usuario que escriba 3 dígitos numéricos (no los muestres por la
 * consola). A continuación suma los números e informa al usuario de su
 * resultado: Has escrito: 2 + 5 + 8 = 15
 */

public class Ejercicio20 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce un segundo numero");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce un tercer numero");
		int num3 = Integer.parseInt(sc.nextLine());
		sc.close();
	}

	public static void main(String[] args) {
		operacion();
	}
}
