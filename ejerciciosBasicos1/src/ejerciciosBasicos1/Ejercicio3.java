package ejerciciosBasicos1;

public class Ejercicio3 {

	private static void comparador() {
		int a = 5, b = 5;
		
		// El valor es mayor
		System.out.print("El primer valor "+a+" es mayor al segundo "+b+": ");
		if(a>b) {
			System.out.println("True");
		}
		if(a<b) {
			System.out.println("False");
		}
		if(a==b) {
			System.out.println("False");
		}
		// El valor es menor
		System.out.print("El primer valor "+a+" es menor al segundo "+b+": ");
		if(a>b) {
			System.out.println("False");
		}
		if(a<b) {
			System.out.println("True");
		}
		if(a==b) {
			System.out.println("False");
		}
		// El valor es igual
		System.out.print("El primer valor "+a+" es igual al segundo "+b+": ");
		if(a>b) {
			System.out.println("False");
		}
		if(a<b) {
			System.out.println("False");
		}
		if(a==b) {
			System.out.println("True");
		}
		
		

		
		
	}
	
	public static void main(String[] args) {
		comparador();
	}
}
