package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//���ڹ��캯��������ע��
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();
		
		//������ֵ����������ע��
		TextEditor te2 = (TextEditor)context.getBean("textEditor2");
		te2.spellCheck();
		

	}

}
