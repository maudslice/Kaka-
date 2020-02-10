package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

//注解方式实现springmvc

@Controller
public class HelloController{
	@RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ModelAndView mav = new ModelAndView("hello");
        mav.addObject("message", "kaka! 我的力量无人能及！");
        return mav;
    }
}
