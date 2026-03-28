package member;

public class PrimeMembers extends Members {
	int JoiningYear;
	float JoiningFees;
	boolean isActive;
	
	public int getJoiningYear() {
		return JoiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		JoiningYear = joiningYear;
	}

	public float getJoiningFees() {
		return JoiningFees;
	}

	public void setJoiningFees(float joiningFees) {
		JoiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void display() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Phone no: "+getPhone_no());
		System.out.println("Address: "+getAddress());
		System.out.println("Salary: "+getSalary());
		System.out.println("Joining Year: "+JoiningYear);
		System.out.println("Joining Fees: "+JoiningFees);
		System.out.println("Active Status: "+(isActive ? "Active" : "Inactive"));
	}
}
