package ejerciciosArrays;

import java.util.Scanner;

/**
 * 3. Pide al usuario 10 números con decimales (double). Usa un array para almacenarlos.
 * Muestra la media y los números que están por encima de esa media.
 */

public class Ejercicio03 {

	public static void operacion() {
		double[] numeros = new double[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 10 numeros.");
		double sum=0;
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce el numero "+(i+1)+" numeros.");
			numeros[i]=Double.parseDouble(sc.nextLine());
			sum+=numeros[i];
		}
		double media = sum/numeros.length;
		for(double numero:numeros) {
			if(numero>=media) {
				System.out.println(numero);
			}
		}
		
		System.out.println("La media es "+media);
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
