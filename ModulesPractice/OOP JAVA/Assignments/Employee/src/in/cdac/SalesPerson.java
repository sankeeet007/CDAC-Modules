package in.cdac;

public class SalesPerson extends Employee{
	protected float Commission;
	
	
	public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float Commission) 
	{
		super(name, address, age, gender, basicSalary);
		setCommission(Commission);
	}

	public float getCommission() {
		return Commission;
	}

	public void setCommission(float Commission) {
		this.Commission = Commission;
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
		sb.append("Commission: ");
		sb.append(Commission);
		return sb.toString();		
	}
}
