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
	 * Funcion para añadir una Cuenta a una lista en Cuentas
	 * 
	 * @param datosDevueltos
	 * @return
	 */
	public static List<Cuenta> devolverListaCuentas(List<String> datosDevueltos) {
		List<Cuenta> cuentas = new ArrayList<>();
		for (String s : datosDevueltos) {
			String[] datos = s.split(";");
			cuentas.add(
					new Cuenta(datos[0], datos[1], LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
							datos[3], Double.parseDouble(datos[4])));
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
		cuentas.addCuentas(devolverListaCuentas(devolverLineasJava8(Paths.get("archivos", "caixa.txt"))));
		cuentas.addCuentas(devolverListaCuentas(devolverLineasJava8(Paths.get("archivos", "sabadell.txt"))));
		cuentas.addCuentas(devolverListaCuentas(devolverLineasJava8(Paths.get("archivos", "santander.txt"))));
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
	 * Funcion que pregunta la fecha de nacimiento correcta si hay mas de 1
	 * @param cliente
	 * @return
	 */

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
		
		return oferta.stream().max(Comparator.comparingDouble(Oferta::getSaldoMin)).orElse(ofertas.getOfertas().get(0));

	}

	/**
	 * Funcion que llama a los mensajes segun la el pais del cliente y muestra la
	 * oferta
	 * 
	 * @param cuentasCliente
	 */
	public static void mensajes(Cuentas cuentasCliente, Oferta oferta) {
		Cuenta cliente=cuentasCliente.getCuentas().get(0);
		System.out.println(((cliente.getcodigoPais().equals("ES"))?"Hola ":"Hello ") + cliente.getNombre());
		System.out.println(LocalDateTime.now()
				.format((cliente.getcodigoPais().equals("ES"))?DateTimeFormatter.ofPattern("'Hoy es' eeee dd 'de' MMMM 'de' yyyy\n'Hora: 'HH:mm:ss"):DateTimeFormatter.ofPattern("'Date: 'eeee',' MMMM dd',' yyyy\n'Time: 'HH:mm:ss", Locale.UK)));
		System.out.println(oferta.getNombre().trim());
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Cuentas cuentas = devolverCuentas();
		Cuentas cuentasCliente = devolverCliente(cuentas);
		mensajes(cuentasCliente, obtenerOferta(fechaNacimiento(cuentasCliente), cuentasCliente));
		sc.close();
	}

}
