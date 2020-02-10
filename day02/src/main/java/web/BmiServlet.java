package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BmiServlet extends HttpServlet{

	public BmiServlet() {
		System.out.println("BmiServlet构造器！");
	}
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("BmiServlet的service()方法！");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		System.out.println("height: "+height+"weight: "+weight);
		
		double bmi = Double.parseDouble(weight)/
					Double.parseDouble(height)/
					Double.parseDouble(height);
		String status = "正常";
		if (bmi<19) {
			status = "过轻";
		}
		if (bmi>24) {
			status = "过重";
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+status+"</h1>");
	}
}
