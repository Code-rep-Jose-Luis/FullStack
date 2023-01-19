package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static void ejemploIf() {
		//String nombre = "Jose";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		if(nombre.equals("Jose")) {
			System.out.println("Hola "+nombre);
		}
		System.out.println("Pasa un buen dia!");
		sc.close();
	}
	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		if(nombre.equals("Jose")) {
			System.out.println("Hola "+nombre);
			System.out.println("Pasa un buen dia!");
		}else {
			System.out.println("Pasa un buen dia");
		}
		sc.close();
	}
	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero del dado: ");
		int numero = sc.nextInt();
		if(numero == 1) {
			System.out.println(numero);
		}
		else if(numero == 2) {
			System.out.println(numero);
		}
		else if(numero == 3) {
			System.out.println(numero);
		}
		else if(numero == 4) {
			System.out.println(numero);
		}
		else if(numero == 5) {
			System.out.println(numero);
		}
		else if(numero == 6) {
			System.out.println(numero);
		}
		else {
			System.out.println("El numero no es una cara del dado");			
		}
		sc.close();
		
		
		
		
	}
	
	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero del dado: ");
		int numero = sc.nextInt();
		switch(numero) {
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
	
	public static void main(String[] args) {
		//ejemploIf();
		//ejemploIfElse();
		//ejemploIfElseIfElse();
		ejemploSwitch();
	}

}
