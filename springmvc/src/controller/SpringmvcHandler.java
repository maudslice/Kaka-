package controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
//@RequestMapping(value="/springmvc")
public class SpringmvcHandler {
	
	
	
	/**
	 * REST PUT
	 */
	@RequestMapping(value="/order",method=RequestMethod.PUT)
	public String testRestPUT() {
		System.out.println("REST PUT");
		return "hello";
	}
	/**
	 * REST POST
	 */
	@RequestMapping(value="/order",method=RequestMethod.POST)
	public String testRestPOST() {
		System.out.println("REST POST");
		
		return "hello";
	}
	
	
	/**
	 * REST DELETE
	 */
	@RequestMapping(value="/order/{id}",method=RequestMethod.DELETE)
	public String testRestDELETE(@PathVariable("id")Integer id ) {
		System.out.println("REST DELETE: " + id );
		return "hello";
	}
	
	/**
	 * REST GET
	 */
	@RequestMapping(value="/order/{id}",method=RequestMethod.GET)
	public String testRestGET(@PathVariable("id")Integer id ) {
		System.out.println("REST GET: " + id );
		return "hello";
	}
	
	/**
	 * ��ռλ����URL
	 * 
	 * �����:  http://localhost:8888/Springmvc01/testPathVariable/admin/1001
	 */
	@RequestMapping(value="/testPathVariable/{name}/{id}")
	public String testPathVariable(@PathVariable("name")String name, @PathVariable("id")Integer id ) {
		System.out.println(name  + " : " + id);
		
		return "hello";
	}
	
	
	/**
	 * @RequestMapping  ӳ���������   �Լ�  ����ͷ��Ϣ
	 * 
	 * params  : username=tom&age=22
	 * headers
	 */
	
	@RequestMapping(value="/testRequestMappingParamsAndHeaders",
					params= {"username","age=22"},
					headers= {"!Accept-Language"})
	public String testRequestMappingParamsAndHeaders() {
		
		return "hello";
	}
	
	
	/**
	 * @RequestMapping  method ӳ������ʽ
	 * 
	 */
	@RequestMapping(value="/testRequestMappingMethod",method= {RequestMethod.POST,RequestMethod.GET})
	public String testRequestMappingMethod() {
		
		return "hello";
	}
	
	/**
	 * @RequestMapping  
	 */
	@RequestMapping(value="/testRequestMapping")
	public String testRequestMapping() {
		
		return "hello";
	}
	
}	
