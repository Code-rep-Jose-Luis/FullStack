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
		Scanner sc = new Scanner(System.in);
		precio=50;
		System.out.println("Introduce la edad");
		int edad = sc.nextInt();
		sc.nextLine();
		if (edad<18) {
			precio*=1-MENOR_EDAD;
		}else if(edad>=65) {
			precio*=1-JUVILADO;
		}else {
			System.out.println("Es socio?");
			String respuesta = sc.nextLine();
			if(respuesta.toLowerCase().charAt(0)=='s') {
				precio*=1-SOCIO;
			}
		}
		System.out.println("Precio de la entrada "+precio);
		
		sc.close();
		
	}
	
	public static void operacion2() {
		final double MENOR_EDAD= 0.25;
		final double SOCIO= 0.40;
		final double JUVILADO= 0.75;
		double precio = 50;
		double precioTotal=0;
		int edad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de personas, el total saldra al final");
		int personas = sc.nextInt();
		sc.nextLine();
		while(personas>0) {
			precio=50;
			System.out.println("Introduce la edad");
			edad = sc.nextInt();
			sc.nextLine();
			if (edad<18) {
				precio*=1-MENOR_EDAD;
			}else if(edad>=65) {
				precio*=1-JUVILADO;
			}else {
				System.out.println("Es socio?");
				String respuesta = sc.nextLine();
				if(respuesta.toLowerCase().charAt(0)=='s') {
					precio*=1-SOCIO;
				}
			}
			System.out.println("Precio de la entrada "+precio);
			precioTotal+=precio;
			personas--;
			System.out.println("Personas restantes: "+personas+"\n");
			
		}
		System.out.println("Precio total: "+precioTotal);
		
		sc.close();
	}
	
	public static void operacion3() {
		final double MENOR_EDAD= 0.25;
		final double DESCUENTO_SOCIO= 0.40;
		final double DESCUENTO_JUVILADO= 0.75;
		final int MAYORYA_EDAD=18;
		final int EDAD_JUVILACION = 65;
		double precioInicial = 50;
		double precioTotal=0;
		double precioEntrada=0;
		int edad = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de personas, el total saldra al final");
		int personas = sc.nextInt();
		sc.nextLine();
		while(personas>0) {

			System.out.println("Introduce la edad");
			edad = sc.nextInt();
			sc.nextLine();
			if (edad<MAYORYA_EDAD) {
				precioEntrada=precioInicial*(1-MENOR_EDAD);
			}else if(edad>=EDAD_JUVILACION) {
				precioEntrada=precioInicial*(1-DESCUENTO_JUVILADO);
			}else {
				System.out.println("Es socio?");
				String respuesta = sc.nextLine();
				if(respuesta.toLowerCase().charAt(0)=='s') {
					precioEntrada=precioInicial*(1-DESCUENTO_SOCIO);
				}
			}
			precioTotal+=precioEntrada;
			System.out.println("Precio de la entrada "+precioInicial);
			;
			System.out.println("Personas restantes: "+(--personas)+"\n");
			
		}
		System.out.println("Precio total: "+precioTotal);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//operacion();
		//operacion2();
		operacion3();
	}
}
