package com.jose.ejercicioBancos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.jose.ejercicioBancos.entidades.Cuenta;
import com.jose.ejercicioBancos.entidades.CuentaCaixa;
import com.jose.ejercicioBancos.entidades.CuentaSabadell;
import com.jose.ejercicioBancos.entidades.CuentaSantander;
import com.jose.ejercicioBancos.entidades.Cuentas;
import com.jose.ejercicioBancos.entidades.Oferta;
import com.jose.ejercicioBancos.entidades.Ofertas;

public class App {

	private static Scanner sc;

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
			cuentas.add(new CuentaCaixa(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4])));
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
			cuentas.add(new CuentaSabadell(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4])));
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
			cuentas.add(new CuentaSantander(datos[0], datos[1],
					LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3],
					Double.parseDouble(datos[4])));
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

		ArrayList<String> dni = new ArrayList<>();
		dni.add("");
		String cadena = "";
		do {
			System.out.println("Introduce el dni de una cuenta existente: ");
			dni.set(0, sc.nextLine());
			cuentasCliente
					.addCuentas(cuentas.getCuentas().stream().filter(e -> e.getDni().equals(dni.get(0))).toList());
		} while (cuentasCliente.getCuentas().size() == 0);

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
		List<Cuenta> clientesFecha = cliente.getCuentas().stream().distinct().toList();
		LocalDate fecha = clientesFecha.get(0).getfechaNacimiento();
		if (clientesFecha.size() > 1) {
			System.out.println("Elige la fecha de nacimiento correcta");
			for (int i = 0; i < clientesFecha.size(); i++) {
				System.out.println((i + 1) + ". " + clientesFecha.get(i).getfechaNacimiento());
			}
			int eleccion = 0;
			while (eleccion < 1 || eleccion > clientesFecha.size()) {
				System.out.println("Introduce opcion: ");
				eleccion = Integer.parseInt(sc.nextLine());
			}

			fecha = clientesFecha.get(eleccion - 1).getfechaNacimiento();
		}

		return fecha;
	}

	/**
	 * Funcion para añadir una Cuenta de CuentaSantander a una lista en Cuentas
	 * 
	 * @param datosDevueltos
	 * @return
	 */
	public static List<Oferta> devolverOfertas(List<String> datosDevueltos) {
		List<Oferta> ofertas = new ArrayList<>();
		for (String s : datosDevueltos) {
			String[] datos = s.split(";");
			ofertas.add(new Oferta(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Double.parseDouble(datos[2]),
					Double.parseDouble(datos[3]), datos[4]));
		}
		return ofertas;
	}

	/**
	 * Funcion que devuelve la oferta que este en el rango de edad y saldo,
	 * devolviendo la que mayor saldo minimo tenga
	 * 
	 * @param fechaNacimiento
	 * @param cuentasCliente
	 * @return
	 */
	public static Oferta obtenerOferta(LocalDate fechaNacimiento, Cuentas cuentasCliente) {
		Ofertas ofertas = new Ofertas(
				devolverOfertas(devolverLineasJava8(Paths.get("archivos", "productosofertados.txt"))));
		double saldoCuentas = cuentasCliente.getCuentas().stream().mapToDouble(e -> e.getSaldo()).sum();
		int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
		List<Oferta> oferta = ofertas.getOferta(edad, saldoCuentas);
		return oferta.stream().max(Comparator.comparingDouble(Oferta::getSaldoMin)).orElseThrow();

	}

	/**
	 * Funcion que llama a los mensajes segun la el pais del cliente y muestra la
	 * oferta
	 * 
	 * @param cuentasCliente
	 */
	public static void mensajes(Cuentas cuentasCliente, Oferta oferta) {
		if (cuentasCliente.getCuentas().get(0).getcodigoPais().equalsIgnoreCase("ES")) {
			mensajeEs(cuentasCliente.getCuentas().get(0));
			fechaEs();
		} else {
			mensajeEx(cuentasCliente.getCuentas().get(0));
			fechaEx();
		}
		System.out.println(oferta.getNombre());

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Cuentas cuentas = devolverCuentas();
		Cuentas cuentasCliente = devolverCliente(cuentas);
		mensajes(cuentasCliente, obtenerOferta(fechaNacimiento(cuentasCliente), cuentasCliente));
		sc.close();
	}

}
