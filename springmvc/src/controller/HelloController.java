package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

//ע�ⷽʽʵ��springmvc

@Controller
public class HelloController{
	@RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ModelAndView mav = new ModelAndView("hello");
        mav.addObject("message", "kaka! �ҵ����������ܼ���");
        return mav;
    }
}
