package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static void ejemploIf() {
		//String nombre = "Jose";
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		if(nombre.equals("Jose")) {
			System.out.println("Hola "+nombre);
		}
		System.out.println("Pasa un buen dia!");

		sc.close();
	}
	
	public static void main(String[] args) {
		ejemploIf();

	}

}
