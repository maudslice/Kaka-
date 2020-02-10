package com.how2java.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHibernate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new ��һ��Product();�������ݿ��л�û�ж�Ӧ�ļ�¼�����ʱ��Product�����״̬��˲ʱ�ġ�
//		ͨ��Session��save�Ѹö��󱣴��������ݿ��У��ö���Ҳ��Session֮���������ϵ����ʱ״̬�ǳ־õġ�
//		����Session�ر��ˣ�������������ݿ�����Ȼ�ж�Ӧ�����ݣ������Ѿ���Sessionʧȥ����ϵ���൱�������˹���״̬�����ѹܵ�

		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		Product p = new Product();
        p.setName("p1");
        System.out.println("��ʱp��˲ʱ״̬");
        session.save(p);
        System.out.println("��ʱp�ǳ־�״̬");
        session.getTransaction().commit();
        session.close();
        System.out.println("��ʱp���ѹ�״̬");
        sf.close();
	}

}
