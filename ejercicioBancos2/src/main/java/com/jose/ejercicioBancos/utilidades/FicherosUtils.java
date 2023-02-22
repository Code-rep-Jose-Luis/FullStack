package com.jose.ejercicioBancos.utilidades;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FicherosUtils {

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
}
