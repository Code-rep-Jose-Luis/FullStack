package ejerciciosBasicos1;

public class Ejercicio3 {

	
	private static void comparador() {
		int a = 5, b = 5;
		
		// El valor es menor
		System.out.println("El primer valor "+a+" es menor al segundo "+b+": "+(a<b));

		// El valor es igual
		System.out.println("El primer valor "+a+" es igual al segundo "+b+": "+(a==b));

		// El valor es mayor o igual
		System.out.println("El primer valor "+a+" es mayor o igual al segundo "+b+": "+(a>=b));

		
	}
	
	public static void main(String[] args) {
		comparador();
	}
}
