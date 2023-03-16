package com.jose.Biblioteca1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        if(session!=null) {
        	System.out.println("conectado");
        }else {
        	System.out.println("no conectado");
        }
        
    }
}
