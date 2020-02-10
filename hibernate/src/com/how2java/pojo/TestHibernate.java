package com.how2java.pojo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestHibernate {

	public static void main(String[] args) {
//		hibernate�Ļ��������ǣ�
//		1. ��ȡSessionFactory
//		2. ͨ��SessionFactory ��ȡһ��Session
//		3. ��Session�����Ͽ���һ������
//		4. ͨ������Session��save�����Ѷ��󱣴浽���ݿ�
//		5. �ύ����
//		6. �ر�Session
//		7. �ر�SessionFactory
		
		
		
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
