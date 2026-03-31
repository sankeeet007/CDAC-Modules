package in.cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	static ArrayList<String>fieldsArrayList = new ArrayList<>();
	static ArrayList<String>methodsArrayList = new ArrayList<>();
	public static void main(String[] args) {
		int choice;
		Fields f = new Fields();
		final int ADD_CLASS_AND_PACKAGE_NAME = 1;
		final int ADD_FIELDS = 2;
		final int ADD_METHODS = 3;
		final int GENERATE_CLASS = 4;
		final int EXIT = 5;
		try(Scanner sc = new Scanner(System.in)){
				do {		
					System.out.println("1. Add class and package name: \n"
									 + "2. Add Fields: \n"
									 + "3. Add Methods: \n"
									 + "4. Generate class: \n"
									 + "5. Exit");
					System.out.println("Enter your choice: ");
					choice = sc.nextInt();
					String classname;
					switch(choice) {
					case ADD_CLASS_AND_PACKAGE_NAME:{
							System.out.println("Enter the class name: ");
							classname = sc.next();
							CreateClass.getClass(classname);
							break;
						}
					case ADD_FIELDS:{
						Fields.getClassFields(sc, fieldsArrayList);
						break;
						}
					case ADD_METHODS:{
						Methods.getClassMethods(sc, methodsArrayList);
						break;
						}
					case GENERATE_CLASS:{
						CreateClass.generateClass(fieldsArrayList, methodsArrayList);
						break;
						}
					case EXIT:{	
								// Exit Mechanism
								System.out.println("Exiting.......");
						break;
						}
					}
				}while(choice!=5);
			}
		}

}
