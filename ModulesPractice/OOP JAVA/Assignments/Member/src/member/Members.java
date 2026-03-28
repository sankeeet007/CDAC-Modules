package member;

import java.util.Scanner;

public class Members {
	String name;
	int age;
	String phone_no;
	String address;
	float salary;
	
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Salary: "+salary);
	}
	
}
