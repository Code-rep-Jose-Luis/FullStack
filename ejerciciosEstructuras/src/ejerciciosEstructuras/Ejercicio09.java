package ejerciciosEstructuras;

/**
 * 9. Programa que lea una variable entera llamada mes y compruebe con una estructura switch,
 * si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28
 * días. Se mostrará además de los días, el nombre del mes. Se mostrará un error cuando el mes
 * no sea válido.
 */

public class Ejercicio09 {

	public static void operacion() {
		int mes=6;
		switch (mes) {
		case 1 ->System.out.println("Enero 31 dias");
		case 2 ->System.out.println("Febrero 28 dias");
		case 3 ->System.out.println("Marzo 31 dias");
		case 4 ->System.out.println("Abril 30 dias");
		case 5 ->System.out.println("Mayo 31 dias");
		case 6 ->System.out.println("Junio 30 dias");
		case 7 ->System.out.println("Julio 31 dias");
		case 8 ->System.out.println("Agosto 31 dias");
		case 9 ->System.out.println("Septiembre 30 dias");
		case 10 ->System.out.println("Octubre 31 dias");
		case 11 ->System.out.println("Noviembre 30 dias");
		case 12 ->System.out.println("Diciembre 31 dias");
		default ->System.out.println("El mes es incorrecto");
		}

	}
	
	public static void main(String[] args) {
		operacion();
		

	}

}
