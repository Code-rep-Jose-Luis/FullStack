package ejerciciosEstructuras;

/**
 * 
 * 8. Escribe un programa que declare una variable A de tipo entero y asígnale un valor. A continuación
 * muestra un mensaje indicando si A es par o impar. Utiliza el operador ternario ( ? : ) dentro de
 * WriteLine para resolverlo.
 * Si por ejemplo A = 14 la salida será:
 * 14 es par
 * Si fuese por ejemplo A = 15 la salida será:
 * 15 es impar
 * 
 * 
 * 
 */

public class Ejercicio08 {

	public static void operacion() {
		int A = 15;
		System.out.println(A+((A%2==0)?" Es par":" Es impar"));
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
