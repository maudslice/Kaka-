package com.how2java.pojo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 
        Session s = sf.openSession();
        s.beginTransaction();
        //hql查询
//        1. 首先根据hql创建一个Query对象
//        2. 设置参数(和基1的PreparedStatement不一样，Query是基0的)
//        3. 通过Query对象的list()方法即返回查询的结果了。
//        注： 使用hql的时候，用的是类名Product,而不是表名product_
//        注： 使用hql的时候，不需要在前面加 select *
        String name = "iphone";
        Query q2 =s.createQuery("from Product p");
//        Query q =s.createQuery("from Product p where p.name like ?");
//        q.setString(0, "%"+name+"%");
        List<Product> ps= q2.list();
        for (Product p : ps) {
            System.out.println(p.getName());
        }
         
        s.getTransaction().commit();
        s.close();
        sf.close();
	}

}
