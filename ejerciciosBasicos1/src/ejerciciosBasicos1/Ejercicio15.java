package ejerciciosBasicos1;

import java.util.Scanner;

public class Ejercicio15 {

//	public static void lista() {
//		Scanner sc = new Scanner(System.in);
//		
//	}
	
	public static void lista() { // Leer de la consola
		final double IVA = 0.21;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdzca el nombre del primer producto:");
		String nombre1 = sc.nextLine();
		System.out.println("Introdzca el precio del primer producto:");
		double precio1 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		System.out.println("Introdzca el nombre del segundo producto::");
		String nombre2 = sc.nextLine();
		System.out.println("Introdzca el precio del segundo producto:");
		double precio2 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		System.out.println("Introdzca el nombre del tercer producto::");
		String nombre3 = sc.nextLine();
		System.out.println("Introdzca el precio del tercer producto:");
		double precio3 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		System.out.printf("%-15s%12s%12s\n","NOMBRE","PRECIO","CON IVA");
		System.out.printf("%-15s%11.2f€%13.2f€\n",nombre1,precio1,precio1*(1+IVA));
		System.out.printf("%-15s%11.2f€%13.2f€\n",nombre2,precio2,precio2*(1+IVA));
		System.out.printf("%-15s%11.2f€%13.2f€\n",nombre3,precio3,precio3*(1+IVA));
		sc.close();
		

		
	}
	
	public static void main(String[] args) {
		lista();
	}
}
