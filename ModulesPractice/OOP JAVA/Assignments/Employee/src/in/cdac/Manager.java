package in.cdac;

public class Manager extends Employee{
	protected float Hra;
	
	
	public Manager(String name, String address, int age, boolean gender, float basicSalary, float Hra) 
	{
		super(name, address, age, gender, basicSalary);
		setHra(Hra);
	}

	public float getHra() {
		return Hra;
	}

	public void setHra(float hra) {
		Hra = hra;
	}

	public String display() {
		StringBuffer sb = new StringBuffer("Name: ");
		sb.append(name);
		sb.append("Address: ");
		sb.append(address);
		sb.append("Age: ");
		sb.append(age);
		sb.append("Gender: ");
		sb.append(gender);
		sb.append("Basic Salary: ");
		sb.append(basicSalary);
		sb.append("HRA: ");
		sb.append(Hra);
		return sb.toString();		
	}
}
