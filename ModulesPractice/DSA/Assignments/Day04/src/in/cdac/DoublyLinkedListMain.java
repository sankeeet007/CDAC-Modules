package in.cdac;

import java.util.Scanner;

public class DoublyLinkedListMain {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		DoublyLinkedListADT Slist = new DoublyLinkedListADT();
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
							 + "6. Delete All Occurrences\n"
							 + "7. Search Element\n"
							 + "8. Display LinkedList\n"
							 + "9. Exit");
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
					System.out.println("Deleted Item: "+Slist.deleteByValue(scanner.nextInt()));
				}
				break;
				case 6: {
					System.out.println("Enter a value to be deleted.");
					Slist.deleteAll(scanner.nextInt());
				}
			break;
				case 7: {
						System.out.println("Enter a value to be Searched.");
							if(Slist.searchValue(scanner.nextInt())) {
								System.out.println("Element Found.");
							}
							else {
								System.out.println("Element NOT Found");
							}
				}
				break;
				case 8: {
						Slist.displayList();
					}
					break;
				case 9: {
					System.out.println("Exiting.......");
					}
					break;
			}
		}while(choice != 9);
		scanner.close();
	}
}
