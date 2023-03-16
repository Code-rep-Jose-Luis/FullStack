package com.jose.anotaciones1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jose.anotaciones1.entidades.Autores;
import com.jose.anotaciones1.entidades.Libros;

/**
 * Hello world!
 *
 */
public class App 
{
	static SessionFactory sessionFactory;
	static Session session;
	public static boolean openSession() {
		sessionFactory= new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        if(session!=null) {
        	return true;
        }
        return false;
	}
	public static void closeSession() {
		if(session!=null) {
			session.close();
			sessionFactory.close();
		}
	}
	
	public static void mostrarLibros() {
		List<Libros> libros=session.createSelectionQuery("from Libros",Libros.class).list();
		libros.forEach(e->System.out.println(e.getId()+" "+e.getAutores().getNombre()));
	}
	
	public static void mostrarAutoes() {
		List<Autores> autores=session.createSelectionQuery("from Autores",Autores.class).list();
		autores.forEach(e->System.out.println(e.getCod()+" "+e.getNombre()+" "+e.hashCode()));
	}
	
	public static void anyadirAutor(Autores autor) {
		Transaction trans = session.beginTransaction();
		session.persist(autor);
		trans.commit();
	}
	public static void anyadirLibro(Libros libro) {
		Transaction trans = session.beginTransaction();
		session.persist(libro);
		trans.commit();
	}
	
	public static void updateAutor(String nombreAntiguo,String nombreNuevo) {
		List<Autores> autores=session.createSelectionQuery("from Autores where nombre='"+nombreAntiguo+"'",Autores.class).list();
		Transaction trans = session.beginTransaction();
		autores.forEach(e->{
			e.setNombre(nombreNuevo);
			session.merge(e);
		});
		trans.commit();
	}
	
	public static void deleteAutor(String codigo) {
		List<Autores> autor=session.createSelectionQuery("from Autores where cod='"+codigo+"'",Autores.class).list();
		if(autor.size()>0) {
			Transaction trans = session.beginTransaction();
			session.remove(autor.get(0));
			trans.commit();
		}
	}
	
    public static void main( String[] args )
    {
        if (openSession()) {
			System.out.println("conectado");
			mostrarLibros();
			closeSession();
		}
    }
}
