package employee;

public class Employee {
	double salary;
	int emp_id, no_of_hrs;
	
	public void getInfo(double sal, int per_day_work) {
		salary = sal;
		no_of_hrs = per_day_work;
	}
	
	public void addSal() {
		if(salary < 500) {
			salary += 10;
		}
	}
	
	public void addWork() {
		if(no_of_hrs > 6) {
			salary += 5;
		}
	}
	
	public void FinalSalary() {
		System.out.println("Final Salary : $"+salary);
	}
}
