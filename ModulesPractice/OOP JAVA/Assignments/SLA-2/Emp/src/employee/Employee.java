package employee;

public class Employee {
	String name, YearOfJoining, address;
	
	public Employee(String nm, String yoj, String add) {
		name = nm;
		YearOfJoining = yoj;
		address = add;
	}
	
	public void display() {
		System.out.println(name+"\t"+YearOfJoining+"\t\t\t"+address);
	}
}
