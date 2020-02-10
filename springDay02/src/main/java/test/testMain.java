package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.JavaCollection;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//spring注入集合，传递多个值
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();

	}

}
