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

	public String displayData() {
		StringBuffer sb = new StringBuffer(super.displayData());
		sb.append("HRA: "+getHra()+"\n");
		return sb.toString();		
	}
	
	@Override
	public float calculateTotalSalary() {
	    return getBasicSalary() + getHra();
	}
}
