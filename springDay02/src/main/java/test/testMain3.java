package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.TextEditor;

public class testMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***/
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor2");
		te.spellCheck();
		System.out.println(te.getName());
	}

}
