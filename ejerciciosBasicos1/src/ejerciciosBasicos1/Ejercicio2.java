package ejerciciosBasicos1;

/*
 * 2. Crea un programa con 2 variables de tipo entero con los valores 15 y 4. Para estos valores calcula la
 *suma, la resta, la multiplicación, la división y el resto. Ten en cuenta que al ser 2 números enteros, el
 *resultado de la división también será entero. Muestra por pantalla los resultados de esta manera:
 *15 + 4 = 19
 *15 – 4 = 11
 *15 / 4 = 3
 *15 * 4 = 60
 *15 % 4 = 3
 *
 */
public class Ejercicio2 {

		private static void operaciones() {
			int numero1 = 15;
			int numero2 = 4;
			
			System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
			System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
			System.out.println(numero1+" / "+numero2+" = "+(numero1/numero2));
			System.out.println(numero1+" * "+numero2+" = "+(numero1*numero2));
			System.out.println(numero1+" % "+numero2+" = "+(numero1%numero2));

		}
	
	public static void main(String[] args) {
		operaciones();
	}
	
}
