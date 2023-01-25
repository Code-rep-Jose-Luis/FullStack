package ejerciciosEstructuras;

import java.util.Scanner;

/**
 * 6. Programa que pida al usuario tres números enteros y muestre el mayor de los tres.
 *
 */

public class Ejercicio06 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a comparar 3 numeros");
		System.out.println("Introduce el primero");
		int numero1=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo");
		int numero2=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el tercero");
		int numero3=Integer.parseInt(sc.nextLine());
		int aux=0;
		
		if(numero1>aux) {
			aux=numero1;
		}
		if(numero2>aux) {
			aux=numero2;
		}
		if(numero3>aux) {
			aux=numero3;
		}
		
		System.out.println("El numero mayor es: "+aux);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
		
	}

}
