package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.TextEditor;

public class testMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Spring �Զ�װ�� ��byName��
		 * ����ģʽ����������ָ���Զ�װ�䡣 Spring �������� beans���� XML �����ļ��� beans �� auto-wire ��������Ϊ
		 * byName�� Ȼ�������Խ����������������ļ��ж���Ϊ��ͬ���Ƶ� beans ����ƥ������ӡ� ����ҵ�ƥ�������ע����Щ beans��
		 * ���������׳��쳣��
		 * ��byType����byName����
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}

}
