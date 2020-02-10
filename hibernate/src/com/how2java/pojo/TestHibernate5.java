package com.how2java.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 
        Session s = sf.openSession();
        s.beginTransaction();
        //HibernateÉ¾³ý
        Product p =(Product) s.get(Product.class, 20);
        s.delete(p);
         
        s.getTransaction().commit();
        s.close();
        sf.close();
	}

}
