package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloSpring obj = (HelloSpring)context.getBean("mes");
//		obj.setMessage("Œ“»º…’ƒ„µƒ√Œ");
//		obj.getMessage();
//		HelloSpring obj4 = (HelloSpring)context.getBean("mes");
//		obj4.getMessage();
//		
//		HelloSpring obj2 = (HelloSpring)context.getBean("mes2");
//		obj2.setMessage("kaka!");
//		obj2.getMessage();
//		HelloSpring obj3 = (HelloSpring)context.getBean("mes2");
//		obj3.getMessage();
		
		HelloSpring obj5 = (HelloSpring)context.getBean("mes3");
		obj5.getMessage();
		
		

	}

}
