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

	public String displayData() {
		StringBuffer sb = new StringBuffer(super.displayData());
		sb.append("Commission: "+getCommission());
		return sb.toString();		
	}
}
