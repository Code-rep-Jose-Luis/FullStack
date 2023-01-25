package ejerciciosEstructuras;

import java.util.Scanner;

/**
 * 11. Pide al usuario 2 números. Después muestra al usuario un menú con las siguientes opciones:
 * 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir. Comprueba la opción elegida, haz la operación y
 * muestra el resultado de la misma.
 * Si la operación elegida es la división, comprueba que el segundo número (divisor) no sea cero
 * antes de hacer la operación.
 */

public class Ejercicio11 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a operar.");
		System.out.println("Introduzca el primer numero");
		int numero1=Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el segundo numero");
		int numero2=Integer.parseInt(sc.nextLine());
		System.out.println("Que va a realizar:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
		int opcion=Integer.parseInt(sc.nextLine());
		switch (opcion) {
		case 1 ->System.out.println("La suma de los 2 numero "+numero1+" y "+numero2+" es: "+(numero1+numero2));
		case 2 ->System.out.println("La resta de los 2 numero "+numero1+" y "+numero2+" es: "+(numero1-numero2));
		case 3 ->System.out.println("La multiplicacion de los 2 numero "+numero1+" y "+numero2+" es: "+(numero1*numero2));
		case 4 ->System.out.println("La division de los 2 numero "+numero1+" y "+numero2+((numero2==0)?" no es posible":" es: "+((double)numero1/numero2)));
		
		default ->System.out.println("La opcion es incorrecta");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
