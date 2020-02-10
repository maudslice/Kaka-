package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAOP.ProductService;
import springAOP.ProformanceService;



public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

//		Category c = (Category) context.getBean("c");
//		Category p = (Category)context.getBean("p");

//		System.out.println(c.getName());
//		System.out.println(p.getName());
		
//		Product p = (Product)context.getBean("p2");
//		System.out.println(p.getName());
//      System.out.println(p.getCategory().getName());
		
		// π”√xml≈‰÷√AOP
		ProformanceService pf = (ProformanceService) context.getBean("pf");
        pf.doSomeService();
        System.out.println();
        //◊¢Ω‚AOP
        ProductService p  = (ProductService)context.getBean("s");
        p.doSomeService();
	}
}