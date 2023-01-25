package ejerciciosArrays;

import java.util.Scanner;

/**
 * 1. Crea un array con los nombres de los meses. A continuación pide al usuario un número
 * del 1 al 12. Muéstrale el nombre del mes correspondiente sin usar estructuras
 * condicionales (es decir, a partir de los valores del array).
 */

public class Ejercicio01 {

	public static void operacion() {
		String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero del mes: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.println(meses[numero-1]);
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
