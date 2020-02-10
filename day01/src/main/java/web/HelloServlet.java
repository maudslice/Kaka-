package web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public HelloServlet(){
		System.out.println("helloServlet构造器");
	}
	
	@Override
//	servlet容器收到请求，会将servlet实例化
//	接下来会调用该实例的service方法来处理请求
//	容器会将请求对象和相应对象作为参数传递进来
//	注：
//		servlet容器会提供网络相关服务，这儿容器会解析请求数据包
//		并将解析的数据存放到request方法对象中，开发人员不用再解析数据包
//	
//	
//	
//	
//	
//	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("helloServlet的service方法");
		PrintWriter out = response.getWriter();
		out.println("<h1> hello servlet <h1>");
	}
	
}
