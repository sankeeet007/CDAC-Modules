package in.cdac;

import java.util.Scanner;

public class StackWithLinkedListMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		StackWithLinkedListADT stackObj = new StackWithLinkedListADT();
				
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
						System.out.println(stackObj.isEmpty());	
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
