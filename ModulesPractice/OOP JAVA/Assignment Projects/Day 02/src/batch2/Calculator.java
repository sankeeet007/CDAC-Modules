package batch2;


public class Calculator {

	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1. Add two Integers\n2. Subtract two Integers.\n3. Multiply two Integers.\n4. Divide two Integers.");
			System.out.println("5. Add two Float\n6. Subtract two Float.\n7. Multiply two Float.\n8. Divide two Float.\n9. Exit");
			
			System.out.println("Enter your Choice");
			choice = ConsoleInput.getInt();
			
			switch (choice) {
			case 1: {
					System.out.println("Enter Num1 and Num2: ");
					int num1 = ConsoleInput.getInt();
					int num2 = ConsoleInput.getInt();
					System.out.println("Addition is: " + Operations.add(num1, num2));
					break;
			}
			case 2: {
				System.out.println("Enter Num1 and Num2: ");
				int num1 = ConsoleInput.getInt();
				int num2 = ConsoleInput.getInt();
				System.out.println("Addition is: " + Operations.subtract(num1, num2));
				break;
			}
			case 3: {
				System.out.println("Enter Num1 and Num2: ");
				int num1 = ConsoleInput.getInt();
				int num2 = ConsoleInput.getInt();
				System.out.println("Addition is: " + Operations.multiply(num1, num2));
				break;
			}
			case 4: {
				System.out.println("Enter Num1 and Num2: ");
				int num1 = ConsoleInput.getInt();
				int num2 = ConsoleInput.getInt();
				System.out.println("Addition is: " + Operations.divide(num1, num2));
				break;
			}
			case 5: {
				System.out.println("Enter Num1 and Num2: ");
				float num1 = ConsoleInput.getFloat();
				float num2 = ConsoleInput.getFloat();
				System.out.println("Addition is: " + Operations.add(num1, num2));
				break;
			}
			case 6: {
				System.out.println("Enter Num1 and Num2: ");
				float num1 = ConsoleInput.getFloat();
				float num2 = ConsoleInput.getFloat();
				System.out.println("Addition is: " + Operations.subtract(num1, num2));
				break;
			}
			case 7: {
				System.out.println("Enter Num1 and Num2: ");
				float num1 = ConsoleInput.getFloat();
				float num2 = ConsoleInput.getFloat();
				System.out.println("Addition is: " + Operations.multiply(num1, num2));
				break;
			}
			case 8: {
				System.out.println("Enter Num1 and Num2: ");
				float num1 = ConsoleInput.getFloat();
				float num2 = ConsoleInput.getFloat();
				System.out.println("Addition is: " + Operations.divide(num1, num2));
				break;
			}
			case 9: {
					System.out.println("Exiting program.......");
					break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}while(choice != 9);
		

	
	}
	

}
