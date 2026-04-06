package in.cdac;

import java.util.Scanner;

public class StackMain {

	public static void main(String []args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("Enter size fo stack: ");
		int s = scanner.nextInt();	// s = 5 
		
		StackADT<Integer> stackObj = new StackADT<>(s);
				
		do {
			System.out.println("1. Push\n"
							 + "2. Pop\n"
							 + "3. Peek\n"
							 + "4. isEmpty\n"
							 + "5. Display Stack\n"
							 + "6. Exit");
			choice = scanner.nextInt();
			switch(choice) {
				case 1: {
						System.out.println("Enter a number to enqueue: ");
						stackObj.push(scanner.nextInt());
					}
					break;
				case 2: {
						System.out.println(stackObj.pop());	
					}
					break;
				case 3: {
						System.out.println(stackObj.peek());
					}
					break;
				case 4: {
							stackObj.isEmpty();
					}
					break;
				case 5: {
						stackObj.displayStack();
					}
					break;
				case 6: {
					System.out.println("Exiting.......");
					}
					break;
			}
		}while(choice != 6);
		scanner.close();
	}
}
