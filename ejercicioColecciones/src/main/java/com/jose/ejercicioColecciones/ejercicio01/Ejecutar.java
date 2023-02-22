package com.jose.ejercicioColecciones.ejercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejecutar {
	
	
	public static void main(String[] args) {
		List<Integer> numeros=new ArrayList<>(Arrays.asList(10,20,30,40));
		numeros.addAll(Arrays.asList(50,60));
		numeros.removeIf(e->e==20);
		numeros.addAll(1, Arrays.asList(25,26));
//		numeros.sort(Comparator.reverseOrder());
//		numeros.sort(Collections.reverseOrder());
//		numeros.sort((a,b)->b-a); // lo ordena de mayor a menor
		Collections.reverse(numeros); // Da la vuelta a la lista
		numeros.forEach(e->System.out.println(e));
		
	}
}
