package com.jose.ejercicioBancos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import com.jose.ejercicioBancos.entidades.Cuenta;
import com.jose.ejercicioBancos.entidades.CuentaCaixa;
import com.jose.ejercicioBancos.entidades.CuentaSabadell;
import com.jose.ejercicioBancos.entidades.CuentaSantander;
import com.jose.ejercicioBancos.entidades.Cuentas;
import com.jose.ejercicioBancos.utilidades.FicherosUtils;

public class App {

	

	/**
	 * Funcion para añadir una Cuenta de CuentaCaixa a una lista en Cuentas
	 * 
	 * @param datosDevueltos
	 * @return
	 */

	public static List<Cuenta> devolverListaCuentasCaixa(List<String> datosDevueltos) {
		List<Cuenta> cuentas = new ArrayList<>();
		for (String s : datosDevueltos) {
			String[] datos = s.split(";");
			Cuenta c = new CuentaCaixa(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4]),nivelCatalan());
			cuentas.add(c);
		}
		return cuentas;
	}

	/**
	 * Funcion para añadir una Cuenta de CuentaSabadell a una lista en Cuentas
	 * 
	 * @param list
	 * @return
	 */
	public static List<Cuenta> devolverListaCuentasSabadell(List<String> list) {
		List<Cuenta> cuentas = new ArrayList<>();
		for (String s : list) {
			String[] datos = s.split(";");
			Cuenta c = new CuentaSabadell(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4]),nivelCatalan());
			cuentas.add(c);
		}
		return cuentas;
	}

	/**
	 * Funcion para añadir una Cuenta de CuentaSantander a una lista en Cuentas
	 * 
	 * @param datosDevueltos
	 * @return
	 */
	public static List<Cuenta> devolverListaCuentasSantander(List<String> datosDevueltos) {
		List<Cuenta> cuentas = new ArrayList<>();
		for (String s : datosDevueltos) {
			String[] datos = s.split(";");
			Cuenta c = new CuentaSantander(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4]),isResident());
			cuentas.add(c);
		}
		return cuentas;
	}

	/**
	 * Funcion que llama a los ficheros caixa.txt, sabadell.txt, santander.txt y
	 * devuelve un objeto Cuentas con una lista de todas las cuentas
	 * 
	 * @return
	 */
	public static Cuentas devolverCuentas() {
		Cuentas cuentas = new Cuentas();
		cuentas.addCuentas(devolverListaCuentasCaixa(FicherosUtils.devolverLineasJava8(Paths.get("archivos", "caixa.txt"))));
		cuentas.addCuentas(devolverListaCuentasSabadell(FicherosUtils.devolverLineasJava8(Paths.get("archivos", "sabadell.txt"))));
		cuentas.addCuentas(devolverListaCuentasSantander(FicherosUtils.devolverLineasJava8(Paths.get("archivos", "santander.txt"))));
		return cuentas;
	}

	/**
	 * Funcion que devuelve una lista de Cuenta en un objeto Cuentas en el que
	 * coincide el dni con el String que se pide al usuario
	 * 
	 * @param cuentas
	 * @return
	 */
	public static Cuentas devolverCliente(Cuentas cuentas) {
		Cuentas cuentasCliente = new Cuentas();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dni = new ArrayList<>();
		dni.add("");
		do {
			System.out.println("Introduce el dni de una cuenta existente: ");
			dni.set(0, sc.nextLine());
			cuentasCliente
					.addCuentas(cuentas.getCuentas().stream().filter(e -> e.getDni().equals(dni.get(0))).toList());
		} while (cuentasCliente.getCuentas().size() == 0);

		sc.close();
		return cuentasCliente;
	}

	/**
	 * Funcion que muestra un saludo al cliente en español
	 * 
	 * @param cliente
	 */
	
	public static String nivelCatalan() {
		List<String> nivel= new ArrayList<String>();
		nivel.add("bajo");
		nivel.add("medio");
		nivel.add("alto");
		return nivel.get(new Random().nextInt(nivel.size()));
	}
	
	public static boolean isResident() {
		
		return new Random().nextBoolean();
	}
	
	public static void main(String[] args) {
		Cuentas sabadell=new Cuentas(devolverListaCuentasSabadell(FicherosUtils.devolverLineasJava8(Paths.get("archivos", "sabadell.txt"))));
		Cuentas caixa=new Cuentas(devolverListaCuentasCaixa(FicherosUtils.devolverLineasJava8(Paths.get("archivos", "caixa.txt"))));
		Cuentas santander=new Cuentas(devolverListaCuentasSantander(FicherosUtils.devolverLineasJava8(Paths.get("archivos", "santander.txt"))));

		
//		caixa.getCuentas().forEach(e->System.out.println(e));
//		santander.getCuentas().forEach(e->System.out.println(e));
//		System.out.println(CuentaSantander.getCuentasCreadas());
		
		List<Cuenta> cuentas=new ArrayList<Cuenta>();
		caixa.getCuentas().forEach(e->cuentas.add(e));
		sabadell.getCuentas().forEach(e->cuentas.add(e));
		santander.getCuentas().forEach(e->cuentas.add(e));
		
		cuentas.forEach(e->System.out.println(e.getClass().getName()+", "+e));
		

	}

}
