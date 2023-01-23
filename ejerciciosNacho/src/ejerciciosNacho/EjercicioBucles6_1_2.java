package ejerciciosNacho;

public class EjercicioBucles6_1_2 {

	/**
	 * Ejercicio propuesto 6.1.2: Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "while"
	 */
	
	public static void operaciones() {
		int numero = 20;
		while(numero>=0) {
			if(numero%2==0) {
				System.out.println(numero);
			}
		numero--;
		}

	}

	
	public static void main(String[] args) {
		operaciones();


	}

}
