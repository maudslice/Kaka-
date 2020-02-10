package com.how2java.pojo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestHibernate {

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
 
        for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setName("iphone"+i);
            p.setPrice(i);
            s.save(p);         
        }
         
        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
