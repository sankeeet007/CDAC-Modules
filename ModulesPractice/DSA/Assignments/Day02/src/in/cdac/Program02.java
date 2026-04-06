package in.cdac;

import java.util.Scanner;

public class Program02 {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size fo stack: ");
		int s = scanner.nextInt();	// s = 5 
		
		StackADT stackObj = new StackADT(s);
		
		//stackObj.pop();
		stackObj.push(10);
		stackObj.push(20);
		stackObj.push(30);
		stackObj.pop();
		stackObj.push(40);
		stackObj.push(50);
		stackObj.push(30);
		
		stackObj.displayStack();
		
		scanner.close();
	}
}
