package ejerciciosBasicos1;

/*

7. Crea un programa donde definimos 2 variables de tipo carácter. Muestra la posición de cada carácter
en la tabla unicode y la diferencia entre ambos caracteres. Si los caracteres son ‘b’ y ‘k’, la salida
sería:
'b' tiene la posición 98
'k' tiene la posición 107
Diferencia entre 'b' y 'k': 9

 */

public class Ejercicio7 {
	
	public static void comparacion() {
		char letra1 = 'a';
		char letra2 = 'c';
		System.out.println("'"+letra1+"' tiene la posicion "+(int)letra1);
		System.out.println("'"+letra2+"' tiene la posicion "+(int)letra2);
		System.out.println("Diferencia  entre '"+letra1+"' y '"+letra2+"' : "+(int)(letra2-letra1));
		System.out.println("Diferencia  entre '"+letra1+"' y '"+letra2+"' : "+((int)letra2-(int)letra1));

	}
	
	public static void main(String[] args) {
		comparacion();
	}
}
