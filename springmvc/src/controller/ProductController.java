package controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

import org.springframework.stereotype.Controller;

//注解方式实现springmvc

@Controller
public class ProductController{
	@RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception {
    	ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
	
	@RequestMapping("/jump")
	public ModelAndView jump() {
		//客户端跳转
		ModelAndView mav = new ModelAndView("redirect:/addProduct");
		return mav;
	}
}
