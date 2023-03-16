package com.jose.anotaciones2.utilidades;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	static SessionFactory sessionFactory;
	static Session session;
	
	public static boolean openSession() {
		sessionFactory= new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        return (session!=null);
	}
	
	public static boolean closeSession() {
		try {
			if(session!=null) {
				session.close();	
			}
			if(sessionFactory!=null) {
				sessionFactory.close();
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
			
	}
}
