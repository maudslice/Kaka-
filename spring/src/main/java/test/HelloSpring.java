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
		System.out.println("helloSpring�ĳ�ʼ������");
	}
	public void destroy() {
		System.out.println("helloSpring�����ٷ���");
	}
	
}
