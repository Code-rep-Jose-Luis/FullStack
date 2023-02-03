package funciones;

public class Ejemplos {

	public static void ejemplo1() {
		// public indica que la función és pública (private, protecte, nada)
		// static significa que es un metodo de clase ("nada" es non-static)
		// void significa que el metodo no devuelve nada (int, String, char, Coche, Moto...)
		
	}
	
	public static void imprimirCadena(String cadena) {
		System.out.println(cadena);
	}
	public static void imprimirCadena(int cadena) {
		System.out.println(cadena);
	}
	
	public static void main(String[] args) {
		imprimirCadena("Hola");
		imprimirCadena(1);

	}

}
