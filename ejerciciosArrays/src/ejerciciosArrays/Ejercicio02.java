package ejerciciosArrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 2. Crea un array de enteros con 10 posiciones. A continuación pide al usuario que vaya
 * introduciendo uno a uno los 10 números por consola. Muestra lo siguiente:
 * a. La lista de números introducidos
 * b. La suma de los números
 * c. La media de los números
 * d. El mayor y el menor de los números (crea un máximo y un mínimo provisional que
 * será igual al primer número del array, después vas comparando con el resto de
 * posiciones).
 */

public class Ejercicio02 {

	public static void operacion() {
		Integer[] numeros = new Integer[10];
		int numero = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero: "+(i+1));
			numero=Integer.parseInt(sc.nextLine());
			numeros[i]=numero;
			suma+=numero;
		}
		Arrays.sort(numeros);
		System.out.println("La lista de números introducidos:"+Arrays.toString(numeros));
		System.out.println();
		System.out.println("La suma de los números: "+suma);
		System.out.println("La media de los números"+(suma/numeros.length));
		System.out.println("El mayor es: "+numeros[numeros.length-1]+" y el menor es: "+numeros[0]);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
