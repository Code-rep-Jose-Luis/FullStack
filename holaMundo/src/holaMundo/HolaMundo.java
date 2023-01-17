package holaMundo;

/*
 * @autor 
 */
public class HolaMundo {

	public static void ejemplosComentarios() {
		/*
		 * System.out.println("Hola mundo!");
		 */
		
//		System.out.println("Hola mundo!");
		
		System.out.println("Hola mundo!");
	}
	private static void ejemplosTipos() {
		// Numeros enteros
		int numero = 5;
		int numero2 = 7;
		int sum = numero + numero2;
		int resta = numero2 - numero;
		System.out.println(sum);
		System.out.println(resta);
		System.out.println("La division de enteros es: " + (numero2 / numero));
		System.out.println("La division de double y entero es: " + ((double)numero2 / numero));
		// Numeros decimales
		double decimales = 3.14;
		double decimales2 = 3.22;
		System.out.println("La multiplicacion es: " + decimales * decimales2);
		System.out.println("La division es: " + decimales / decimales2);
		System.out.println("El intento de suma es: " + decimales + decimales2);
		System.out.println("La suma es: " + (decimales + decimales2));
		// Enteros largos
		int largo1 = 2000000000;
		int largo2 = 100000000;
		System.out.println("Suma de dos largos: "+ (largo1+largo2));

		int largo3 = 200000000;
		System.out.println("Suma de dos largos: "+ (largo1+largo3));
		int largo4 =Integer.MAX_VALUE;
		System.out.println("int max: "+ (largo4));
		System.out.println("int max+1: "+ (largo4+1));
		
		
	}
	
	public static void main(String[] args) {
		
		ejemplosComentarios();
		ejemplosTipos();
	}

}
