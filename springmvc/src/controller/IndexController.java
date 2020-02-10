package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

//控制类IndexController实现接口Controller，提供handleRequest方法来处理请求
//SpringMVC通过 ModelAndView 对象把模型和视图结合在一起
 
@Controller
public class IndexController{
	@RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//    	表示视图是index.jsp
//    	模型数据是 message，内容是 “Hello Spring MVC”
    	ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
	
	@RequestMapping("/check")
	public ModelAndView check(HttpSession session) throws Exception {
		Integer i = (Integer)session.getAttribute("count");
		if (i == null) {
			i = 0;
		}
		i ++;
		session.setAttribute("count", i);
		ModelAndView mav = new ModelAndView("check");
		return mav;
		
	}
}
