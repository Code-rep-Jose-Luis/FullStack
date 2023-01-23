package ejerciciosEstructuras;

/**
 * 12. Crea una variable con el precio de una entrada que inicialmente valga 50. Pregunta al usuario
 * su edad.
 * a. Si es menor de edad se le hará un descuento del 25% en la entrada.
 * b. Si es mayor de edad pero no está jubilado (65 años), pregúntale si es socio. Si el usuario
 * responde “sí” hazle un descuento del 40%.
 * c. Si está jubilado se le hará un descuento del 75%.
 * d. Finalmente muéstrale el precio que tiene que pagar por la entrada
 */

import java.util.Scanner;

public class Ejercicio12 {

	public static void operacion() {
		final double MENOR_EDAD= 0.25;
		final double SOCIO= 0.40;
		final double JUVILADO= 0.75;
		double precio = 50;
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		sc.nextLine();
		if (edad<18) {
			precio*=1-MENOR_EDAD;
		}else if(edad>=65) {
			precio*=1-JUVILADO;
		}else {
			System.out.println("Eres socio?");
			String respuesta = sc.nextLine();
			if(respuesta.toLowerCase().equals("si")) {
				precio*=1-SOCIO;
			}
		}
		System.out.println("Precio de la entrada "+precio);
		
	}
	
	public static void main(String[] args) {
		operacion();
	}
}
