package ejerciciosEstructuras;

import java.util.Scanner;

/**
 * 7. Programa que pida al usuario una cantidad de horas, de minutos y de segundos (3 números diferentes).
 * Comprueba que la hora está en el rango de 0 a 23, los minutos y los segundos de 0 a 59.
 * Si todo es correcto, muestra al usuario la hora en formato HH:MM:SS (2 cifras para cada parte
 * rellenando con 0 a la izquierda si es una cifra), y si no, muestra un mensaje de error. Pista: Repasa la
 * parte de formatear la salida de texto para números enteros.
 * 
 */

public class Ejercicio07 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int horas=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce los minutos: ");
		int minutos=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce los segundos: ");
		int segundos=Integer.parseInt(sc.nextLine());
		boolean error=false;
		if(horas<0 || horas>23) {
			System.out.println("La hora es incorecta, tiene que ser entre 0 y 23");
			error = true;
		}
		if(minutos<0 || minutos>59) {
			System.out.println("Los minutos son incorectos, tiene que ser entre 0 y 59");
			error = true;
		}
		if(segundos<0 || segundos>59) {
			System.out.println("Los segundos son incorrectos, tiene que ser entre 0 y 59");
			error = true;
		}
		if(!error) {
			System.out.printf("La hora es: %02d:%02d:%02d",horas,minutos,segundos);
		}
		
		
		sc.close();
	}
	public static void main(String[] args) {
		operacion();

	}

}
