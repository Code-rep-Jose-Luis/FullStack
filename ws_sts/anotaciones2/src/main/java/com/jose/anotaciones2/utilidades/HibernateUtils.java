package com.jose.anotaciones2.utilidades;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateUtils {
	
	static SessionFactory sessionFactory;
	static Session session;
	
	/**
	 * Abre una conexión con la base de datos
	 * @return True si la conexión se abre correctamente. False en caso contrario
	 */
	public static boolean openSession() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        return (session!=null);
	}
	
	/**
	 * Cierra la conexión con la base de datos
	 * @return True si la conexión se cierra correctamente. False en caso contrario
	 */
	public static boolean closeSession() {		
		try {
			if(session!=null)
				session.close();
			if(sessionFactory!=null)
				sessionFactory.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * Dado el nombre de una clase, devuelve una lista con todos los elementos que tiene.
	 * Usaremos este método en un proyecto < Hibernate 6.0
	 * <br>ex: HibernateUtils.devolverListaObjetos("Libros")
	 * @param clase Nombre de la clase de la que queremos obtener todos los datos.
	 * @return Lista con el equivalente a todas las filas de la tabla de ese nombre
	 */
	@SuppressWarnings("deprecation")
	public static List<?> devolverListaObjetos(String clase){
		return session.createQuery("from " + clase).list();
	}
	
	/**
	 * Dado el tipo de una clase, devuelve una lista con todos los elementos que tiene.
	 * Usaremos este método en un proyecto >= Hibernate 6.0
	 * <br> ex: HibernateUtils.devolverListaObjetos(Autores.class)
	 * @param <T> Tipo de la clase
	 * @param clase Clase pasada
	 * @return Lista con el equivalente a todas las filas de la tabla de ese nombre
	 */
	public static <T> List<T> devolverListaObjetos(Class<T> clase){
		return session.createSelectionQuery("from " + clase.getSimpleName(),clase).list();
	}
	
	/**
	 * Inserta el registro en su tabla correspondiente de la base de datos
	 * <br> ex: HibernateUtils.save(new Autores("AAAAA","Nombre de prueba",new HashSet<Libros>(0)));
	 * @param object Objeto de la clase que queremos insertar
	 * @return True si la inserción es correcta. False si falla.
	 */
	public static boolean save(Object object) {
		Transaction trans = null;
		try {
			trans = session.beginTransaction();  // abro la transacción		
			session.persist(object);  // antiguo save. Persist es a partir de la versión 6.0
			trans.commit();  // confirmo los cambios en la transacción
			session.clear();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			return false;
		}
	}
	
	/**
	 * Método que actualiza un/os registro/s de la base de datos mediante un patrón que indica
	 * los campos que queremos actualizar siempre que no le pasemos null
	 * <br> HibernateUtils.update(Autores.class, "nombre='Nombre de prueba'", new Autores(null,"Update Genérico",null));
	 * @param <T> Clase con la que trabajamos
	 * @param clase Nombre del objeto de tipo clase
	 * @param where Condición de búsqueda, sin la palabra where
	 * @param datos Objeto con los nuevos datos, actualiza todo lo que no sea null (no se puede actualizar un campo un null)
	 * @return True si es correcta la actualiza de todos los registros. False en caso contrario
	 */
	public static <T> boolean update(Class<T> clase, String where, T datos) {
		Transaction trans = null;
		try {
			List<T> resultados = session.createSelectionQuery("FROM  " + clase.getSimpleName() + " WHERE " + where,clase).list();
			trans = session.beginTransaction();
			Arrays.asList(clase.getDeclaredFields()).forEach(atributo->{
				resultados.forEach(resultado -> {
					atributo.setAccessible(true);
					try {
						if(atributo.get(datos)!=null && !Modifier.isStatic(atributo.getModifiers())) {
							atributo.set(resultado,atributo.get(datos));
						}
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					atributo.setAccessible(false);
				});
			});
			resultados.forEach(e->session.merge(e));  // Antiguo update < 6.0
			trans.commit();
			session.clear();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			return false;
		}
	}
	
	/**
	 * Borramos los objetos de la clase que cumplan la condición pasada en el where
	 * <br> HibernateUtils.delete(Autores.class, "cod='AAAAB'");
	 * @param <T> Clase con la que trabajamos 
	 * @param clase Objeto de la clase
	 * @param where Condición de borrado sin la palabra where
	 * @return Número de elementos borrados, 0 si no borra ninguno, -1 en caso de error.
	 */
	public static <T> int delete(Class<T> clase, String where) {
		Transaction trans = null;
		try {
			List<T> resultados = session.createSelectionQuery("FROM  " + clase.getSimpleName() + " WHERE " + where,clase).list();
			trans = session.beginTransaction();  // abro la transacción		
			resultados.forEach(e->session.remove(e)); // Hibernate <6.0 era delete
			trans.commit();  // confirmo los cambios en la transacción
			session.clear();
			return resultados.size();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			return -1;
		}
	}
	
	
}