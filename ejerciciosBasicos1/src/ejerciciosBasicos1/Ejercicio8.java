package ejerciciosBasicos1;
/*
 8. ¿Cuál sería el resultado de las siguientes operaciones? a=5; b=++a; c=a++; b=b*5; a=a*2;
Calcúlalo a mano y luego crea un programa que lo resuelva, para ver si habías hallado la
solución correcta.
 
 */


public class Ejercicio8 {

	public static void operaciones() {
		int a=5; 
		System.out.println("a = "+a);
		int b=++a; 
		System.out.println("b = "+b);
		int c=a++; 
		System.out.println("c = "+c);
		b=b*5; 
		System.out.println("b = "+b);
		a=a*2;
		System.out.println("a = "+a);

	}
	
	public static void main(String[] args) {
		operaciones();

	}

}
