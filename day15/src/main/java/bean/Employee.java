package bean;

import java.io.Serializable;

public class Employee implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7874812345139102778L;

	private String ename;
	private double salary;
	private int age;
	
	
	public Employee() {
		super();
	}


	public Employee(String ename, double salary, int age) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.age = age;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
	

}
