package in.cdac;

import java.util.Scanner;

public class QueueWithLinkedListMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		QueueWithLinkedListADT queueObj = new QueueWithLinkedListADT();
		
		do {
			System.out.println("1. Enqueue\n"
							 + "2. Dequeue\n"
							 + "3. isEmpty\n"
							 + "4. Display Queue\n"
							 + "5. Exit");
			choice = scanner.nextInt();
			switch(choice) {
				case 1: {
						System.out.println("Enter a number to enqueue: ");
						queueObj.enqueue(scanner.nextInt());
					}
					break;
				case 2: {
						System.out.println(queueObj.dequeue());	
					}
					break;
				case 3: {
						System.out.println(queueObj.isEmpty());
					}
					break;
				case 4: {
						queueObj.displayQueue();
					}
					break;
				case 5: {
					System.out.println("Exiting.......");
					}
					break;
			}
		}while(choice != 5);
		
		scanner.close();
	}

}
