package controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

import org.springframework.stereotype.Controller;

//ע�ⷽʽʵ��springmvc

@Controller
public class ProductController{
	@RequestMapping("/addProduct")
    public ModelAndView add(Product product) throws Exception {
    	ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
	
	@RequestMapping("/jump")
	public ModelAndView jump() {
		//�ͻ�����ת
		ModelAndView mav = new ModelAndView("redirect:/addProduct");
		return mav;
	}
}
