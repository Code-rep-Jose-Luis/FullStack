package ejerciciosEstructuras;

import java.util.Scanner;

/**
 * 10. Crea un programa que lea una letra tecleada por el usuario y diga si se trata de un signo de
 * puntuación (. , ; :), una cifra numérica (del 0 al 9) u otro carácter, usando "switch" (pista:
 * necesitarás usar un dato de tipo "char").
 */
public class Ejercicio10 {

	public static void operacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 1 caracter: ");
		char letra= sc.nextLine().charAt(0);
		switch (letra) {
		case '.',',',';',':' ->System.out.println("Es un signo de puntuacion");
		case '0','1','2','3','4','5','6','7','8','9' ->System.out.println("Es un numero");
		default ->System.out.println("Es otro caracter");
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		operacion();

	}

}
