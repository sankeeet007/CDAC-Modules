package in.cdac;

import in.cdac.LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Please enter 10 unique integers:");

            if (sc.hasNextInt()) {
                int input = sc.nextInt();

                if (isUnique(list, input)) {
                    list.add(input);
                    System.out.println(input + " added.");
                } else {
                    System.out.println("Duplicate detected! " + input + " was skipped.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input
            }
        }

        // Display the final list
        System.out.println("\n--- Final Unique List ---");
        for (int i = 0; i < list.getMaxCount(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        sc.close();
	}
}
