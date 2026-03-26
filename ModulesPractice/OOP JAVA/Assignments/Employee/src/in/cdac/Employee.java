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
		if(name == null || name.equals("") || name.length()<3)	//validation
			name = "Default";
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address == null || address.equals("") || address.length()<3)	//validation
			address = "CDAC Acts, Pashan";
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18 || age>58)		//validation
			age=21;
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
		if(basicSalary < 0)		//validation
			basicSalary = 12000.0F;
		this.basicSalary = basicSalary;
	}
	
	public String displayData() {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("Name: "+getName());
		sBuffer.append("Address: "+getAddress());
		sBuffer.append("Age: "+getAge());
		sBuffer.append("Gender: "+isGender());
		sBuffer.append("Basic Salary: "+getBasicSalary());
		return sBuffer.toString();
	}
	
}
