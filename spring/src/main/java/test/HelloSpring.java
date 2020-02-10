package test;

public class HelloSpring {
	private String message;

	public String getMessage() {
		System.out.println("Your Message : " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.out.println("helloSpring的初始化方法");
	}
	public void destroy() {
		System.out.println("helloSpring的销毁方法");
	}
	
}
