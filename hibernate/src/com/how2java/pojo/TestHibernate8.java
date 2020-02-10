package com.how2java.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHibernate8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		Product p =(Product) session.get(Product.class, 6);
        
        System.out.println(p.getName());
         
        p.setName("iphone-modified");
         
        session.update(p);
        session.getTransaction().commit();
        session.close();
        sf.close();
	}

}
