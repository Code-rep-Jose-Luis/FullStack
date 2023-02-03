package funciones;

import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicios {

	public static double ejercicio6(double... numeros) {
			return Arrays.stream(numeros).average().getAsDouble();
	}
	
	/**
	 * 7. Crea una función que reciba un array de cadenas por parámetro y devuelva una de las
	 * cadenas al azar. Pista: puedes generar un número aleatorio entre 0 y la última
	 * posición del array usando new Random().nextInt(array.length).
	 * @param numeros
	 * @return
	 */
	public static String ejercicio7(String...cadenas) {
		return cadenas[new Random().nextInt(cadenas.length)];
	}
	public static void ejercicio7Mostrar(String...cadenas) {
		Arrays.stream(cadenas).forEach(e->System.out.println(e));
	}
	
	public static String ejercicio7_2() {
		final String[] cadenas= {"hola", "adios", "buenos dias", "Hola","Adios"};
		final int maxIntento=3;
		String cadena = ejercicio7(cadenas);
		Scanner sc = new Scanner(System.in);
		String respuesta = "";
		int intentos=1;
		do {
			ejercicio7Mostrar(cadenas);
			System.out.println();
			System.out.println("Intenta adivinar la palabra. Llevas "+intentos+" de "+maxIntento+": ");
			respuesta=sc.nextLine();
			intentos++;
		}
		while(!respuesta.equals(cadena) && (intentos <= maxIntento));
		
		sc.close();
		respuesta=(!respuesta.equals(cadena))?"No has acertado la palabra, era: "+cadena:"Has acertado la palabra!!";
		
		return respuesta;
	}
	
	public static double ejercicio8(double...numeros) {
		return Arrays.stream(numeros).max().orElse(0);
	}
	
	public static int ejercicio9(String cadena, String subcadena){
		int posicion=0;
		int veces = 0;
		while((posicion=cadena.indexOf(subcadena,posicion))!=-1) {
			veces++;
			posicion++;
		}
		return veces;
	}
	
	public static int ejercicio9_2(String cadena, String subcadena){
		int veces =0;
		Pattern patron = Pattern.compile(subcadena);
		Matcher coincidencias = patron.matcher(cadena);
		while(coincidencias.find()) {
			veces++;
		}
		return veces;
	}
	
	public static void ejercicio12(String[] cadena) {
		Arrays.sort(cadena,Comparator.reverseOrder());
	}
	
	public static LocalDate ejercicio15(String cadena) {
		
		String[] fecha=cadena.split("-");
		LocalDate resultado=LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[0]));
		resultado = resultado.plusYears(2);
		resultado = resultado.plusMonths(3);
		resultado = resultado.plusDays(5);
		return resultado;
	}
	/**
	 * Funcion que añade tiempo a una fecha en años, meses y dias
	 * @param fecha
	 * @param years
	 * @param months
	 * @param days
	 * @return
	 */
	
	public static LocalDate fechaSumarTiempo(LocalDate fecha,int years, int months, int days) {
		return fecha.plusYears(years).plusMonths(months).plusDays(days);
	}
	
	public static LocalDate fechaConvertir(String years, String months, String days) {
		return LocalDate.of(Integer.parseInt(years), Integer.parseInt(months), Integer.parseInt(days));
	}
	
	public static LocalDate convertirFechaDateTimeFormatter(String fecha) {
		return LocalDate.parse(fecha.replace("-", "/"), DateTimeFormatter.ofPattern("d/M/y") );
	}
	
	
	
	
	public static LocalDate ejercicio15_2(String cadena) {
		
		String[] fecha=cadena.split("-");
		LocalDate resultado=fechaConvertir(fecha[2], fecha[1], fecha[0]);
		resultado = fechaSumarTiempo(resultado,2,3,5);
		return resultado;
	}
	
	public static void main(String[] args) {
		double[] numeros = {1,2,3,4};
		System.out.println(ejercicio6(numeros));
		//System.out.println(ejercicio7_2());
		System.out.println(ejercicio8());
		System.out.println(ejercicio8(numeros));
		String cadena="cocinando cocos con chocolate";
		int veces = ejercicio9(cadena,"co");
		System.out.println(veces);
		
		// Ordenar reverso
		String[] letras= {"a","b","e","c"};
		ejercicio12(letras);
		System.out.println(String.join(",", letras));
		System.out.println(ejercicio15("02-03-2001"));
		System.out.println(convertirFechaDateTimeFormatter("02-03-2001"));
		
		
	}

}
