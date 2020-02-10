package bean;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String[] interest;
	private String username;
	
	
	
	
	public User() {
		super();
	}


	public User(int age, String[] interest, String username) {
		super();
		this.age = age;
		this.interest = interest;
		this.username = username;
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
