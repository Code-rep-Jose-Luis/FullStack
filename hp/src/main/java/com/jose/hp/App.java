package com.jose.hp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.jose.hp.entidades.Personaje;
import com.jose.hp.utilidades.JsonUtils;
import com.jose.hp.utilidades.SerializacionUtils;

/**
 * Hello world!
 *
 */
public class App {
	static List<Personaje> personajes = new ArrayList<Personaje>();
	final static String URI = "jdbc:mysql://localhost:3306/harry_poter";
	final static String USER="root";
	final static String PASSWORD="";
	public static Connection con;
	
	public static void ejemploSerializar() {
		// Probamos la serialización
        if(SerializacionUtils.serializarListaObjetos("personajes.dat", personajes)) {
        	System.out.println("La serialización fue satisfactoria");
        } else {
        	System.out.println("La serialización falló");
        }
	}

	public static void obtenerDatosApi() {
		// Obtener los datos de la API
		personajes = JsonUtils.devolverArrayGsonGenerico("https://hp-api.onrender.com/api/characters",
				Personaje[].class);
		personajes.stream().filter(e -> e.getName().equals("Harry Potter")).forEach(e -> System.out.println(e));
	}

	public static void rellenarFechaNacLD() {
		personajes.stream().peek(e -> {
			if (e.getDateOfBirth() != null) {
				e.setDateOfBirthLD(LocalDate.parse(e.getDateOfBirth(), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			}
		}).filter(e -> e.getName().equals("Harry Potter")).forEach(e -> System.out.println(e));
	}

	public static void ejemploDesSerializar() {
		personajes = SerializacionUtils.desSerializarListaObjetos("personajes.dat");
	}

	public static void mostrarPersonajes() {
		personajes.forEach(e -> System.out.println(e));
	}
	
	public static void probarConexion() {
		con = null;
		try {
			con = DriverManager.getConnection(URI, USER, PASSWORD);
			System.out.println("La conexión se realizó correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo en la conexión");
		}
	}
	
	public static void poblarBbdd() {
		
		Statement st;
		String sql = "";
		con = null;
		try {
			con = DriverManager.getConnection(URI, USER, PASSWORD);
			st = con.createStatement();
			
			for(Personaje personaje : personajes) {
				sql = "INSERT INTO personaje(id,name) VALUES('" +
						personaje.getId() + "','" +
						personaje.getName() +
					"');";
				System.out.println(sql);
				st.executeUpdate(sql);
			}
			
			st.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo en la conexión");
		}
	}

	public static void main(String[] args) {
		// Proceso de Serialización
    	//obtenerDatosApi();
    	//rellenarFechaNacLD();       
        //ejemploSerializar();
    	
    	// Proceso de DesSerialización
    	//ejemploDesSerializar();
    	//rellenarFechaNacLD();
    	//mostrarPersonajes();
    	
    	// Proceso de Carga en BBDD
    	// probarConexion();  // Prueba la conexión con la base de datos
    	obtenerDatosApi();
    	rellenarFechaNacLD();
    	poblarBbdd();
	}
}
