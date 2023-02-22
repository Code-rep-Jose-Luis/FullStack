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
import java.util.Scanner;

public class App {

	/**
	 * Funcion que devuelve todas las lineas de un archivo en filas
	 * 
	 * @param ruta en formato Path
	 * @return
	 */
	public static List<String> devolverLineasJava8(Path ruta) {
		try {
			List<String> lineas = Files.readAllLines(ruta, Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

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
					Double.parseDouble(datos[4]));
			cuentas.add(c);
		}
		return cuentas;
	}

	/**
	 * Funcion para añadir una Cuenta de CuentaSabadell a una lista en Cuentas
	 * 
	 * @param datosDevueltos
	 * @return
	 */
	public static List<Cuenta> devolverListaCuentasSabadell(List<String> datosDevueltos) {
		List<Cuenta> cuentas = new ArrayList<>();
		for (String s : datosDevueltos) {
			String[] datos = s.split(";");
			Cuenta c = new CuentaSabadell(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4]));
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
					Double.parseDouble(datos[4]));
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
		cuentas.addCuentas(devolverListaCuentasCaixa(devolverLineasJava8(Paths.get("archivos", "caixa.txt"))));
		cuentas.addCuentas(devolverListaCuentasSabadell(devolverLineasJava8(Paths.get("archivos", "sabadell.txt"))));
		cuentas.addCuentas(devolverListaCuentasSantander(devolverLineasJava8(Paths.get("archivos", "santander.txt"))));
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
	public static void mensajeEs(Cuenta cliente) {
		System.out.println("Hola " + cliente.getNombre());
	}

	/**
	 * Funcion que muestra un saludo al cliente en ingles
	 * 
	 * @param cliente
	 */
	public static void mensajeEx(Cuenta cliente) {
		System.out.println("Hello " + cliente.getNombre());
	}

	/**
	 * Funcion que puestra la fecha en formato español
	 */
	public static void fechaEs() {
		System.out.println(LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("'Hoy es' eeee dd 'de' MMMM 'de' yyyy\n'Hora: 'HH:mm:ss")));
	}

	/**
	 * Funcion que muestra la fecha en formato ingles
	 */
	public static void fechaEx() {
		System.out.println(LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("'Date: 'eeee',' MMMM dd',' yyyy\n'Time: 'HH:mm:ss", Locale.UK)));
	}
	
	public static LocalDate fechaNacimiento(Cuentas cliente) {
		List<Cuenta> clientesFecha=cliente.getCuentas().stream().distinct().toList();
		LocalDate fecha=clientesFecha.get(0).getfechaNacimiento();
		if (clientesFecha.size()>0) {
			System.out.println("Elige la fecha de nacimiento correcta");
			for (int i = 0; i < clientesFecha.size(); i++) {
				System.out.println((i+1)+". "+clientesFecha.get(i).getfechaNacimiento());
			}
			Scanner sc =new Scanner(System.in);
			int eleccion=0;
			sc.nextLine();
			while (eleccion<1 || eleccion>clientesFecha.size()){
				eleccion=Integer.parseInt(sc.nextLine());
			}
			sc.close();
		}
		
		return fecha;
	}

	public static void main(String[] args) {
		Cuentas cuentas = devolverCuentas();

		Cuentas cuentasCliente = devolverCliente(cuentas);

		if (cuentasCliente.getCuentas().get(0).getcodigoPais().equalsIgnoreCase("ES")) {
			mensajeEs(cuentasCliente.getCuentas().get(0));
			fechaEs();
		} else {
			mensajeEx(cuentasCliente.getCuentas().get(0));
			fechaEx();
		}

		LocalDate fechaNacimiento=fechaNacimiento(cuentasCliente);
		
		
		System.out.println(fechaNacimiento);
		//System.out.println(cuentasCliente);
		//System.out.println(cuentasCliente.getCuentas().stream().distinct().toList());
		
		// datosDevueltos=devolverLineasJava8(Paths.get("alumnos.txt"));

	}

}
