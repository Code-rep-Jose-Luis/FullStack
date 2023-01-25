package ejerciciosEstructuras;

import java.util.Scanner;

/*
 * 4. Programa que le pida 2 cadenas de texto al usuario y compruebe si son iguales.
 */

public class Ejercicio04 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String cadena1=sc.nextLine();
		System.out.println("Introduce un segundo texto: ");
		String cadena2=sc.nextLine();

		// opcion 1 cadenas identicas
		System.out.println((cadena1.equals(cadena2))?"Las 2 cadenas son iguales: "+cadena1:"Las cadenas son distintas '"+cadena1+"' | '"+cadena2+"'");
		// opcion 2 cadenas identicas ignorando mayusculas/minusculas
		System.out.println((cadena1.equalsIgnoreCase(cadena2))?"Las 2 cadenas tienen las mismas letras ignorando mayusculas y minusculas: "+cadena1.toLowerCase():"Las cadenas son distintas '"+cadena1+"' | '"+cadena2+"'");
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
	
}
