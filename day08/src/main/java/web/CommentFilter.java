package web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CommentFilter implements Filter{
	private FilterConfig config;
	public CommentFilter() {
		// TODO Auto-generated constructor stub
		System.out.println("CommentFilter构造器!");
	}
	
	public void init(FilterConfig arg0) throws ServletException{
		System.out.println("CommentFilter实例的init方法");
		config = arg0;
	}
	
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("CommentFilter实例的doFilter方法开始执行");
		
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String content = request.getParameter("content");
		System.out.println("content:" + content);

		String illegal = config.getInitParameter("illegal");
		System.out.println("illegal:" + illegal);
		
		if (content.indexOf(illegal) == -1) {
			//不包含敏感词
			arg2.doFilter(request, response);
		}else {
			//包含
			response.getWriter().println("评论内容包含违禁词!");
		}
		
		System.out.println("CommentFilter实例的doFilter方法执行结束");
		
	}
	
	public void destroy() {
		System.out.println("CommentFilter实例的destroy方法");
	}


	

}
