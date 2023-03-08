package com.jose.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jose.jdbc.entidades.Tabla1;
import com.jose.jdbc.utilidades.JdbcUtils;

public class App 
{
	
	
	static List<Tabla1> datos = new ArrayList<Tabla1>();
	
	public static void cargarDatosTabla1() {
		ResultSet rs = JdbcUtils.devolverResultSet("SELECT * FROM tabla1");
    	try {
			while(rs.next()) {  		 // mientras hay resultados, los vamos recorriendo
				datos.add(new Tabla1(rs.getInt("id"),rs.getString("nombre")));  // Metería en la lista un elemento por cada registro que devuelve la consulta
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void cargarDatosTabla1PreparedStatement() {
		String sql = "SELECT * FROM tabla1 WHERE id=? and nombre=?";
		List<Object> parametros = new ArrayList<Object>();
		parametros.add(11);
		parametros.add("Paco");
		ResultSet rs = JdbcUtils.devolverResultSetPreparedStatement(sql, parametros);
		if(rs!=null) {
			try {
				while(rs.next()) {  		 // mientras hay resultados, los vamos recorriendo
					datos.add(new Tabla1(rs.getInt("id"),rs.getString("nombre")));  // Metería en la lista un elemento por cada registro que devuelve la consulta
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    	
	}
	
	public static void insertarDato() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de la persona:");
		String nombre = sc.nextLine();
		// En la siguiente línea no pasamos el id porque lo pone automático la base de datos
		//int registros = JdbcUtils.statementDML("INSERT INTO tabla1(nombre) VALUES('Eoi')");
		int registros = JdbcUtils.statementDML("INSERT INTO tabla1(nombre) VALUES('" + nombre + "')");
		System.out.println("Se ha insertado " + registros + " registro");
		sc.close();
	}
	
	public static void borrarDatoPorId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el código de la persona a borrar:");
		int id = Integer.parseInt(sc.nextLine());
		int registros = JdbcUtils.statementDML("DELETE FROM tabla1 WHERE id =" + id);
		System.out.println("Se ha borrado " + registros + " registro");
		sc.close();
	}
	
	public static void borrarDatoPorNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de la persona a borrar:");
		String nombre = sc.nextLine();
		// DELETE FROM tabla1 WHERE nombre LIKE 'Fran'
		// Ejemplo de SQL injection
		// DELETE FROM tabla1 WHERE nombre LIKE 'a' or 'a'='a'
		int registros = JdbcUtils.statementDML("DELETE FROM tabla1 WHERE nombre LIKE '" + nombre + "'");
		System.out.println("Se ha borrado " + registros + " registro");
		sc.close();
	}
	
	public static void modificarDatoPorNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de la persona a modificar:");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el nuevo nombre:");
		String nombreModificado = sc.nextLine();
		int registros = JdbcUtils.statementDML("UPDATE tabla1 SET nombre ='" + nombreModificado + "' WHERE nombre LIKE '" + nombre + "'");
		System.out.println("Se ha actualizado " + registros + " registro");
		sc.close();
	}
	
	public static void borrarDatoPorIdPS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el código de la persona a borrar:");
		int id = Integer.parseInt(sc.nextLine());
		List<Object> parametros = new ArrayList<Object>();
		parametros.add(id);
		int registros = JdbcUtils.preparedStatementDML("DELETE FROM tabla1 WHERE id = ?",parametros);
		System.out.println("Se ha borrado " + registros + " registro");
		sc.close();
	}
	
    public static void main( String[] args )
    {
        if(JdbcUtils.conexion()) {
        	// Aquí irá el programa
        	// Solo mostrar los datos
            // JdbcUtils.selectBasica();
        	
        	// Devolver la lista de datos
        	/*
        	datos = JdbcUtils.devolverRegistrosTabla1();
        	datos.stream()
        		.filter(e->e.getNombre().length()>4)
        		.forEach(e->System.out.println(e.getNombre()));
        	*/
        	
        	// Devolver el ResultSet
        	//cargarDatosTabla1();
        	//insertarDato();
        	//borrarDatoPorId();
        	//borrarDatoPorNombre();
        	//modificarDatoPorNombre();
        	//JdbcUtils.ejemploPreparedStatement();
        	/*
        	cargarDatosTabla1PreparedStatement();
        	datos.stream()
    		.forEach(e->System.out.println(e.getNombre()));
    		*/
        	borrarDatoPorIdPS();
            JdbcUtils.desconexion();
        }
        
    }
}