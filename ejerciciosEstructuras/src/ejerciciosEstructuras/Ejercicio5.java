package ejerciciosEstructuras;

import java.util.Scanner;



/**
 * @author Usuario
 *
 * 5. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por
 * el segundo. Se debe comprobar que el divisor no puede ser cero.
 *
 */
public class Ejercicio5 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		double numero1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el segundo numero: ");
		double numero2 = Double.parseDouble(sc.nextLine());
		
		System.out.println((numero1!=0 && numero2!=0)?"La division de "+numero1+" entre "+numero2+" = "+numero1/numero2:"No se puede calcular");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
