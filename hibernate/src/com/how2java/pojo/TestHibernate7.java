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
        //hql��ѯ
//        1. ���ȸ���hql����һ��Query����
//        2. ���ò���(�ͻ�1��PreparedStatement��һ����Query�ǻ�0��)
//        3. ͨ��Query�����list()���������ز�ѯ�Ľ���ˡ�
//        ע�� ʹ��hql��ʱ���õ�������Product,�����Ǳ���product_
//        ע�� ʹ��hql��ʱ�򣬲���Ҫ��ǰ��� select *
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
