package in.cdac;

import java.util.Scanner;

public class DCLLMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		DoublyCircularLinkedListADT Slist = new DoublyCircularLinkedListADT();
		Slist.addFirst(60);
		Slist.addFirst(35);
		Slist.addFirst(35);
		Slist.addFirst(25);
		Slist.addFirst(25);
		Slist.addFirst(15);
		Slist.addFirst(5);
		do {
			System.out.println("1. Add at First\n"
							 + "2. Add at Last\n"
							 + "3. Delete First\n"
							 + "4. Delete Last\n"
							 + "5. Delete by Value\n"
							 + "6. Display Forward\n"
							 + "7. Display Backword\n"
							 + "8.  Exit");
			choice = scanner.nextInt();
			switch(choice) {
				case 1: {
						System.out.println("Enter a number to Add at First: ");
						Slist.addFirst(scanner.nextInt());
					}
					break;
				case 2: {
						System.out.println("Enter a number to Add at Last: ");
						Slist.addLast(scanner.nextInt());	
					}
					break;
				case 3: {
						System.out.println("Deleted element: " + Slist.deleteFirst());
					}
					break;
				case 4: {
						System.out.println("Deleted element: " + Slist.deleteLast());
					}
					break;
				case 5: {
						System.out.println("Enter a value to be deleted.");
						Slist.delete(scanner.nextInt());
				}
				break;
				case 6: {
						System.out.println("FORWARD >> ");
						Slist.printForward();
					}
				break;
				case 7: {
						System.out.println("BACKWARD >> ");
						Slist.printBackward();
					}
				break;
				case 8: {
					System.out.println("Exiting.......");
					}
				break;
			}
		}while(choice != 8);
		scanner.close();
	}

}
