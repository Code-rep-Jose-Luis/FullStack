package ejerciciosEstructuras;

/**
 * 
 * @author José Luis Romero Gallego
 *
 * 1.Crear un programa que me diga si un numero es par o impar
 */
public class Ejercicio1 {

	public static void operacione() {
		int numero = 8;
		System.out.println(((numero%2>0)?(numero+" es impar"):(numero+" es par")));
		numero = 7;
		System.out.println(((numero%2>0)?(numero+" es impar"):(numero+" es par")));

	}
	
	public static void main(String[] args) {
		operacione();
	}
}
