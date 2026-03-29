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
	

	public String displayData() {
		StringBuffer sb = new StringBuffer(super.displayData());
		sb.append("Overtime: "+getOverTime()+"\n");
		return sb.toString();		
	}
	
	@Override
	public float calculateTotalSalary() {
	    return getBasicSalary() + getOverTime();
	}
}
