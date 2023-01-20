package ejerciciosEstructuras;

import java.util.Scanner;

/*
 * 2. Programa que lea un número entero y muestre si el número es múltiplo de 10 (si el resto de la
 * división entre 10 da 0).
 */

public class Ejercicio2 {
	
	public static void operacion() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce 1 entero: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.println((numero%10==0)?numero+" es multiplo de 10":numero+" no es multiplo de 10");
		sc.close();
	}
	

	public static void main(String[] args) {
		operacion();

	}

}
