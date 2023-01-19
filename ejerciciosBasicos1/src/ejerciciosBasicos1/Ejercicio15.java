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
		String nombre = sc.nextLine();
		System.out.println("Introdzca el precio del primer producto:");
		double precio = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		double precioIva=precio*(1+IVA);
		System.out.printf("%15s%12s%12s\n","NOMBRE","PRECIO","CON IVA");
		System.out.println("--------------------------");
		System.out.printf("%-12s%12.2f€%14.2f€\n",nombre,precio,precioIva);
		System.out.println("Introdzca el nombre del segundo producto::");
		nombre = sc.nextLine();
		System.out.println("Introdzca el precio del segundo producto:");
		precio = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		precioIva=precio*(1+IVA);
		System.out.printf("%-12s%12.2f€%14.2f€\n",nombre,precio,precioIva);
		System.out.println("Introdzca el nombre del tercer producto::");
		nombre = sc.nextLine();
		System.out.println("Introdzca el precio del tercer producto:");
		precio = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		precioIva=precio*(1+IVA);
		System.out.printf("%-12s%12.2f€%14.2f€\n",nombre,precio,precioIva);
		sc.close();
		

		
	}
	
	public static void main(String[] args) {
		lista();
	}
}
