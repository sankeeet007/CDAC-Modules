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
									throw new IllegalArgumentException("Unexpected value: " + subChoice);
								}
							}while(subChoice!=4);
						break;
					}
							
					case 2:	{
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
										Object data = objList.getFirst();
										Employee objEmployee = (Employee) data;
										while(objEmployee != null) 
										{
											
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
											data = objList.getNext();
											objEmployee = (Employee) data;
										}
									break;
									}
								case 2: 
									{
										Object data = objList.getFirst();
										Employee objEmployee = (Employee) data;
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
										Object data = objList.getFirst();
										Employee objEmployee = (Employee) data;
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
										data = objList.getNext();
									break;
									}
								case 4: 
									{
										Object data = objList.getFirst();
										Employee objEmployee = (Employee) data;
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
										data = objList.getPrevious();
									break;
									}
								case 5: 
									{
										Object data = objList.getLast();
										Employee objEmployee = (Employee) data;
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
										data = objList.getNext();
									break;
									}
								case 6: {//Exit to Main Menu
									break;
									}
							default:
								throw new IllegalArgumentException("Unexpected value: " + subChoice);
							}
						}while(subChoice!=6);
					}
					

					case 3:	{
						do {
							System.out.println("1. Sort All Managers");
							System.out.println("2. Sort All Engineers");
							System.out.println("3. Sort All Sales Persons");
							System.out.println("4. Sort All Employees Alphabetic Order Ascending");
							System.out.println("5. Sort All Employees Alphabetic Order Descending");
							System.out.println("6. Exit to Main menu");
							System.out.println("Enter your choice: ");
							subChoice = sc.nextInt();
							
							switch (subChoice) 
							{
								case 1: {
//									System.out.println("All Managers: ");
//									LinkedList objManagerList = new LinkedList();
//									Object data = objList.getFirst();
//									Employee objEmployee = (Employee) data;
//									if(objEmployee instanceof Manager) {
//										
//									}
//									  
									break;
								}
								
								case 2: {
									System.out.println("Sorted By Total Salary");
//									 for(int i = 0; i < indexEmp - 1; i++) {
//									        for(int j = i + 1; j < indexEmp; j++) {
//									            float sal1 = DataOperations.calculateTotalSalary(empArr[i]);
//									            float sal2 = DataOperations.calculateTotalSalary(empArr[j]);
//									            if(sal1 > sal2) {
//									                Employee temp = empArr[i];
//									                empArr[i] = empArr[j];
//									                empArr[j] = temp;
//									            }
//									        }
//									    }
									break;
								}
								
								case 3: {
									System.out.println("Sorted By Designation");
									break;
								}
								case 4: {
							
									break;
								}
								case 5: {
						
									break;
								}
								case 6: {
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
