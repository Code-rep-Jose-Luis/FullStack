package com.jose.BibliotecaH2;

import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jose.BibliotecaH2.entidades.Autores;
import com.jose.BibliotecaH2.entidades.Libros;

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
		autores.forEach(e->System.out.println(e.getCod()+" "+e.getNombre()+" "+e.hashCode()+" "+e.mostrarLibros()));
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
    	java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.SEVERE);
    	if(openSession()) {
    		//anyadirAutor(new Autores("BBBBB","Autor de prueba", new HashSet<Libros>(0)));
    		//anyadirLibro(new Libros(3,new Autores("AAAAA","Autor de prueba", new HashSet<Libros>(0)),"nombre de un libro"));
    		mostrarLibros();
    		mostrarAutoes();
    		//updateAutor("Autor de prueba","Autor actualizado");
    		deleteAutor("BBBBB");
    		closeSession();
    	}
    }
}
