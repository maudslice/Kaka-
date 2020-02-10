package com.how2java.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHibernate6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		Category c =new Category();
        c.setName("c1");
        s.save(c);
         
        Product p = (Product) s.get(Product.class, 8);
        p.setCategory(c);
         
        s.update(p);
        s.getTransaction().commit();
        s.close();
        sf.close();
	}

}
