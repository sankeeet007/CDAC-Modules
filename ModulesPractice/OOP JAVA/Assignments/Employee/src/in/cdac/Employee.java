package in.cdac;

public abstract class Employee {
	
	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected float basicSalary;
	
	public Employee(String name, String address, int age, boolean gender, float basicSalary)
	{
		super();
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setBasicSalary(basicSalary);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public String displayData() {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("Name: "+getName()+"\n");
		sBuffer.append("Address: "+getAddress()+"\n");
		sBuffer.append("Age: "+getAge()+"\n");
		sBuffer.append("Gender: "+isGender()+"\n");
		sBuffer.append("Basic Salary: "+getBasicSalary()+"\n");
		return sBuffer.toString();
	}
	
	public float calculateTotalSalary() {
	    return basicSalary;
	}
	
}
