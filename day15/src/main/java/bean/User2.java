package bean;

import java.io.Serializable;

public class User2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1664348189829941826L;
	private String username;
	private String gender;
	
	
	
	
	public User2() {
		super();
	}
	public User2(String username, String gender) {
		super();
		this.username = username;
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User2 [username=" + username + ", gender=" + gender + "]";
	}
	
	
	

}
