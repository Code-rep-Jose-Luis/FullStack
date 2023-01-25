package ejerciciosBasicos1;

/*
 * 11. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula
 * correspondiente para pasar de grados centígrados a fahrenheit es:
 * F = 32 + ( 9 * C / 5)
 */

public class Ejercicio11 {

	public static void operacion() {
		double grados = 26;
		double fahrenheit=32+(9*grados/5);
		System.out.println(grados+" grados celcius son "+ fahrenheit+" frados fahrenheit");

	}
	
	public static void main(String[] args) {
		operacion();

	}

}
