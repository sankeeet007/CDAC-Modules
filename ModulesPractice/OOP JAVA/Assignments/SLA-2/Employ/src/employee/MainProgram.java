package employee;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee objEmployee = new Employee();
		
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();
		System.out.println("Enter number of hours of work per day: ");
		int no_of_hrs = sc.nextInt();
		
		objEmployee.getInfo(sal, no_of_hrs);
		objEmployee.addSal();
		objEmployee.addWork();
		
		objEmployee.FinalSalary();
		
		sc.close();
	}

}
