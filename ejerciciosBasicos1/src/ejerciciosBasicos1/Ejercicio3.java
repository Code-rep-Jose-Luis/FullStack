package ejerciciosBasicos1;

/*
 * 3. Crea 2 variables enteras con el mismo valor en la misma línea (declaración y asignación) y muestra la
siguiente información:
a. Si la primera variable es menor que la segunda
b. Si son iguales
c. Si la primera variable es mayor o igual que la segunda
Muestra el resultado indicando si la comparación es True o False (valor del booleano). Ejemplo: 6 es menor
que 6: False

*/

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
