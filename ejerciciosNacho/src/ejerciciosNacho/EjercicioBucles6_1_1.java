package ejerciciosNacho;

public class EjercicioBucles6_1_1 {

	/**
	 * Ejercicio propuesto 6.1.1: Crea un programa que muestre los números del 1 al 10, usando "while"
	 */

	public static void operaciones() {
		int numero = 1;
		
		while (numero<=10) {
			System.out.println(numero++);
		}
		
		
	}
	
	public static void main(String[] args) {
		operaciones();
	}
}
