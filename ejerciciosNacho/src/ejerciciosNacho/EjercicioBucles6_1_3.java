package ejerciciosNacho;

/**
 * Ejercicio propuesto 6.1.3: Crea un programa que muestre la "tabla de multiplicar del 5", usando "while"
 *
 */

public class EjercicioBucles6_1_3 {

	public static void operacion() {
		int numero = 5;
		int contador=0;
		int fin = 10;
		
		while(contador<=fin) {
			System.out.println(numero+" x "+contador+" = "+(numero*contador));
			contador++;
		}

	}
	public static void main(String[] args) {
		operacion();
	}

}