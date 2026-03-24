package in.cdac;

public class Engineer extends Employee{

	protected float OverTime;
	

	public Engineer(String name, String address, int age, boolean gender, float basicSalary, float OverTime) 
	{
		super(name, address, age, gender, basicSalary);
		setOverTime(OverTime);
	}
	
	public float getOverTime() {
		return OverTime;
	}

	public void setOverTime(float OverTime) {
		this.OverTime = OverTime;
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
		sb.append("OverTime: ");
		sb.append(OverTime);
		return sb.toString();		
	}
}
