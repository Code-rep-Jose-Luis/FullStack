package ejerciciosEstructuras;

import java.util.Iterator;

/**
 * 13. Muestra por pantalla los números de 20 al 1 usando un bucle while, y después hazlo otra vez
 * usando un bucle for.
 * @author José Luis Romero Gallego
 *
 */

public class Ejercicio13 {

	public static void operacion(){
		int numero = 20;
		while(numero>0) {
			System.out.println(numero--);
			;
		}
		
		System.out.println("----");	
		numero = 20;
		for (int i = numero; i > 0 ; i--) {
			System.out.println(i);	
		}
		
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
