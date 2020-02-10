package com.how2java.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHibernate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		//通过ID获得一个对象
		Product p = (Product)session.get(Product.class, 6);
		System.out.println(p.getName());
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
