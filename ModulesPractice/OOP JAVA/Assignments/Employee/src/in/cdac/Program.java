package in.cdac;

import java.util.Scanner;


public class Program {
	
	 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//Employee empArr[] = new Employee[100];
		
		LinkedList objList = new LinkedList();		//LinkedList from in.cdac package
		
		int choice, indexEmp=0;
		
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
									Manager objManager = new Manager(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary,Hra);
									objList.add(objManager);
									break;
								}
								
								case 2: {
									DataOperations.acceptData();
									System.out.println("Enter Commission: ");
									float Commission = sc.nextFloat();
									// UPCAST to Employee
									SalesPerson objSalesPerson = new SalesPerson(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary, Commission);
									objList.add(objSalesPerson);
									break;
								}
								
								case 3: {
									DataOperations.acceptData();
									System.out.println("Enter Overtime: ");
									float OverTime = sc.nextFloat();
									// UPCAST to Employee
									Engineer objEngineer = new Engineer(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary, OverTime);
									objList.add(objEngineer);
									break;
								}
								
								case 4: //Exit to Main Menu
										break;
											
								default:
									System.out.println("********Invalid choice**********");
								}
							}while(subChoice!=4);
						break;
					}
							
					case 2:	{
						Object data = objList.getFirst();
						Employee objEmployee = (Employee) data;
						do {
							System.out.println("1. All Employees");
							System.out.println("2. First Employee");
							System.out.println("3. Next Employee");
							System.out.println("4. Previous Employee");
							System.out.println("5. Last Employee");
							System.out.println("6. Exit to Main Menu");
							System.out.println("Enter your choice: ");
							subChoice = sc.nextInt();
							
							switch (subChoice) 
							{
								case 1: {
										data = objList.getFirst();
										objEmployee = (Employee) data;
										for(int i=0; i<objList.maxCount; i++) {
											objEmployee.displayData();
//											System.out.println("Name: "+ objEmployee.getName());
//											System.out.println("Address: "+ objEmployee.getAddress());
//											System.out.println("Age: "+ objEmployee.getAge());
//											System.out.println("Gender: "+ objEmployee.isGender());
//											System.out.println("Basic Salary: "+ objEmployee.getBasicSalary());
//											
											if(objEmployee instanceof Manager objManager) {
												// DOWNCAST to Manager
												objManager.displayData();
											}
											else if(objEmployee instanceof SalesPerson) {
												// DOWNCAST to SalesPerson
												SalesPerson objSalesPerson = (SalesPerson) objEmployee;
												objSalesPerson.displayData();
											}
											else if(objEmployee instanceof Engineer) {
												// DOWNCAST to Engineer
												Engineer objEngineer = (Engineer) objEmployee;
												objEngineer.displayData();
											}
										}
									break;
									}
								case 2: 
									{
										data = objList.getFirst();
										objEmployee = (Employee) data;
										System.out.println("Name: "+objEmployee.getName());
										System.out.println("Address: "+objEmployee.getAddress());
										System.out.println("Age: "+objEmployee.getAge());
										System.out.println("Gender: "+objEmployee.isGender());
										System.out.println("Basic Salary: "+objEmployee.getBasicSalary());
										
										if(objEmployee instanceof Manager objManager) {
											// DOWNCAST to Manager
											System.out.println("HRA: "+ objManager.getHra());
										}
										else if(objEmployee instanceof SalesPerson) {
											// DOWNCAST to SalesPerson
											SalesPerson objSalesPerson = (SalesPerson) objEmployee;
											System.out.println("Comission: "+ objSalesPerson.getCommission());
										}
										else if(objEmployee instanceof Engineer) {
											// DOWNCAST to Engineer
											Engineer objEngineer = (Engineer) objEmployee;
											System.out.println("Overtime: "+ objEngineer.getOverTime());
										}
										break;
									}
								case 3: 
									{
										data = objList.getNext();
										if(data!=null) {
										System.out.println("Name: "+objEmployee.getName());
										System.out.println("Address: "+objEmployee.getAddress());
										System.out.println("Age: "+objEmployee.getAge());
										System.out.println("Gender: "+objEmployee.isGender());
										System.out.println("Basic Salary: "+objEmployee.getBasicSalary());
										
										if(objEmployee instanceof Manager objManager) {
											// DOWNCAST to Manager
											System.out.println("HRA: "+ objManager.getHra());
										}
										else if(objEmployee instanceof SalesPerson) {
											// DOWNCAST to SalesPerson
											SalesPerson objSalesPerson = (SalesPerson) objEmployee;
											System.out.println("Comission: "+ objSalesPerson.getCommission());
										}
										else if(objEmployee instanceof Engineer) {
											// DOWNCAST to Engineer
											Engineer objEngineer = (Engineer) objEmployee;
											System.out.println("Overtime: "+ objEngineer.getOverTime());
										}
										else {
											System.out.println("No previous record");
										}
									}
										break;
									}
								case 4: 
									{
										data = objList.getPrevious();
										if(data!=null) {
										System.out.println("Name: "+objEmployee.getName());
										System.out.println("Address: "+objEmployee.getAddress());
										System.out.println("Age: "+objEmployee.getAge());
										System.out.println("Gender: "+objEmployee.isGender());
										System.out.println("Basic Salary: "+objEmployee.getBasicSalary());
										
										if(objEmployee instanceof Manager objManager) {
											// DOWNCAST to Manager
											System.out.println("HRA: "+ objManager.getHra());
										}
										else if(objEmployee instanceof SalesPerson) {
											// DOWNCAST to SalesPerson
											SalesPerson objSalesPerson = (SalesPerson) objEmployee;
											System.out.println("Comission: "+ objSalesPerson.getCommission());
										}
										else if(objEmployee instanceof Engineer) {
											// DOWNCAST to Engineer
											Engineer objEngineer = (Engineer) objEmployee;
											System.out.println("Overtime: "+ objEngineer.getOverTime());
										}
										}
										else {
											System.out.println("No previous record");
										}
									break;
									}
								case 5: 
									{
										data = objList.getLast();
										objEmployee = (Employee) data;
										System.out.println("Name: "+objEmployee.getName());
										System.out.println("Address: "+objEmployee.getAddress());
										System.out.println("Age: "+objEmployee.getAge());
										System.out.println("Gender: "+objEmployee.isGender());
										System.out.println("Basic Salary: "+objEmployee.getBasicSalary());
										
										if(objEmployee instanceof Manager objManager) {
											// DOWNCAST to Manager
											System.out.println("HRA: "+ objManager.getHra());
										}
										else if(objEmployee instanceof SalesPerson) {
											// DOWNCAST to SalesPerson
											SalesPerson objSalesPerson = (SalesPerson) objEmployee;
											System.out.println("Comission: "+ objSalesPerson.getCommission());
										}
										else if(objEmployee instanceof Engineer) {
											// DOWNCAST to Engineer
											Engineer objEngineer = (Engineer) objEmployee;
											System.out.println("Overtime: "+ objEngineer.getOverTime());
										}
									break;
									}
								case 6: {//Exit to Main Menu
									break;
									}
							default:
								System.out.println("********Invalid choice**********");
							}
						}while(subChoice!=6);
					}
					

					case 3:	{
						Object data = objList.getFirst();
						Employee objEmployee = (Employee) data;

						do {
							System.out.println("1. Sort All Managers");
							System.out.println("2. Sort All Engineers");
							System.out.println("3. Sort All Sales Persons");
							System.out.println("4. Sort All Employees Alphabetic Order Ascending");
							System.out.println("5. Sort All Employees Alphabetic Order Descending");
							System.out.println("6. Exit to Main menu");
							System.out.println("Enter your choice: ");
							subChoice = sc.nextInt();
							
							LinkedList displayList = new LinkedList();			
							switch (subChoice) 
							{
								case 1: {
									System.out.println("All Managers: ");
									data = objList.getFirst();
									objEmployee = (Employee) data;
									while(objEmployee != null) 
									{
										if(objEmployee instanceof Manager objManager) {
											displayList.add(objManager);
										}
										data = objList.getNext();
										objEmployee = (Employee) data;
									}
									
									//Display functionality
									data = objList.getFirst();
									objEmployee = (Employee) data;
									while(objEmployee != null) 
									{
										System.out.println("Name: "+ objEmployee.getName());
										System.out.println("Address: "+ objEmployee.getAddress());
										System.out.println("Age: "+ objEmployee.getAge());
										System.out.println("Gender: "+ objEmployee.isGender());
										System.out.println("Basic Salary: "+ objEmployee.getBasicSalary());
										
										if(objEmployee instanceof Manager objManager) {
											// DOWNCAST to Manager
											System.out.println("HRA: "+ objManager.getHra());
										}
										data = objList.getNext();
										objEmployee = (Employee) data;
									}
									break;
								}
								
								case 2: {
									System.out.println("All Sales Persons: ");
									data = objList.getFirst();
									objEmployee = (Employee) data;
									while(objEmployee != null) 
									{
										if(objEmployee instanceof SalesPerson objSalesPerson) {
											displayList.add(objSalesPerson);
										}
										data = objList.getNext();
										objEmployee = (Employee) data;
									}
									
									//Display functionality
									data = objList.getFirst();
									objEmployee = (Employee) data;
									while(objEmployee != null) 
									{
										
										System.out.println("Name: "+ objEmployee.getName());
										System.out.println("Address: "+ objEmployee.getAddress());
										System.out.println("Age: "+ objEmployee.getAge());
										System.out.println("Gender: "+ objEmployee.isGender());
										System.out.println("Basic Salary: "+ objEmployee.getBasicSalary());
										
										if(objEmployee instanceof SalesPerson objSalesPerson) {
											// DOWNCAST to Manager
											System.out.println("Commission: "+ objSalesPerson.getCommission());
										}
										data = objList.getNext();
										objEmployee = (Employee) data;
									}
									break;
								}
								
								case 3: {
									System.out.println("All Engineers: ");
									data = objList.getFirst();
									objEmployee = (Employee) data;
									while(objEmployee != null) 
									{
										if(objEmployee instanceof Engineer objEngineer) {
											displayList.add(objEngineer);
										}
										data = objList.getNext();
										objEmployee = (Employee) data;
									}
									
									//Display functionality
									data = objList.getFirst();
									objEmployee = (Employee) data;
									while(objEmployee != null) 
									{
										
										System.out.println("Name: "+ objEmployee.getName());
										System.out.println("Address: "+ objEmployee.getAddress());
										System.out.println("Age: "+ objEmployee.getAge());
										System.out.println("Gender: "+ objEmployee.isGender());
										System.out.println("Basic Salary: "+ objEmployee.getBasicSalary());
										
										if(objEmployee instanceof Engineer objEngineer) {
											// DOWNCAST to Manager
											System.out.println("Overtime: "+ objEngineer.getOverTime());
										}
										data = objList.getNext();
										objEmployee = (Employee) data;
									}
									break;
								}
								case 4: {
										// Ascending alphabetical
//									System.out.println("Sort All Employees Alphabetic Order Ascending: ");
//									data = objList.getFirst();
//									objEmployee = (Employee) data;
//									while(objEmployee != null) 
//									{
//										if(objEmployee instanceof Manager objManager) {
//											displayList.add(objManager);
//										}
//										data = objList.getNext();
//										objEmployee = (Employee) data;
//									}
//									
//									//Display functionality
//									data = objList.getFirst();
//									objEmployee = (Employee) data;
//									while(objEmployee != null) 
//									{
//										
//										System.out.println("Name: "+ objEmployee.getName());
//										System.out.println("Address: "+ objEmployee.getAddress());
//										System.out.println("Age: "+ objEmployee.getAge());
//										System.out.println("Gender: "+ objEmployee.isGender());
//										System.out.println("Basic Salary: "+ objEmployee.getBasicSalary());
//										
//										if(objEmployee instanceof Manager objManager) {
//											// DOWNCAST to Manager
//											System.out.println("HRA: "+ objManager.getHra());
//										}
//										data = objList.getNext();
//										objEmployee = (Employee) data;
//									}
									break;
								}
								case 5: {
										// Descending alphabetical
									break;
								}
								case 6: {
									//Exit to Main Menu
									break;
								}			
								default:
									System.out.println("********Invalid choice**********");
								}
							}while(subChoice!=6);
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
						System.out.println("********Invalid choice**********");
				}
		}while(choice!=6);
		sc.close();
	}

}
