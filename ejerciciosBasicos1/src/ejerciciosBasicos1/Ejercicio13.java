package ejerciciosBasicos1;

import java.util.Scanner;

/**
 * 13. Programa que pida por teclado la fecha de nacimiento de una persona (dia,
 * mes, año) y calcule su número de la suerte. El número de la suerte se calcula
 * sumando el día, mes y año de la fecha de nacimiento y a continuación sumando
 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
 * 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
 * 28 Número de la suerte: 28
 */

public class Ejercicio13 {

	public static void operaciones() {
		Scanner sc = new Scanner(System.in);
		int datos = 0;
		System.out.println("Introduce el dia ");
		datos += sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el mes ");
		datos += sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el año ");
		datos += sc.nextInt();
		sc.nextLine();
//		System.out.println(datos/1000);
//		System.out.println(datos%1000/100);
//		System.out.println(datos%100/10);
//		System.out.println(datos%10);
		int numeroSuerte = (datos / 1000) + (datos % 1000 / 100) + (datos % 100 / 10) + (datos % 10);
		System.out.println("Tu numero de la suerte es: " + numeroSuerte);
		sc.close();
	}

	public static void main(String[] args) {
		operaciones();

	}

}
