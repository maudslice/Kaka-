package com.how2java.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Testhibernate2 {

	public static void main(String[] args) {
//		hibernate的基本步骤是：
//		1. 获取SessionFactory
//		2. 通过SessionFactory 获取一个Session
//		3. 在Session基础上开启一个事务
//		4. 通过调用Session的save方法把对象保存到数据库
//		5. 提交事务
//		6. 关闭Session
//		7. 关闭SessionFactory
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Category c1 = new Category();
		c1.setName("wangdachui");
		
		s.save(c1);
		s.getTransaction().commit();
		
		s.close();
		sf.close();

	}

}
