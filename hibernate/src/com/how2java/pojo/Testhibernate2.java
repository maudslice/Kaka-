package com.how2java.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Testhibernate2 {

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
		
		Category c1 = new Category();
		c1.setName("wangdachui");
		
		s.save(c1);
		s.getTransaction().commit();
		
		s.close();
		sf.close();

	}

}
