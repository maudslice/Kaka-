package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.TextEditor;

public class testMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Spring 自动装配 ‘byName’
		 * 这种模式由属性名称指定自动装配。 Spring 容器看作 beans，在 XML 配置文件中 beans 的 auto-wire 属性设置为
		 * byName。 然后，它尝试将它的属性与配置文件中定义为相同名称的 beans 进行匹配和连接。 如果找到匹配项，它将注入这些 beans，
		 * 否则，它将抛出异常。
		 * ‘byType’与byName类似
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}

}
