package ejerciciosNacho;

import java.util.Scanner;

/**
 * Ejercicio propuesto 6.1.4: Crea un programa que pida al usuario un número entero y muestre su cuadrado. Se repetirá mientras el usuario introduzca un número distinto de cero.
 */

public class EjercicioBucles6_1_4 {

	
	public static void operaciones() {
		int numero=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce 1 numero: ");
			numero=sc.nextInt();
			sc.nextLine();
			System.out.println("El cuadrado de "+numero+" es: "+numero*numero);
		} while (numero!=0);
		
		sc.close();
	}
	public static void main(String[] args) {
		operaciones();

	}

}