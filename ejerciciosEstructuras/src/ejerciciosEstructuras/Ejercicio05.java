package ejerciciosEstructuras;

import java.util.Scanner;



/**
 * @author Usuario
 *
 * 5. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por
 * el segundo. Se debe comprobar que el divisor no puede ser cero.
 *
 */
public class Ejercicio05 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		double numerador = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el segundo numero: ");
		double divisor = Double.parseDouble(sc.nextLine());
		
		System.out.println((divisor!=0)?"La division de "+numerador+" entre "+numerador+" = "+numerador/divisor:"No se puede calcular");

		//System.out.println((numerador!=0 && divisor!=0)?"La division de "+numerador+" entre "+divisor+" = "+numerador/divisor:"No se puede calcular");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
