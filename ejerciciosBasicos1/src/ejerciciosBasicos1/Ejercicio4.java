package ejerciciosBasicos1;

/*
 * 4. Crea 4 variables de tipo double con los valores que quieras. A continuación muestra sus valores por
 * consola usando 4 instrucciones para imprimir por consola y sin generar ningún salto de línea (todos
 * los valores se verán en una sola línea
 * A continuación, muestra el resultado de sumar las 2 primeras variables, multiplicar el resultado
 * por la tercera y dividir por la cuarta. Pista: la suma tiene menos prioridad que la multiplicación, por lo
 * que necesitarás agrupar dicha operación entre paréntesis.
 */

public class Ejercicio4 {

	public static void operacion() {
		double numero1 = 2;
		double numero2 = 7;
		double numero3 = 11;
		double numero4 = 3;

		System.out.print(numero1);
		System.out.print(numero2);
		System.out.print(numero3);
		System.out.print(numero4);
		
		System.out.print("\n"+(numero1+numero2)*numero3/numero4);
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
