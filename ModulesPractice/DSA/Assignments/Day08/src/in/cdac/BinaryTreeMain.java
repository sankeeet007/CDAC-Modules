package in.cdac;

import java.util.Scanner;

public class BinaryTreeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BinaryTreeADT btree = new BinaryTreeADT();
		int choice;
		
		btree.setRoot(5);
		btree.addLeft(1);
		btree.addLeft(2);
		btree.addRight(3);
		do {
			System.out.println("1. set Root Node\n"
							 + "2. Add at Left\n"
							 + "3. Add at Right\n"
							 + "4. Display Preorder: \n"
							 + "5. Display Inorder: \n"
							 + "6. Display Postorder: \n"
							 + "7. Total count of Leaf Nodes: \n"
							 + "8. Total count of Nodes: \n"
							 + "9. Count of node having data: \n"
							 + "10. Calucalte Height of the Tree: \n"
							 + "11. Iterative Inorder: \n"
							 + "12. Exit");
			choice = scanner.nextInt();
			switch(choice) {
				case 1: {
						System.out.println("Enter data for Root Node: ");
						btree.setRoot(scanner.nextInt());
					}
					break;
				case 2: {
						System.out.println("Enter data for Left Node: ");
						btree.addLeft(scanner.nextInt());	
					}
					break;
				case 3: {
						System.out.println("Enter data for Right Node: ");
						btree.addRight(scanner.nextInt());
					}
					break;
				case 4: {
						System.out.println("PreOrder Traversal: ");
						btree.printUsingPreorder(btree.rootNode);
						System.out.println(BinaryTreeADT.str);
						BinaryTreeADT.str ="";
					}
					break;
				case 5: {
						System.out.println("InOrder Traversal: ");
						btree.printUsingInorder(btree.rootNode);
						System.out.println(BinaryTreeADT.str);
						BinaryTreeADT.str ="";
					}
				break;
				case 6: {
						System.out.println("PostOrder Traversal: ");
						btree.printUsingPostorder(btree.rootNode);
						System.out.println(BinaryTreeADT.str);
						BinaryTreeADT.str ="";
				}
				break;
				case 7: {
						System.out.println("Leaf Nodes: " + btree.countLeafNodes());
				}
				break;
				
				case 8: {
						System.out.println("Nodes: " + btree.countNodes());
				 }
				break;
				
				case 9: {
						System.out.println("Enter data to be counted: ");
						int data = scanner.nextInt();
						System.out.println("Occurance of "+ data+" : " + btree.CountNodesWithValue(data));
				 }
				break;
				case 10: {
						System.out.println("Height of Tree: " + btree.getHightOfTree());
						
				 }
				break;
				case 11: {
						System.out.println("ITERATIVE Inorder Traversal:");
						btree.IterativeInorder(btree.rootNode);
						System.out.println(BinaryTreeADT.str);
						BinaryTreeADT.str ="";
				 }
				break;
				case 12: {
						System.out.println("Exiting...");
				}
				break;
			}
		}while(choice != 12);
		scanner.close();
	}

}
