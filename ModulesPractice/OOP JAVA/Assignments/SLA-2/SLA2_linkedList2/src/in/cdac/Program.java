package in.cdac;

import in.cdac.LinkedList;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
       
        System.out.println("Please enter 10 unique integers:");
        while(list.maxCount < 10) {
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                boolean flag = false;
                
                for(int i=0; i<list.maxCount; i++) {
                if(list.get(i).equals(input)) {
                	flag = true;
                	break;
                	}
                }
                if (flag != true) {
                    list.add(input);
                    System.out.println(input + " added.");
                } else {
                    System.out.println("Duplicate detected! " + input + " was skipped.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }

        // Display the final list
        System.out.println("\nFinal Unique List");
        for(int i=0; i<list.maxCount; i++) {
            System.out.print(list.get(i) + " ");
        }
        
        sc.close();
	}
}
