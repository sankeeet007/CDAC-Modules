package member;

import java.util.Scanner;

public class MainProgram {
	
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			Members objMembers = new Members();
			System.out.println("Enter Name: ");
			objMembers.setName(sc.nextLine());
			System.out.println("Enter Age: ");
			objMembers.setAge(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Phone No: ");
			objMembers.setPhone_no(sc.nextLine());
			System.out.println("Enter Address: ");
			objMembers.setAddress(sc.nextLine());
			System.out.println("Enter Salary: ");
			objMembers.setSalary(sc.nextFloat());
			sc.nextLine();
			
			System.out.println("Name: " + objMembers.getName());
	        System.out.println("Age: " + objMembers.getAge());
	        System.out.println("Phone: " + objMembers.getPhone_no());
	        System.out.println("Address: " + objMembers.getAddress());
	        objMembers.printSalary();
	        
	        PrimeMembers objPrimeMembers = new PrimeMembers();

	        System.out.print("Enter Name: ");
	        objPrimeMembers.setName(sc.nextLine()); 

	        System.out.print("Enter Age: ");
	        objPrimeMembers.setAge(sc.nextInt());
	        sc.nextLine();

	        System.out.print("Enter Phone Number: ");
	        objPrimeMembers.setPhone_no(sc.nextLine());

	        System.out.print("Enter Address: ");
	        objPrimeMembers.setAddress(sc.nextLine());

	        System.out.print("Enter Salary: ");
	        objPrimeMembers.setSalary(sc.nextFloat());

	        System.out.print("Enter Joining Year: ");
	        objPrimeMembers.setJoiningYear(sc.nextInt());

	        System.out.print("Enter Joining Fees: ");
	        objPrimeMembers.setJoiningFees(sc.nextFloat());

	        System.out.print("Is the member active? (true/false): ");
	        objPrimeMembers.setActive(sc.nextBoolean());

	        objPrimeMembers.display();

	        sc.close();
	}

}
