package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//基于构造函数的依赖注入
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();
		
		//基于设值函数的依赖注入
		TextEditor te2 = (TextEditor)context.getBean("textEditor2");
		te2.spellCheck();
		

	}

}
