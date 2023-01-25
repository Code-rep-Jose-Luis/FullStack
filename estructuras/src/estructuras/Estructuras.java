package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static final double IVA = 0.21;

	public static void ejemploIf() {
		// String nombre = "Jose";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("Jose")) {
			System.out.println("Hola " + nombre);
		}
		System.out.println("Pasa un buen dia!");
		sc.close();
	}

	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("Jose")) {
			System.out.println("Hola " + nombre);
			System.out.println("Pasa un buen dia!");
		} else {
			System.out.println("Pasa un buen dia");
		}
		sc.close();
	}

	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero del dado: ");
		int numero = sc.nextInt();
		if (numero == 1) {
			System.out.println(numero);
		} else if (numero == 2) {
			System.out.println(numero);
		} else if (numero == 3) {
			System.out.println(numero);
		} else if (numero == 4) {
			System.out.println(numero);
		} else if (numero == 5) {
			System.out.println(numero);
		} else if (numero == 6) {
			System.out.println(numero);
		} else {
			System.out.println("El numero no es una cara del dado");
		}
		sc.close();

	}

	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero del dado: ");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println(numero);
			break;
		case 2:
			System.out.println(numero);
			break;
		case 3:
			System.out.println(numero);
			break;
		case 4:
			System.out.println(numero);
			break;
		case 5:
			System.out.println(numero);
			break;
		case 6:
			System.out.println(numero);
			break;
		default:
			System.out.println("El numero no es una cara del dado");
			break;
		}
		sc.close();

	}

	public static void IfElseIfSinElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu equipo preferido");
		String equipo = sc.nextLine();
		String equipoMayusculas = equipo.toUpperCase(); // pasa la cadena a mayúscula y le asigna el valor a otra nueva
														// variable

		if (equipo.toLowerCase().equals("barcelona")) { // Pasa a minúscula y compara
			System.out.println("Visca el Barsa!");
		} else if (equipo.toUpperCase().equals("MADRID")) { // Pasa a mayúscula y compara
			System.out.println("Hala Madrid!");
		} else if (equipo.equalsIgnoreCase("atletico")) { // Compara sin tener en cuenta mayúsculas ni minúsculas
			System.out.println("Aupa Atleti!");
		}
		System.out.println("Bienvenido a nuestro programa de fútbol");
		sc.close();
	}

	public static void ejemplosTernarios() {
		int edad = 10;
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");

	}

	public static void ejemploAmbitosVariables() {
		int numero = 5;
		int edad = 18;
		if (edad >= 18) {
			int valor = 4;
			System.out.println(valor); // valor desaparece al salir del if
		}

	}

	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		boolean adivina = false;
		while (!adivina) {
			System.out.println("Introduzca la contraseña: ");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			}
		}
		System.out.println("Acertaste!");
		sc.close();
	}

	public static void ejemploWhile2() {
		Scanner sc = new Scanner(System.in);
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		while (!adivina && intentos < 3) {
			intentos--;
			System.out.println("Introduzca la contraseña: ");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste la contraseña!\nNumero de intentos restantes: " + (3 - intentos) + "\n");
			}
		}
		System.out.println(adivina ? "Acertaste!" : "No has acertado la contraseña");
		sc.close();
	}

	public static void ejemploFor1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Repeticion numero " + (i + 1));
		}
	}

	public static void main(String[] args) {

		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// IfElseIfSinElse();
		// ejemploSwitch();
		// ejemplosTernarios();
		// ejemploAmbitosVariables();
		// ejemploWhile1();
		// ejemploWhile2();
		ejemploFor1();
	}


}
