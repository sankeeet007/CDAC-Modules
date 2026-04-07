package in.cdac;

import java.util.Scanner;

public class SinglyLinkedListTest {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		SinglyLinkedListADT Slist = new SinglyLinkedListADT();
		
		do {
			System.out.println("1. Add at First\n"
							 + "2. Add at Last\n"
							 + "3. Delete First\n"
							 + "4. Delete Last\n"
							 + "5. Display LinkedList\n"
							 + "6. Exit");
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
						Slist.displayList();
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
