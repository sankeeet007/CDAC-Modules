package in.cdac;

import java.util.Scanner;


public class Program {
	
	 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Employee empArr[] = new Employee[100];
		int choice, empArrIndex=0;
		
		do {
				System.out.println("1. Add");
				System.out.println("2. Display");
				System.out.println("3. Sort");
				System.out.println("4. Save");
				System.out.println("5. Load");
				System.out.println("6. Exit");
				System.out.println("Enter your Choice: ");
				choice = sc.nextInt();
				
				int subChoice;
				switch (choice) 
				{
					case 1:	{
							do {
							System.out.println("1. Manager");
							System.out.println("2. Sales Person");
							System.out.println("3. Engineer");
							System.out.println("4. Exit to Main menu");
							System.out.println("Enter your choice: ");
							subChoice = sc.nextInt();
						
							
							switch (subChoice) 
							{
								case 1: {
									DataOperations.acceptData();
									System.out.println("Enter HRA: ");
									float Hra = sc.nextFloat();
									// UPCAST to Employee
									empArr[empArrIndex++] = new Manager(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary,Hra);
									break;
								}
								
								case 2: {
									DataOperations.acceptData();
									System.out.println("Enter Commission: ");
									float Commission = sc.nextFloat();
									// UPCAST to Employee
									empArr[empArrIndex++] = new SalesPerson(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary, Commission);
									break;
								}
								
								case 3: {
									DataOperations.acceptData();
									System.out.println("Enter Overtime: ");
									float OverTime = sc.nextFloat();
									// UPCAST to Employee
									empArr[empArrIndex++] = new Engineer(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary, OverTime);
									break;
								}
								
								case 4: //Exit to Main Menu
										break;
											
								default:
									throw new IllegalArgumentException("Unexpected value: " + subChoice);
								}
							}while(subChoice!=4);
						break;
					}
							
					case 2:	{
							// Displaying all objects form Emp array 
							for(int iTmp=0; iTmp<empArrIndex; iTmp++) {
							System.out.println("Name: "+empArr[iTmp].getName());
							System.out.println("Address: "+empArr[iTmp].getAddress());
							System.out.println("Age: "+empArr[iTmp].getAge());
							System.out.println("Gender: "+empArr[iTmp].isGender());
							System.out.println("Basic Salary: "+empArr[iTmp].getBasicSalary());
							
							if(empArr[iTmp] instanceof Manager) {
								// DOWNCAST to Manager
								Manager objManager = (Manager) empArr[iTmp];
								System.out.println("HRA: "+ objManager.getHra());
							}
							else if(empArr[iTmp] instanceof SalesPerson) {
								// DOWNCAST to SalesPerson
								SalesPerson objSalesPerson = (SalesPerson) empArr[iTmp];
								System.out.println("Comission: "+ objSalesPerson.getCommission());
							}
							else if(empArr[iTmp] instanceof Engineer) {
								// DOWNCAST to Engineer
								Engineer objEngineer = (Engineer) empArr[iTmp];
								System.out.println("Overtime: "+ objEngineer.getOverTime());
							}
						}
							break;
				}
					case 3:	{
						do {
							System.out.println("1. Sort by Name");
							System.out.println("2. Sort by Total Salary");
							System.out.println("3. Sort by Designation");
							System.out.println("4. Exit to Main menu");
							System.out.println("Enter your choice: ");
							subChoice = sc.nextInt();
							
							
							switch (subChoice) 
							{
								case 1: {
									System.out.println("Sorted By Name");
									   for(int iTmp = 0; iTmp < empArrIndex - 1; iTmp++) {
									        for(int jTmp = iTmp + 1; jTmp < empArrIndex; jTmp++) {

									            if(empArr[iTmp].getName().compareTo(empArr[jTmp].getName()) > 0) {

									                Employee temp = empArr[iTmp];
									                empArr[iTmp] = empArr[jTmp];
									                empArr[jTmp] = temp;

									            }
									        }
									    }
									  
									break;
								}
								
								case 2: {
									System.out.println("Sorted By Total Salary");
									 for(int i = 0; i < empArrIndex - 1; i++) {
									        for(int j = i + 1; j < empArrIndex; j++) {
									            float sal1 = DataOperations.calculateTotalSalary(empArr[i]);
									            float sal2 = DataOperations.calculateTotalSalary(empArr[j]);
									            if(sal1 > sal2) {
									                Employee temp = empArr[i];
									                empArr[i] = empArr[j];
									                empArr[j] = temp;
									            }
									        }
									    }
									break;
								}
								
								case 3: {
									System.out.println("Sorted By Designation");
									break;
								}
								case 4: {
									//Exit to Main Menu
									break;
								}
											
								default:
									throw new IllegalArgumentException("Unexpected value: " + subChoice);
								}
							}while(subChoice!=4);
							break;
						}
					case 4:	{
								// Saving Data to local File
						break;
						}
					case 5:	{
								// Load that Saved data
						break;
						}
					case 6:	{
								System.out.println("Exiting.....");
						break;
						}
					default:
						throw new IllegalArgumentException("Unexpected value: " + choice);
				}
		}while(choice!=6);
		sc.close();
	}

}
