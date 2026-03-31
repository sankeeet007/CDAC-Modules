package in.cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

	public static void getClassMethods(Scanner sc, ArrayList<String> methodsArrayList) {

			System.out.println("Enter Access Modifier: ");
			System.out.println("1. Private \n"
							 + "2. Public \n"
							 + "3. Protected \n"
							 + "4. Default");
			System.out.println("Enter your choice: ");
			final int PRIVATE = 1;
			final int PUBLIC = 2;
			final int PROTECTED = 3;
			final int DEFAULT = 4;
			final int EXIT = 5;
			String accessModifier="";
			int subChoice = sc.nextInt();

				switch(subChoice) {
					case PRIVATE:{
						accessModifier = "private";
						break;
						}
					case PUBLIC:{
						accessModifier = "public";
						break;
						}
					case PROTECTED:{
						accessModifier = "protected";
						break;
						}
					case DEFAULT:{
						accessModifier = "default";
						break;
						}
					case EXIT:{
							//Exit mechanism
						break;
					}
					default: 
							System.out.println("Invalid choice!!!");
				}
				
				System.out.println("Enter Datatype: ");
				System.out.println("1. Int \n"
								 + "2. String \n"
								 + "3. Float \n"
								 + "4. Double \n"
								 + "5. Boolean \n"
								 + "6. Long \n"
								 + "7. Exit");
				System.out.println("Enter your choice: ");
				final int INT = 1;
				final int STRING = 2;
				final int FLOAT = 3;
				final int DOUBLE = 4;
				final int BOOLEAN = 5;
				final int LONG = 6;
				final int EXIT_DT = 7;
				String dataType="";
				subChoice = sc.nextInt();
				
				switch(subChoice) {
					case INT:{
						dataType = "Integer";
						break;
					}
					case STRING:{
						dataType = "Integer";
						break;
					}
					case FLOAT:{
						dataType = "Float";
						break;
					}
					case DOUBLE:{
						dataType = "Double";
						break;
					}
					case BOOLEAN:{
						dataType = "Boolean";
						break;
					}
					case LONG:{
						dataType = "Long";
						break;
					}
					case EXIT_DT:{
							// Exit mechanism
						break;
					}
					default: System.out.println("Invalid Input!!!");
				}
				System.out.println("enter the method name: ");
				sc.nextLine();
				String methodName = sc.nextLine();
				methodsArrayList.add(accessModifier + " " + dataType + " " + methodName + "();");
	}
	
}
