package com.jose.hp.utilidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

	/**
	 * Metódo genérico que dada una url con un json donde se encuentra un objeto
	 * devuelve un objeto de la clase asociada. Ejemplo de llamada:
	 * JsonUtils.devolverObjetoGsonGenerico("https://swapi.dev/api/people/1/?format=json",People2.class)
	 * 
	 * @param <T>   Nombre de la clase
	 * @param url
	 * @param clase Clase con la que trabajaremos
	 * @return
	 */
	public static <T> T leerObjeto(String url, Class<T> clase) {
		return new Gson().fromJson(InternetUtils.readUrl(url), clase);
	}

	/**
	 * Metódo genérico que dada una url con un json donde se encuentra un objeto
	 * devuelve un objeto de la clase asociada. Ejemplo de llamada:
	 * JsonUtils.devolverObjetoGsonGenerico("https://swapi.dev/api/people/1/?format=json",People2.class)
	 * 
	 * @param <T>   Nombre de la clase
	 * @param token Token de la API a la que nos conectamos
	 * @param url
	 * @param clase Clase con la que trabajaremos
	 * @return
	 */
	public static <T> T leerObjetoConToken(String url, String token, Class<T> clase) {
		return new Gson().fromJson(InternetUtils.readUrl(url, token), clase);
	}

	/**
	 * Metódo genérico que dada una url con un json donde se encuentra un objeto y
	 * un número inicial y final devuelve una lista de objetos de la clase asociada
	 * con sucesivas llamadas a la API Ejemplo de llamada:
	 * JsonUtils.leerObjetos("https://swapi.dev/api/films/", 1, 5, "?format=json",
	 * Films.class)
	 * 
	 * @param <T>            Nombre de la clase
	 * @param comienzoCadena Parte inicial de la url antes del número del elemento
	 * @param numInicio      Elemento inicial a partir del que queremos rellenar la
	 *                       lista
	 * @param numFin         Elemento final a partir del que queremos rellenar la
	 *                       lista
	 * @param finCadena      Parte final de la url después del número del elemento
	 * @param clase          Clase con la que trabajaremos
	 * @return
	 */
	public static <T> List<T> leerObjetos(String comienzoCadena, int numInicio, int numFin, String finCadena,
			Class<T> clase) {
		List<T> resultado = new ArrayList<T>();
		for (int i = numInicio; i <= numFin; i++) {
			resultado.add(leerObjeto(comienzoCadena + i + finCadena, clase));
		}
		return resultado;
	}

	/**
	 * Método genérico que dada una url con un json donde se encuentra un array de
	 * objetos devuelve una lista de este tipo de objetos que contiene todos los
	 * objetos del array. Ejemplo de llamada:
	 * JsonUtils.devolverArrayGsonGenerico("https://jsonplaceholder.typicode.com/posts",Posts[].class);
	 * 
	 * @param <T>   Nombre de la clase genérica
	 * @param url   Url de la web donde está el array en formato json
	 * @param clase Array de elementos del tipo de la clase
	 * @return Lista de elementos de esa clase
	 */
	public static <T> List<T> devolverArrayGsonGenerico(String url, Class<T[]> clase) {
		return Arrays.asList(new Gson().fromJson(InternetUtils.readUrl(url), clase));
	}

	/**
	 * Creamos un String con un json a partir de un objeto
	 * 
	 * @param <T>    tipo del objeto
	 * @param object nombre de la variable
	 * @return String con el Json devuelto
	 */
	public static <T> String crearJson(T object) {
		return new Gson().toJson(object);
	}

	/**
	 * Creamos un String con un json en formato amigable a partir de un objeto
	 * 
	 * @param <T>    tipo del objeto
	 * @param object nombre de la variable
	 * @return String con el Json devuelto
	 */
	public static <T> String crearJsonPretty(T object) {
		return new GsonBuilder().setPrettyPrinting().create().toJson(object);
	}
}