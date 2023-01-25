package ejerciciosBasicos1;

/**
 * 12. Programa que lea un número entero de 3 cifras y muestre por separado las cifras del número.
 */

public class Ejercicio12 {

	public static void operacion() {
		int numero= 759;
		System.out.println((numero/100)+" "+(numero%100/10)+" "+(numero%10));

	}
	
	public static void main(String[] args) {
		operacion();
	}
}
