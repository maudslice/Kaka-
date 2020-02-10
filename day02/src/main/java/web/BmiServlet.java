package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BmiServlet extends HttpServlet{

	public BmiServlet() {
		System.out.println("BmiServlet��������");
	}
	
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("BmiServlet��service()������");
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		System.out.println("height: "+height+"weight: "+weight);
		
		double bmi = Double.parseDouble(weight)/
					Double.parseDouble(height)/
					Double.parseDouble(height);
		String status = "����";
		if (bmi<19) {
			status = "����";
		}
		if (bmi>24) {
			status = "����";
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+status+"</h1>");
	}
}
