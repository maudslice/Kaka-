package web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public HelloServlet(){
		System.out.println("helloServlet������");
	}
	
	@Override
//	servlet�����յ����󣬻Ὣservletʵ����
//	����������ø�ʵ����service��������������
//	�����Ὣ����������Ӧ������Ϊ�������ݽ���
//	ע��
//		servlet�������ṩ������ط����������������������ݰ�
//		�������������ݴ�ŵ�request���������У�������Ա�����ٽ������ݰ�
//	
//	
//	
//	
//	
//	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("helloServlet��service����");
		PrintWriter out = response.getWriter();
		out.println("<h1> hello servlet <h1>");
	}
	
}
