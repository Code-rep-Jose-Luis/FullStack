package ejerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio21 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para saver sus divisores: ");
		int numero = sc.nextInt();
		sc.nextLine();
		for(int i = 1;i<=numero;i++) {
			System.out.print((numero%i==0)?i+" es divisor de "+numero+"\n":"");
		}
		sc.close();
	}
	public static void main(String[] args) {
		operacion();
	}
}
