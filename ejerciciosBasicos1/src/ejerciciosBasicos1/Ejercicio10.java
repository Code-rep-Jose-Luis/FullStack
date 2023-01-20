package ejerciciosBasicos1;

import java.util.Scanner;

/*
 * 10. Escribe un programa que lee un número entero por teclado y obtiene y muestra por pantalla el doble y
 * el triple de ese número.
 */

public class Ejercicio10 {

	public static void calculo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.println("El numero elegido es :"+numero+" su doble es : "+numero*2+" y su triple es : "+numero*3);
		
	}
	
	public static void main(String[] args) {
		calculo();

	}

}
