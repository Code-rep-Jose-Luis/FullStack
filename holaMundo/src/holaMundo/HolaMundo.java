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
		// String String = "String"; // Asignar una variable con String no es buena practica
		//String = "hola";
		String mundo;
		
	}
	
	public static void ejemplosBoolean() {
		boolean verdad = true;
		boolean falso = false;
		System.out.println(10<20); // true
		boolean comparacion1 = 10<18; // true
		System.out.println(comparacion1); // true
		boolean C1 = 10<20; // 10 menor a 20 // true
		boolean C2 = 10>20; // 10 mayor a 20 // false
		boolean C3 = 10<=20; // 10 menor o igual a 20 // true
		boolean C4 = 10>=20; // 10 menor o igual a 20 // false
		boolean C5 = 10==20; // 10 igual a 20 // false
		boolean C6 = 10!=20; // 10 distinto a 20 // true
		String cadena1 = "hola";
		String cadena2 = "adios";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		System.out.println(cadena1.equals(cadena2)); // False
		System.out.println(cadena1.equals(cadena3)); // true
		System.out.println(cadena1.equals(cadena4)); // false
		boolean cadenasIguales = cadena1.equals(cadena2); // false
		int numero1=5;
		double numero3 = 5.0;
		double numero4 = 5.1;
		System.out.println(numero1==numero3); // true
		System.out.println(numero1==numero4); // false
		System.out.println((11/2)==numero1); // true si se divide entre enteros el resultado omite los decimales
		System.out.println((11.0/2)==numero1); // false al poner decimal a un numero se combierte en double y ya considera los decimales al dividir
		System.out.println((23%4)); 
		
	}
	
	public static void tablasVerdad() {
		int edad = 25;
		int anyosCarnet = 6;
		String sexo = "Masculino";
		String nombre = "Pepe";
		boolean esPepeMayor = edad >=18 && nombre.equals("Pepe"); // true
		System.out.println(esPepeMayor); // true

		boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10) || (sexo.equals("Femenino") && anyosCarnet > 5); // false || false
		System.out.println(tieneDescuento); // false
	
		boolean estoQueDa = sexo.equals("Masculino") || anyosCarnet > 5 && nombre.equals("Fran");
		System.out.println(estoQueDa); // true
		
		estoQueDa = (sexo.equals("Masculino") || anyosCarnet > 5) && nombre.equals("Fran");
		System.out.println(estoQueDa); // false
	}
	
	public static void main(String[] args) {
		
		ejemplosComentarios();
		ejemplosTipos();
		ejemplosString();
		ejemplosBoolean();
		tablasVerdad();
	}

}
