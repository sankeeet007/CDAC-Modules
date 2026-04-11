package in.cdac;

import java.util.Scanner;

public class BSTMain {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			BinarySearchTreeADT BSTtree = new BinarySearchTreeADT();
			int choice;
			
			BinarySearchTreeADT.TNode root = BSTtree.new TNode(10); 
			BSTtree.insertData(root, 11);
			BSTtree.insertData(root, 15);
			BSTtree.insertData(root, 2);
			BSTtree.insertData(root, 3);

			do {
				System.out.println("1. set Root Node\n"
								 + "2. Insert Data\n"
								 + "3. Find smallest Data\n"
								 + "4. Find largest Data\n"
								 + "5. Display Inorder: \n"
								 + "6. Exit");
				choice = scanner.nextInt();
				switch(choice) {
					case 1: {
							System.out.println("Enter data for Root Node: ");
							BSTtree.setRoot(scanner.nextInt());
						}
						break;
					case 2: {
							System.out.println("Enter data for Left Node: ");
							int value = scanner.nextInt();
							BSTtree.insertData(root, value);	
						}
						break;
					case 3: {
							System.out.println("Smallest data: " + BSTtree.findSmallest(root));
						}
						break;
					case 4: {
							System.out.println("Largest data: " + BSTtree.findLargest(root));
						}
						break;
					case 5: {
							System.out.println("InOrder Traversal: ");
							BSTtree.printUsingInorder(root);
						}
					break;
					case 6: {
							System.out.println("Exiting...");
						}
					break;
				}
			}while(choice != 6);
			scanner.close();
		}


}
