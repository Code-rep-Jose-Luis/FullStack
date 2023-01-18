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
		// Caracteres
		char letraA = 'a';
		char letraB = 'b';
		System.out.println("La suma de a + b es:"+ letraA + letraB);
		System.out.println("La suma de a + b es:"+ (letraA + letraB));
		System.out.println("La suma de a + b es:"+ (char)(letraA+3));
		
	}
	
	public static void ejemplosString() {
		String cadena1;
		cadena1 = "Jose";
		String cadena2 = "Hola", cadena3 = "adios"; // Por buena practica declarar 1 variable por fila
		String cadena4 = cadena2 + cadena1; // "HolaJose"
		String cadena5 = cadena2 + " " + cadena1; // "Hola Jose"
		String prefijo = "34";
		String telefono = "666666666";
		int numero = 40;
		System.out.println(prefijo + "-" + telefono);
		System.out.println("Otra cosa"); // println pone un salto de linea al imprimir
		System.out.print(prefijo + "-" + telefono); // imprime en la linea, si se vuelve a imprimir, saldra a continuacion
		System.out.println("Otra cosa"); // println pone un salto de linea al imprimir
		System.out.printf("%s tiene %d años\n",cadena1,numero); // imprimir con formato
		// String int = "numero"; hay palabras reservadas que no pueden usarse como nombre de variable
		String String = "String"; // Asignar una variable con String no es buena practica
		String = "hola";
		String mundo;
		
	}
	
	public static void main(String[] args) {
		
		ejemplosComentarios();
		ejemplosTipos();
		ejemplosString();
		
	}

}
