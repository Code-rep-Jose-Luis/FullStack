package ejerciciosEstructuras;

import java.util.Scanner;

/*
 * 3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. Una letra mayúscula
 * es aquella que está entre la ‘A’ y la ‘Z’. Recuerda que se pueden comparar los caracteres como si
 * fueran números.
 * Utiliza cadena.charAt(0) para acceder al primer carácter recibido.
 */

public class Ejercicio3 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 1 texto: ");
		char letra = sc.nextLine().charAt(0);
		System.out.println(((int)letra>=97 && (int)letra<=122)?letra+" es una letra minuscula":((int)letra>=65 && (int)letra<=90)?letra+" es una letra mayuscula":letra+" no es un caracter valido");
	}
	
	public static void main(String[] args) {
		operacion();

	}

}
