package in.cdac;

import java.util.Scanner;


public class Program {
	
	 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//Employee empArr[] = new Employee[100];
		
		LinkedList objList = new LinkedList();		//LinkedList from in.cdac package
		
		int choice;
		try{
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
						try {
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
									Manager objManager = new Manager(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary,Hra);
									objList.add(objManager);
									break;
								}
								
								case 2: {
									DataOperations.acceptData();
									System.out.println("Enter Commission: ");
									float Commission = sc.nextFloat();
									SalesPerson objSalesPerson = new SalesPerson(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary, Commission);
									objList.add(objSalesPerson);
									break;
								}
								
								case 3: {
									DataOperations.acceptData();
									System.out.println("Enter Overtime: ");
									float OverTime = sc.nextFloat();
									Engineer objEngineer = new Engineer(DataOperations.name, DataOperations.address, DataOperations.age, DataOperations.gender, DataOperations.basicSalary, OverTime);
									objList.add(objEngineer);
									break;
								}
								
								case 4: //Exit to Main Menu
										break;
											
								default:
									throw new Exception("Invalid Input" + subChoice);
								}
							}while(subChoice!=4);
						}catch(Exception e) {
							e.printStackTrace();
						}
						break;
					}
							
					case 2:	{
						Object data = objList.getFirst();
						Employee objEmployee;
						try {
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
										for(int i=0; i<objList.maxCount; i++) {
											data = objList.get(i);
											objEmployee = (Employee) data;
											
											System.out.println(objEmployee.displayData());
											
										}
									break;
									}
								case 2: 
									{
										data = objList.getFirst();
										objEmployee = (Employee) data;
										
										System.out.println(objEmployee.displayData());
										
										break;
									}
								case 3: 
									{
										data = objList.getNext();
										objEmployee = (Employee) data;
										
										System.out.println(objEmployee.displayData());
										break;
									}
								case 4: 
									{
										data = objList.getPrevious();
										objEmployee = (Employee) data;
										
										System.out.println(objEmployee.displayData());
										break;
									}
								case 5: 
									{
										data = objList.getLast();
										objEmployee = (Employee) data;
										
										System.out.println(objEmployee.displayData());
										break;
									}
								case 6: {//Exit to Main Menu
									}
								break;
							default:
								throw new Exception("Invalid Input" + subChoice);
							}
						}while(subChoice!=6);
					}catch(Exception e) {
						e.printStackTrace();
					}
						break;
					}

					case 3:	{
						Object data;
					try {
						do {
							System.out.println("1. Sort All Managers");
							System.out.println("2. Sort All Sales Persons");
							System.out.println("3. Sort All Engineers");
							System.out.println("4. Sort All Employees Alphabetic Order Ascending");
							System.out.println("5. Sort All Employees Alphabetic Order Descending");
							System.out.println("6. Exit to Main menu");
							System.out.println("Enter your choice: ");
							subChoice = sc.nextInt();
		
							switch (subChoice) 
							{
								case 1: {
									System.out.println("All Managers: ");
									LinkedList displayList = new LinkedList();

									data = objList.getFirst();

									for (int i = 0; i < objList.getMaxCount(); i++) {
									    Employee emp = (Employee) data;

									    if (emp instanceof Manager) {
									        displayList.add(emp);
									    }

									    data = objList.getNext();
									}

									// Display
									data = displayList.getFirst();
									for (int i = 0; i < displayList.getMaxCount(); i++) {
									    Employee emp = (Employee) data;
									    System.out.println(emp.displayData());
									    data = displayList.getNext();
									}
									break;
								}
								
								case 2: {
									System.out.println("All Sales Persons: ");
									
									LinkedList displayList = new LinkedList();

									data = objList.getFirst();

									for (int i = 0; i < objList.getMaxCount(); i++) {
									    Employee emp = (Employee) data;

									    if (emp instanceof SalesPerson) {
									        displayList.add(emp);
									    }

									    data = objList.getNext();
									}


									// Display
									data = displayList.getFirst();
									for (int i = 0; i < displayList.getMaxCount(); i++) {
									    Employee emp = (Employee) data;
									    System.out.println(emp.displayData());
									    data = displayList.getNext();
									}
									
									break;
								}
								
								case 3: {
									System.out.println("All Engineers: ");
									
									LinkedList displayList = new LinkedList();

									data = objList.getFirst();

									for (int i = 0; i < objList.getMaxCount(); i++) {
									    Employee emp = (Employee) data;

									    if (emp instanceof Engineer) {
									        displayList.add(emp);
									    }

									    data = objList.getNext();
									}


									// DISPLAY
									data = displayList.getFirst();
									for (int i = 0; i < displayList.getMaxCount(); i++) {
									    Employee emp = (Employee) data;
									    System.out.println(emp.displayData());
									    data = displayList.getNext();
									}
									break;
								}
								case 4: {
									LinkedList displayList = new LinkedList();
								    data = objList.getFirst();
								    //adding all employees to display list
								    for (int i = 0; i < objList.getMaxCount(); i++) {
								        displayList.add((Employee) data);
								        data = objList.getNext();
								    }
								    displayList.sortByNameAsc();	//sort using linked list
								    //displaying
								    data = displayList.getFirst();
								    for (int i = 0; i < displayList.getMaxCount(); i++) {
								        Employee emp = (Employee) data;
								        System.out.println(emp.displayData());
								        data = displayList.getNext();
								    }
									break;
								}
								case 5: {
								    LinkedList displayList = new LinkedList();
								    data = objList.getFirst();
								    //adding all employees to display list
								    for (int i = 0; i < objList.getMaxCount(); i++) {
								        displayList.add((Employee) data);
								        data = objList.getNext();
								    }
								  //sort using linked list
								    displayList.sortByNameDesc();	
								    //displaying

								    data = displayList.getFirst();
								    for (int i = 0; i < displayList.getMaxCount(); i++) {
								        Employee emp = (Employee) data;
								        System.out.println(emp.displayData());
								        data = displayList.getNext();
								    }

									break;
								}
								case 6: {
									//Exit to Main Menu
									break;
								}			
								default:
									throw new Exception("Invalid Input" + subChoice);
								}
							}while(subChoice!=6);
					}catch(Exception e){
						e.printStackTrace();
					}
							break;
						}
					case 4:	{
								
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
						throw new Exception("Invalid Input" + choice);
				}
		}while(choice!=6);
	}catch(Exception e) {
		e.printStackTrace();
	}
		sc.close();
	}
	
	

}
